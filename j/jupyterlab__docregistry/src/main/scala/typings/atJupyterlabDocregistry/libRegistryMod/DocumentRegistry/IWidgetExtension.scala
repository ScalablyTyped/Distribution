package typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry

import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for a widget extension.
  */
trait IWidgetExtension[T /* <: Widget */, U /* <: IModel */] extends js.Object {
  /**
    * Create a new extension for a given widget.
    */
  def createNew(widget: T, context: IContext[U]): IDisposable
}

object IWidgetExtension {
  @scala.inline
  def apply[T /* <: Widget */, U /* <: IModel */](createNew: (T, IContext[U]) => IDisposable): IWidgetExtension[T, U] = {
    val __obj = js.Dynamic.literal(createNew = js.Any.fromFunction2(createNew))
  
    __obj.asInstanceOf[IWidgetExtension[T, U]]
  }
}

