package typings.igniteUi.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DvCommonWidget extends StObject {
  
  def option(key: js.Object, value: js.Object): Unit = js.native
}
object DvCommonWidget {
  
  @scala.inline
  def apply(option: (js.Object, js.Object) => Unit): DvCommonWidget = {
    val __obj = js.Dynamic.literal(option = js.Any.fromFunction2(option))
    __obj.asInstanceOf[DvCommonWidget]
  }
  
  @scala.inline
  implicit class DvCommonWidgetMutableBuilder[Self <: DvCommonWidget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOption(value: (js.Object, js.Object) => Unit): Self = StObject.set(x, "option", js.Any.fromFunction2(value))
  }
}
