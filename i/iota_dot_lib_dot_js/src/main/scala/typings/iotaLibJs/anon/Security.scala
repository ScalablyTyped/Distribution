package typings.iotaLibJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Security extends StObject {
  
  var end: Double
  
  var security: js.UndefOr[typings.iotaLibJs.mod.Security] = js.undefined
  
  var start: Double
}
object Security {
  
  @scala.inline
  def apply(end: Double, start: Double): Security = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Security]
  }
  
  @scala.inline
  implicit class SecurityMutableBuilder[Self <: Security] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurity(value: typings.iotaLibJs.mod.Security): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
