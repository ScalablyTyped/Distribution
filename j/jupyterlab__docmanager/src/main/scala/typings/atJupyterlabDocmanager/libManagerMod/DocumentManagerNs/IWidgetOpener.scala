package typings.atJupyterlabDocmanager.libManagerMod.DocumentManagerNs

import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.IModel
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.IOpenOptions
import typings.atJupyterlabDocregistry.libRegistryMod.IDocumentWidget
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

