package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2Row extends StObject {
  
  /**
    * Individual cells.
    */
  var values: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Value]] = js.undefined
}
object SchemaGooglePrivacyDlpV2Row {
  
  inline def apply(): SchemaGooglePrivacyDlpV2Row = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Row]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2Row](x: Self) {
    
    inline def setValues(value: js.Array[SchemaGooglePrivacyDlpV2Value]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: SchemaGooglePrivacyDlpV2Value*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
