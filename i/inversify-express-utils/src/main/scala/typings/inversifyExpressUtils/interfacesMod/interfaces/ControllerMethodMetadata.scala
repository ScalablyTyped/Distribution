package typings.inversifyExpressUtils.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControllerMethodMetadata extends ControllerMetadata {
  var key: String = js.native
  var method: String = js.native
}

object ControllerMethodMetadata {
  @scala.inline
  def apply(key: String, method: String, middleware: js.Array[Middleware], path: String, target: js.Any): ControllerMethodMetadata = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], middleware = middleware.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
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
  }
  
}

