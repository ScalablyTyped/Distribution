package typings.jsrsasign.jsrsasign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevokedCertificate extends StObject {
  
  var date: String
  
  var ext: js.Array[ExtParam]
  
  var sn: typings.jsrsasign.anon.Hex
}
object RevokedCertificate {
  
  inline def apply(date: String, ext: js.Array[ExtParam], sn: typings.jsrsasign.anon.Hex): RevokedCertificate = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], sn = sn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokedCertificate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RevokedCertificate] (val x: Self) extends AnyVal {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setExt(value: js.Array[ExtParam]): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    inline def setExtVarargs(value: ExtParam*): Self = StObject.set(x, "ext", js.Array(value*))
    
    inline def setSn(value: typings.jsrsasign.anon.Hex): Self = StObject.set(x, "sn", value.asInstanceOf[js.Any])
  }
}
