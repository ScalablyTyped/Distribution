package typings.googleapis.tpuV2alpha1Mod.tpuV2alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGenerateServiceIdentityResponse extends StObject {
  
  /**
    * ServiceIdentity that was created or retrieved.
    */
  var identity: js.UndefOr[SchemaServiceIdentity] = js.undefined
}
object SchemaGenerateServiceIdentityResponse {
  
  inline def apply(): SchemaGenerateServiceIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateServiceIdentityResponse]
  }
  
  extension [Self <: SchemaGenerateServiceIdentityResponse](x: Self) {
    
    inline def setIdentity(value: SchemaServiceIdentity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
  }
}
