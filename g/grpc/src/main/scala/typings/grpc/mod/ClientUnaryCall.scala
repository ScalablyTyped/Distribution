package typings.grpc.mod

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grpc", "ClientUnaryCall")
@js.native
class ClientUnaryCall protected () extends EventEmitter {
  
  /**
    * Cancel the ongoing call. Results in the call ending with a CANCELLED status,
    * unless it has already ended with some other status.
    */
  def cancel(): Unit = js.native
  
  /**
    * Get the endpoint this call/stream is connected to.
    * @return The URI of the endpoint
    */
  def getPeer(): String = js.native
}
