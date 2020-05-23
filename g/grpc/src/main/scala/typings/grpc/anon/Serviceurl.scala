package typings.grpc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Serviceurl extends js.Object {
  var service_url: String
}

object Serviceurl {
  @scala.inline
  def apply(service_url: String): Serviceurl = {
    val __obj = js.Dynamic.literal(service_url = service_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Serviceurl]
  }
}

