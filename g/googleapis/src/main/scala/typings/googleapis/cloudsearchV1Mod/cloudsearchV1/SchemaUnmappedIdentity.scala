package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUnmappedIdentity extends StObject {
  
  /**
    * The resource name for an external user.
    */
  var externalIdentity: js.UndefOr[SchemaPrincipal] = js.undefined
  
  /**
    * The resolution status for the external identity.
    */
  var resolutionStatusCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaUnmappedIdentity {
  
  inline def apply(): SchemaUnmappedIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnmappedIdentity]
  }
  
  extension [Self <: SchemaUnmappedIdentity](x: Self) {
    
    inline def setExternalIdentity(value: SchemaPrincipal): Self = StObject.set(x, "externalIdentity", value.asInstanceOf[js.Any])
    
    inline def setExternalIdentityUndefined: Self = StObject.set(x, "externalIdentity", js.undefined)
    
    inline def setResolutionStatusCode(value: String): Self = StObject.set(x, "resolutionStatusCode", value.asInstanceOf[js.Any])
    
    inline def setResolutionStatusCodeNull: Self = StObject.set(x, "resolutionStatusCode", null)
    
    inline def setResolutionStatusCodeUndefined: Self = StObject.set(x, "resolutionStatusCode", js.undefined)
  }
}
