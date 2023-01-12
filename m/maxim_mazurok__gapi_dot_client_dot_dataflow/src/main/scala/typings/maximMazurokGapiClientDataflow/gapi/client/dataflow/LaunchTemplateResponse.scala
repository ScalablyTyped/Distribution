package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateResponse extends StObject {
  
  /** The job that was launched, if the request was not a dry run and the job was successfully launched. */
  var job: js.UndefOr[Job] = js.undefined
}
object LaunchTemplateResponse {
  
  inline def apply(): LaunchTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LaunchTemplateResponse] (val x: Self) extends AnyVal {
    
    inline def setJob(value: Job): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    inline def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
  }
}
