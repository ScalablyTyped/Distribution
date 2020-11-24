package typings.grpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grpc", "ListenerBuilder")
@js.native
class ListenerBuilder () extends js.Object {
  
  /**
    * Builds the call listener
    */
  def build(): Listener = js.native
  
  /**
    * Adds onReceiveMessage method to the builder
    * @param onReceiveMessage A listener method for receiving message
    */
  def withOnReceiveMessage(onReceiveMessage: MessageListener): this.type = js.native
  
  /**
    * Adds onReceiveMetadata method to the builder
    * @param onReceiveMetadata A listener method for receiving metadata
    */
  def withOnReceiveMetadata(onReceiveMetadata: MetadataListener): this.type = js.native
  
  /**
    * Adds onReceiveStatus method to the builder
    * @param onReceiveStatus A listener method for receiving status
    */
  def withOnReceiveStatus(onReceiveStatus: StatusListener): this.type = js.native
}
