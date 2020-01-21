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
  def apply(
    enableHttpPortAccess: js.UndefOr[Boolean] = js.undefined,
    httpPorts: StringDictionary[String] = null
  ): SchemaEndpointConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableHttpPortAccess)) __obj.updateDynamic("enableHttpPortAccess")(enableHttpPortAccess.asInstanceOf[js.Any])
    if (httpPorts != null) __obj.updateDynamic("httpPorts")(httpPorts.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEndpointConfig]
  }
}

