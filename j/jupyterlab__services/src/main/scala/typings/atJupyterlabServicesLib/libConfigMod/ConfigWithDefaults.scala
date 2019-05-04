package typings
package atJupyterlabServicesLib.libConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/config", "ConfigWithDefaults")
@js.native
class ConfigWithDefaults protected () extends js.Object {
  /**
    * Create a new config with defaults.
    */
  def this(options: atJupyterlabServicesLib.libConfigMod.ConfigWithDefaultsNs.IOptions) = this()
  /**
    * Get data from the Section with our classname, if available.
    *
    * #### Notes
    * If we have no classname, get all of the data in the Section
    */
  var _classData: js.Any = js.native
  var _className: js.Any = js.native
  var _defaults: js.Any = js.native
  var _section: js.Any = js.native
  /**
    * Get data from the config section or fall back to defaults.
    */
  def get(key: java.lang.String): atPhosphorCoreutilsLib.libJsonMod.JSONValue = js.native
  /**
    * Set a config value.
    *
    * #### Notes
    * Uses the [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/config).
    *
    * The promise is fulfilled on a valid response and rejected otherwise.
    *
    * Sends the update to the server, and changes our local copy of the data
    * immediately.
    */
  def set(key: java.lang.String, value: atPhosphorCoreutilsLib.libJsonMod.JSONValue): js.Promise[atPhosphorCoreutilsLib.libJsonMod.JSONValue] = js.native
}

