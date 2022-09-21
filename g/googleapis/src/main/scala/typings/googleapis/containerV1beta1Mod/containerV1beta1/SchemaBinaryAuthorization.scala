package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBinaryAuthorization extends StObject {
  
  /**
    * This field is deprecated. Leave this unset and instead configure BinaryAuthorization using evaluation_mode. If evaluation_mode is set to anything other than EVALUATION_MODE_UNSPECIFIED, this field is ignored.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Mode of operation for binauthz policy evaluation. Currently the only options are equivalent to enable/disable. If unspecified, defaults to DISABLED.
    */
  var evaluationMode: js.UndefOr[String | Null] = js.undefined
}
object SchemaBinaryAuthorization {
  
  inline def apply(): SchemaBinaryAuthorization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBinaryAuthorization]
  }
  
  extension [Self <: SchemaBinaryAuthorization](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEvaluationMode(value: String): Self = StObject.set(x, "evaluationMode", value.asInstanceOf[js.Any])
    
    inline def setEvaluationModeNull: Self = StObject.set(x, "evaluationMode", null)
    
    inline def setEvaluationModeUndefined: Self = StObject.set(x, "evaluationMode", js.undefined)
  }
}
