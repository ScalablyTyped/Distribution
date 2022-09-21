package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2SummaryResult extends StObject {
  
  /**
    * Outcome of the transformation.
    */
  var code: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of transformations counted by this result.
    */
  var count: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A place for warnings or errors to show up if a transformation didn't work as expected.
    */
  var details: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2SummaryResult {
  
  inline def apply(): SchemaGooglePrivacyDlpV2SummaryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2SummaryResult]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2SummaryResult](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountNull: Self = StObject.set(x, "count", null)
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsNull: Self = StObject.set(x, "details", null)
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
  }
}
