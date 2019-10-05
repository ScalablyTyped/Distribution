package typings.inversify.dtsInterfacesInterfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindingTypeEnum extends js.Object {
  var ConstantValue: BindingType
  var Constructor: BindingType
  var DynamicValue: BindingType
  var Factory: BindingType
  var Function: BindingType
  var Instance: BindingType
  var Invalid: BindingType
  var Provider: BindingType
}

object BindingTypeEnum {
  @scala.inline
  def apply(
    ConstantValue: BindingType,
    Constructor: BindingType,
    DynamicValue: BindingType,
    Factory: BindingType,
    Function: BindingType,
    Instance: BindingType,
    Invalid: BindingType,
    Provider: BindingType
  ): BindingTypeEnum = {
    val __obj = js.Dynamic.literal(ConstantValue = ConstantValue, Constructor = Constructor, DynamicValue = DynamicValue, Factory = Factory, Function = Function, Instance = Instance, Invalid = Invalid, Provider = Provider)
  
    __obj.asInstanceOf[BindingTypeEnum]
  }
}

