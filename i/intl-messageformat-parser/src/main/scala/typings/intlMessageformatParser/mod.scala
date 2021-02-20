package typings.intlMessageformatParser

import typings.intlMessageformatParser.srcParserMod.Expectation
import typings.intlMessageformatParser.srcParserMod.IFileRange
import typings.intlMessageformatParser.srcParserMod.IParseOptions
import typings.intlMessageformatParser.srcParserMod.ParseFunction
import typings.intlMessageformatParser.srcTypesMod.DateTimeSkeleton
import typings.intlMessageformatParser.srcTypesMod.LiteralElement
import typings.intlMessageformatParser.srcTypesMod.MessageFormatElement
import typings.intlMessageformatParser.srcTypesMod.NumberElement
import typings.intlMessageformatParser.srcTypesMod.NumberSkeleton
import typings.intlMessageformatParser.srcTypesMod.Options
import typings.intlMessageformatParser.srcTypesMod.Skeleton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("intl-messageformat-parser", "SyntaxError")
  @js.native
  class SyntaxError protected ()
    extends typings.intlMessageformatParser.srcParserMod.SyntaxError {
    def this(message: String, expected: js.Array[Expectation], found: String, location: IFileRange) = this()
    def this(message: String, expected: js.Array[Expectation], found: Null, location: IFileRange) = this()
  }
  /* static members */
  object SyntaxError {
    
    @JSImport("intl-messageformat-parser", "SyntaxError.buildMessage")
    @js.native
    def buildMessage(expected: js.Array[Expectation]): String = js.native
    @JSImport("intl-messageformat-parser", "SyntaxError.buildMessage")
    @js.native
    def buildMessage(expected: js.Array[Expectation], found: String): String = js.native
  }
  
  @JSImport("intl-messageformat-parser", "TYPE")
  @js.native
  object TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.intlMessageformatParser.srcTypesMod.TYPE with Double] = js.native
    
    /* 1 */ val argument: typings.intlMessageformatParser.srcTypesMod.TYPE.argument with Double = js.native
    
    /* 3 */ val date: typings.intlMessageformatParser.srcTypesMod.TYPE.date with Double = js.native
    
    /* 0 */ val literal: typings.intlMessageformatParser.srcTypesMod.TYPE.literal with Double = js.native
    
    /* 2 */ val number: typings.intlMessageformatParser.srcTypesMod.TYPE.number with Double = js.native
    
    /* 6 */ val plural: typings.intlMessageformatParser.srcTypesMod.TYPE.plural with Double = js.native
    
    /* 7 */ val pound: typings.intlMessageformatParser.srcTypesMod.TYPE.pound with Double = js.native
    
    /* 5 */ val select: typings.intlMessageformatParser.srcTypesMod.TYPE.select with Double = js.native
    
    /* 8 */ val tag: typings.intlMessageformatParser.srcTypesMod.TYPE.tag with Double = js.native
    
    /* 4 */ val time: typings.intlMessageformatParser.srcTypesMod.TYPE.time with Double = js.native
  }
  
  @JSImport("intl-messageformat-parser", "createLiteralElement")
  @js.native
  def createLiteralElement(value: String): LiteralElement = js.native
  
  @JSImport("intl-messageformat-parser", "createNumberElement")
  @js.native
  def createNumberElement(value: String): NumberElement = js.native
  @JSImport("intl-messageformat-parser", "createNumberElement")
  @js.native
  def createNumberElement(value: String, style: String): NumberElement = js.native
  
  @JSImport("intl-messageformat-parser", "isArgumentElement")
  @js.native
  def isArgumentElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.ArgumentElement */ Boolean = js.native
  
  @JSImport("intl-messageformat-parser", "isDateElement")
  @js.native
  def isDateElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateElement */ Boolean = js.native
  
  @JSImport("intl-messageformat-parser", "isDateTimeSkeleton")
  @js.native
  def isDateTimeSkeleton(): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateTimeSkeleton */ Boolean = js.native
  @JSImport("intl-messageformat-parser", "isDateTimeSkeleton")
  @js.native
  def isDateTimeSkeleton(el: js.UndefOr[DateTimeSkeleton | Null | String]): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateTimeSkeleton */ Boolean = js.native
  @JSImport("intl-messageformat-parser", "isDateTimeSkeleton")
  @js.native
  def isDateTimeSkeleton(el: Skeleton): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateTimeSkeleton */ Boolean = js.native
  
  @JSImport("intl-messageformat-parser", "isLiteralElement")
  @js.native
  def isLiteralElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.LiteralElement */ Boolean = js.native
  
  @JSImport("intl-messageformat-parser", "isNumberElement")
  @js.native
  def isNumberElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.NumberElement */ Boolean = js.native
  
  @JSImport("intl-messageformat-parser", "isNumberSkeleton")
  @js.native
  def isNumberSkeleton(el: js.UndefOr[String | NumberSkeleton | Null]): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.NumberSkeleton */ Boolean = js.native
  @JSImport("intl-messageformat-parser", "isNumberSkeleton")
  @js.native
  def isNumberSkeleton(el: Skeleton): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.NumberSkeleton */ Boolean = js.native
  
  @JSImport("intl-messageformat-parser", "isPluralElement")
  @js.native
  def isPluralElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.PluralElement */ Boolean = js.native
  
  @JSImport("intl-messageformat-parser", "isPoundElement")
  @js.native
  def isPoundElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.PoundElement */ Boolean = js.native
  
  @JSImport("intl-messageformat-parser", "isSelectElement")
  @js.native
  def isSelectElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.SelectElement */ Boolean = js.native
  
  @JSImport("intl-messageformat-parser", "isTagElement")
  @js.native
  def isTagElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.TagElement */ Boolean = js.native
  
  @JSImport("intl-messageformat-parser", "isTimeElement")
  @js.native
  def isTimeElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.TimeElement */ Boolean = js.native
  
  @JSImport("intl-messageformat-parser", "parse")
  @js.native
  def parse(input: String): js.Array[MessageFormatElement] = js.native
  @JSImport("intl-messageformat-parser", "parse")
  @js.native
  def parse(input: String, opts: ParseOptions): js.Array[MessageFormatElement] = js.native
  
  @JSImport("intl-messageformat-parser", "pegParse")
  @js.native
  val pegParse: ParseFunction = js.native
  
  type ParseOptions = Options with IParseOptions
}
