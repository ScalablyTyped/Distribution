package typings
package atJupyterlabCoreutilsLib.libPageconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils/lib/pageconfig", "PageConfig")
@js.native
object PageConfigNs extends js.Object {
  /**
    * The tree URL construction options.
    */
  trait ITreeOptions extends js.Object {
    /**
      * If `true`, the tree URL will include the current workspace, if any.
      */
    var workspace: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  /**
    * Get the base url for a Jupyter application, or the base url of the page.
    */
  def getBaseUrl(): java.lang.String = js.native
  /**
    * Get the Notebook version info [major, minor, patch].
    */
  def getNotebookVersion(): js.Tuple3[scala.Double, scala.Double, scala.Double] = js.native
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
  def getOption(name: java.lang.String): java.lang.String = js.native
  /**
    * Get the authorization token for a Jupyter application.
    */
  def getToken(): java.lang.String = js.native
  /**
    * Get the tree url for a JupyterLab application.
    *
    * @param options - The tree URL construction options.
    */
  def getTreeUrl(): java.lang.String = js.native
  def getTreeUrl(options: ITreeOptions): java.lang.String = js.native
  /**
    * Get the base websocket url for a Jupyter application, or an empty string.
    */
  def getWsUrl(): java.lang.String = js.native
  def getWsUrl(baseUrl: java.lang.String): java.lang.String = js.native
  /**
    * Set global configuration data for the Jupyter application.
    *
    * @param name - The name of the configuration option.
    * @param value - The value to set the option to.
    *
    * @returns The last config value or an empty string if it doesn't exist.
    */
  def setOption(name: java.lang.String, value: java.lang.String): java.lang.String = js.native
}

