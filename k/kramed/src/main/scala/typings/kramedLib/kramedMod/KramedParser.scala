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
  def apply(parse: js.Function1[js.Array[_], java.lang.String]): KramedParser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(parse)
    __obj.asInstanceOf[KramedParser]
  }
}

