package typings.grpcGrpcJs.serviceConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodConfigName extends js.Object {
  var method: js.UndefOr[String] = js.native
  var service: String = js.native
}

object MethodConfigName {
  @scala.inline
  def apply(service: String): MethodConfigName = {
    val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodConfigName]
  }
  @scala.inline
  implicit class MethodConfigNameOps[Self <: MethodConfigName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
  }
  
}

