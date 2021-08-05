package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Sets a data validation rule to every cell in the range. To clear validation
  * in a range, call this with no rule specified.
  */
trait SchemaSetDataValidationRequest extends StObject {
  
  /**
    * The range the data validation rule should apply to.
    */
  var range: js.UndefOr[SchemaGridRange] = js.undefined
  
  /**
    * The data validation rule to set on each cell in the range, or empty to
    * clear the data validation in the range.
    */
  var rule: js.UndefOr[SchemaDataValidationRule] = js.undefined
}
object SchemaSetDataValidationRequest {
  
  inline def apply(): SchemaSetDataValidationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetDataValidationRequest]
  }
  
  extension [Self <: SchemaSetDataValidationRequest](x: Self) {
    
    inline def setRange(value: SchemaGridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRule(value: SchemaDataValidationRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
