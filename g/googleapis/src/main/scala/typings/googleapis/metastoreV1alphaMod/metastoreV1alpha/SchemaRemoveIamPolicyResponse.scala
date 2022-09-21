package typings.googleapis.metastoreV1alphaMod.metastoreV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRemoveIamPolicyResponse extends StObject {
  
  /**
    * whether related policies are removed
    */
  var success: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaRemoveIamPolicyResponse {
  
  inline def apply(): SchemaRemoveIamPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemoveIamPolicyResponse]
  }
  
  extension [Self <: SchemaRemoveIamPolicyResponse](x: Self) {
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessNull: Self = StObject.set(x, "success", null)
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
