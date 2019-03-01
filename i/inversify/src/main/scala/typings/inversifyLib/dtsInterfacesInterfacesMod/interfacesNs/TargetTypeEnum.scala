package typings
package inversifyLib.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetTypeEnum extends js.Object {
  var ClassProperty: TargetType
  var ConstructorArgument: TargetType
  var Variable: TargetType
}

object TargetTypeEnum {
  @scala.inline
  def apply(ClassProperty: TargetType, ConstructorArgument: TargetType, Variable: TargetType): TargetTypeEnum = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ClassProperty")(ClassProperty)
    __obj.updateDynamic("ConstructorArgument")(ConstructorArgument)
    __obj.updateDynamic("Variable")(Variable)
    __obj.asInstanceOf[TargetTypeEnum]
  }
}

