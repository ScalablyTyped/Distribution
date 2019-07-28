package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsipjson extends js.Object {
  def sj_serialize(smode: String, pvn: String): Double
}

object Typeofsipjson {
  @scala.inline
  def apply(sj_serialize: (String, String) => Double): Typeofsipjson = {
    val __obj = js.Dynamic.literal(sj_serialize = js.Any.fromFunction2(sj_serialize))
  
    __obj.asInstanceOf[Typeofsipjson]
  }
}

