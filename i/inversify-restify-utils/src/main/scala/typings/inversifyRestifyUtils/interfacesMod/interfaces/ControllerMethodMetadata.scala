package typings.inversifyRestifyUtils.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ControllerMethodMetadata extends js.Object {
  
  var key: String = js.native
  
  var method: String = js.native
  
  var middleware: js.Array[Middleware] = js.native
  
  var options: RouteOptions = js.native
  
  var target: js.Any = js.native
}
object ControllerMethodMetadata {
  
  @scala.inline
  def apply(
    key: String,
    method: String,
    middleware: js.Array[Middleware],
    options: RouteOptions,
    target: js.Any
  ): ControllerMethodMetadata = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], middleware = middleware.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControllerMethodMetadata]
  }
  
  @scala.inline
  implicit class ControllerMethodMetadataOps[Self <: ControllerMethodMetadata] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddlewareVarargs(value: Middleware*): Self = this.set("middleware", js.Array(value :_*))
    
    @scala.inline
    def setMiddleware(value: js.Array[Middleware]): Self = this.set("middleware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: RouteOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}
