package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDSSEHint extends StObject {
  
  /**
    * Required. The human readable name of this attestation authority, for example "cloudbuild-prod".
    */
  var humanReadableName: js.UndefOr[String | Null] = js.undefined
}
object SchemaDSSEHint {
  
  inline def apply(): SchemaDSSEHint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDSSEHint]
  }
  
  extension [Self <: SchemaDSSEHint](x: Self) {
    
    inline def setHumanReadableName(value: String): Self = StObject.set(x, "humanReadableName", value.asInstanceOf[js.Any])
    
    inline def setHumanReadableNameNull: Self = StObject.set(x, "humanReadableName", null)
    
    inline def setHumanReadableNameUndefined: Self = StObject.set(x, "humanReadableName", js.undefined)
  }
}
