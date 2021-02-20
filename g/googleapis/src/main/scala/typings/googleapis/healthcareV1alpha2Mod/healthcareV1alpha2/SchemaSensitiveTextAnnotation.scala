package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A TextAnnotation specifies a text range that includes sensitive
  * information.
  */
@js.native
trait SchemaSensitiveTextAnnotation extends StObject {
  
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
  implicit class SchemaSensitiveTextAnnotationMutableBuilder[Self <: SchemaSensitiveTextAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: StringDictionary[SchemaDetail]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
  }
}
