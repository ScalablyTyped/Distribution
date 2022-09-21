package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaV1Beta1GenerateServiceIdentityResponse extends StObject {
  
  /**
    * ServiceIdentity that was created or retrieved.
    */
  var identity: js.UndefOr[SchemaV1Beta1ServiceIdentity] = js.undefined
}
object SchemaV1Beta1GenerateServiceIdentityResponse {
  
  inline def apply(): SchemaV1Beta1GenerateServiceIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaV1Beta1GenerateServiceIdentityResponse]
  }
  
  extension [Self <: SchemaV1Beta1GenerateServiceIdentityResponse](x: Self) {
    
    inline def setIdentity(value: SchemaV1Beta1ServiceIdentity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
  }
}
