package typings.jupyterlabFilebrowser.modelMod.FileBrowserModel

import typings.jupyterlabDocmanager.tokensMod.IDocumentManager
import typings.jupyterlabStatedb.tokensMod.IStateDB
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a file browser.
  */
trait IOptions extends js.Object {
  /**
    * Whether a file browser automatically loads its initial path.
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
    * A document manager instance.
    */
  var manager: IDocumentManager
  /**
    * The time interval for browser refreshing, in ms.
    */
  var refreshInterval: js.UndefOr[Double] = js.undefined
  /**
    * An optional state database. If provided, the model will restore which
    * folder was last opened when it is restored.
    */
  var state: js.UndefOr[IStateDB[ReadonlyPartialJSONValue]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    manager: IDocumentManager,
    auto: js.UndefOr[Boolean] = js.undefined,
    driveName: String = null,
    refreshInterval: js.UndefOr[Double] = js.undefined,
    state: IStateDB[ReadonlyPartialJSONValue] = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
    if (!js.isUndefined(auto)) __obj.updateDynamic("auto")(auto.get.asInstanceOf[js.Any])
    if (driveName != null) __obj.updateDynamic("driveName")(driveName.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshInterval)) __obj.updateDynamic("refreshInterval")(refreshInterval.get.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

