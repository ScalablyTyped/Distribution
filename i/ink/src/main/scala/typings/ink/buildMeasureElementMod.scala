package typings.ink

import typings.ink.buildDomMod.DOMElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMeasureElementMod {
  
  @JSImport("ink/build/measure-element", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: DOMElement): Output = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[Output]
  
  trait Output extends StObject {
    
    /**
      * Element height.
      */
    var height: Double
    
    /**
      * Element width.
      */
    var width: Double
  }
  object Output {
    
    inline def apply(height: Double, width: Double): Output = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Output]
    }
    
    extension [Self <: Output](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
