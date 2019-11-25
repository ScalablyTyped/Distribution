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
    val __obj = js.Dynamic.literal(ConstantValue = ConstantValue.asInstanceOf[js.Any], Constructor = Constructor.asInstanceOf[js.Any], DynamicValue = DynamicValue.asInstanceOf[js.Any], Factory = Factory.asInstanceOf[js.Any], Function = Function.asInstanceOf[js.Any], Instance = Instance.asInstanceOf[js.Any], Invalid = Invalid.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BindingTypeEnum]
  }
}

