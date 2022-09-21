package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFilesModifylabels
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the file for which the labels are modified.
    */
  var fileId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaModifyLabelsRequest] = js.undefined
}
object ParamsResourceFilesModifylabels {
  
  inline def apply(): ParamsResourceFilesModifylabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFilesModifylabels]
  }
  
  extension [Self <: ParamsResourceFilesModifylabels](x: Self) {
    
    inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    inline def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    inline def setRequestBody(value: SchemaModifyLabelsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
