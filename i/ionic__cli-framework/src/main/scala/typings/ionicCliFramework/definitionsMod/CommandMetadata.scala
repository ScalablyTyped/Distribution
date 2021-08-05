package typings.ionicCliFramework.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandMetadata[I, O]
  extends StObject
     with Metadata {
  
  var exampleCommands: js.UndefOr[js.Array[String]] = js.undefined
  
  var inputs: js.UndefOr[js.Array[I]] = js.undefined
  
  var options: js.UndefOr[js.Array[O]] = js.undefined
}
object CommandMetadata {
  
  inline def apply[I, O](name: String, summary: String): CommandMetadata[I, O] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandMetadata[I, O]]
  }
  
  extension [Self <: CommandMetadata[?, ?], I, O](x: Self & (CommandMetadata[I, O])) {
    
    inline def setExampleCommands(value: js.Array[String]): Self = StObject.set(x, "exampleCommands", value.asInstanceOf[js.Any])
    
    inline def setExampleCommandsUndefined: Self = StObject.set(x, "exampleCommands", js.undefined)
    
    inline def setExampleCommandsVarargs(value: String*): Self = StObject.set(x, "exampleCommands", js.Array(value :_*))
    
    inline def setInputs(value: js.Array[I]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setInputsVarargs(value: I*): Self = StObject.set(x, "inputs", js.Array(value :_*))
    
    inline def setOptions(value: js.Array[O]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: O*): Self = StObject.set(x, "options", js.Array(value :_*))
  }
}
