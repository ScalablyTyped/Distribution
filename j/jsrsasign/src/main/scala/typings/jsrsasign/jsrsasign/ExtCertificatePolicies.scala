package typings.jsrsasign.jsrsasign

import typings.jsrsasign.jsrsasignStrings.certificatePolicies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtCertificatePolicies
  extends StObject
     with ExtParam {
  
  var array: js.Array[PolicyInformation]
  
  var critical: js.UndefOr[Boolean] = js.undefined
  
  var extname: certificatePolicies
}
object ExtCertificatePolicies {
  
  inline def apply(array: js.Array[PolicyInformation]): ExtCertificatePolicies = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], extname = "certificatePolicies")
    __obj.asInstanceOf[ExtCertificatePolicies]
  }
  
  extension [Self <: ExtCertificatePolicies](x: Self) {
    
    inline def setArray(value: js.Array[PolicyInformation]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayVarargs(value: PolicyInformation*): Self = StObject.set(x, "array", js.Array(value*))
    
    inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    inline def setExtname(value: certificatePolicies): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
  }
}
