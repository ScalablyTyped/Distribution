package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2KAnonymityEquivalenceClass extends StObject {
  
  /**
    * Size of the equivalence class, for example number of rows with the above set of values.
    */
  var equivalenceClassSize: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Set of values defining the equivalence class. One value per quasi-identifier column in the original KAnonymity metric message. The order is always the same as the original request.
    */
  var quasiIdsValues: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Value]] = js.undefined
}
object SchemaGooglePrivacyDlpV2KAnonymityEquivalenceClass {
  
  inline def apply(): SchemaGooglePrivacyDlpV2KAnonymityEquivalenceClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2KAnonymityEquivalenceClass]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2KAnonymityEquivalenceClass](x: Self) {
    
    inline def setEquivalenceClassSize(value: String): Self = StObject.set(x, "equivalenceClassSize", value.asInstanceOf[js.Any])
    
    inline def setEquivalenceClassSizeNull: Self = StObject.set(x, "equivalenceClassSize", null)
    
    inline def setEquivalenceClassSizeUndefined: Self = StObject.set(x, "equivalenceClassSize", js.undefined)
    
    inline def setQuasiIdsValues(value: js.Array[SchemaGooglePrivacyDlpV2Value]): Self = StObject.set(x, "quasiIdsValues", value.asInstanceOf[js.Any])
    
    inline def setQuasiIdsValuesUndefined: Self = StObject.set(x, "quasiIdsValues", js.undefined)
    
    inline def setQuasiIdsValuesVarargs(value: SchemaGooglePrivacyDlpV2Value*): Self = StObject.set(x, "quasiIdsValues", js.Array(value*))
  }
}
