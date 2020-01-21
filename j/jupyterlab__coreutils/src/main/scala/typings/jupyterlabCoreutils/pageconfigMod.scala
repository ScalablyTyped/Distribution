package typings.jupyterlabCoreutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils/lib/pageconfig", JSImport.Namespace)
@js.native
object pageconfigMod extends js.Object {
  @js.native
  object PageConfig extends js.Object {
    /**
      * Get the base url for a Jupyter application, or the base url of the page.
      */
    def getBaseUrl(): String = js.native
    /**
      * Returns the URL converting this notebook to a certain
      * format with nbconvert.
      */
    def getNBConvertURL(hasPathFormatDownload: AnonDownload): String = js.native
    /**
      * Get the Notebook version info [major, minor, patch].
      */
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
    def getOption(name: String): String = js.native
    /**
      * Get the authorization token for a Jupyter application.
      */
    def getToken(): String = js.native
    /**
      * Get the tree url for a JupyterLab application.
      */
    def getTreeUrl(): String = js.native
    /**
      * Get the base websocket url for a Jupyter application, or an empty string.
      */
    def getWsUrl(): String = js.native
    def getWsUrl(baseUrl: String): String = js.native
    /**
      * Set global configuration data for the Jupyter application.
      *
      * @param name - The name of the configuration option.
      * @param value - The value to set the option to.
      *
      * @returns The last config value or an empty string if it doesn't exist.
      */
    def setOption(name: String, value: String): String = js.native
    /**
      * The namespace for page config `Extension` functions.
      */
    @js.native
    object Extension extends js.Object {
      /**
        * The collection of deferred extensions in page config.
        */
      val deferred: js.Array[AnonRaw] = js.native
      /**
        * The collection of disabled extensions in page config.
        */
      val disabled: js.Array[AnonRaw] = js.native
      /**
        * Returns whether a plugin is deferred.
        *
        * @param id - The plugin ID.
        */
      def isDeferred(id: String): Boolean = js.native
      /**
        * Returns whether a plugin is disabled.
        *
        * @param id - The plugin ID.
        */
      def isDisabled(id: String): Boolean = js.native
    }
    
  }
  
}

