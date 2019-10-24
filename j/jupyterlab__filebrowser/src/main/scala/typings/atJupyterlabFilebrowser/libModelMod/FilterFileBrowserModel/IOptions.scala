package typings.atJupyterlabFilebrowser.libModelMod.FilterFileBrowserModel

import typings.atJupyterlabCoreutils.libTokensMod.IStateDB
import typings.atJupyterlabServices.libContentsMod.Contents.IModel
import typings.atJupyterlabUiDashComponents.libIconInterfacesMod.IIconRegistry
import typings.atPhosphorCoreutils.libJsonMod.ReadonlyJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constructor options
  */
trait IOptions
  extends typings.atJupyterlabFilebrowser.libModelMod.FileBrowserModel.IOptions {
  /**
    * Filter function on file browser item model
    */
  var filter: js.UndefOr[js.Function1[/* value */ IModel, Boolean]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    iconRegistry: IIconRegistry,
    manager: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IDocumentManager */ js.Any,
    driveName: String = null,
    filter: /* value */ IModel => Boolean = null,
    refreshInterval: Int | Double = null,
    state: IStateDB[ReadonlyJSONValue] = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(iconRegistry = iconRegistry, manager = manager)
    if (driveName != null) __obj.updateDynamic("driveName")(driveName)
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (refreshInterval != null) __obj.updateDynamic("refreshInterval")(refreshInterval.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[IOptions]
  }
}

