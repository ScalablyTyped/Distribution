package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofacc_radius extends js.Object {
  def request(comment: String): Double
}

object Typeofacc_radius {
  @scala.inline
  def apply(request: String => Double): Typeofacc_radius = {
    val __obj = js.Dynamic.literal(request = js.Any.fromFunction1(request))
  
    __obj.asInstanceOf[Typeofacc_radius]
  }
}

