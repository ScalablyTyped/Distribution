package typings.googleapis.v5Mod.pagespeedonlineV5

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLighthouseAuditResultV5 extends StObject {
  
  /**
    * The description of the audit.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Freeform details section of the audit.
    */
  var details: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * The value that should be displayed on the UI for this audit.
    */
  var displayValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An error message from a thrown error inside the audit.
    */
  var errorMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An explanation of the errors in the audit.
    */
  var explanation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The audit's id.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unit of the numeric_value field. Used to format the numeric value for display.
    */
  var numericUnit: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A numeric value that has a meaning specific to the audit, e.g. the number of nodes in the DOM or the timestamp of a specific load event. More information can be found in the audit details, if present.
    */
  var numericValue: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The score of the audit, can be null.
    */
  var score: js.UndefOr[Any | Null] = js.undefined
  
  /**
    * The enumerated score display mode.
    */
  var scoreDisplayMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The human readable title.
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Possible warnings that occurred in the audit, can be null.
    */
  var warnings: js.UndefOr[Any | Null] = js.undefined
}
object SchemaLighthouseAuditResultV5 {
  
  inline def apply(): SchemaLighthouseAuditResultV5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLighthouseAuditResultV5]
  }
  
  extension [Self <: SchemaLighthouseAuditResultV5](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDetails(value: StringDictionary[Any]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsNull: Self = StObject.set(x, "details", null)
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setDisplayValue(value: String): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
    
    inline def setDisplayValueNull: Self = StObject.set(x, "displayValue", null)
    
    inline def setDisplayValueUndefined: Self = StObject.set(x, "displayValue", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageNull: Self = StObject.set(x, "errorMessage", null)
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setExplanation(value: String): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
    
    inline def setExplanationNull: Self = StObject.set(x, "explanation", null)
    
    inline def setExplanationUndefined: Self = StObject.set(x, "explanation", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setNumericUnit(value: String): Self = StObject.set(x, "numericUnit", value.asInstanceOf[js.Any])
    
    inline def setNumericUnitNull: Self = StObject.set(x, "numericUnit", null)
    
    inline def setNumericUnitUndefined: Self = StObject.set(x, "numericUnit", js.undefined)
    
    inline def setNumericValue(value: Double): Self = StObject.set(x, "numericValue", value.asInstanceOf[js.Any])
    
    inline def setNumericValueNull: Self = StObject.set(x, "numericValue", null)
    
    inline def setNumericValueUndefined: Self = StObject.set(x, "numericValue", js.undefined)
    
    inline def setScore(value: Any): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreDisplayMode(value: String): Self = StObject.set(x, "scoreDisplayMode", value.asInstanceOf[js.Any])
    
    inline def setScoreDisplayModeNull: Self = StObject.set(x, "scoreDisplayMode", null)
    
    inline def setScoreDisplayModeUndefined: Self = StObject.set(x, "scoreDisplayMode", js.undefined)
    
    inline def setScoreNull: Self = StObject.set(x, "score", null)
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setWarnings(value: Any): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsNull: Self = StObject.set(x, "warnings", null)
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
  }
}
