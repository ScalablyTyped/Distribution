package typings.jupyterlabCoreutils

import typings.jupyterlabCoreutils.anon.Download
import typings.jupyterlabCoreutils.anon.Raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pageconfigMod {
  
  object PageConfig {
    
    @JSImport("@jupyterlab/coreutils/lib/pageconfig", "PageConfig")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The namespace for page config `Extension` functions.
      */
    object Extension {
      
      @JSImport("@jupyterlab/coreutils/lib/pageconfig", "PageConfig.Extension")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * The collection of deferred extensions in page config.
        */
      @JSImport("@jupyterlab/coreutils/lib/pageconfig", "PageConfig.Extension.deferred")
      @js.native
      val deferred: js.Array[Raw] = js.native
      
      /**
        * The collection of disabled extensions in page config.
        */
      @JSImport("@jupyterlab/coreutils/lib/pageconfig", "PageConfig.Extension.disabled")
      @js.native
      val disabled: js.Array[Raw] = js.native
      
      /**
        * Returns whether a plugin is deferred.
        *
        * @param id - The plugin ID.
        */
      @scala.inline
      def isDeferred(id: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeferred")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /**
        * Returns whether a plugin is disabled.
        *
        * @param id - The plugin ID.
        */
      @scala.inline
      def isDisabled(id: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDisabled")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    }
    
    /**
      * Get the base url for a Jupyter application, or the base url of the page.
      */
    @scala.inline
    def getBaseUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBaseUrl")().asInstanceOf[String]
    
    /**
      * Returns the URL converting this notebook to a certain
      * format with nbconvert.
      */
    @scala.inline
    def getNBConvertURL(hasPathFormatDownload: Download): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNBConvertURL")(hasPathFormatDownload.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Get the Notebook version info [major, minor, patch].
      */
    @scala.inline
    def getNotebookVersion(): js.Tuple3[Double, Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNotebookVersion")().asInstanceOf[js.Tuple3[Double, Double, Double]]
    
    /**
      * Get global configuration data for the Jupyter application.
      *
      * @param name - The name of the configuration option.
      *
      * @returns The config value or an empty string if not found.
      *
      * #### Notes
      * All values are treated as strings.
      * For browser based applications, it is assumed that the page HTML
      * includes a script tag with the id `jupyter-config-data` containing the
      * configuration as valid JSON.  In order to support the classic Notebook,
      * we fall back on checking for `body` data of the given `name`.
      *
      * For node applications, it is assumed that the process was launched
      * with a `--jupyter-config-data` option pointing to a JSON settings
      * file.
      */
    @scala.inline
    def getOption(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOption")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Get the base url for sharing links (usually baseUrl)
      */
    @scala.inline
    def getShareUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getShareUrl")().asInstanceOf[String]
    
    /**
      * Get the authorization token for a Jupyter application.
      */
    @scala.inline
    def getToken(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getToken")().asInstanceOf[String]
    
    /**
      * Get the tree url for shareable links.
      * Usually the same as treeUrl,
      * but overrideable e.g. when sharing with JupyterHub.
      */
    @scala.inline
    def getTreeShareUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTreeShareUrl")().asInstanceOf[String]
    
    /**
      * Get the tree url for a JupyterLab application.
      */
    @scala.inline
    def getTreeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTreeUrl")().asInstanceOf[String]
    
    /**
      * Get the base websocket url for a Jupyter application, or an empty string.
      */
    @scala.inline
    def getWsUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getWsUrl")().asInstanceOf[String]
    @scala.inline
    def getWsUrl(baseUrl: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getWsUrl")(baseUrl.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Set global configuration data for the Jupyter application.
      *
      * @param name - The name of the configuration option.
      * @param value - The value to set the option to.
      *
      * @returns The last config value or an empty string if it doesn't exist.
      */
    @scala.inline
    def setOption(name: String, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("setOption")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
