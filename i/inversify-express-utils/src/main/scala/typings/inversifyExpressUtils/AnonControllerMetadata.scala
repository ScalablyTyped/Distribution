package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.interfacesMod.interfaces.ControllerMetadata
import typings.inversifyExpressUtils.interfacesMod.interfaces.ControllerMethodMetadata
import typings.inversifyExpressUtils.interfacesMod.interfaces.ControllerParameterMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonControllerMetadata extends js.Object {
  var controllerMetadata: ControllerMetadata
  var methodMetadata: js.Array[ControllerMethodMetadata]
  var parameterMetadata: ControllerParameterMetadata
}

object AnonControllerMetadata {
  @scala.inline
  def apply(
    controllerMetadata: ControllerMetadata,
    methodMetadata: js.Array[ControllerMethodMetadata],
    parameterMetadata: ControllerParameterMetadata
  ): AnonControllerMetadata = {
    val __obj = js.Dynamic.literal(controllerMetadata = controllerMetadata.asInstanceOf[js.Any], methodMetadata = methodMetadata.asInstanceOf[js.Any], parameterMetadata = parameterMetadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonControllerMetadata]
  }
}

