package typings.jupyterlabFilebrowser.modelMod.FilterFileBrowserModel

import typings.jupyterlabDocmanager.tokensMod.IDocumentManager
import typings.jupyterlabServices.contentsMod.Contents.IModel
import typings.jupyterlabStatedb.tokensMod.IStateDB
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constructor options
  */
trait IOptions
  extends typings.jupyterlabFilebrowser.modelMod.FileBrowserModel.IOptions {
  /**
    * Filter function on file browser item model
    */
  var filter: js.UndefOr[js.Function1[/* value */ IModel, Boolean]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    manager: IDocumentManager,
    auto: js.UndefOr[Boolean] = js.undefined,
    driveName: String = null,
    filter: /* value */ IModel => Boolean = null,
    refreshInterval: Int | Double = null,
    state: IStateDB[ReadonlyPartialJSONValue] = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
    if (!js.isUndefined(auto)) __obj.updateDynamic("auto")(auto.asInstanceOf[js.Any])
    if (driveName != null) __obj.updateDynamic("driveName")(driveName.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (refreshInterval != null) __obj.updateDynamic("refreshInterval")(refreshInterval.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

