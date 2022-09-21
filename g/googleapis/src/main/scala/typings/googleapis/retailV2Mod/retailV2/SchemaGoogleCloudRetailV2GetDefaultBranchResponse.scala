package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2GetDefaultBranchResponse extends StObject {
  
  /**
    * Full resource name of the branch id currently set as default branch.
    */
  var branch: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This corresponds to SetDefaultBranchRequest.note field, when this branch was set as default.
    */
  var note: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time when this branch is set to default.
    */
  var setTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2GetDefaultBranchResponse {
  
  inline def apply(): SchemaGoogleCloudRetailV2GetDefaultBranchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2GetDefaultBranchResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2GetDefaultBranchResponse](x: Self) {
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setBranchNull: Self = StObject.set(x, "branch", null)
    
    inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteNull: Self = StObject.set(x, "note", null)
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setSetTime(value: String): Self = StObject.set(x, "setTime", value.asInstanceOf[js.Any])
    
    inline def setSetTimeNull: Self = StObject.set(x, "setTime", null)
    
    inline def setSetTimeUndefined: Self = StObject.set(x, "setTime", js.undefined)
  }
}
