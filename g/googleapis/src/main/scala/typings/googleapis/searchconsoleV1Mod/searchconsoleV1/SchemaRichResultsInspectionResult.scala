package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRichResultsInspectionResult extends StObject {
  
  /**
    * A list of zero or more rich results detected on this page. Rich results that cannot even be parsed due to syntactic issues will not be listed here.
    */
  var detectedItems: js.UndefOr[js.Array[SchemaDetectedItems]] = js.undefined
  
  /**
    * High-level rich results inspection result for this URL.
    */
  var verdict: js.UndefOr[String | Null] = js.undefined
}
object SchemaRichResultsInspectionResult {
  
  inline def apply(): SchemaRichResultsInspectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRichResultsInspectionResult]
  }
  
  extension [Self <: SchemaRichResultsInspectionResult](x: Self) {
    
    inline def setDetectedItems(value: js.Array[SchemaDetectedItems]): Self = StObject.set(x, "detectedItems", value.asInstanceOf[js.Any])
    
    inline def setDetectedItemsUndefined: Self = StObject.set(x, "detectedItems", js.undefined)
    
    inline def setDetectedItemsVarargs(value: SchemaDetectedItems*): Self = StObject.set(x, "detectedItems", js.Array(value*))
    
    inline def setVerdict(value: String): Self = StObject.set(x, "verdict", value.asInstanceOf[js.Any])
    
    inline def setVerdictNull: Self = StObject.set(x, "verdict", null)
    
    inline def setVerdictUndefined: Self = StObject.set(x, "verdict", js.undefined)
  }
}
