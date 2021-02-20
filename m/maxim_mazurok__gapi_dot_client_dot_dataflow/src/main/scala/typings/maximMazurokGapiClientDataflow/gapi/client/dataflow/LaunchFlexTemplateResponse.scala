package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchFlexTemplateResponse extends StObject {
  
  /** The job that was launched, if the request was not a dry run and the job was successfully launched. */
  var job: js.UndefOr[Job] = js.native
}
object LaunchFlexTemplateResponse {
  
  @scala.inline
  def apply(): LaunchFlexTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchFlexTemplateResponse]
  }
  
  @scala.inline
  implicit class LaunchFlexTemplateResponseMutableBuilder[Self <: LaunchFlexTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJob(value: Job): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
  }
}
