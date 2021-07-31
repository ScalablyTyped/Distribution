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
  
  @scala.inline
  def apply(): SchemaSetDataValidationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetDataValidationRequest]
  }
  
  @scala.inline
  implicit class SchemaSetDataValidationRequestMutableBuilder[Self <: SchemaSetDataValidationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRange(value: SchemaGridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setRule(value: SchemaDataValidationRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
