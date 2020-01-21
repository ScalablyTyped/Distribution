package typings.jupyterlabFilebrowser.opendialogMod.FileDialog

import typings.jupyterlabDocmanager.tokensMod.IDocumentManager
import typings.jupyterlabServices.contentsMod.Contents.IModel
import typings.jupyterlabUiComponents.interfacesMod.IIconRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the open file dialog
  */
trait IFileOptions extends IDirectoryOptions {
  /**
    * Filter function on file browser item model
    */
  var filter: js.UndefOr[js.Function1[/* value */ IModel, Boolean]] = js.undefined
}

object IFileOptions {
  @scala.inline
  def apply(
    iconRegistry: IIconRegistry,
    manager: IDocumentManager,
    filter: /* value */ IModel => Boolean = null
  ): IFileOptions = {
    val __obj = js.Dynamic.literal(iconRegistry = iconRegistry.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    __obj.asInstanceOf[IFileOptions]
  }
}

