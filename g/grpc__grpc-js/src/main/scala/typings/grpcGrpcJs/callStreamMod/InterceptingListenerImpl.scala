package typings.grpcGrpcJs.callStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@grpc/grpc-js/build/src/call-stream", "InterceptingListenerImpl")
@js.native
class InterceptingListenerImpl protected () extends InterceptingListener {
  def this(listener: FullListener, nextListener: InterceptingListener) = this()
  
  var listener: js.Any = js.native
  
  var nextListener: js.Any = js.native
  
  var pendingStatus: js.Any = js.native
  
  var processingMessage: js.Any = js.native
}
