package typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserMod

import typings.intlDashMessageformatDashParser.libParserMod.ParseFunction
import typings.intlDashMessageformatDashParser.libTypesMod.LiteralElement
import typings.intlDashMessageformatDashParser.libTypesMod.MessageFormatElement
import typings.intlDashMessageformatDashParser.libTypesMod.NumberElement
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
  def isArgumentElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.ArgumentElement */ Boolean = js.native
  def isDateElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.DateElement */ Boolean = js.native
  def isLiteralElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.LiteralElement */ Boolean = js.native
  def isNumberElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.NumberElement */ Boolean = js.native
  def isPluralElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.PluralElement */ Boolean = js.native
  def isSelectElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.SelectElement */ Boolean = js.native
  def isTimeElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.TimeElement */ Boolean = js.native
  def parse(input: String): js.Array[MessageFormatElement] = js.native
  def parse(input: String, opts: ParseOptions): js.Array[MessageFormatElement] = js.native
  def printAST(ast: js.Array[MessageFormatElement]): String = js.native
}

