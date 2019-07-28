package typings.atJupyterlabDocregistry.libRegistryMod

import typings.atJupyterlabApputils.atJupyterlabApputilsMod.Toolbar
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.IContext
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.IModel
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDocumentWidget[T /* <: Widget */, U /* <: IModel */] extends Widget {
  /**
    * The content widget.
    */
  val content: T = js.native
  /**
    * The context associated with the document.
    */
  val context: IContext[U] = js.native
  /**
    * A promise resolving after the content widget is revealed.
    */
  val revealed: js.Promise[Unit] = js.native
  /**
    * The toolbar for the widget.
    */
  val toolbar: Toolbar[Widget] = js.native
  /**
    * Set URI fragment identifier.
    */
  def setFragment(fragment: String): Unit = js.native
}

