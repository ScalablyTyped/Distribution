package typings.inversify

import typings.inversify.dtsInterfacesInterfacesMod.interfaces.BindingScope
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.BindingType
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.TargetType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object inversifyStrings {
  @js.native
  sealed trait ClassProperty extends TargetType
  
  @js.native
  sealed trait ConstantValue extends BindingType
  
  @js.native
  sealed trait Constructor extends BindingType
  
  @js.native
  sealed trait ConstructorArgument extends TargetType
  
  @js.native
  sealed trait DynamicValue extends BindingType
  
  @js.native
  sealed trait Factory extends BindingType
  
  @js.native
  sealed trait Function extends BindingType
  
  @js.native
  sealed trait Instance extends BindingType
  
  @js.native
  sealed trait Invalid extends BindingType
  
  @js.native
  sealed trait Provider extends BindingType
  
  @js.native
  sealed trait Request extends BindingScope
  
  @js.native
  sealed trait Singleton extends BindingScope
  
  @js.native
  sealed trait Transient extends BindingScope
  
  @js.native
  sealed trait Variable extends TargetType
  
  @js.native
  sealed trait `design:paramtypes` extends js.Object
  
  @js.native
  sealed trait inject extends js.Object
  
  @js.native
  sealed trait `inversify:paramtypes` extends js.Object
  
  @js.native
  sealed trait `inversify:tagged` extends js.Object
  
  @js.native
  sealed trait `inversify:tagged_props` extends js.Object
  
  @js.native
  sealed trait multi_inject extends js.Object
  
  @js.native
  sealed trait name extends js.Object
  
  @js.native
  sealed trait named extends js.Object
  
  @js.native
  sealed trait optional extends js.Object
  
  @js.native
  sealed trait post_construct extends js.Object
  
  @js.native
  sealed trait unmanaged extends js.Object
  
  @scala.inline
  def ClassProperty: ClassProperty = "ClassProperty".asInstanceOf[ClassProperty]
  @scala.inline
  def ConstantValue: ConstantValue = "ConstantValue".asInstanceOf[ConstantValue]
  @scala.inline
  def Constructor: Constructor = "Constructor".asInstanceOf[Constructor]
  @scala.inline
  def ConstructorArgument: ConstructorArgument = "ConstructorArgument".asInstanceOf[ConstructorArgument]
  @scala.inline
  def DynamicValue: DynamicValue = "DynamicValue".asInstanceOf[DynamicValue]
  @scala.inline
  def Factory: Factory = "Factory".asInstanceOf[Factory]
  @scala.inline
  def Function: Function = "Function".asInstanceOf[Function]
  @scala.inline
  def Instance: Instance = "Instance".asInstanceOf[Instance]
  @scala.inline
  def Invalid: Invalid = "Invalid".asInstanceOf[Invalid]
  @scala.inline
  def Provider: Provider = "Provider".asInstanceOf[Provider]
  @scala.inline
  def Request: Request = "Request".asInstanceOf[Request]
  @scala.inline
  def Singleton: Singleton = "Singleton".asInstanceOf[Singleton]
  @scala.inline
  def Transient: Transient = "Transient".asInstanceOf[Transient]
  @scala.inline
  def Variable: Variable = "Variable".asInstanceOf[Variable]
  @scala.inline
  def `design:paramtypes`: `design:paramtypes` = "design:paramtypes".asInstanceOf[`design:paramtypes`]
  @scala.inline
  def inject: inject = "inject".asInstanceOf[inject]
  @scala.inline
  def `inversify:paramtypes`: `inversify:paramtypes` = "inversify:paramtypes".asInstanceOf[`inversify:paramtypes`]
  @scala.inline
  def `inversify:tagged`: `inversify:tagged` = "inversify:tagged".asInstanceOf[`inversify:tagged`]
  @scala.inline
  def `inversify:tagged_props`: `inversify:tagged_props` = "inversify:tagged_props".asInstanceOf[`inversify:tagged_props`]
  @scala.inline
  def multi_inject: multi_inject = "multi_inject".asInstanceOf[multi_inject]
  @scala.inline
  def name: name = "name".asInstanceOf[name]
  @scala.inline
  def named: named = "named".asInstanceOf[named]
  @scala.inline
  def optional: optional = "optional".asInstanceOf[optional]
  @scala.inline
  def post_construct: post_construct = "post_construct".asInstanceOf[post_construct]
  @scala.inline
  def unmanaged: unmanaged = "unmanaged".asInstanceOf[unmanaged]
}

