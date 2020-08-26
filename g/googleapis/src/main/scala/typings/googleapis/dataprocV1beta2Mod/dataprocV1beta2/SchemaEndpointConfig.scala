package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Endpoint config for this cluster
  */
@js.native
trait SchemaEndpointConfig extends js.Object {
  /**
    * Optional. If true, enable http access to specific ports on the cluster
    * from external sources. Defaults to false.
    */
  var enableHttpPortAccess: js.UndefOr[Boolean] = js.native
  /**
    * Output only. The map of port descriptions to URLs. Will only be populated
    * if enable_http_port_access is true.
    */
  var httpPorts: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaEndpointConfig {
  @scala.inline
  def apply(): SchemaEndpointConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEndpointConfig]
  }
  @scala.inline
  implicit class SchemaEndpointConfigOps[Self <: SchemaEndpointConfig] (val x: Self) extends AnyVal {
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
    def setEnableHttpPortAccess(value: Boolean): Self = this.set("enableHttpPortAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableHttpPortAccess: Self = this.set("enableHttpPortAccess", js.undefined)
    @scala.inline
    def setHttpPorts(value: StringDictionary[String]): Self = this.set("httpPorts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpPorts: Self = this.set("httpPorts", js.undefined)
  }
  
}

