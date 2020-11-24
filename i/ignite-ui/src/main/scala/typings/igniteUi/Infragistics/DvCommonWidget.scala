package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DvCommonWidget extends js.Object {
  
  def option(key: js.Object, value: js.Object): Unit = js.native
}
object DvCommonWidget {
  
  @scala.inline
  def apply(option: (js.Object, js.Object) => Unit): DvCommonWidget = {
    val __obj = js.Dynamic.literal(option = js.Any.fromFunction2(option))
    __obj.asInstanceOf[DvCommonWidget]
  }
  
  @scala.inline
  implicit class DvCommonWidgetOps[Self <: DvCommonWidget] (val x: Self) extends AnyVal {
    
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
    def setOption(value: (js.Object, js.Object) => Unit): Self = this.set("option", js.Any.fromFunction2(value))
  }
}
