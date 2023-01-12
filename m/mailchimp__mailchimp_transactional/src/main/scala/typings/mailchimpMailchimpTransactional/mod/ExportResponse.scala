package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportResponse extends StObject {
  
  /** the date and time that the export job was created as a UTC string in YYYY-MM-DD HH:MM:SS format */
  var created_at: String
  
  /** the date and time that the export job was finished as a UTC string in YYYY-MM-DD HH:MM:SS format */
  var finished_at: String
  
  /** the unique identifier for this Export. Use this identifier when checking the export job's status */
  var id: String
  
  /** the url for the export job's results, if the job is completed. */
  var result_url: String
  
  /** the export job's state - waiting, working, complete, error, or expired. */
  var state: ExportsJobState
  
  /** the type of the export job - activity, reject, or allowlist */
  var `type`: ExportsJobType
}
object ExportResponse {
  
  inline def apply(
    created_at: String,
    finished_at: String,
    id: String,
    result_url: String,
    state: ExportsJobState,
    `type`: ExportsJobType
  ): ExportResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], finished_at = finished_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], result_url = result_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportResponse] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setFinished_at(value: String): Self = StObject.set(x, "finished_at", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setResult_url(value: String): Self = StObject.set(x, "result_url", value.asInstanceOf[js.Any])
    
    inline def setState(value: ExportsJobState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setType(value: ExportsJobType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
