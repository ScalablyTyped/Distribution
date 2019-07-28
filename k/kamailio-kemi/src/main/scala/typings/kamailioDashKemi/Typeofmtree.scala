package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofmtree extends js.Object {
  def mt_match(tname: String, tomatch: String, mval: Double): Double
}

object Typeofmtree {
  @scala.inline
  def apply(mt_match: (String, String, Double) => Double): Typeofmtree = {
    val __obj = js.Dynamic.literal(mt_match = js.Any.fromFunction3(mt_match))
  
    __obj.asInstanceOf[Typeofmtree]
  }
}

