package typings.grpc.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grpc", "InterceptingCall")
@js.native
class InterceptingCall () extends js.Object {
  /**
    * @param next_Call The next call in the chain
    * @param requester Interceptor methods to handle request
    */
  def this(nextCall: InterceptingCall) = this()
  def this(nextCall: Null, requester: Requester) = this()
  def this(nextCall: InterceptingCall, requester: Requester) = this()
  /**
    * Run a cancel operation through the interceptor chain
    */
  def cancel(): Unit = js.native
  /**
    * Run a cancelWithStatus operation through the interceptor chain.
    * @param status
    * @param message
    */
  def cancelWithStatus(status: StatusObject, message: String): Unit = js.native
  /**
    * Pass a getPeer call down to the base gRPC call (should not be intercepted)
    */
  def getPeer(): js.Object = js.native
  /**
    * Run a close operation through the interceptor chain
    */
  def halfClose(): Unit = js.native
  /**
    * For receiving streaming messages, we need to seed the base interceptor with
    * the streaming context to create a RECV_MESSAGE batch.
    * @param context Carries objects needed for streaming operations
    */
  def recvMessageWithContext(context: js.Object): Unit = js.native
  /**
    * Pass a message through the interceptor chain.
    */
  def sendMessage(message: js.Any): Unit = js.native
  /**
    * For streaming calls, we need to transparently pass the stream's context
    * through the interceptor chain. Passes the context between InterceptingCalls
    * but hides it from any requester implementations.
    * @param context Carries objects needed for streaming operations.
    * @param message The message to send.
    */
  def sendMessageWithContext(context: js.Object, message: js.Any): Unit = js.native
  /**
    * Starts a call through the outbound interceptor chain and adds an element to
    * the reciprocal inbound listener chain.
    */
  def start(metadata: Metadata, listener: Listener): Unit = js.native
}

