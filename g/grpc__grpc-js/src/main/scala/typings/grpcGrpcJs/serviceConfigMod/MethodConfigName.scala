package typings.grpcGrpcJs.serviceConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodConfigName extends js.Object {
  var method: js.UndefOr[String] = js.undefined
  var service: String
}

object MethodConfigName {
  @scala.inline
  def apply(service: String, method: String = null): MethodConfigName = {
    val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodConfigName]
  }
}

