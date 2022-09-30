package typings.html2canvas

import typings.html2canvas.backgroundSizeMod.BackgroundSizeInfo
import typings.html2canvas.html2canvasInts.`0`
import typings.html2canvas.html2canvasInts.`10`
import typings.html2canvas.html2canvasInts.`11`
import typings.html2canvas.html2canvasInts.`12`
import typings.html2canvas.html2canvasInts.`13`
import typings.html2canvas.html2canvasInts.`14`
import typings.html2canvas.html2canvasInts.`15`
import typings.html2canvas.html2canvasInts.`16`
import typings.html2canvas.html2canvasInts.`17`
import typings.html2canvas.html2canvasInts.`18`
import typings.html2canvas.html2canvasInts.`19`
import typings.html2canvas.html2canvasInts.`1`
import typings.html2canvas.html2canvasInts.`20`
import typings.html2canvas.html2canvasInts.`21`
import typings.html2canvas.html2canvasInts.`22`
import typings.html2canvas.html2canvasInts.`23`
import typings.html2canvas.html2canvasInts.`24`
import typings.html2canvas.html2canvasInts.`25`
import typings.html2canvas.html2canvasInts.`26`
import typings.html2canvas.html2canvasInts.`27`
import typings.html2canvas.html2canvasInts.`28`
import typings.html2canvas.html2canvasInts.`29`
import typings.html2canvas.html2canvasInts.`2`
import typings.html2canvas.html2canvasInts.`30`
import typings.html2canvas.html2canvasInts.`31`
import typings.html2canvas.html2canvasInts.`32`
import typings.html2canvas.html2canvasInts.`3`
import typings.html2canvas.html2canvasInts.`4`
import typings.html2canvas.html2canvasInts.`5`
import typings.html2canvas.html2canvasInts.`6`
import typings.html2canvas.html2canvasInts.`7`
import typings.html2canvas.html2canvasInts.`8`
import typings.html2canvas.html2canvasInts.`9`
import typings.html2canvas.lengthMod.Length
import typings.html2canvas.lengthPercentageMod.LengthPercentage
import typings.html2canvas.parserMod.CSSValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenizerMod {
  
  @JSImport("html2canvas/dist/types/css/syntax/tokenizer", "EOF_TOKEN")
  @js.native
  val EOF_TOKEN: Token = js.native
  
  @JSImport("html2canvas/dist/types/css/syntax/tokenizer", "FLAG_ID")
  @js.native
  val FLAG_ID: Double = js.native
  
  @JSImport("html2canvas/dist/types/css/syntax/tokenizer", "FLAG_INTEGER")
  @js.native
  val FLAG_INTEGER: Double = js.native
  
  @JSImport("html2canvas/dist/types/css/syntax/tokenizer", "FLAG_NUMBER")
  @js.native
  val FLAG_NUMBER: Double = js.native
  
  @JSImport("html2canvas/dist/types/css/syntax/tokenizer", "FLAG_UNRESTRICTED")
  @js.native
  val FLAG_UNRESTRICTED: Double = js.native
  
  @JSImport("html2canvas/dist/types/css/syntax/tokenizer", "Tokenizer")
  @js.native
  open class Tokenizer () extends StObject {
    
    /* private */ var _value: Any = js.native
    
    /* private */ var consumeBadUrlRemnants: Any = js.native
    
    /* private */ var consumeCodePoint: Any = js.native
    
    /* private */ var consumeEscapedCodePoint: Any = js.native
    
    /* private */ var consumeIdentLikeToken: Any = js.native
    
    /* private */ var consumeName: Any = js.native
    
    /* private */ var consumeNumber: Any = js.native
    
    /* private */ var consumeNumericToken: Any = js.native
    
    /* private */ var consumeStringSlice: Any = js.native
    
    /* private */ var consumeStringToken: Any = js.native
    
    /* private */ var consumeToken: Any = js.native
    
    /* private */ var consumeUnicodeRangeToken: Any = js.native
    
    /* private */ var consumeUrlToken: Any = js.native
    
    /* private */ var consumeWhiteSpace: Any = js.native
    
    /* private */ var peekCodePoint: Any = js.native
    
    def read(): js.Array[CSSToken] = js.native
    
    /* private */ var reconsumeCodePoint: Any = js.native
    
    def write(chunk: String): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.html2canvas.tokenizerMod.Token
    - typings.html2canvas.tokenizerMod.StringValueToken
    - typings.html2canvas.tokenizerMod.NumberValueToken
    - typings.html2canvas.tokenizerMod.DimensionToken
    - typings.html2canvas.tokenizerMod.UnicodeRangeToken
    - typings.html2canvas.tokenizerMod.HashToken
  */
  trait CSSToken
    extends StObject
       with CSSValue
  object CSSToken {
    
    inline def DimensionToken(flags: Double, number: Double, unit: String): typings.html2canvas.tokenizerMod.DimensionToken = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(15)
      __obj.asInstanceOf[typings.html2canvas.tokenizerMod.DimensionToken]
    }
    
    inline def HashToken(flags: Double, value: String): typings.html2canvas.tokenizerMod.HashToken = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(5)
      __obj.asInstanceOf[typings.html2canvas.tokenizerMod.HashToken]
    }
    
    inline def NumberValueToken(flags: Double, number: Double, `type`: `16` | `17`): typings.html2canvas.tokenizerMod.NumberValueToken = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.html2canvas.tokenizerMod.NumberValueToken]
    }
    
    inline def StringValueToken(`type`: `0` | `6` | `19` | `20` | `22` | `7`, value: String): typings.html2canvas.tokenizerMod.StringValueToken = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.html2canvas.tokenizerMod.StringValueToken]
    }
    
    inline def Token(
      `type`: `23` | `1` | `2` | `3` | `4` | `14` | `8` | `13` | `26` | `27` | `28` | `29` | `11` | `12` | `9` | `10` | `21` | `31` | `24` | `25` | `32`
    ): typings.html2canvas.tokenizerMod.Token = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.html2canvas.tokenizerMod.Token]
    }
    
    inline def UnicodeRangeToken(end: Double, start: Double): typings.html2canvas.tokenizerMod.UnicodeRangeToken = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(30)
      __obj.asInstanceOf[typings.html2canvas.tokenizerMod.UnicodeRangeToken]
    }
  }
  
  trait DimensionToken
    extends StObject
       with IToken
       with CSSToken
       with Length
       with LengthPercentage {
    
    var flags: Double
    
    var number: Double
    
    @JSName("type")
    var type_DimensionToken: `15`
    
    var unit: String
  }
  object DimensionToken {
    
    inline def apply(flags: Double, number: Double, unit: String): DimensionToken = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(15)
      __obj.asInstanceOf[DimensionToken]
    }
    
    extension [Self <: DimensionToken](x: Self) {
      
      inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setType(value: `15`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    }
  }
  
  trait HashToken
    extends StObject
       with IToken
       with CSSToken {
    
    var flags: Double
    
    @JSName("type")
    var type_HashToken: `5`
    
    var value: String
  }
  object HashToken {
    
    inline def apply(flags: Double, value: String): HashToken = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(5)
      __obj.asInstanceOf[HashToken]
    }
    
    extension [Self <: HashToken](x: Self) {
      
      inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setType(value: `5`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait IToken extends StObject {
    
    var `type`: TokenType
  }
  object IToken {
    
    inline def apply(`type`: TokenType): IToken = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IToken]
    }
    
    extension [Self <: IToken](x: Self) {
      
      inline def setType(value: TokenType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait NumberValueToken
    extends StObject
       with IToken
       with CSSToken
       with Length
       with LengthPercentage {
    
    var flags: Double
    
    var number: Double
    
    @JSName("type")
    var type_NumberValueToken: `16` | `17`
  }
  object NumberValueToken {
    
    inline def apply(flags: Double, number: Double, `type`: `16` | `17`): NumberValueToken = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberValueToken]
    }
    
    extension [Self <: NumberValueToken](x: Self) {
      
      inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setType(value: `16` | `17`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait StringValueToken
    extends StObject
       with IToken
       with BackgroundSizeInfo
       with CSSToken {
    
    @JSName("type")
    var type_StringValueToken: `0` | `6` | `19` | `20` | `22` | `7`
    
    var value: String
  }
  object StringValueToken {
    
    inline def apply(`type`: `0` | `6` | `19` | `20` | `22` | `7`, value: String): StringValueToken = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StringValueToken]
    }
    
    extension [Self <: StringValueToken](x: Self) {
      
      inline def setType(value: `0` | `6` | `19` | `20` | `22` | `7`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Token
    extends StObject
       with IToken
       with CSSToken {
    
    @JSName("type")
    var type_Token: `23` | `1` | `2` | `3` | `4` | `14` | `8` | `13` | `26` | `27` | `28` | `29` | `11` | `12` | `9` | `10` | `21` | `31` | `24` | `25` | `32`
  }
  object Token {
    
    inline def apply(
      `type`: `23` | `1` | `2` | `3` | `4` | `14` | `8` | `13` | `26` | `27` | `28` | `29` | `11` | `12` | `9` | `10` | `21` | `31` | `24` | `25` | `32`
    ): Token = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    extension [Self <: Token](x: Self) {
      
      inline def setType(
        value: `23` | `1` | `2` | `3` | `4` | `14` | `8` | `13` | `26` | `27` | `28` | `29` | `11` | `12` | `9` | `10` | `21` | `31` | `24` | `25` | `32`
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.html2canvas.html2canvasInts.`0`
    - typings.html2canvas.html2canvasInts.`1`
    - typings.html2canvas.html2canvasInts.`2`
    - typings.html2canvas.html2canvasInts.`3`
    - typings.html2canvas.html2canvasInts.`4`
    - typings.html2canvas.html2canvasInts.`5`
    - typings.html2canvas.html2canvasInts.`6`
    - typings.html2canvas.html2canvasInts.`7`
    - typings.html2canvas.html2canvasInts.`8`
    - typings.html2canvas.html2canvasInts.`9`
    - typings.html2canvas.html2canvasInts.`10`
    - typings.html2canvas.html2canvasInts.`11`
    - typings.html2canvas.html2canvasInts.`12`
    - typings.html2canvas.html2canvasInts.`13`
    - typings.html2canvas.html2canvasInts.`14`
    - typings.html2canvas.html2canvasInts.`15`
    - typings.html2canvas.html2canvasInts.`16`
    - typings.html2canvas.html2canvasInts.`17`
    - typings.html2canvas.html2canvasInts.`18`
    - typings.html2canvas.html2canvasInts.`19`
    - typings.html2canvas.html2canvasInts.`20`
    - typings.html2canvas.html2canvasInts.`21`
    - typings.html2canvas.html2canvasInts.`22`
    - typings.html2canvas.html2canvasInts.`23`
    - typings.html2canvas.html2canvasInts.`24`
    - typings.html2canvas.html2canvasInts.`25`
    - typings.html2canvas.html2canvasInts.`26`
    - typings.html2canvas.html2canvasInts.`27`
    - typings.html2canvas.html2canvasInts.`28`
    - typings.html2canvas.html2canvasInts.`29`
    - typings.html2canvas.html2canvasInts.`30`
    - typings.html2canvas.html2canvasInts.`31`
    - typings.html2canvas.html2canvasInts.`32`
  */
  trait TokenType extends StObject
  object TokenType {
    
    inline def AT_KEYWORD_TOKEN: `7` = 7.asInstanceOf[`7`]
    
    inline def BAD_STRING_TOKEN: `1` = 1.asInstanceOf[`1`]
    
    inline def BAD_URL_TOKEN: `23` = 23.asInstanceOf[`23`]
    
    inline def CDC_TOKEN: `24` = 24.asInstanceOf[`24`]
    
    inline def CDO_TOKEN: `25` = 25.asInstanceOf[`25`]
    
    inline def COLON_TOKEN: `26` = 26.asInstanceOf[`26`]
    
    inline def COLUMN_TOKEN: `21` = 21.asInstanceOf[`21`]
    
    inline def COMMA_TOKEN: `4` = 4.asInstanceOf[`4`]
    
    inline def DASH_MATCH_TOKEN: `9` = 9.asInstanceOf[`9`]
    
    inline def DELIM_TOKEN: `6` = 6.asInstanceOf[`6`]
    
    inline def DIMENSION_TOKEN: `15` = 15.asInstanceOf[`15`]
    
    inline def EOF_TOKEN: `32` = 32.asInstanceOf[`32`]
    
    inline def FUNCTION: `18` = 18.asInstanceOf[`18`]
    
    inline def FUNCTION_TOKEN: `19` = 19.asInstanceOf[`19`]
    
    inline def HASH_TOKEN: `5` = 5.asInstanceOf[`5`]
    
    inline def IDENT_TOKEN: `20` = 20.asInstanceOf[`20`]
    
    inline def INCLUDE_MATCH_TOKEN: `10` = 10.asInstanceOf[`10`]
    
    inline def LEFT_CURLY_BRACKET_TOKEN: `11` = 11.asInstanceOf[`11`]
    
    inline def LEFT_PARENTHESIS_TOKEN: `2` = 2.asInstanceOf[`2`]
    
    inline def LEFT_SQUARE_BRACKET_TOKEN: `28` = 28.asInstanceOf[`28`]
    
    inline def NUMBER_TOKEN: `17` = 17.asInstanceOf[`17`]
    
    inline def PERCENTAGE_TOKEN: `16` = 16.asInstanceOf[`16`]
    
    inline def PREFIX_MATCH_TOKEN: `8` = 8.asInstanceOf[`8`]
    
    inline def RIGHT_CURLY_BRACKET_TOKEN: `12` = 12.asInstanceOf[`12`]
    
    inline def RIGHT_PARENTHESIS_TOKEN: `3` = 3.asInstanceOf[`3`]
    
    inline def RIGHT_SQUARE_BRACKET_TOKEN: `29` = 29.asInstanceOf[`29`]
    
    inline def SEMICOLON_TOKEN: `27` = 27.asInstanceOf[`27`]
    
    inline def STRING_TOKEN: `0` = 0.asInstanceOf[`0`]
    
    inline def SUBSTRING_MATCH_TOKEN: `14` = 14.asInstanceOf[`14`]
    
    inline def SUFFIX_MATCH_TOKEN: `13` = 13.asInstanceOf[`13`]
    
    inline def UNICODE_RANGE_TOKEN: `30` = 30.asInstanceOf[`30`]
    
    inline def URL_TOKEN: `22` = 22.asInstanceOf[`22`]
    
    inline def WHITESPACE_TOKEN: `31` = 31.asInstanceOf[`31`]
  }
  
  trait UnicodeRangeToken
    extends StObject
       with IToken
       with CSSToken {
    
    var end: Double
    
    var start: Double
    
    @JSName("type")
    var type_UnicodeRangeToken: `30`
  }
  object UnicodeRangeToken {
    
    inline def apply(end: Double, start: Double): UnicodeRangeToken = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(30)
      __obj.asInstanceOf[UnicodeRangeToken]
    }
    
    extension [Self <: UnicodeRangeToken](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setType(value: `30`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
