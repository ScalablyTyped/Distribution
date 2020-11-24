package typings.grpcGrpcJs.anon

import typings.grpcGrpcJs.callStreamMod.StatusObject
import typings.grpcGrpcJs.metadataMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/call-stream.InterceptingListener> */
@js.native
trait PartialInterceptingListen extends js.Object {
  
  var onReceiveMessage: js.UndefOr[js.Function1[/* message */ js.Any, Unit]] = js.native
  
  var onReceiveMetadata: js.UndefOr[js.Function1[/* metadata */ Metadata, Unit]] = js.native
  
  var onReceiveStatus: js.UndefOr[js.Function1[/* status */ StatusObject, Unit]] = js.native
}
object PartialInterceptingListen {
  
  @scala.inline
  def apply(): PartialInterceptingListen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialInterceptingListen]
  }
  
  @scala.inline
  implicit class PartialInterceptingListenOps[Self <: PartialInterceptingListen] (val x: Self) extends AnyVal {
    
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
    def setOnReceiveMessage(value: /* message */ js.Any => Unit): Self = this.set("onReceiveMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnReceiveMessage: Self = this.set("onReceiveMessage", js.undefined)
    
    @scala.inline
    def setOnReceiveMetadata(value: /* metadata */ Metadata => Unit): Self = this.set("onReceiveMetadata", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnReceiveMetadata: Self = this.set("onReceiveMetadata", js.undefined)
    
    @scala.inline
    def setOnReceiveStatus(value: /* status */ StatusObject => Unit): Self = this.set("onReceiveStatus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnReceiveStatus: Self = this.set("onReceiveStatus", js.undefined)
  }
}
