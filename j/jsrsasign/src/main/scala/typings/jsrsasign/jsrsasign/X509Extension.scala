package typings.jsrsasign.jsrsasign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X509Extension extends StObject {
  
  var critical: Boolean
  
  var oid: String
  
  var vidx: Double
}
object X509Extension {
  
  @scala.inline
  def apply(critical: Boolean, oid: String, vidx: Double): X509Extension = {
    val __obj = js.Dynamic.literal(critical = critical.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any], vidx = vidx.asInstanceOf[js.Any])
    __obj.asInstanceOf[X509Extension]
  }
  
  @scala.inline
  implicit class X509ExtensionMutableBuilder[Self <: X509Extension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOid(value: String): Self = StObject.set(x, "oid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVidx(value: Double): Self = StObject.set(x, "vidx", value.asInstanceOf[js.Any])
  }
}
