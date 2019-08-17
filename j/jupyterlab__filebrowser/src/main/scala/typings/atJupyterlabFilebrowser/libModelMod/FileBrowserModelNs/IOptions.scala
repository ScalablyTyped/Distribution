package typings.atJupyterlabFilebrowser.libModelMod.FileBrowserModelNs

import typings.atJupyterlabCoreutils.libTokensMod.IStateDB
import typings.atJupyterlabDocmanager.libTokensMod.IDocumentManager
import typings.atPhosphorCoreutils.libJsonMod.ReadonlyJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a file browser.
  */
trait IOptions extends js.Object {
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
  var state: js.UndefOr[IStateDB[ReadonlyJSONValue]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    manager: IDocumentManager,
    driveName: String = null,
    refreshInterval: Int | Double = null,
    state: IStateDB[ReadonlyJSONValue] = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(manager = manager)
    if (driveName != null) __obj.updateDynamic("driveName")(driveName)
    if (refreshInterval != null) __obj.updateDynamic("refreshInterval")(refreshInterval.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[IOptions]
  }
}

