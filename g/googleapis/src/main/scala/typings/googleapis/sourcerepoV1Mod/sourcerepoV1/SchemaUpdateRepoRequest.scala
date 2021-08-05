package typings.googleapis.sourcerepoV1Mod.sourcerepoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for UpdateRepo.
  */
trait SchemaUpdateRepoRequest extends StObject {
  
  /**
    * The new configuration for the repository.
    */
  var repo: js.UndefOr[SchemaRepo] = js.undefined
  
  /**
    * A FieldMask specifying which fields of the repo to modify. Only the
    * fields in the mask will be modified. If no mask is provided, this request
    * is no-op.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object SchemaUpdateRepoRequest {
  
  inline def apply(): SchemaUpdateRepoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateRepoRequest]
  }
  
  extension [Self <: SchemaUpdateRepoRequest](x: Self) {
    
    inline def setRepo(value: SchemaRepo): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setRepoUndefined: Self = StObject.set(x, "repo", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
