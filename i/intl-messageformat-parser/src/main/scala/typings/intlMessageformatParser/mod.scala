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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("intl-messageformat-parser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def createLiteralElement(value: String): LiteralElement = js.native
  
  def createNumberElement(value: String): NumberElement = js.native
  def createNumberElement(value: String, style: String): NumberElement = js.native
  
  def isArgumentElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.ArgumentElement */ Boolean = js.native
  
  def isDateElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateElement */ Boolean = js.native
  
  def isDateTimeSkeleton(): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateTimeSkeleton */ Boolean = js.native
  def isDateTimeSkeleton(el: js.UndefOr[DateTimeSkeleton | Null | String]): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateTimeSkeleton */ Boolean = js.native
  def isDateTimeSkeleton(el: Skeleton): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateTimeSkeleton */ Boolean = js.native
  
  def isLiteralElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.LiteralElement */ Boolean = js.native
  
  def isNumberElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.NumberElement */ Boolean = js.native
  
  def isNumberSkeleton(el: js.UndefOr[String | NumberSkeleton | Null]): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.NumberSkeleton */ Boolean = js.native
  def isNumberSkeleton(el: Skeleton): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.NumberSkeleton */ Boolean = js.native
  
  def isPluralElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.PluralElement */ Boolean = js.native
  
  def isPoundElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.PoundElement */ Boolean = js.native
  
  def isSelectElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.SelectElement */ Boolean = js.native
  
  def isTagElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.TagElement */ Boolean = js.native
  
  def isTimeElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.TimeElement */ Boolean = js.native
  
  def parse(input: String): js.Array[MessageFormatElement] = js.native
  def parse(input: String, opts: ParseOptions): js.Array[MessageFormatElement] = js.native
  
  val pegParse: ParseFunction = js.native
  
  @js.native
  class SyntaxError protected ()
    extends typings.intlMessageformatParser.srcParserMod.SyntaxError {
    def this(message: String, expected: js.Array[Expectation], found: String, location: IFileRange) = this()
    def this(message: String, expected: js.Array[Expectation], found: Null, location: IFileRange) = this()
  }
  /* static members */
  @js.native
  object SyntaxError extends js.Object {
    
    def buildMessage(expected: js.Array[Expectation]): String = js.native
    def buildMessage(expected: js.Array[Expectation], found: String): String = js.native
  }
  
  @js.native
  object TYPE extends js.Object {
    
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
  
  type ParseOptions = Options with IParseOptions
}
