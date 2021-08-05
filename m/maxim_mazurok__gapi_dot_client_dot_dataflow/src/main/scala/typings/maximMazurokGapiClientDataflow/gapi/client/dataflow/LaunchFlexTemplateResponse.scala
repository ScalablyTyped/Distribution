package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchFlexTemplateResponse extends StObject {
  
  /** The job that was launched, if the request was not a dry run and the job was successfully launched. */
  var job: js.UndefOr[Job] = js.undefined
}
object LaunchFlexTemplateResponse {
  
  inline def apply(): LaunchFlexTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchFlexTemplateResponse]
  }
  
  extension [Self <: LaunchFlexTemplateResponse](x: Self) {
    
    inline def setJob(value: Job): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    inline def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
  }
}
