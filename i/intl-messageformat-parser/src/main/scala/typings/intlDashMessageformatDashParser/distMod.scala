package typings.intlDashMessageformatDashParser

import typings.intlDashMessageformatDashParser.distMod.ParseOptions
import typings.intlDashMessageformatDashParser.distParserMod.Expectation
import typings.intlDashMessageformatDashParser.distParserMod.IFileRange
import typings.intlDashMessageformatDashParser.distParserMod.IParseOptions
import typings.intlDashMessageformatDashParser.distParserMod.ParseFunction
import typings.intlDashMessageformatDashParser.distTypesMod.LiteralElement
import typings.intlDashMessageformatDashParser.distTypesMod.MessageFormatElement
import typings.intlDashMessageformatDashParser.distTypesMod.NumberElement
import typings.intlDashMessageformatDashParser.distTypesMod.Options
import typings.intlDashMessageformatDashParser.distTypesMod.Skeleton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat-parser/dist", JSImport.Namespace)
@js.native
object distMod extends js.Object {
  @js.native
  class SyntaxError protected ()
    extends typings.intlDashMessageformatDashParser.distParserMod.SyntaxError {
    def this(message: String, expected: js.Array[Expectation], found: String, location: IFileRange) = this()
    def this(message: String, expected: js.Array[Expectation], found: Null, location: IFileRange) = this()
  }
  
  val parse: ParseFunction = js.native
  def createLiteralElement(value: String): LiteralElement = js.native
  def createNumberElement(value: String): NumberElement = js.native
  def createNumberElement(value: String, style: String): NumberElement = js.native
  def isArgumentElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/dist/types.ArgumentElement */ Boolean = js.native
  def isDateElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/dist/types.DateElement */ Boolean = js.native
  def isDateTimeSkeleton(el: Skeleton): /* is intl-messageformat-parser.intl-messageformat-parser/dist/types.DateTimeSkeleton */ Boolean = js.native
  def isLiteralElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/dist/types.LiteralElement */ Boolean = js.native
  def isNumberElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/dist/types.NumberElement */ Boolean = js.native
  def isNumberSkeleton(el: Skeleton): /* is intl-messageformat-parser.intl-messageformat-parser/dist/types.NumberSkeleton */ Boolean = js.native
  def isPluralElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/dist/types.PluralElement */ Boolean = js.native
  def isSelectElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/dist/types.SelectElement */ Boolean = js.native
  def isTimeElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/dist/types.TimeElement */ Boolean = js.native
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
    /* 1 */ val argument: typings.intlDashMessageformatDashParser.distTypesMod.TYPE.argument with Double = js.native
    /* 3 */ val date: typings.intlDashMessageformatDashParser.distTypesMod.TYPE.date with Double = js.native
    /* 0 */ val literal: typings.intlDashMessageformatDashParser.distTypesMod.TYPE.literal with Double = js.native
    /* 2 */ val number: typings.intlDashMessageformatDashParser.distTypesMod.TYPE.number with Double = js.native
    /* 6 */ val plural: typings.intlDashMessageformatDashParser.distTypesMod.TYPE.plural with Double = js.native
    /* 5 */ val select: typings.intlDashMessageformatDashParser.distTypesMod.TYPE.select with Double = js.native
    /* 4 */ val time: typings.intlDashMessageformatDashParser.distTypesMod.TYPE.time with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.intlDashMessageformatDashParser.distTypesMod.TYPE with Double] = js.native
  }
  
  type ParseOptions = Options with IParseOptions
}

