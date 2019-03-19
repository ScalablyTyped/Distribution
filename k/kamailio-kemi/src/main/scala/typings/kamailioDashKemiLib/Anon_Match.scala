package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Match extends js.Object {
  def `match`(tomatch: java.lang.String, pvclass: java.lang.String): scala.Double
}

object Anon_Match {
  @scala.inline
  def apply(`match`: (java.lang.String, java.lang.String) => scala.Double): Anon_Match = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(js.Any.fromFunction2(`match`))
    __obj.asInstanceOf[Anon_Match]
  }
}

