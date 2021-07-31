package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A rule that may or may not match, depending on the condition.
  */
trait SchemaBooleanRule extends StObject {
  
  /**
    * The condition of the rule. If the condition evaluates to true, the format
    * is applied.
    */
  var condition: js.UndefOr[SchemaBooleanCondition] = js.undefined
  
  /**
    * The format to apply. Conditional formatting can only apply a subset of
    * formatting: bold, italic, strikethrough, foreground color &amp;
    * background color.
    */
  var format: js.UndefOr[SchemaCellFormat] = js.undefined
}
object SchemaBooleanRule {
  
  @scala.inline
  def apply(): SchemaBooleanRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBooleanRule]
  }
  
  @scala.inline
  implicit class SchemaBooleanRuleMutableBuilder[Self <: SchemaBooleanRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: SchemaBooleanCondition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setFormat(value: SchemaCellFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
