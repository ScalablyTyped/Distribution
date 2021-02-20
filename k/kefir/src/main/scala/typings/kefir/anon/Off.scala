package typings.kefir.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Off extends StObject {
  
  var off: js.Function = js.native
  
  var on: js.Function = js.native
}
object Off {
  
  @scala.inline
  def apply(off: js.Function, on: js.Function): Off = {
    val __obj = js.Dynamic.literal(off = off.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[Off]
  }
  
  @scala.inline
  implicit class OffMutableBuilder[Self <: Off] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOff(value: js.Function): Self = StObject.set(x, "off", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOn(value: js.Function): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
  }
}
