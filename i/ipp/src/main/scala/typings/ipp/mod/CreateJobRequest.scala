package typings.ipp.mod

import typings.ipp.anon.Ippattributefidelity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateJobRequest extends StObject {
  
  var `job-attributes-tag`: js.UndefOr[JobTemplateAttributes] = js.undefined
  
  var `operation-attributes-tag`: Ippattributefidelity
}
object CreateJobRequest {
  
  @scala.inline
  def apply(`operation-attributes-tag`: Ippattributefidelity): CreateJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobRequest]
  }
  
  @scala.inline
  implicit class CreateJobRequestMutableBuilder[Self <: CreateJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setJob-attributes-tag`(value: JobTemplateAttributes): Self = StObject.set(x, "job-attributes-tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-attributes-tagUndefined`: Self = StObject.set(x, "job-attributes-tag", js.undefined)
    
    @scala.inline
    def `setOperation-attributes-tag`(value: Ippattributefidelity): Self = StObject.set(x, "operation-attributes-tag", value.asInstanceOf[js.Any])
  }
}
