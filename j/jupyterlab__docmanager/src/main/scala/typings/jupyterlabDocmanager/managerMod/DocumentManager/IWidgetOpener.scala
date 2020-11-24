package typings.jupyterlabDocmanager.managerMod.DocumentManager

import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IOpenOptions
import typings.jupyterlabDocregistry.registryMod.IDocumentWidget
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface for a widget opener.
  */
@js.native
trait IWidgetOpener extends js.Object {
  
  /**
    * Open the given widget.
    */
  def open(widget: IDocumentWidget[Widget, IModel]): Unit = js.native
  def open(widget: IDocumentWidget[Widget, IModel], options: IOpenOptions): Unit = js.native
}
