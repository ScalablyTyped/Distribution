package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofaccRadius extends js.Object {
  def request(comment: String): Double
}

object TypeofaccRadius {
  @scala.inline
  def apply(request: String => Double): TypeofaccRadius = {
    val __obj = js.Dynamic.literal(request = js.Any.fromFunction1(request))
  
    __obj.asInstanceOf[TypeofaccRadius]
  }
}

