package typings.jsTokens

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js-tokens", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(input: String): js.Iterable[Token] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[js.Iterable[Token]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsTokens.anon.Closed
    - typings.jsTokens.anon.Type
    - typings.jsTokens.anon.Value
    - typings.jsTokens.anon.TypeValue
    - typings.jsTokens.anon.ValueString
  */
  trait JSXToken extends StObject
  object JSXToken {
    
    inline def Closed(closed: Boolean, value: String): typings.jsTokens.anon.Closed = {
      val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("JSXString")
      __obj.asInstanceOf[typings.jsTokens.anon.Closed]
    }
    
    inline def Type(value: String): typings.jsTokens.anon.Type = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("JSXText")
      __obj.asInstanceOf[typings.jsTokens.anon.Type]
    }
    
    inline def TypeValue(value: String): typings.jsTokens.anon.TypeValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("JSXPunctuator")
      __obj.asInstanceOf[typings.jsTokens.anon.TypeValue]
    }
    
    inline def Value(value: String): typings.jsTokens.anon.Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("JSXIdentifier")
      __obj.asInstanceOf[typings.jsTokens.anon.Value]
    }
    
    inline def ValueString(value: String): typings.jsTokens.anon.ValueString = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("JSXInvalid")
      __obj.asInstanceOf[typings.jsTokens.anon.ValueString]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsTokens.anon.ClosedType
    - typings.jsTokens.anon.ClosedTypeValue
    - typings.jsTokens.anon.TypeValueString
    - typings.jsTokens.anon.`0`
    - typings.jsTokens.anon.ClosedBoolean
    - typings.jsTokens.anon.ClosedBooleanType
    - typings.jsTokens.anon.ClosedBooleanTypeValueString
    - typings.jsTokens.anon.`1`
    - typings.jsTokens.anon.`2`
    - typings.jsTokens.anon.`3`
    - typings.jsTokens.anon.`4`
    - typings.jsTokens.anon.`5`
    - typings.jsTokens.anon.`6`
    - typings.jsTokens.anon.`7`
    - typings.jsTokens.anon.`8`
  */
  trait Token extends StObject
  object Token {
    
    inline def `0`(value: String): typings.jsTokens.anon.`0` = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("TemplateMiddle")
      __obj.asInstanceOf[typings.jsTokens.anon.`0`]
    }
    
    inline def `1`(value: String): typings.jsTokens.anon.`1` = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("SingleLineComment")
      __obj.asInstanceOf[typings.jsTokens.anon.`1`]
    }
    
    inline def `2`(value: String): typings.jsTokens.anon.`2` = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("IdentifierName")
      __obj.asInstanceOf[typings.jsTokens.anon.`2`]
    }
    
    inline def `3`(value: String): typings.jsTokens.anon.`3` = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("PrivateIdentifier")
      __obj.asInstanceOf[typings.jsTokens.anon.`3`]
    }
    
    inline def `4`(value: String): typings.jsTokens.anon.`4` = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("NumericLiteral")
      __obj.asInstanceOf[typings.jsTokens.anon.`4`]
    }
    
    inline def `5`(value: String): typings.jsTokens.anon.`5` = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Punctuator")
      __obj.asInstanceOf[typings.jsTokens.anon.`5`]
    }
    
    inline def `6`(value: String): typings.jsTokens.anon.`6` = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("WhiteSpace")
      __obj.asInstanceOf[typings.jsTokens.anon.`6`]
    }
    
    inline def `7`(value: String): typings.jsTokens.anon.`7` = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("LineTerminatorSequence")
      __obj.asInstanceOf[typings.jsTokens.anon.`7`]
    }
    
    inline def `8`(value: String): typings.jsTokens.anon.`8` = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Invalid")
      __obj.asInstanceOf[typings.jsTokens.anon.`8`]
    }
    
    inline def ClosedBoolean(closed: Boolean, value: String): typings.jsTokens.anon.ClosedBoolean = {
      val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("TemplateTail")
      __obj.asInstanceOf[typings.jsTokens.anon.ClosedBoolean]
    }
    
    inline def ClosedBooleanType(closed: Boolean, value: String): typings.jsTokens.anon.ClosedBooleanType = {
      val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("RegularExpressionLiteral")
      __obj.asInstanceOf[typings.jsTokens.anon.ClosedBooleanType]
    }
    
    inline def ClosedBooleanTypeValueString(closed: Boolean, value: String): typings.jsTokens.anon.ClosedBooleanTypeValueString = {
      val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiLineComment")
      __obj.asInstanceOf[typings.jsTokens.anon.ClosedBooleanTypeValueString]
    }
    
    inline def ClosedType(closed: Boolean, value: String): typings.jsTokens.anon.ClosedType = {
      val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("StringLiteral")
      __obj.asInstanceOf[typings.jsTokens.anon.ClosedType]
    }
    
    inline def ClosedTypeValue(closed: Boolean, value: String): typings.jsTokens.anon.ClosedTypeValue = {
      val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("NoSubstitutionTemplate")
      __obj.asInstanceOf[typings.jsTokens.anon.ClosedTypeValue]
    }
    
    inline def TypeValueString(value: String): typings.jsTokens.anon.TypeValueString = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("TemplateHead")
      __obj.asInstanceOf[typings.jsTokens.anon.TypeValueString]
    }
  }
}
