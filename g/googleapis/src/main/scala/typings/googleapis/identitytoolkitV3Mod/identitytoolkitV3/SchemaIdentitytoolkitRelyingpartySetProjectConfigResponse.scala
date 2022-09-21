package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse extends StObject {
  
  /**
    * Project ID of the relying party.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
}
object SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse {
  
  inline def apply(): SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse]
  }
  
  extension [Self <: SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse](x: Self) {
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
