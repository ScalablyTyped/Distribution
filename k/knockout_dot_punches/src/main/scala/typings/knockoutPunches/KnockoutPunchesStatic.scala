package typings.knockoutPunches

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutPunchesStatic extends StObject {
  
  def enableAll(): Unit
}
object KnockoutPunchesStatic {
  
  inline def apply(enableAll: () => Unit): KnockoutPunchesStatic = {
    val __obj = js.Dynamic.literal(enableAll = js.Any.fromFunction0(enableAll))
    __obj.asInstanceOf[KnockoutPunchesStatic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnockoutPunchesStatic] (val x: Self) extends AnyVal {
    
    inline def setEnableAll(value: () => Unit): Self = StObject.set(x, "enableAll", js.Any.fromFunction0(value))
  }
}
