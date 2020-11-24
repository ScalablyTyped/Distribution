package typings.grpcGrpcJs.clientMod

import typings.grpcGrpcJs.callCredentialsMod.CallCredentials
import typings.grpcGrpcJs.callStreamMod.Deadline
import typings.grpcGrpcJs.clientInterceptorsMod.Interceptor
import typings.grpcGrpcJs.clientInterceptorsMod.InterceptorProvider
import typings.grpcGrpcJs.serverCallMod.ServerDuplexStream
import typings.grpcGrpcJs.serverCallMod.ServerReadableStream
import typings.grpcGrpcJs.serverCallMod.ServerUnaryCall
import typings.grpcGrpcJs.serverCallMod.ServerWritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallOptions extends js.Object {
  
  var credentials: js.UndefOr[CallCredentials] = js.native
  
  var deadline: js.UndefOr[Deadline] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var interceptor_providers: js.UndefOr[js.Array[InterceptorProvider]] = js.native
  
  var interceptors: js.UndefOr[js.Array[Interceptor]] = js.native
  
  var parent: js.UndefOr[
    (ServerUnaryCall[_, _]) | (ServerReadableStream[_, _]) | (ServerWritableStream[_, _]) | (ServerDuplexStream[_, _])
  ] = js.native
  
  var propagate_flags: js.UndefOr[Double] = js.native
}
object CallOptions {
  
  @scala.inline
  def apply(): CallOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallOptions]
  }
  
  @scala.inline
  implicit class CallOptionsOps[Self <: CallOptions] (val x: Self) extends AnyVal {
    
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
    def setCredentials(value: CallCredentials): Self = this.set("credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    
    @scala.inline
    def setDeadline(value: Deadline): Self = this.set("deadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeadline: Self = this.set("deadline", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setInterceptor_providersVarargs(value: InterceptorProvider*): Self = this.set("interceptor_providers", js.Array(value :_*))
    
    @scala.inline
    def setInterceptor_providers(value: js.Array[InterceptorProvider]): Self = this.set("interceptor_providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterceptor_providers: Self = this.set("interceptor_providers", js.undefined)
    
    @scala.inline
    def setInterceptorsVarargs(value: Interceptor*): Self = this.set("interceptors", js.Array(value :_*))
    
    @scala.inline
    def setInterceptors(value: js.Array[Interceptor]): Self = this.set("interceptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterceptors: Self = this.set("interceptors", js.undefined)
    
    @scala.inline
    def setParent(
      value: (ServerUnaryCall[_, _]) | (ServerReadableStream[_, _]) | (ServerWritableStream[_, _]) | (ServerDuplexStream[_, _])
    ): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setPropagate_flags(value: Double): Self = this.set("propagate_flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropagate_flags: Self = this.set("propagate_flags", js.undefined)
  }
}
