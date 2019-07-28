package typings.inversify.dtsInterfacesInterfacesMod.interfacesNs

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
    val __obj = js.Dynamic.literal(ClassProperty = ClassProperty, ConstructorArgument = ConstructorArgument, Variable = Variable)
  
    __obj.asInstanceOf[TargetTypeEnum]
  }
}

