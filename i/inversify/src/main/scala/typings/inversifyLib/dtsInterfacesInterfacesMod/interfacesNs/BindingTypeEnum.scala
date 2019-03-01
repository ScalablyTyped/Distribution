package typings
package inversifyLib.dtsInterfacesInterfacesMod.interfacesNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ConstantValue")(ConstantValue)
    __obj.updateDynamic("Constructor")(Constructor)
    __obj.updateDynamic("DynamicValue")(DynamicValue)
    __obj.updateDynamic("Factory")(Factory)
    __obj.updateDynamic("Function")(Function)
    __obj.updateDynamic("Instance")(Instance)
    __obj.updateDynamic("Invalid")(Invalid)
    __obj.updateDynamic("Provider")(Provider)
    __obj.asInstanceOf[BindingTypeEnum]
  }
}

