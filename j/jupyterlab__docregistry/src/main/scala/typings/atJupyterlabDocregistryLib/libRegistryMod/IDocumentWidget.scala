package typings
package atJupyterlabDocregistryLib.libRegistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDocumentWidget[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */, U /* <: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel */]
  extends atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget {
  /**
    * The content widget.
    */
  val content: T = js.native
  /**
    * The context associated with the document.
    */
  val context: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IContext[U] = js.native
  /**
    * A promise resolving after the content widget is revealed.
    */
  val revealed: js.Promise[scala.Unit] = js.native
  /**
    * The toolbar for the widget.
    */
  val toolbar: atJupyterlabApputilsLib.atJupyterlabApputilsMod.Toolbar[atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget] = js.native
}

