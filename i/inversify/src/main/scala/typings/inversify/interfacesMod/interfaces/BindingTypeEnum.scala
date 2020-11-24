package typings.inversify.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindingTypeEnum extends js.Object {
  
  var ConstantValue: BindingType = js.native
  
  var Constructor: BindingType = js.native
  
  var DynamicValue: BindingType = js.native
  
  var Factory: BindingType = js.native
  
  var Function: BindingType = js.native
  
  var Instance: BindingType = js.native
  
  var Invalid: BindingType = js.native
  
  var Provider: BindingType = js.native
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
  
  @scala.inline
  implicit class BindingTypeEnumOps[Self <: BindingTypeEnum] (val x: Self) extends AnyVal {
    
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
    def setConstantValue(value: BindingType): Self = this.set("ConstantValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstructor(value: BindingType): Self = this.set("Constructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicValue(value: BindingType): Self = this.set("DynamicValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFactory(value: BindingType): Self = this.set("Factory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunction(value: BindingType): Self = this.set("Function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstance(value: BindingType): Self = this.set("Instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalid(value: BindingType): Self = this.set("Invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: BindingType): Self = this.set("Provider", value.asInstanceOf[js.Any])
  }
}
