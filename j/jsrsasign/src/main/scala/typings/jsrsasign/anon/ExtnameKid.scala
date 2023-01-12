package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtnameKid extends StObject {
  
  var critical: js.UndefOr[Boolean] = js.undefined
  
  var extname: String
  
  var kid: typings.jsrsasign.jsrsasign.Hex
}
object ExtnameKid {
  
  inline def apply(extname: String, kid: typings.jsrsasign.jsrsasign.Hex): ExtnameKid = {
    val __obj = js.Dynamic.literal(extname = extname.asInstanceOf[js.Any], kid = kid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtnameKid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtnameKid] (val x: Self) extends AnyVal {
    
    inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    inline def setExtname(value: String): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
    
    inline def setKid(value: typings.jsrsasign.jsrsasign.Hex): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
  }
}
