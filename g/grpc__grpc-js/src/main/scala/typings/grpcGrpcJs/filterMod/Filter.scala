package typings.grpcGrpcJs.filterMod

import typings.grpcGrpcJs.callStreamMod.StatusObject
import typings.grpcGrpcJs.callStreamMod.WriteObject
import typings.grpcGrpcJs.metadataMod.Metadata
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filter extends js.Object {
  
  def receiveMessage(message: js.Promise[Buffer]): js.Promise[Buffer] = js.native
  
  def receiveMetadata(metadata: Metadata): Metadata = js.native
  
  def receiveTrailers(status: StatusObject): StatusObject = js.native
  
  def sendMessage(message: js.Promise[WriteObject]): js.Promise[WriteObject] = js.native
  
  def sendMetadata(metadata: js.Promise[Metadata]): js.Promise[Metadata] = js.native
}
object Filter {
  
  @scala.inline
  def apply(
    receiveMessage: js.Promise[Buffer] => js.Promise[Buffer],
    receiveMetadata: Metadata => Metadata,
    receiveTrailers: StatusObject => StatusObject,
    sendMessage: js.Promise[WriteObject] => js.Promise[WriteObject],
    sendMetadata: js.Promise[Metadata] => js.Promise[Metadata]
  ): Filter = {
    val __obj = js.Dynamic.literal(receiveMessage = js.Any.fromFunction1(receiveMessage), receiveMetadata = js.Any.fromFunction1(receiveMetadata), receiveTrailers = js.Any.fromFunction1(receiveTrailers), sendMessage = js.Any.fromFunction1(sendMessage), sendMetadata = js.Any.fromFunction1(sendMetadata))
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
    
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
    def setReceiveMessage(value: js.Promise[Buffer] => js.Promise[Buffer]): Self = this.set("receiveMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReceiveMetadata(value: Metadata => Metadata): Self = this.set("receiveMetadata", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReceiveTrailers(value: StatusObject => StatusObject): Self = this.set("receiveTrailers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSendMessage(value: js.Promise[WriteObject] => js.Promise[WriteObject]): Self = this.set("sendMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSendMetadata(value: js.Promise[Metadata] => js.Promise[Metadata]): Self = this.set("sendMetadata", js.Any.fromFunction1(value))
  }
}
