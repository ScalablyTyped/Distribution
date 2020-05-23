package typings.jupyterlabFilebrowser.tokensMod.IFileBrowserFactory

import typings.jupyterlabStatedb.tokensMod.IStateDB
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
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
    * Whether a file browser automatically loads its initial path.
    *
    * #### Notes
    * The default is `true`.
    */
  var auto: js.UndefOr[Boolean] = js.undefined
  /**
    * An optional `Contents.IDrive` name for the model.
    * If given, the model will prepend `driveName:` to
    * all paths used in file operations.
    */
  var driveName: js.UndefOr[String] = js.undefined
  /**
    * The time interval for browser refreshing, in ms.
    */
  var refreshInterval: js.UndefOr[Double] = js.undefined
  /**
    * Whether a file browser automatically restores state when instantiated.
    * The default is `true`.
    *
    * #### Notes
    * The file browser model will need to be restored before for the file
    * browser to start saving its state.
    */
  var restore: js.UndefOr[Boolean] = js.undefined
  /**
    * The state database to use for saving file browser state and restoring it.
    *
    * #### Notes
    * Unless the value `null` is set for this option, the application state
    * database will be automatically passed in and used for state restoration.
    */
  var state: js.UndefOr[IStateDB[ReadonlyPartialJSONValue] | Null] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    auto: js.UndefOr[Boolean] = js.undefined,
    driveName: String = null,
    refreshInterval: js.UndefOr[Double] = js.undefined,
    restore: js.UndefOr[Boolean] = js.undefined,
    state: js.UndefOr[Null | IStateDB[ReadonlyPartialJSONValue]] = js.undefined
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(auto)) __obj.updateDynamic("auto")(auto.get.asInstanceOf[js.Any])
    if (driveName != null) __obj.updateDynamic("driveName")(driveName.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshInterval)) __obj.updateDynamic("refreshInterval")(refreshInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(restore)) __obj.updateDynamic("restore")(restore.get.asInstanceOf[js.Any])
    if (!js.isUndefined(state)) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

