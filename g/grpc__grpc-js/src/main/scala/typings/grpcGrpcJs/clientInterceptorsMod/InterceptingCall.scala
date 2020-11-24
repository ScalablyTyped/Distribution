package typings.grpcGrpcJs.clientInterceptorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@grpc/grpc-js/build/src/client-interceptors", "InterceptingCall")
@js.native
class InterceptingCall protected () extends InterceptingCallInterface {
  def this(nextCall: InterceptingCallInterface) = this()
  def this(nextCall: InterceptingCallInterface, requester: Requester) = this()
  
  var nextCall: js.Any = js.native
  
  /**
    * Indicates that a status was received but could not be propagated because
    * a message was still being processed.
    */
  var pendingHalfClose: js.Any = js.native
  
  /**
    * Indicates that a message has been passed to the listener's onReceiveMessage
    * method it has not been passed to the corresponding next callback
    */
  var processingMessage: js.Any = js.native
  
  /**
    * The requester that this InterceptingCall uses to modify outgoing operations
    */
  var requester: js.Any = js.native
}
