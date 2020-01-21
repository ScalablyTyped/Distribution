package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Handler defines a specific action that should be taken
  */
@js.native
trait SchemaHandler extends js.Object {
  /**
    * One and only one of the following should be specified. Exec specifies the
    * action to take. +optional
    */
  var exec: js.UndefOr[SchemaExecAction] = js.native
  /**
    * HTTPGet specifies the http request to perform. +optional
    */
  var httpGet: js.UndefOr[SchemaHTTPGetAction] = js.native
  /**
    * TCPSocket specifies an action involving a TCP port. TCP hooks not yet
    * supported
    */
  var tcpSocket: js.UndefOr[SchemaTCPSocketAction] = js.native
}

object SchemaHandler {
  @scala.inline
  def apply(
    exec: SchemaExecAction = null,
    httpGet: SchemaHTTPGetAction = null,
    tcpSocket: SchemaTCPSocketAction = null
  ): SchemaHandler = {
    val __obj = js.Dynamic.literal()
    if (exec != null) __obj.updateDynamic("exec")(exec.asInstanceOf[js.Any])
    if (httpGet != null) __obj.updateDynamic("httpGet")(httpGet.asInstanceOf[js.Any])
    if (tcpSocket != null) __obj.updateDynamic("tcpSocket")(tcpSocket.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHandler]
  }
}

