package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ContainerPort represents a network port in a single container.
  */
@js.native
trait SchemaContainerPort extends js.Object {
  /**
    * Number of port to expose on the pod&#39;s IP address. This must be a
    * valid port number, 0 &lt; x &lt; 65536.
    */
  var containerPort: js.UndefOr[Double] = js.native
  /**
    * What host IP to bind the external port to. +optional
    */
  var hostIP: js.UndefOr[String] = js.native
  /**
    * Number of port to expose on the host. If specified, this must be a valid
    * port number, 0 &lt; x &lt; 65536. If HostNetwork is specified, this must
    * match ContainerPort. Most containers do not need this. +optional
    */
  var hostPort: js.UndefOr[Double] = js.native
  /**
    * If specified, this must be an IANA_SVC_NAME and unique within the pod.
    * Each named port in a pod must have a unique name. Name for the port that
    * can be referred to by services. +optional
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Protocol for port. Must be UDP or TCP. Defaults to &quot;TCP&quot;.
    * +optional
    */
  var protocol: js.UndefOr[String] = js.native
}

object SchemaContainerPort {
  @scala.inline
  def apply(
    containerPort: js.UndefOr[Double] = js.undefined,
    hostIP: String = null,
    hostPort: js.UndefOr[Double] = js.undefined,
    name: String = null,
    protocol: String = null
  ): SchemaContainerPort = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(containerPort)) __obj.updateDynamic("containerPort")(containerPort.get.asInstanceOf[js.Any])
    if (hostIP != null) __obj.updateDynamic("hostIP")(hostIP.asInstanceOf[js.Any])
    if (!js.isUndefined(hostPort)) __obj.updateDynamic("hostPort")(hostPort.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaContainerPort]
  }
}

