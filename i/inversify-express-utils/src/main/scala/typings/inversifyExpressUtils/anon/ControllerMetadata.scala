package typings.inversifyExpressUtils.anon

import typings.inversifyExpressUtils.interfacesMod.interfaces.ControllerMethodMetadata
import typings.inversifyExpressUtils.interfacesMod.interfaces.ControllerParameterMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControllerMetadata extends js.Object {
  var controllerMetadata: typings.inversifyExpressUtils.interfacesMod.interfaces.ControllerMetadata = js.native
  var methodMetadata: js.Array[ControllerMethodMetadata] = js.native
  var parameterMetadata: ControllerParameterMetadata = js.native
}

object ControllerMetadata {
  @scala.inline
  def apply(
    controllerMetadata: typings.inversifyExpressUtils.interfacesMod.interfaces.ControllerMetadata,
    methodMetadata: js.Array[ControllerMethodMetadata],
    parameterMetadata: ControllerParameterMetadata
  ): ControllerMetadata = {
    val __obj = js.Dynamic.literal(controllerMetadata = controllerMetadata.asInstanceOf[js.Any], methodMetadata = methodMetadata.asInstanceOf[js.Any], parameterMetadata = parameterMetadata.asInstanceOf[js.Any])
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
    def setControllerMetadata(value: typings.inversifyExpressUtils.interfacesMod.interfaces.ControllerMetadata): Self = this.set("controllerMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethodMetadataVarargs(value: ControllerMethodMetadata*): Self = this.set("methodMetadata", js.Array(value :_*))
    @scala.inline
    def setMethodMetadata(value: js.Array[ControllerMethodMetadata]): Self = this.set("methodMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameterMetadata(value: ControllerParameterMetadata): Self = this.set("parameterMetadata", value.asInstanceOf[js.Any])
  }
  
}

