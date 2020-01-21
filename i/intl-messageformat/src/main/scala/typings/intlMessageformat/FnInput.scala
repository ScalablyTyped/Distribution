package typings.intlMessageformat

import typings.intlMessageformatParser.mod.MessageFormatElement
import typings.intlMessageformatParser.mod.ParseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnInput extends js.Object {
  def apply(input: String): js.Array[MessageFormatElement] = js.native
  def apply(input: String, opts: ParseOptions): js.Array[MessageFormatElement] = js.native
}

