package typings.intlMessageformat.mod

import typings.intlMessageformat.intlMessageformatNumbers.`0`
import typings.intlMessageformat.intlMessageformatNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.intlMessageformat.mod.LiteralPart
  - typings.intlMessageformat.mod.ObjectPart[T]
*/
trait MessageFormatPart[T] extends js.Object

object MessageFormatPart {
  @scala.inline
  def LiteralPart[T](`type`: `0`, value: String): MessageFormatPart[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageFormatPart[T]]
  }
  @scala.inline
  def ObjectPart[T](`type`: `1`, value: T): MessageFormatPart[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageFormatPart[T]]
  }
}

