package typings
package kramedLib.kramedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KramedParser extends js.Object {
  def parse(source: js.Array[_]): java.lang.String
}

object KramedParser {
  @scala.inline
  def apply(parse: js.Array[_] => java.lang.String): KramedParser = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
  
    __obj.asInstanceOf[KramedParser]
  }
}

