package typings.html2canvas

import typings.html2canvas.html2canvasNumbers.`0`
import typings.html2canvas.html2canvasNumbers.`10`
import typings.html2canvas.html2canvasNumbers.`11`
import typings.html2canvas.html2canvasNumbers.`12`
import typings.html2canvas.html2canvasNumbers.`13`
import typings.html2canvas.html2canvasNumbers.`14`
import typings.html2canvas.html2canvasNumbers.`16`
import typings.html2canvas.html2canvasNumbers.`17`
import typings.html2canvas.html2canvasNumbers.`18`
import typings.html2canvas.html2canvasNumbers.`19`
import typings.html2canvas.html2canvasNumbers.`1`
import typings.html2canvas.html2canvasNumbers.`20`
import typings.html2canvas.html2canvasNumbers.`21`
import typings.html2canvas.html2canvasNumbers.`22`
import typings.html2canvas.html2canvasNumbers.`23`
import typings.html2canvas.html2canvasNumbers.`24`
import typings.html2canvas.html2canvasNumbers.`25`
import typings.html2canvas.html2canvasNumbers.`26`
import typings.html2canvas.html2canvasNumbers.`27`
import typings.html2canvas.html2canvasNumbers.`28`
import typings.html2canvas.html2canvasNumbers.`29`
import typings.html2canvas.html2canvasNumbers.`2`
import typings.html2canvas.html2canvasNumbers.`31`
import typings.html2canvas.html2canvasNumbers.`32`
import typings.html2canvas.html2canvasNumbers.`3`
import typings.html2canvas.html2canvasNumbers.`4`
import typings.html2canvas.html2canvasNumbers.`6`
import typings.html2canvas.html2canvasNumbers.`7`
import typings.html2canvas.html2canvasNumbers.`8`
import typings.html2canvas.html2canvasNumbers.`9`
import typings.html2canvas.tokenizerMod.CSSToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("html2canvas/dist/types/css/syntax/parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("html2canvas/dist/types/css/syntax/parser", "Parser")
  @js.native
  open class Parser protected () extends StObject {
    def this(tokens: js.Array[CSSToken]) = this()
    
    /* private */ var _tokens: Any = js.native
    
    /* private */ var consumeComponentValue: Any = js.native
    
    /* private */ var consumeFunction: Any = js.native
    
    /* private */ var consumeSimpleBlock: Any = js.native
    
    /* private */ var consumeToken: Any = js.native
    
    def parseComponentValue(): CSSValue = js.native
    
    def parseComponentValues(): js.Array[CSSValue] = js.native
    
    /* private */ var reconsumeToken: Any = js.native
  }
  /* static members */
  object Parser {
    
    @JSImport("html2canvas/dist/types/css/syntax/parser", "Parser")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(value: String): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(value.asInstanceOf[js.Any]).asInstanceOf[Parser]
    
    inline def parseValue(value: String): CSSValue = ^.asInstanceOf[js.Dynamic].applyDynamic("parseValue")(value.asInstanceOf[js.Any]).asInstanceOf[CSSValue]
    
    inline def parseValues(value: String): js.Array[CSSValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseValues")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[CSSValue]]
  }
  
  inline def isDimensionToken(token: CSSValue): /* is html2canvas.html2canvas/dist/types/css/syntax/tokenizer.DimensionToken */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDimensionToken")(token.asInstanceOf[js.Any]).asInstanceOf[/* is html2canvas.html2canvas/dist/types/css/syntax/tokenizer.DimensionToken */ Boolean]
  
  inline def isIdentToken(token: CSSValue): /* is html2canvas.html2canvas/dist/types/css/syntax/tokenizer.StringValueToken */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdentToken")(token.asInstanceOf[js.Any]).asInstanceOf[/* is html2canvas.html2canvas/dist/types/css/syntax/tokenizer.StringValueToken */ Boolean]
  
  inline def isIdentWithValue(token: CSSValue, value: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIdentWithValue")(token.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isNumberToken(token: CSSValue): /* is html2canvas.html2canvas/dist/types/css/syntax/tokenizer.NumberValueToken */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumberToken")(token.asInstanceOf[js.Any]).asInstanceOf[/* is html2canvas.html2canvas/dist/types/css/syntax/tokenizer.NumberValueToken */ Boolean]
  
  inline def isStringToken(token: CSSValue): /* is html2canvas.html2canvas/dist/types/css/syntax/tokenizer.StringValueToken */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStringToken")(token.asInstanceOf[js.Any]).asInstanceOf[/* is html2canvas.html2canvas/dist/types/css/syntax/tokenizer.StringValueToken */ Boolean]
  
  inline def nonFunctionArgSeparator(token: CSSValue): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("nonFunctionArgSeparator")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def nonWhiteSpace(token: CSSValue): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("nonWhiteSpace")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parseFunctionArgs(tokens: js.Array[CSSValue]): js.Array[js.Array[CSSValue]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFunctionArgs")(tokens.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[CSSValue]]]
  
  trait CSSBlock
    extends StObject
       with CSSValue {
    
    var `type`: CSSBlockType
    
    var values: js.Array[CSSValue]
  }
  object CSSBlock {
    
    inline def apply(`type`: CSSBlockType, values: js.Array[CSSValue]): CSSBlock = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CSSBlock]
    }
    
    extension [Self <: CSSBlock](x: Self) {
      
      inline def setType(value: CSSBlockType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[CSSValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: CSSValue*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.html2canvas.html2canvasNumbers.`2`
    - typings.html2canvas.html2canvasNumbers.`28`
    - typings.html2canvas.html2canvasNumbers.`11`
  */
  trait CSSBlockType extends StObject
  
  trait CSSFunction
    extends StObject
       with CSSValue {
    
    var name: String
    
    var `type`: `18`
    
    var values: js.Array[CSSValue]
  }
  object CSSFunction {
    
    inline def apply(name: String, values: js.Array[CSSValue]): CSSFunction = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(18)
      __obj.asInstanceOf[CSSFunction]
    }
    
    extension [Self <: CSSFunction](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: `18`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[CSSValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: CSSValue*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.html2canvas.parserMod.CSSFunction
    - typings.html2canvas.tokenizerMod.CSSToken
    - typings.html2canvas.parserMod.CSSBlock
  */
  trait CSSValue extends StObject
  object CSSValue {
    
    inline def CSSBlock(`type`: CSSBlockType, values: js.Array[CSSValue]): typings.html2canvas.parserMod.CSSBlock = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.html2canvas.parserMod.CSSBlock]
    }
    
    inline def CSSFunction(name: String, values: js.Array[CSSValue]): typings.html2canvas.parserMod.CSSFunction = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(18)
      __obj.asInstanceOf[typings.html2canvas.parserMod.CSSFunction]
    }
    
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
}
