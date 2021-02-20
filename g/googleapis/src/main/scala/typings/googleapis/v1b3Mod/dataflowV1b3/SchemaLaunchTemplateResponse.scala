package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to the request to launch a template.
  */
@js.native
trait SchemaLaunchTemplateResponse extends StObject {
  
  /**
    * The job that was launched, if the request was not a dry run and the job
    * was successfully launched.
    */
  var job: js.UndefOr[SchemaJob] = js.native
}
object SchemaLaunchTemplateResponse {
  
  @scala.inline
  def apply(): SchemaLaunchTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLaunchTemplateResponse]
  }
  
  @scala.inline
  implicit class SchemaLaunchTemplateResponseMutableBuilder[Self <: SchemaLaunchTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJob(value: SchemaJob): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
  }
}
