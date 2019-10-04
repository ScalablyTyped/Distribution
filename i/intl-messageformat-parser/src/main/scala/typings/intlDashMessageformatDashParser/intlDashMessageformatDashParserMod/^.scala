package typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserMod

import typings.intlDashMessageformatDashParser.distParserMod.ParseFunction
import typings.intlDashMessageformatDashParser.distTypesMod.LiteralElement
import typings.intlDashMessageformatDashParser.distTypesMod.MessageFormatElement
import typings.intlDashMessageformatDashParser.distTypesMod.NumberElement
import typings.intlDashMessageformatDashParser.distTypesMod.Skeleton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
}

