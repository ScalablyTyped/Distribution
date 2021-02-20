package typings.inversify.interfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetTypeEnum extends StObject {
  
  var ClassProperty: TargetType = js.native
  
  var ConstructorArgument: TargetType = js.native
  
  var Variable: TargetType = js.native
}
object TargetTypeEnum {
  
  @scala.inline
  def apply(ClassProperty: TargetType, ConstructorArgument: TargetType, Variable: TargetType): TargetTypeEnum = {
    val __obj = js.Dynamic.literal(ClassProperty = ClassProperty.asInstanceOf[js.Any], ConstructorArgument = ConstructorArgument.asInstanceOf[js.Any], Variable = Variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetTypeEnum]
  }
  
  @scala.inline
  implicit class TargetTypeEnumMutableBuilder[Self <: TargetTypeEnum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassProperty(value: TargetType): Self = StObject.set(x, "ClassProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstructorArgument(value: TargetType): Self = StObject.set(x, "ConstructorArgument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariable(value: TargetType): Self = StObject.set(x, "Variable", value.asInstanceOf[js.Any])
  }
}
