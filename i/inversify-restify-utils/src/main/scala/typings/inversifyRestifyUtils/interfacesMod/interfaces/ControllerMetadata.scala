package typings.inversifyRestifyUtils.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ControllerMetadata extends js.Object {
  
  var middleware: js.Array[Middleware] = js.native
  
  var path: String = js.native
  
  var target: js.Any = js.native
}
object ControllerMetadata {
  
  @scala.inline
  def apply(middleware: js.Array[Middleware], path: String, target: js.Any): ControllerMetadata = {
    val __obj = js.Dynamic.literal(middleware = middleware.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControllerMetadata]
  }
  
  @scala.inline
  implicit class ControllerMetadataOps[Self <: ControllerMetadata] (val x: Self) extends AnyVal {
    
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
    def setMiddlewareVarargs(value: Middleware*): Self = this.set("middleware", js.Array(value :_*))
    
    @scala.inline
    def setMiddleware(value: js.Array[Middleware]): Self = this.set("middleware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}
