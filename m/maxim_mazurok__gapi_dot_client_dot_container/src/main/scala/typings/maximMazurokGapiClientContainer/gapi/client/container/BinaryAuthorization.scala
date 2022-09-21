package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinaryAuthorization extends StObject {
  
  /**
    * This field is deprecated. Leave this unset and instead configure BinaryAuthorization using evaluation_mode. If evaluation_mode is set to anything other than
    * EVALUATION_MODE_UNSPECIFIED, this field is ignored.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /** Mode of operation for binauthz policy evaluation. Currently the only options are equivalent to enable/disable. If unspecified, defaults to DISABLED. */
  var evaluationMode: js.UndefOr[String] = js.undefined
}
object BinaryAuthorization {
  
  inline def apply(): BinaryAuthorization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BinaryAuthorization]
  }
  
  extension [Self <: BinaryAuthorization](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEvaluationMode(value: String): Self = StObject.set(x, "evaluationMode", value.asInstanceOf[js.Any])
    
    inline def setEvaluationModeUndefined: Self = StObject.set(x, "evaluationMode", js.undefined)
  }
}
