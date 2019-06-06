package typings
package intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parser extends js.Object {
  var SyntaxError: stdLib.Error
  def parse(msg: java.lang.String): MessageFormatPattern
}

object Parser {
  @scala.inline
  def apply(SyntaxError: stdLib.Error, parse: java.lang.String => MessageFormatPattern): Parser = {
    val __obj = js.Dynamic.literal(SyntaxError = SyntaxError, parse = js.Any.fromFunction1(parse))
  
    __obj.asInstanceOf[Parser]
  }
}

