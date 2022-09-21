package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJobExecutionDetails extends StObject {
  
  /**
    * If present, this response does not contain all requested tasks. To obtain the next page of results, repeat the request with page_token set to this value.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The stages of the job execution.
    */
  var stages: js.UndefOr[js.Array[SchemaStageSummary]] = js.undefined
}
object SchemaJobExecutionDetails {
  
  inline def apply(): SchemaJobExecutionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobExecutionDetails]
  }
  
  extension [Self <: SchemaJobExecutionDetails](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setStages(value: js.Array[SchemaStageSummary]): Self = StObject.set(x, "stages", value.asInstanceOf[js.Any])
    
    inline def setStagesUndefined: Self = StObject.set(x, "stages", js.undefined)
    
    inline def setStagesVarargs(value: SchemaStageSummary*): Self = StObject.set(x, "stages", js.Array(value*))
  }
}
