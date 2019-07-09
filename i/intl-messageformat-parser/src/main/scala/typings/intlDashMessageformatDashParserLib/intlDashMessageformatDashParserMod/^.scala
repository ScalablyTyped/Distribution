package typings
package intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val parse: intlDashMessageformatDashParserLib.libParserMod.ParseFunction = js.native
  def createLiteralElement(value: java.lang.String): intlDashMessageformatDashParserLib.libTypesMod.LiteralElement = js.native
  def createNumberElement(value: java.lang.String): intlDashMessageformatDashParserLib.libTypesMod.NumberElement = js.native
  def createNumberElement(value: java.lang.String, style: java.lang.String): intlDashMessageformatDashParserLib.libTypesMod.NumberElement = js.native
  def isArgumentElement(el: intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.ArgumentElement */ scala.Boolean = js.native
  def isDateElement(el: intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.DateElement */ scala.Boolean = js.native
  def isLiteralElement(el: intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.LiteralElement */ scala.Boolean = js.native
  def isNumberElement(el: intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.NumberElement */ scala.Boolean = js.native
  def isPluralElement(el: intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.PluralElement */ scala.Boolean = js.native
  def isSelectElement(el: intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.SelectElement */ scala.Boolean = js.native
  def isTimeElement(el: intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.TimeElement */ scala.Boolean = js.native
  def parse(input: java.lang.String): js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement] = js.native
  def parse(input: java.lang.String, opts: ParseOptions): js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement] = js.native
}

