package typings.linq4js

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Linq4JS {
  
  @js.native
  sealed trait OrderDirection extends StObject
  @JSGlobal("Linq4JS.OrderDirection")
  @js.native
  object OrderDirection extends StObject {
    
    @js.native
    sealed trait Ascending
      extends StObject
         with OrderDirection
    
    @js.native
    sealed trait Descending
      extends StObject
         with OrderDirection
  }
  
  trait EvaluateCommand extends StObject {
    
    var Command: String
    
    var Finder: Array[RegExp]
    
    var SplitRegex: Array[RegExp]
  }
  object EvaluateCommand {
    
    inline def apply(Command: String, Finder: Array[RegExp], SplitRegex: Array[RegExp]): EvaluateCommand = {
      val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], Finder = Finder.asInstanceOf[js.Any], SplitRegex = SplitRegex.asInstanceOf[js.Any])
      __obj.asInstanceOf[EvaluateCommand]
    }
    
    extension [Self <: EvaluateCommand](x: Self) {
      
      inline def setCommand(value: String): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
      
      inline def setFinder(value: Array[RegExp]): Self = StObject.set(x, "Finder", value.asInstanceOf[js.Any])
      
      inline def setSplitRegex(value: Array[RegExp]): Self = StObject.set(x, "SplitRegex", value.asInstanceOf[js.Any])
    }
  }
  
  trait EvaluateCommandResult extends StObject {
    
    var Command: String
    
    var DynamicFunction: String
  }
  object EvaluateCommandResult {
    
    inline def apply(Command: String, DynamicFunction: String): EvaluateCommandResult = {
      val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], DynamicFunction = DynamicFunction.asInstanceOf[js.Any])
      __obj.asInstanceOf[EvaluateCommandResult]
    }
    
    extension [Self <: EvaluateCommandResult](x: Self) {
      
      inline def setCommand(value: String): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
      
      inline def setDynamicFunction(value: String): Self = StObject.set(x, "DynamicFunction", value.asInstanceOf[js.Any])
    }
  }
  
  trait GeneratedEntity extends StObject {
    
    var Id: Double
    
    var _GeneratedId_ : Double
  }
  object GeneratedEntity {
    
    inline def apply(Id: Double, _GeneratedId_ : Double): GeneratedEntity = {
      val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], _GeneratedId_ = _GeneratedId_.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeneratedEntity]
    }
    
    extension [Self <: GeneratedEntity](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def set_GeneratedId_(value: Double): Self = StObject.set(x, "_GeneratedId_", value.asInstanceOf[js.Any])
    }
  }
  
  trait Helper extends StObject
  
  trait OrderEntry extends StObject {
    
    var Direction: OrderDirection
    
    def ValueSelector(item: js.Any): js.Any
  }
  object OrderEntry {
    
    inline def apply(Direction: OrderDirection, ValueSelector: js.Any => js.Any): OrderEntry = {
      val __obj = js.Dynamic.literal(Direction = Direction.asInstanceOf[js.Any], ValueSelector = js.Any.fromFunction1(ValueSelector))
      __obj.asInstanceOf[OrderEntry]
    }
    
    extension [Self <: OrderEntry](x: Self) {
      
      inline def setDirection(value: OrderDirection): Self = StObject.set(x, "Direction", value.asInstanceOf[js.Any])
      
      inline def setValueSelector(value: js.Any => js.Any): Self = StObject.set(x, "ValueSelector", js.Any.fromFunction1(value))
    }
  }
  
  trait SelectEntry extends StObject {
    
    var name: String
    
    var property: String
  }
  object SelectEntry {
    
    inline def apply(name: String, property: String): SelectEntry = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectEntry]
    }
    
    extension [Self <: SelectEntry](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    }
  }
}
