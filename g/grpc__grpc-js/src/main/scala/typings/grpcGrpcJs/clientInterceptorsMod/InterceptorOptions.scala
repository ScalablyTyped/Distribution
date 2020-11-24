package typings.grpcGrpcJs.clientInterceptorsMod

import typings.grpcGrpcJs.clientMod.CallOptions
import typings.grpcGrpcJs.makeClientMod.ClientMethodDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterceptorOptions extends CallOptions {
  
  var method_definition: ClientMethodDefinition[_, _] = js.native
}
object InterceptorOptions {
  
  @scala.inline
  def apply(method_definition: ClientMethodDefinition[_, _]): InterceptorOptions = {
    val __obj = js.Dynamic.literal(method_definition = method_definition.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterceptorOptions]
  }
  
  @scala.inline
  implicit class InterceptorOptionsOps[Self <: InterceptorOptions] (val x: Self) extends AnyVal {
    
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
    def setMethod_definition(value: ClientMethodDefinition[_, _]): Self = this.set("method_definition", value.asInstanceOf[js.Any])
  }
}
