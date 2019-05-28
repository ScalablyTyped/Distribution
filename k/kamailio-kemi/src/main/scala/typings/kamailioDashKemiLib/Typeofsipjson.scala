package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsipjson extends js.Object {
  def sj_serialize(smode: java.lang.String, pvn: java.lang.String): scala.Double
}

object Typeofsipjson {
  @scala.inline
  def apply(sj_serialize: (java.lang.String, java.lang.String) => scala.Double): Typeofsipjson = {
    val __obj = js.Dynamic.literal(sj_serialize = js.Any.fromFunction2(sj_serialize))
  
    __obj.asInstanceOf[Typeofsipjson]
  }
}

