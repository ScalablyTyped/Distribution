package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ocsp extends StObject {
  
  var ocsp: String
}
object Ocsp {
  
  inline def apply(ocsp: String): Ocsp = {
    val __obj = js.Dynamic.literal(ocsp = ocsp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ocsp]
  }
  
  extension [Self <: Ocsp](x: Self) {
    
    inline def setOcsp(value: String): Self = StObject.set(x, "ocsp", value.asInstanceOf[js.Any])
  }
}
