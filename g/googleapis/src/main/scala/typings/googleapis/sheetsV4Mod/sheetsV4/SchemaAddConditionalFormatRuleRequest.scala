package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Adds a new conditional format rule at the given index. All subsequent
  * rules&#39; indexes are incremented.
  */
trait SchemaAddConditionalFormatRuleRequest extends StObject {
  
  /**
    * The zero-based index where the rule should be inserted.
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * The rule to add.
    */
  var rule: js.UndefOr[SchemaConditionalFormatRule] = js.undefined
}
object SchemaAddConditionalFormatRuleRequest {
  
  @scala.inline
  def apply(): SchemaAddConditionalFormatRuleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddConditionalFormatRuleRequest]
  }
  
  @scala.inline
  implicit class SchemaAddConditionalFormatRuleRequestMutableBuilder[Self <: SchemaAddConditionalFormatRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setRule(value: SchemaConditionalFormatRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
