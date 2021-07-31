package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deletes a conditional format rule at the given index. All subsequent
  * rules&#39; indexes are decremented.
  */
trait SchemaDeleteConditionalFormatRuleRequest extends StObject {
  
  /**
    * The zero-based index of the rule to be deleted.
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * The sheet the rule is being deleted from.
    */
  var sheetId: js.UndefOr[Double] = js.undefined
}
object SchemaDeleteConditionalFormatRuleRequest {
  
  @scala.inline
  def apply(): SchemaDeleteConditionalFormatRuleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteConditionalFormatRuleRequest]
  }
  
  @scala.inline
  implicit class SchemaDeleteConditionalFormatRuleRequestMutableBuilder[Self <: SchemaDeleteConditionalFormatRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
  }
}
