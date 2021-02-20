package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response of setting the project configuration.
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse extends StObject {
  
  /**
    * Project ID of the relying party.
    */
  var projectId: js.UndefOr[String] = js.native
}
object SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse {
  
  @scala.inline
  def apply(): SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse]
  }
  
  @scala.inline
  implicit class SchemaIdentitytoolkitRelyingpartySetProjectConfigResponseMutableBuilder[Self <: SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
