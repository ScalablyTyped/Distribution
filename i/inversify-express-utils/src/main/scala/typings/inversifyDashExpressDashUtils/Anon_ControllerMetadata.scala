package typings.inversifyDashExpressDashUtils

import typings.inversifyDashExpressDashUtils.dtsInterfacesMod.interfacesNs.ControllerMetadata
import typings.inversifyDashExpressDashUtils.dtsInterfacesMod.interfacesNs.ControllerMethodMetadata
import typings.inversifyDashExpressDashUtils.dtsInterfacesMod.interfacesNs.ControllerParameterMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ControllerMetadata extends js.Object {
  var controllerMetadata: ControllerMetadata
  var methodMetadata: js.Array[ControllerMethodMetadata]
  var parameterMetadata: ControllerParameterMetadata
}

object Anon_ControllerMetadata {
  @scala.inline
  def apply(
    controllerMetadata: ControllerMetadata,
    methodMetadata: js.Array[ControllerMethodMetadata],
    parameterMetadata: ControllerParameterMetadata
  ): Anon_ControllerMetadata = {
    val __obj = js.Dynamic.literal(controllerMetadata = controllerMetadata, methodMetadata = methodMetadata, parameterMetadata = parameterMetadata)
  
    __obj.asInstanceOf[Anon_ControllerMetadata]
  }
}

