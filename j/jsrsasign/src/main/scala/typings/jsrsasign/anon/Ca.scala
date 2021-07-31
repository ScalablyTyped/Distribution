package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ca extends StObject {
  
  var ca: Boolean
  
  var critical: Boolean
}
object Ca {
  
  @scala.inline
  def apply(ca: Boolean, critical: Boolean): Ca = {
    val __obj = js.Dynamic.literal(ca = ca.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ca]
  }
  
  @scala.inline
  implicit class CaMutableBuilder[Self <: Ca] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCa(value: Boolean): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
  }
}
