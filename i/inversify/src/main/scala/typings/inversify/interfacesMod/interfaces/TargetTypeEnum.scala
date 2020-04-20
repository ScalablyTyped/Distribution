package typings.inversify.interfacesMod.interfaces

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
    val __obj = js.Dynamic.literal(ClassProperty = ClassProperty.asInstanceOf[js.Any], ConstructorArgument = ConstructorArgument.asInstanceOf[js.Any], Variable = Variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetTypeEnum]
  }
}

