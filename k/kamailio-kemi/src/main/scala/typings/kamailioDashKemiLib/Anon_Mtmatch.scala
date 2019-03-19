package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mtmatch extends js.Object {
  def mt_match(tname: java.lang.String, tomatch: java.lang.String, mval: scala.Double): scala.Double
}

object Anon_Mtmatch {
  @scala.inline
  def apply(mt_match: (java.lang.String, java.lang.String, scala.Double) => scala.Double): Anon_Mtmatch = {
    val __obj = js.Dynamic.literal(mt_match = js.Any.fromFunction3(mt_match))
  
    __obj.asInstanceOf[Anon_Mtmatch]
  }
}

