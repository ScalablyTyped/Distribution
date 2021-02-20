package typings.ink

import typings.ink.domMod.DOMElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object measureElementMod {
  
  @JSImport("ink/build/measure-element", JSImport.Default)
  @js.native
  def default(node: DOMElement): Output = js.native
  
  @js.native
  trait Output extends StObject {
    
    /**
      * Element height.
      */
    var height: Double = js.native
    
    /**
      * Element width.
      */
    var width: Double = js.native
  }
  object Output {
    
    @scala.inline
    def apply(height: Double, width: Double): Output = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Output]
    }
    
    @scala.inline
    implicit class OutputMutableBuilder[Self <: Output] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
