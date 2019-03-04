package typings
package inversifyDashExpressDashUtilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ControllerMetadata extends js.Object {
  var controllerMetadata: inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.ControllerMetadata
  var methodMetadata: js.Array[
    inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.ControllerMethodMetadata
  ]
  var parameterMetadata: inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.ControllerParameterMetadata
}

object Anon_ControllerMetadata {
  @scala.inline
  def apply(
    controllerMetadata: inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.ControllerMetadata,
    methodMetadata: js.Array[
      inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.ControllerMethodMetadata
    ],
    parameterMetadata: inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.ControllerParameterMetadata
  ): Anon_ControllerMetadata = {
    val __obj = js.Dynamic.literal(controllerMetadata = controllerMetadata, methodMetadata = methodMetadata, parameterMetadata = parameterMetadata)
  
    __obj.asInstanceOf[Anon_ControllerMetadata]
  }
}

