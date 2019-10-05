package typings.atJupyterlabFilebrowser.libOpendialogMod.FileDialog

import typings.atJupyterlabDocmanager.libTokensMod.IDocumentManager
import typings.atJupyterlabUiDashComponents.libIconInterfacesMod.IIconRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the open directory dialog
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof std.Pick<@jupyterlab/apputils.@jupyterlab/apputils/lib/dialog.Dialog.IOptions<std.Promise<std.Array<@jupyterlab/services.@jupyterlab/services/lib/contents.Contents.IModel>>>, std.Exclude<keyof @jupyterlab/apputils.@jupyterlab/apputils/lib/dialog.Dialog.IOptions<std.Promise<std.Array<@jupyterlab/services.@jupyterlab/services/lib/contents.Contents.IModel>>>, 'body' | 'buttons' | 'defaultButton'>> ]:? std.Pick<@jupyterlab/apputils.@jupyterlab/apputils/lib/dialog.Dialog.IOptions<std.Promise<std.Array<@jupyterlab/services.@jupyterlab/services/lib/contents.Contents.IModel>>>, std.Exclude<keyof @jupyterlab/apputils.@jupyterlab/apputils/lib/dialog.Dialog.IOptions<std.Promise<std.Array<@jupyterlab/services.@jupyterlab/services/lib/contents.Contents.IModel>>>, 'body' | 'buttons' | 'defaultButton'>>[P]} */ trait IDirectoryOptions extends js.Object {
  /**
    * An icon registry instance.
    */
  var iconRegistry: IIconRegistry
  /**
    * Document manager
    */
  var manager: IDocumentManager
}

object IDirectoryOptions {
  @scala.inline
  def apply(iconRegistry: IIconRegistry, manager: IDocumentManager): IDirectoryOptions = {
    val __obj = js.Dynamic.literal(iconRegistry = iconRegistry, manager = manager)
  
    __obj.asInstanceOf[IDirectoryOptions]
  }
}

