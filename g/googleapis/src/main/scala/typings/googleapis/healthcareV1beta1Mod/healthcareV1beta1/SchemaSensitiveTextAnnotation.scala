package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSensitiveTextAnnotation extends StObject {
  
  /**
    * Maps from a resource slice. For example, FHIR resource field path to a set of sensitive text findings. For example, Appointment.Narrative text1 --\> {findings_1, findings_2, findings_3\}
    */
  var details: js.UndefOr[StringDictionary[SchemaDetail] | Null] = js.undefined
}
object SchemaSensitiveTextAnnotation {
  
  inline def apply(): SchemaSensitiveTextAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSensitiveTextAnnotation]
  }
  
  extension [Self <: SchemaSensitiveTextAnnotation](x: Self) {
    
    inline def setDetails(value: StringDictionary[SchemaDetail]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsNull: Self = StObject.set(x, "details", null)
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
  }
}
