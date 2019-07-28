package typings.kramed.kramedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KramedParser extends js.Object {
  def parse(source: js.Array[_]): String
}

object KramedParser {
  @scala.inline
  def apply(parse: js.Array[_] => String): KramedParser = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
  
    __obj.asInstanceOf[KramedParser]
  }
}

