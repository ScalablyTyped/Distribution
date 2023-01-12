package typings.jsrsasign.jsrsasign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyInformation extends StObject {
  
  var array: js.UndefOr[js.Array[PolicyQualifierInfo]] = js.undefined
  
  var policyoid: String
}
object PolicyInformation {
  
  inline def apply(policyoid: String): PolicyInformation = {
    val __obj = js.Dynamic.literal(policyoid = policyoid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolicyInformation] (val x: Self) extends AnyVal {
    
    inline def setArray(value: js.Array[PolicyQualifierInfo]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
    
    inline def setArrayVarargs(value: PolicyQualifierInfo*): Self = StObject.set(x, "array", js.Array(value*))
    
    inline def setPolicyoid(value: String): Self = StObject.set(x, "policyoid", value.asInstanceOf[js.Any])
  }
}
