package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of conditions.
  */
trait SchemaGooglePrivacyDlpV2Conditions extends StObject {
  
  var conditions: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Condition]] = js.undefined
}
object SchemaGooglePrivacyDlpV2Conditions {
  
  inline def apply(): SchemaGooglePrivacyDlpV2Conditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Conditions]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2Conditions](x: Self) {
    
    inline def setConditions(value: js.Array[SchemaGooglePrivacyDlpV2Condition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: SchemaGooglePrivacyDlpV2Condition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
  }
}
