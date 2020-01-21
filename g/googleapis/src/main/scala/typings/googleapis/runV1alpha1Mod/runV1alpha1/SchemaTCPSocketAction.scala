package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TCPSocketAction describes an action based on opening a socket
  */
@js.native
trait SchemaTCPSocketAction extends js.Object {
  /**
    * Optional: Host name to connect to, defaults to the pod IP. +optional
    */
  var host: js.UndefOr[String] = js.native
  /**
    * Number or name of the port to access on the container. Number must be in
    * the range 1 to 65535. Name must be an IANA_SVC_NAME.
    */
  var port: js.UndefOr[SchemaIntOrString] = js.native
}

object SchemaTCPSocketAction {
  @scala.inline
  def apply(host: String = null, port: SchemaIntOrString = null): SchemaTCPSocketAction = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTCPSocketAction]
  }
}

