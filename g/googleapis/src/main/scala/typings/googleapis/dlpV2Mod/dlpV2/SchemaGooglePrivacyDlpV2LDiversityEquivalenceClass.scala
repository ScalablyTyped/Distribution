package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The set of columns&#39; values that share the same ldiversity value.
  */
trait SchemaGooglePrivacyDlpV2LDiversityEquivalenceClass extends StObject {
  
  /**
    * Size of the k-anonymity equivalence class.
    */
  var equivalenceClassSize: js.UndefOr[String] = js.undefined
  
  /**
    * Number of distinct sensitive values in this equivalence class.
    */
  var numDistinctSensitiveValues: js.UndefOr[String] = js.undefined
  
  /**
    * Quasi-identifier values defining the k-anonymity equivalence class. The
    * order is always the same as the original request.
    */
  var quasiIdsValues: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Value]] = js.undefined
  
  /**
    * Estimated frequencies of top sensitive values.
    */
  var topSensitiveValues: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2ValueFrequency]] = js.undefined
}
object SchemaGooglePrivacyDlpV2LDiversityEquivalenceClass {
  
  inline def apply(): SchemaGooglePrivacyDlpV2LDiversityEquivalenceClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2LDiversityEquivalenceClass]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2LDiversityEquivalenceClass](x: Self) {
    
    inline def setEquivalenceClassSize(value: String): Self = StObject.set(x, "equivalenceClassSize", value.asInstanceOf[js.Any])
    
    inline def setEquivalenceClassSizeUndefined: Self = StObject.set(x, "equivalenceClassSize", js.undefined)
    
    inline def setNumDistinctSensitiveValues(value: String): Self = StObject.set(x, "numDistinctSensitiveValues", value.asInstanceOf[js.Any])
    
    inline def setNumDistinctSensitiveValuesUndefined: Self = StObject.set(x, "numDistinctSensitiveValues", js.undefined)
    
    inline def setQuasiIdsValues(value: js.Array[SchemaGooglePrivacyDlpV2Value]): Self = StObject.set(x, "quasiIdsValues", value.asInstanceOf[js.Any])
    
    inline def setQuasiIdsValuesUndefined: Self = StObject.set(x, "quasiIdsValues", js.undefined)
    
    inline def setQuasiIdsValuesVarargs(value: SchemaGooglePrivacyDlpV2Value*): Self = StObject.set(x, "quasiIdsValues", js.Array(value :_*))
    
    inline def setTopSensitiveValues(value: js.Array[SchemaGooglePrivacyDlpV2ValueFrequency]): Self = StObject.set(x, "topSensitiveValues", value.asInstanceOf[js.Any])
    
    inline def setTopSensitiveValuesUndefined: Self = StObject.set(x, "topSensitiveValues", js.undefined)
    
    inline def setTopSensitiveValuesVarargs(value: SchemaGooglePrivacyDlpV2ValueFrequency*): Self = StObject.set(x, "topSensitiveValues", js.Array(value :_*))
  }
}
