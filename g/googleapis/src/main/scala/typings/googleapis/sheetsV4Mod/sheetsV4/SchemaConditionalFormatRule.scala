package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A rule describing a conditional format.
  */
trait SchemaConditionalFormatRule extends StObject {
  
  /**
    * The formatting is either &quot;on&quot; or &quot;off&quot; according to
    * the rule.
    */
  var booleanRule: js.UndefOr[SchemaBooleanRule] = js.undefined
  
  /**
    * The formatting will vary based on the gradients in the rule.
    */
  var gradientRule: js.UndefOr[SchemaGradientRule] = js.undefined
  
  /**
    * The ranges that are formatted if the condition is true. All the ranges
    * must be on the same grid.
    */
  var ranges: js.UndefOr[js.Array[SchemaGridRange]] = js.undefined
}
object SchemaConditionalFormatRule {
  
  @scala.inline
  def apply(): SchemaConditionalFormatRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConditionalFormatRule]
  }
  
  @scala.inline
  implicit class SchemaConditionalFormatRuleMutableBuilder[Self <: SchemaConditionalFormatRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBooleanRule(value: SchemaBooleanRule): Self = StObject.set(x, "booleanRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBooleanRuleUndefined: Self = StObject.set(x, "booleanRule", js.undefined)
    
    @scala.inline
    def setGradientRule(value: SchemaGradientRule): Self = StObject.set(x, "gradientRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientRuleUndefined: Self = StObject.set(x, "gradientRule", js.undefined)
    
    @scala.inline
    def setRanges(value: js.Array[SchemaGridRange]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    @scala.inline
    def setRangesVarargs(value: SchemaGridRange*): Self = StObject.set(x, "ranges", js.Array(value :_*))
  }
}
