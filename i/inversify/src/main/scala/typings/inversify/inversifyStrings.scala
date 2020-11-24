package typings.inversify

import typings.inversify.interfacesMod.interfaces.BindingScope
import typings.inversify.interfacesMod.interfaces.BindingType
import typings.inversify.interfacesMod.interfaces.TargetType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inversifyStrings {
  
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
}
