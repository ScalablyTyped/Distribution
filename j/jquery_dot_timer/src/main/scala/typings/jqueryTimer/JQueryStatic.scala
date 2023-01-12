package typings.jqueryTimer

import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  // #region Constructors
  def timer(): js.Object
  def timer(action: js.Function): js.Object
  def timer(action: js.Function, time: Unit, autostart: Boolean): js.Object
  def timer(action: js.Function, time: Number): js.Object
  def timer(action: js.Function, time: Number, autostart: Boolean): js.Object
  def timer(action: Unit, time: Unit, autostart: Boolean): js.Object
  def timer(action: Unit, time: Number): js.Object
  def timer(action: Unit, time: Number, autostart: Boolean): js.Object
  @JSName("timer")
  var timer_Original: JQueryTimer
}
object JQueryStatic {
  
  inline def apply(timer: JQueryTimer): JQueryStatic = {
    val __obj = js.Dynamic.literal(timer = timer.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    inline def setTimer(value: JQueryTimer): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
  }
}
