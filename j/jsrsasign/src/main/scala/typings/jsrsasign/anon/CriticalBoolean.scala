package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CriticalBoolean extends StObject {
  
  var critical: Boolean = js.native
}
object CriticalBoolean {
  
  @scala.inline
  def apply(critical: Boolean): CriticalBoolean = {
    val __obj = js.Dynamic.literal(critical = critical.asInstanceOf[js.Any])
    __obj.asInstanceOf[CriticalBoolean]
  }
  
  @scala.inline
  implicit class CriticalBooleanMutableBuilder[Self <: CriticalBoolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
  }
}
