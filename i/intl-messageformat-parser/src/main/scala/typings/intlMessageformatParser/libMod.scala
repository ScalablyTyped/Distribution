package typings.intlMessageformatParser

import typings.formatjsIntlUnifiedNumberformat.mod.UnifiedNumberFormatOptions
import typings.intlMessageformatParser.parserMod.Expectation
import typings.intlMessageformatParser.parserMod.IFileRange
import typings.intlMessageformatParser.parserMod.IParseOptions
import typings.intlMessageformatParser.parserMod.ParseFunction
import typings.intlMessageformatParser.skeletonMod.ExtendedDateTimeFormatOptions
import typings.intlMessageformatParser.typesMod.DateTimeSkeleton
import typings.intlMessageformatParser.typesMod.LiteralElement
import typings.intlMessageformatParser.typesMod.MessageFormatElement
import typings.intlMessageformatParser.typesMod.NumberElement
import typings.intlMessageformatParser.typesMod.NumberSkeleton
import typings.intlMessageformatParser.typesMod.NumberSkeletonToken
import typings.intlMessageformatParser.typesMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat-parser/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  @js.native
  class SyntaxError protected ()
    extends typings.intlMessageformatParser.parserMod.SyntaxError {
    def this(message: String, expected: js.Array[Expectation], found: String, location: IFileRange) = this()
    def this(message: String, expected: js.Array[Expectation], found: Null, location: IFileRange) = this()
  }
  
  val pegParse: ParseFunction = js.native
  def convertNumberSkeletonToNumberFormatOptions(tokens: js.Array[NumberSkeletonToken]): UnifiedNumberFormatOptions = js.native
  def createLiteralElement(value: String): LiteralElement = js.native
  def createNumberElement(value: String): NumberElement = js.native
  def createNumberElement(value: String, style: String): NumberElement = js.native
  def isArgumentElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.ArgumentElement */ Boolean = js.native
  def isDateElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.DateElement */ Boolean = js.native
  def isDateTimeSkeleton(): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.DateTimeSkeleton */ Boolean = js.native
  def isDateTimeSkeleton(el: DateTimeSkeleton | String): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.DateTimeSkeleton */ Boolean = js.native
  def isLiteralElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.LiteralElement */ Boolean = js.native
  def isNumberElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.NumberElement */ Boolean = js.native
  def isNumberSkeleton(): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.NumberSkeleton */ Boolean = js.native
  def isNumberSkeleton(el: String): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.NumberSkeleton */ Boolean = js.native
  def isNumberSkeleton(el: NumberSkeleton): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.NumberSkeleton */ Boolean = js.native
  def isPluralElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.PluralElement */ Boolean = js.native
  def isPoundElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.PoundElement */ Boolean = js.native
  def isSelectElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.SelectElement */ Boolean = js.native
  def isTimeElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.TimeElement */ Boolean = js.native
  def parse(input: String): js.Array[MessageFormatElement] = js.native
  def parse(input: String, opts: ParseOptions): js.Array[MessageFormatElement] = js.native
  def parseDateTimeSkeleton(skeleton: String): ExtendedDateTimeFormatOptions = js.native
  /* static members */
  @js.native
  object SyntaxError extends js.Object {
    def buildMessage(expected: js.Array[Expectation]): String = js.native
    def buildMessage(expected: js.Array[Expectation], found: String): String = js.native
  }
  
  @js.native
  object TYPE extends js.Object {
    /* 1 */ val argument: typings.intlMessageformatParser.typesMod.TYPE.argument with Double = js.native
    /* 3 */ val date: typings.intlMessageformatParser.typesMod.TYPE.date with Double = js.native
    /* 0 */ val literal: typings.intlMessageformatParser.typesMod.TYPE.literal with Double = js.native
    /* 2 */ val number: typings.intlMessageformatParser.typesMod.TYPE.number with Double = js.native
    /* 6 */ val plural: typings.intlMessageformatParser.typesMod.TYPE.plural with Double = js.native
    /* 7 */ val pound: typings.intlMessageformatParser.typesMod.TYPE.pound with Double = js.native
    /* 5 */ val select: typings.intlMessageformatParser.typesMod.TYPE.select with Double = js.native
    /* 4 */ val time: typings.intlMessageformatParser.typesMod.TYPE.time with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.intlMessageformatParser.typesMod.TYPE with Double] = js.native
  }
  
  type ParseOptions = Options with IParseOptions
}

