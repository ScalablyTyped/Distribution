package typings.jupyterlabCoreutils

import typings.jupyterlabCoreutils.anon.Download
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPageconfigMod {
  
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
      val deferred: js.Array[String] = js.native
      
      /**
        * The collection of disabled extensions in page config.
        */
      @JSImport("@jupyterlab/coreutils/lib/pageconfig", "PageConfig.Extension.disabled")
      @js.native
      val disabled: js.Array[String] = js.native
      
      /**
        * Returns whether a plugin is deferred.
        *
        * @param id - The plugin ID.
        */
      inline def isDeferred(id: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeferred")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /**
        * Returns whether a plugin is disabled.
        *
        * @param id - The plugin ID.
        */
      inline def isDisabled(id: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDisabled")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    }
    
    @JSImport("@jupyterlab/coreutils/lib/pageconfig", "PageConfig.defaultWorkspace")
    @js.native
    val defaultWorkspace: String = js.native
    
    /**
      * Get the base url for a Jupyter application, or the base url of the page.
      */
    inline def getBaseUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBaseUrl")().asInstanceOf[String]
    
    /**
      * Returns the URL converting this notebook to a certain
      * format with nbconvert.
      */
    inline def getNBConvertURL(hasPathFormatDownload: Download): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNBConvertURL")(hasPathFormatDownload.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Get the Notebook version info [major, minor, patch].
      */
    inline def getNotebookVersion(): js.Tuple3[Double, Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNotebookVersion")().asInstanceOf[js.Tuple3[Double, Double, Double]]
    
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
    inline def getOption(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOption")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Get the base url for sharing links (usually baseUrl)
      */
    inline def getShareUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getShareUrl")().asInstanceOf[String]
    
    /**
      * Get the authorization token for a Jupyter application.
      */
    inline def getToken(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getToken")().asInstanceOf[String]
    
    /**
      * Get the tree url for shareable links.
      * Usually the same as treeUrl,
      * but overrideable e.g. when sharing with JupyterHub.
      */
    inline def getTreeShareUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTreeShareUrl")().asInstanceOf[String]
    
    /**
      * Get the tree url for a JupyterLab application.
      */
    inline def getTreeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTreeUrl")().asInstanceOf[String]
    
    /**
      * Create a new URL given an optional mode and tree path.
      *
      * This is used to create URLS when the mode or tree path change as the user
      * changes mode or the current document in the main area. If fields in
      * options are omitted, the value in PageConfig will be used.
      *
      * @param options - IGetUrlOptions for the new path.
      */
    inline def getUrl(options: IGetUrlOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(options.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Get the base websocket url for a Jupyter application, or an empty string.
      */
    inline def getWsUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getWsUrl")().asInstanceOf[String]
    inline def getWsUrl(baseUrl: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getWsUrl")(baseUrl.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Set global configuration data for the Jupyter application.
      *
      * @param name - The name of the configuration option.
      * @param value - The value to set the option to.
      *
      * @returns The last config value or an empty string if it doesn't exist.
      */
    inline def setOption(name: String, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("setOption")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Options for getUrl
      */
    trait IGetUrlOptions extends StObject {
      
      /**
        * The optional mode as a string 'single-document' or 'multiple-document'. If
        * the mode argument is missing, it will be provided from the PageConfig.
        */
      var mode: js.UndefOr[String] = js.undefined
      
      /**
        * Whether the url is meant to be shared or not; default false.
        */
      var toShare: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The optional tree path as as string. If treePath is not provided it will be
        * provided from the PageConfig. If an empty string, the resulting path will not
        * contain a tree portion.
        */
      var treePath: js.UndefOr[String] = js.undefined
      
      /**
        * The optional workspace as a string. If this argument is missing, the value will
        * be pulled from PageConfig. To use the default workspace (no /workspaces/<name>
        * URL segment will be included) pass the string PageConfig.defaultWorkspace.
        */
      var workspace: js.UndefOr[String] = js.undefined
    }
    object IGetUrlOptions {
      
      inline def apply(): IGetUrlOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IGetUrlOptions]
      }
      
      extension [Self <: IGetUrlOptions](x: Self) {
        
        inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
        
        inline def setToShare(value: Boolean): Self = StObject.set(x, "toShare", value.asInstanceOf[js.Any])
        
        inline def setToShareUndefined: Self = StObject.set(x, "toShare", js.undefined)
        
        inline def setTreePath(value: String): Self = StObject.set(x, "treePath", value.asInstanceOf[js.Any])
        
        inline def setTreePathUndefined: Self = StObject.set(x, "treePath", js.undefined)
        
        inline def setWorkspace(value: String): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
        
        inline def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
      }
    }
  }
}
