package typings.inversify

import typings.inversify.interfacesMod.interfaces.BindingScope
import typings.inversify.interfacesMod.interfaces.BindingType
import typings.inversify.interfacesMod.interfaces.TargetType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inversifyStrings {
  
  @js.native
  sealed trait ClassProperty
    extends StObject
       with TargetType
  inline def ClassProperty: ClassProperty = "ClassProperty".asInstanceOf[ClassProperty]
  
  @js.native
  sealed trait ConstantValue
    extends StObject
       with BindingType
  inline def ConstantValue: ConstantValue = "ConstantValue".asInstanceOf[ConstantValue]
  
  @js.native
  sealed trait Constructor
    extends StObject
       with BindingType
  inline def Constructor: Constructor = "Constructor".asInstanceOf[Constructor]
  
  @js.native
  sealed trait ConstructorArgument
    extends StObject
       with TargetType
  inline def ConstructorArgument: ConstructorArgument = "ConstructorArgument".asInstanceOf[ConstructorArgument]
  
  @js.native
  sealed trait DynamicValue
    extends StObject
       with BindingType
  inline def DynamicValue: DynamicValue = "DynamicValue".asInstanceOf[DynamicValue]
  
  @js.native
  sealed trait Factory
    extends StObject
       with BindingType
  inline def Factory: Factory = "Factory".asInstanceOf[Factory]
  
  @js.native
  sealed trait Function
    extends StObject
       with BindingType
  inline def Function: Function = "Function".asInstanceOf[Function]
  
  @js.native
  sealed trait Instance
    extends StObject
       with BindingType
  inline def Instance: Instance = "Instance".asInstanceOf[Instance]
  
  @js.native
  sealed trait Invalid
    extends StObject
       with BindingType
  inline def Invalid: Invalid = "Invalid".asInstanceOf[Invalid]
  
  @js.native
  sealed trait Provider
    extends StObject
       with BindingType
  inline def Provider: Provider = "Provider".asInstanceOf[Provider]
  
  @js.native
  sealed trait Request
    extends StObject
       with BindingScope
  inline def Request: Request = "Request".asInstanceOf[Request]
  
  @js.native
  sealed trait Singleton
    extends StObject
       with BindingScope
  inline def Singleton: Singleton = "Singleton".asInstanceOf[Singleton]
  
  @js.native
  sealed trait Transient
    extends StObject
       with BindingScope
  inline def Transient: Transient = "Transient".asInstanceOf[Transient]
  
  @js.native
  sealed trait Variable
    extends StObject
       with TargetType
  inline def Variable: Variable = "Variable".asInstanceOf[Variable]
}
