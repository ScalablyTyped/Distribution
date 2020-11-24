package typings.grpcGrpcJs.clientInterceptorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterceptorArguments extends js.Object {
  
  var callInterceptorProviders: js.Array[InterceptorProvider] = js.native
  
  var callInterceptors: js.Array[Interceptor] = js.native
  
  var clientInterceptorProviders: js.Array[InterceptorProvider] = js.native
  
  var clientInterceptors: js.Array[Interceptor] = js.native
}
object InterceptorArguments {
  
  @scala.inline
  def apply(
    callInterceptorProviders: js.Array[InterceptorProvider],
    callInterceptors: js.Array[Interceptor],
    clientInterceptorProviders: js.Array[InterceptorProvider],
    clientInterceptors: js.Array[Interceptor]
  ): InterceptorArguments = {
    val __obj = js.Dynamic.literal(callInterceptorProviders = callInterceptorProviders.asInstanceOf[js.Any], callInterceptors = callInterceptors.asInstanceOf[js.Any], clientInterceptorProviders = clientInterceptorProviders.asInstanceOf[js.Any], clientInterceptors = clientInterceptors.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterceptorArguments]
  }
  
  @scala.inline
  implicit class InterceptorArgumentsOps[Self <: InterceptorArguments] (val x: Self) extends AnyVal {
    
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
    def setCallInterceptorProvidersVarargs(value: InterceptorProvider*): Self = this.set("callInterceptorProviders", js.Array(value :_*))
    
    @scala.inline
    def setCallInterceptorProviders(value: js.Array[InterceptorProvider]): Self = this.set("callInterceptorProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallInterceptorsVarargs(value: Interceptor*): Self = this.set("callInterceptors", js.Array(value :_*))
    
    @scala.inline
    def setCallInterceptors(value: js.Array[Interceptor]): Self = this.set("callInterceptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientInterceptorProvidersVarargs(value: InterceptorProvider*): Self = this.set("clientInterceptorProviders", js.Array(value :_*))
    
    @scala.inline
    def setClientInterceptorProviders(value: js.Array[InterceptorProvider]): Self = this.set("clientInterceptorProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientInterceptorsVarargs(value: Interceptor*): Self = this.set("clientInterceptors", js.Array(value :_*))
    
    @scala.inline
    def setClientInterceptors(value: js.Array[Interceptor]): Self = this.set("clientInterceptors", value.asInstanceOf[js.Any])
  }
}
