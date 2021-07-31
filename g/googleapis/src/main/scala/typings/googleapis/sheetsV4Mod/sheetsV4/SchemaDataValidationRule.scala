package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A data validation rule.
  */
trait SchemaDataValidationRule extends StObject {
  
  /**
    * The condition that data in the cell must match.
    */
  var condition: js.UndefOr[SchemaBooleanCondition] = js.undefined
  
  /**
    * A message to show the user when adding data to the cell.
    */
  var inputMessage: js.UndefOr[String] = js.undefined
  
  /**
    * True if the UI should be customized based on the kind of condition. If
    * true, &quot;List&quot; conditions will show a dropdown.
    */
  var showCustomUi: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True if invalid data should be rejected.
    */
  var strict: js.UndefOr[Boolean] = js.undefined
}
object SchemaDataValidationRule {
  
  @scala.inline
  def apply(): SchemaDataValidationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataValidationRule]
  }
  
  @scala.inline
  implicit class SchemaDataValidationRuleMutableBuilder[Self <: SchemaDataValidationRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: SchemaBooleanCondition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setInputMessage(value: String): Self = StObject.set(x, "inputMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputMessageUndefined: Self = StObject.set(x, "inputMessage", js.undefined)
    
    @scala.inline
    def setShowCustomUi(value: Boolean): Self = StObject.set(x, "showCustomUi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCustomUiUndefined: Self = StObject.set(x, "showCustomUi", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
