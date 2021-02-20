package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaUnmappedIdentity extends StObject {
  
  /**
    * The resource name for an external user.
    */
  var externalIdentity: js.UndefOr[SchemaPrincipal] = js.native
  
  /**
    * The resolution status for the external identity.
    */
  var resolutionStatusCode: js.UndefOr[String] = js.native
}
object SchemaUnmappedIdentity {
  
  @scala.inline
  def apply(): SchemaUnmappedIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnmappedIdentity]
  }
  
  @scala.inline
  implicit class SchemaUnmappedIdentityMutableBuilder[Self <: SchemaUnmappedIdentity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternalIdentity(value: SchemaPrincipal): Self = StObject.set(x, "externalIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalIdentityUndefined: Self = StObject.set(x, "externalIdentity", js.undefined)
    
    @scala.inline
    def setResolutionStatusCode(value: String): Self = StObject.set(x, "resolutionStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionStatusCodeUndefined: Self = StObject.set(x, "resolutionStatusCode", js.undefined)
  }
}
