package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sn extends StObject {
  
  var sn: IntegerParam
  
  var time: StringParam
}
object Sn {
  
  inline def apply(sn: IntegerParam, time: StringParam): Sn = {
    val __obj = js.Dynamic.literal(sn = sn.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sn]
  }
  
  extension [Self <: Sn](x: Self) {
    
    inline def setSn(value: IntegerParam): Self = StObject.set(x, "sn", value.asInstanceOf[js.Any])
    
    inline def setTime(value: StringParam): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
