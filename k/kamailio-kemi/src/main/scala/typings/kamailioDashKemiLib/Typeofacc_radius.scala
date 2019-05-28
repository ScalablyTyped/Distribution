package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofacc_radius extends js.Object {
  def request(comment: java.lang.String): scala.Double
}

object Typeofacc_radius {
  @scala.inline
  def apply(request: java.lang.String => scala.Double): Typeofacc_radius = {
    val __obj = js.Dynamic.literal(request = js.Any.fromFunction1(request))
  
    __obj.asInstanceOf[Typeofacc_radius]
  }
}

