package typings
package atJupyterlabFilebrowserLib.libFactoryMod.IFileBrowserFactoryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for creating a file browser using a file browser factory.
  *
  * #### Notes
  * In future versions of JupyterLab, some of these options may disappear,
  * which is a backward-incompatible API change and will necessitate a new
  * version release. This is because in future versions, there will likely be
  * an application-wide notion of a singleton command registry and a singleton
  * state database.
  */
trait IOptions extends js.Object {
  /**
    * The command registry used by the file browser.
    *
    * #### Notes
    * If no command registry is provided, the application default will be used.
    */
  var commands: js.UndefOr[atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistry] = js.undefined
  /**
    * An optional `Contents.IDrive` name for the model.
    * If given, the model will prepend `driveName:` to
    * all paths used in file operations.
    */
  var driveName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The time interval for browser refreshing, in ms.
    */
  var refreshInterval: js.UndefOr[scala.Double] = js.undefined
  /**
    * The state database to use for saving file browser state and restoring it.
    *
    * #### Notes
    * Unless the value `null` is set for this option, the application state
    * database will be automatically passed in and used for state restoration.
    */
  var state: js.UndefOr[atJupyterlabCoreutilsLib.libStatedbMod.IStateDB | scala.Null] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    commands: atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistry = null,
    driveName: java.lang.String = null,
    refreshInterval: scala.Int | scala.Double = null,
    state: atJupyterlabCoreutilsLib.libStatedbMod.IStateDB = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (commands != null) __obj.updateDynamic("commands")(commands)
    if (driveName != null) __obj.updateDynamic("driveName")(driveName)
    if (refreshInterval != null) __obj.updateDynamic("refreshInterval")(refreshInterval.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[IOptions]
  }
}

