package typings.jupyterlabDocregistry.registryMod.DocumentRegistry

import typings.luminoDisposable.mod.IDisposable
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface for a widget extension.
  */
@js.native
trait IWidgetExtension[T /* <: Widget */, U /* <: IModel */] extends js.Object {
  
  /**
    * Create a new extension for a given widget.
    */
  def createNew(widget: T, context: IContext[U]): IDisposable = js.native
}
object IWidgetExtension {
  
  @scala.inline
  def apply[T /* <: Widget */, U /* <: IModel */](createNew: (T, IContext[U]) => IDisposable): IWidgetExtension[T, U] = {
    val __obj = js.Dynamic.literal(createNew = js.Any.fromFunction2(createNew))
    __obj.asInstanceOf[IWidgetExtension[T, U]]
  }
  
  @scala.inline
  implicit class IWidgetExtensionOps[Self <: IWidgetExtension[_, _], T /* <: Widget */, U /* <: IModel */] (val x: Self with (IWidgetExtension[T, U])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateNew(value: (T, IContext[U]) => IDisposable): Self = this.set("createNew", js.Any.fromFunction2(value))
  }
}
