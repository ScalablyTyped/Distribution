package typings.ink

import typings.ink.domMod.DOMElement
import typings.ink.domMod.TextNode
import typings.yogaLayout.mod.YogaConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLayoutMod {
  
  @JSImport("ink/build/build-layout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildLayout(node: DOMElement, options: BuildLayoutOptions): TextNode | DOMElement = (^.asInstanceOf[js.Dynamic].applyDynamic("buildLayout")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TextNode | DOMElement]
  inline def buildLayout(node: TextNode, options: BuildLayoutOptions): TextNode | DOMElement = (^.asInstanceOf[js.Dynamic].applyDynamic("buildLayout")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TextNode | DOMElement]
  
  trait BuildLayoutOptions extends StObject {
    
    var config: YogaConfig
    
    var skipStaticElements: Boolean
    
    var terminalWidth: Double
  }
  object BuildLayoutOptions {
    
    inline def apply(config: YogaConfig, skipStaticElements: Boolean, terminalWidth: Double): BuildLayoutOptions = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], skipStaticElements = skipStaticElements.asInstanceOf[js.Any], terminalWidth = terminalWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildLayoutOptions]
    }
    
    extension [Self <: BuildLayoutOptions](x: Self) {
      
      inline def setConfig(value: YogaConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setSkipStaticElements(value: Boolean): Self = StObject.set(x, "skipStaticElements", value.asInstanceOf[js.Any])
      
      inline def setTerminalWidth(value: Double): Self = StObject.set(x, "terminalWidth", value.asInstanceOf[js.Any])
    }
  }
}
