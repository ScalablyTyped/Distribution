package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBooleanRule extends StObject {
  
  /**
    * The condition of the rule. If the condition evaluates to true, the format is applied.
    */
  var condition: js.UndefOr[SchemaBooleanCondition] = js.undefined
  
  /**
    * The format to apply. Conditional formatting can only apply a subset of formatting: bold, italic, strikethrough, foreground color & background color.
    */
  var format: js.UndefOr[SchemaCellFormat] = js.undefined
}
object SchemaBooleanRule {
  
  inline def apply(): SchemaBooleanRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBooleanRule]
  }
  
  extension [Self <: SchemaBooleanRule](x: Self) {
    
    inline def setCondition(value: SchemaBooleanCondition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setFormat(value: SchemaCellFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
