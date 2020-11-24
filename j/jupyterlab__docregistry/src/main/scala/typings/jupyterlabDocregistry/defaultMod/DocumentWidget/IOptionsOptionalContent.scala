package typings.jupyterlabDocregistry.defaultMod.DocumentWidget

import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IContext
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOptionsOptionalContent[T /* <: Widget */, U /* <: IModel */]
  extends typings.jupyterlabApputils.mainareawidgetMod.MainAreaWidget.IOptionsOptionalContent[T] {
  
  var context: IContext[U] = js.native
}
object IOptionsOptionalContent {
  
  @scala.inline
  def apply[T /* <: Widget */, U /* <: IModel */](context: IContext[U]): IOptionsOptionalContent[T, U] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptionsOptionalContent[T, U]]
  }
  
  @scala.inline
  implicit class IOptionsOptionalContentOps[Self <: IOptionsOptionalContent[_, _], T /* <: Widget */, U /* <: IModel */] (val x: Self with (IOptionsOptionalContent[T, U])) extends AnyVal {
    
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
    def setContext(value: IContext[U]): Self = this.set("context", value.asInstanceOf[js.Any])
  }
}
