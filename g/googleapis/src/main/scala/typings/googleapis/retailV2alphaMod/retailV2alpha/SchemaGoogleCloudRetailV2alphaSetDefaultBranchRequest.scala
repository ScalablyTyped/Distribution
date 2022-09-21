package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaSetDefaultBranchRequest extends StObject {
  
  /**
    * The final component of the resource name of a branch. This field must be one of "0", "1" or "2". Otherwise, an INVALID_ARGUMENT error is returned. If there are no sufficient active products in the targeted branch and force is not set, a FAILED_PRECONDITION error is returned.
    */
  var branchId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If set to true, it permits switching to a branch with branch_id even if it has no sufficient active products.
    */
  var force: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Some note on this request, this can be retrieved by CatalogService.GetDefaultBranch before next valid default branch set occurs. This field must be a UTF-8 encoded string with a length limit of 1,000 characters. Otherwise, an INVALID_ARGUMENT error is returned.
    */
  var note: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaSetDefaultBranchRequest {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaSetDefaultBranchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaSetDefaultBranchRequest]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaSetDefaultBranchRequest](x: Self) {
    
    inline def setBranchId(value: String): Self = StObject.set(x, "branchId", value.asInstanceOf[js.Any])
    
    inline def setBranchIdNull: Self = StObject.set(x, "branchId", null)
    
    inline def setBranchIdUndefined: Self = StObject.set(x, "branchId", js.undefined)
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceNull: Self = StObject.set(x, "force", null)
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteNull: Self = StObject.set(x, "note", null)
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
  }
}
