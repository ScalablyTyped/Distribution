package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A TextAnnotation specifies a text range that includes sensitive
  * information.
  */
@js.native
trait SchemaSensitiveTextAnnotation extends js.Object {
  
  /**
    * Maps from a resource slice (e.g. FHIR resource field path) to a set of
    * sensitive text findings. For example, Appointment.Narrative text1 --&gt;
    * {findings_1, findings_2, findings_3}
    */
  var details: js.UndefOr[StringDictionary[SchemaDetail]] = js.native
}
object SchemaSensitiveTextAnnotation {
  
  @scala.inline
  def apply(): SchemaSensitiveTextAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSensitiveTextAnnotation]
  }
  
  @scala.inline
  implicit class SchemaSensitiveTextAnnotationOps[Self <: SchemaSensitiveTextAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDetails(value: StringDictionary[SchemaDetail]): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
  }
}
