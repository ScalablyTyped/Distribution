package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input only.  Update job request.
  */
@js.native
trait SchemaUpdateJobRequest extends StObject {
  
  /**
    * Required.  The Job to be updated.
    */
  var job: js.UndefOr[SchemaJob] = js.native
  
  /**
    * Optional but strongly recommended to be provided for the best service
    * experience.  If update_mask is provided, only the specified fields in job
    * are updated. Otherwise all the fields are updated.  A field mask to
    * restrict the fields that are updated. Only top level fields of Job are
    * supported.
    */
  var updateMask: js.UndefOr[String] = js.native
}
object SchemaUpdateJobRequest {
  
  @scala.inline
  def apply(): SchemaUpdateJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateJobRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateJobRequestMutableBuilder[Self <: SchemaUpdateJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJob(value: SchemaJob): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
