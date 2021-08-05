package typings.ink

import typings.ink.domMod.DOMElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererMod {
  
  @JSImport("ink/build/renderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: DOMElement, terminalWidth: Double): Result = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], terminalWidth.asInstanceOf[js.Any])).asInstanceOf[Result]
  
  trait Result extends StObject {
    
    var output: String
    
    var outputHeight: Double
    
    var staticOutput: String
  }
  object Result {
    
    inline def apply(output: String, outputHeight: Double, staticOutput: String): Result = {
      val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], outputHeight = outputHeight.asInstanceOf[js.Any], staticOutput = staticOutput.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputHeight(value: Double): Self = StObject.set(x, "outputHeight", value.asInstanceOf[js.Any])
      
      inline def setStaticOutput(value: String): Self = StObject.set(x, "staticOutput", value.asInstanceOf[js.Any])
    }
  }
}
