package typings.grpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grpc", "RequesterBuilder")
@js.native
class RequesterBuilder () extends js.Object {
  
  /**
    * Builds the requester's interceptor methods.
    */
  def build(): Requester = js.native
  
  /**
    * Add a cancel requester to the builder.
    * @param cancel A requester method for handling `cancel`
    */
  def withCancel(cancel: CancelRequester): this.type = js.native
  
  /**
    * Add a close requester to the builder.
    * @param halfClose A requester method for handling client
    * close.
    */
  def withHalfClose(halfClose: CloseRequester): this.type = js.native
  
  /**
    * Add a message requester to the builder.
    * @param sendMessage A requester method for handling
    * messages.
    */
  def withSendMessage(sendMessage: MessageRequester): this.type = js.native
  
  /**
    * Add a metadata requester to the builder
    * @param start A requester method for handling metadata
    */
  def withStart(start: MetadataRequester): this.type = js.native
}
