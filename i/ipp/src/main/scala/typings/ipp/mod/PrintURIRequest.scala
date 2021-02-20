package typings.ipp.mod

import typings.ipp.anon.Documentformat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintURIRequest extends StObject {
  
  var `job-attributes-tag`: js.UndefOr[JobTemplateAttributes] = js.native
  
  var `operation-attributes-tag`: Documentformat = js.native
}
object PrintURIRequest {
  
  @scala.inline
  def apply(`operation-attributes-tag`: Documentformat): PrintURIRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintURIRequest]
  }
  
  @scala.inline
  implicit class PrintURIRequestMutableBuilder[Self <: PrintURIRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setJob-attributes-tag`(value: JobTemplateAttributes): Self = StObject.set(x, "job-attributes-tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-attributes-tagUndefined`: Self = StObject.set(x, "job-attributes-tag", js.undefined)
    
    @scala.inline
    def `setOperation-attributes-tag`(value: Documentformat): Self = StObject.set(x, "operation-attributes-tag", value.asInstanceOf[js.Any])
  }
}
