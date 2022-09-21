package typings.hyperformula

import typings.hyperformula.maybeMod.Maybe
import typings.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("hyperformula/typings/format/parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait FormatExpressionType extends StObject
  @JSImport("hyperformula/typings/format/parser", "FormatExpressionType")
  @js.native
  object FormatExpressionType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FormatExpressionType & String] = js.native
    
    @js.native
    sealed trait DATE
      extends StObject
         with FormatExpressionType
    /* "DATE" */ val DATE: typings.hyperformula.parserMod.FormatExpressionType.DATE & String = js.native
    
    @js.native
    sealed trait NUMBER
      extends StObject
         with FormatExpressionType
    /* "NUMBER" */ val NUMBER: typings.hyperformula.parserMod.FormatExpressionType.NUMBER & String = js.native
    
    @js.native
    sealed trait STRING
      extends StObject
         with FormatExpressionType
    /* "STRING" */ val STRING: typings.hyperformula.parserMod.FormatExpressionType.STRING & String = js.native
  }
  
  @js.native
  sealed trait TokenType extends StObject
  @JSImport("hyperformula/typings/format/parser", "TokenType")
  @js.native
  object TokenType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TokenType & String] = js.native
    
    @js.native
    sealed trait FORMAT
      extends StObject
         with TokenType
    /* "FORMAT" */ val FORMAT: typings.hyperformula.parserMod.TokenType.FORMAT & String = js.native
    
    @js.native
    sealed trait FREE_TEXT
      extends StObject
         with TokenType
    /* "FREE_TEXT" */ val FREE_TEXT: typings.hyperformula.parserMod.TokenType.FREE_TEXT & String = js.native
  }
  
  inline def formatToken(`type`: TokenType, value: String): FormatToken_ = (^.asInstanceOf[js.Dynamic].applyDynamic("formatToken")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[FormatToken_]
  
  inline def isEscapeToken(token: RegExpExecArray): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEscapeToken")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parse(str: String): FormatExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[FormatExpression]
  
  inline def parseForDateTimeFormat(str: String): Maybe[FormatExpression] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseForDateTimeFormat")(str.asInstanceOf[js.Any]).asInstanceOf[Maybe[FormatExpression]]
  
  inline def parseForNumberFormat(str: String): Maybe[FormatExpression] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseForNumberFormat")(str.asInstanceOf[js.Any]).asInstanceOf[Maybe[FormatExpression]]
  
  trait FormatExpression extends StObject {
    
    var tokens: js.Array[FormatToken_]
    
    var `type`: FormatExpressionType
  }
  object FormatExpression {
    
    inline def apply(tokens: js.Array[FormatToken_], `type`: FormatExpressionType): FormatExpression = {
      val __obj = js.Dynamic.literal(tokens = tokens.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatExpression]
    }
    
    extension [Self <: FormatExpression](x: Self) {
      
      inline def setTokens(value: js.Array[FormatToken_]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensVarargs(value: FormatToken_ *): Self = StObject.set(x, "tokens", js.Array(value*))
      
      inline def setType(value: FormatExpressionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormatToken_ extends StObject {
    
    var `type`: TokenType
    
    var value: String
  }
  object FormatToken_ {
    
    inline def apply(`type`: TokenType, value: String): FormatToken_ = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatToken_]
    }
    
    extension [Self <: FormatToken_](x: Self) {
      
      inline def setType(value: TokenType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
