package typings.googleapis.tpuV1Mod.tpuV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A network endpoint over which a TPU worker can be reached.
  */
@js.native
trait SchemaNetworkEndpoint extends js.Object {
  /**
    * The IP address of this network endpoint.
    */
  var ipAddress: js.UndefOr[String] = js.native
  /**
    * The port of this network endpoint.
    */
  var port: js.UndefOr[Double] = js.native
}

object SchemaNetworkEndpoint {
  @scala.inline
  def apply(): SchemaNetworkEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkEndpoint]
  }
  @scala.inline
  implicit class SchemaNetworkEndpointOps[Self <: SchemaNetworkEndpoint] (val x: Self) extends AnyVal {
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
    def setIpAddress(value: String): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
  
}

