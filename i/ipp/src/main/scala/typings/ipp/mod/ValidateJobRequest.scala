package typings.ipp.mod

import typings.ipp.anon.Documentname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateJobRequest extends StObject {
  
  var `job-attributes-tag`: js.UndefOr[JobTemplateAttributes] = js.undefined
  
  var `operation-attributes-tag`: Documentname
}
object ValidateJobRequest {
  
  inline def apply(`operation-attributes-tag`: Documentname): ValidateJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidateJobRequest] (val x: Self) extends AnyVal {
    
    inline def `setJob-attributes-tag`(value: JobTemplateAttributes): Self = StObject.set(x, "job-attributes-tag", value.asInstanceOf[js.Any])
    
    inline def `setJob-attributes-tagUndefined`: Self = StObject.set(x, "job-attributes-tag", js.undefined)
    
    inline def `setOperation-attributes-tag`(value: Documentname): Self = StObject.set(x, "operation-attributes-tag", value.asInstanceOf[js.Any])
  }
}
