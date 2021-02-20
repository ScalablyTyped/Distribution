package typings.ink

import typings.ink.domMod.DOMElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererMod {
  
  @JSImport("ink/build/renderer", JSImport.Default)
  @js.native
  def default(node: DOMElement, terminalWidth: Double): Result = js.native
  
  @js.native
  trait Result extends StObject {
    
    var output: String = js.native
    
    var outputHeight: Double = js.native
    
    var staticOutput: String = js.native
  }
  object Result {
    
    @scala.inline
    def apply(output: String, outputHeight: Double, staticOutput: String): Result = {
      val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], outputHeight = outputHeight.asInstanceOf[js.Any], staticOutput = staticOutput.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputHeight(value: Double): Self = StObject.set(x, "outputHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticOutput(value: String): Self = StObject.set(x, "staticOutput", value.asInstanceOf[js.Any])
    }
  }
}
