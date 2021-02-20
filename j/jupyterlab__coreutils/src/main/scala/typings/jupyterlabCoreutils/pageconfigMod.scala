package typings.jupyterlabCoreutils

import typings.jupyterlabCoreutils.anon.Download
import typings.jupyterlabCoreutils.anon.Raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pageconfigMod {
  
  object PageConfig {
    
    /**
      * The namespace for page config `Extension` functions.
      */
    object Extension {
      
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
      @JSImport("@jupyterlab/coreutils/lib/pageconfig", "PageConfig.Extension.isDeferred")
      @js.native
      def isDeferred(id: String): Boolean = js.native
      
      /**
        * Returns whether a plugin is disabled.
        *
        * @param id - The plugin ID.
        */
      @JSImport("@jupyterlab/coreutils/lib/pageconfig", "PageConfig.Extension.isDisabled")
      @js.native
      def isDisabled(id: String): Boolean = js.native
    }
    
    /**
      * Get the base url for a Jupyter application, or the base url of the page.
      */
    @JSImport("@jupyterlab/coreutils/lib/pageconfig", "PageConfig.getBaseUrl")
    @js.native
    def getBaseUrl(): String = js.native
    
    /**
      * Returns the URL converting this notebook to a certain
      * format with nbconvert.
      */
    @JSImport("@jupyterlab/coreutils/lib/pageconfig", "PageConfig.getNBConvertURL")
    @js.native
    def getNBConvertURL(hasPathFormatDownload: Download): String = js.native
    
    /**
      * Get the Notebook version info [major, minor, patch].
      */
    @JSImport("@jupyterlab/coreutils/lib/pageconfig", "PageConfig.getNotebookVersion")
    @js.native
    def getNotebookVersion(): js.Tuple3[Double, Double, Double] = js.native
    
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
    @JSImport("@jupyterlab/coreutils/lib/pageconfig", "PageConfig.getOption")
    @js.native
    def getOption(name: String): String = js.native
    
    /**
      * Get the base url for sharing links (usually baseUrl)
      */
    @JSImport("@jupyterlab/coreutils/lib/pageconfig", "PageConfig.getShareUrl")
    @js.native
    def getShareUrl(): String = js.native
    
    /**
      * Get the authorization token for a Jupyter application.
      */
    @JSImport("@jupyterlab/coreutils/lib/pageconfig", "PageConfig.getToken")
    @js.native
    def getToken(): String = js.native
    
    /**
      * Get the tree url for shareable links.
      * Usually the same as treeUrl,
      * but overrideable e.g. when sharing with JupyterHub.
      */
    @JSImport("@jupyterlab/coreutils/lib/pageconfig", "PageConfig.getTreeShareUrl")
    @js.native
    def getTreeShareUrl(): String = js.native
    
    /**
      * Get the tree url for a JupyterLab application.
      */
    @JSImport("@jupyterlab/coreutils/lib/pageconfig", "PageConfig.getTreeUrl")
    @js.native
    def getTreeUrl(): String = js.native
    
    /**
      * Get the base websocket url for a Jupyter application, or an empty string.
      */
    @JSImport("@jupyterlab/coreutils/lib/pageconfig", "PageConfig.getWsUrl")
    @js.native
    def getWsUrl(): String = js.native
    @JSImport("@jupyterlab/coreutils/lib/pageconfig", "PageConfig.getWsUrl")
    @js.native
    def getWsUrl(baseUrl: String): String = js.native
    
    /**
      * Set global configuration data for the Jupyter application.
      *
      * @param name - The name of the configuration option.
      * @param value - The value to set the option to.
      *
      * @returns The last config value or an empty string if it doesn't exist.
      */
    @JSImport("@jupyterlab/coreutils/lib/pageconfig", "PageConfig.setOption")
    @js.native
    def setOption(name: String, value: String): String = js.native
  }
}
