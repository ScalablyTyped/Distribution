package typings
package kosDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Payload[T] extends js.Object {
  var payload: T
}

object Anon_Payload {
  @scala.inline
  def apply[T](payload: T): Anon_Payload[T] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Payload[T]]
  }
}

