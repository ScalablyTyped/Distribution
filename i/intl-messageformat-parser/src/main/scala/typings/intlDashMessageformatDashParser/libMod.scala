package typings.intlDashMessageformatDashParser

import typings.intlDashMessageformatDashParser.libMod.ParseOptions
import typings.intlDashMessageformatDashParser.libParserMod.Expectation
import typings.intlDashMessageformatDashParser.libParserMod.IFileRange
import typings.intlDashMessageformatDashParser.libParserMod.IParseOptions
import typings.intlDashMessageformatDashParser.libParserMod.ParseFunction
import typings.intlDashMessageformatDashParser.libTypesMod.LiteralElement
import typings.intlDashMessageformatDashParser.libTypesMod.MessageFormatElement
import typings.intlDashMessageformatDashParser.libTypesMod.NumberElement
import typings.intlDashMessageformatDashParser.libTypesMod.Options
import typings.intlDashMessageformatDashParser.libTypesMod.Skeleton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat-parser/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  @js.native
  class SyntaxError protected ()
    extends typings.intlDashMessageformatDashParser.libParserMod.SyntaxError {
    def this(message: String, expected: js.Array[Expectation], found: String, location: IFileRange) = this()
    def this(message: String, expected: js.Array[Expectation], found: Null, location: IFileRange) = this()
  }
  
  val parse: ParseFunction = js.native
  def createLiteralElement(value: String): LiteralElement = js.native
  def createNumberElement(value: String): NumberElement = js.native
  def createNumberElement(value: String, style: String): NumberElement = js.native
  def isArgumentElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.ArgumentElement */ Boolean = js.native
  def isDateElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.DateElement */ Boolean = js.native
  def isDateTimeSkeleton(el: Skeleton): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.DateTimeSkeleton */ Boolean = js.native
  def isLiteralElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.LiteralElement */ Boolean = js.native
  def isNumberElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.NumberElement */ Boolean = js.native
  def isNumberSkeleton(el: Skeleton): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.NumberSkeleton */ Boolean = js.native
  def isPluralElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.PluralElement */ Boolean = js.native
  def isSelectElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.SelectElement */ Boolean = js.native
  def isTimeElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.TimeElement */ Boolean = js.native
  def parse(input: String): js.Array[MessageFormatElement] = js.native
  def parse(input: String, opts: ParseOptions): js.Array[MessageFormatElement] = js.native
  /* static members */
  @js.native
  object SyntaxError extends js.Object {
    def buildMessage(expected: js.Array[Expectation]): String = js.native
    def buildMessage(expected: js.Array[Expectation], found: String): String = js.native
  }
  
  @js.native
  object TYPE extends js.Object {
    /* 1 */ val argument: typings.intlDashMessageformatDashParser.libTypesMod.TYPE.argument with Double = js.native
    /* 3 */ val date: typings.intlDashMessageformatDashParser.libTypesMod.TYPE.date with Double = js.native
    /* 0 */ val literal: typings.intlDashMessageformatDashParser.libTypesMod.TYPE.literal with Double = js.native
    /* 2 */ val number: typings.intlDashMessageformatDashParser.libTypesMod.TYPE.number with Double = js.native
    /* 6 */ val plural: typings.intlDashMessageformatDashParser.libTypesMod.TYPE.plural with Double = js.native
    /* 5 */ val select: typings.intlDashMessageformatDashParser.libTypesMod.TYPE.select with Double = js.native
    /* 4 */ val time: typings.intlDashMessageformatDashParser.libTypesMod.TYPE.time with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.intlDashMessageformatDashParser.libTypesMod.TYPE with Double] = js.native
  }
  
  type ParseOptions = Options with IParseOptions
}

