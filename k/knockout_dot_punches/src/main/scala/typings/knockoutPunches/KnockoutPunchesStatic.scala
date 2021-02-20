package typings.knockoutPunches

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutPunchesStatic extends StObject {
  
  def enableAll(): Unit = js.native
}
object KnockoutPunchesStatic {
  
  @scala.inline
  def apply(enableAll: () => Unit): KnockoutPunchesStatic = {
    val __obj = js.Dynamic.literal(enableAll = js.Any.fromFunction0(enableAll))
    __obj.asInstanceOf[KnockoutPunchesStatic]
  }
  
  @scala.inline
  implicit class KnockoutPunchesStaticMutableBuilder[Self <: KnockoutPunchesStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableAll(value: () => Unit): Self = StObject.set(x, "enableAll", js.Any.fromFunction0(value))
  }
}
