package typings.googleapis.osloginV1alphaMod.osloginV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersSshpublickeysCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The unique ID for the user in format `users/{user\}`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSshPublicKey] = js.undefined
}
object ParamsResourceUsersSshpublickeysCreate {
  
  inline def apply(): ParamsResourceUsersSshpublickeysCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersSshpublickeysCreate]
  }
  
  extension [Self <: ParamsResourceUsersSshpublickeysCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaSshPublicKey): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
