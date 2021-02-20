package typings.ink

import typings.ink.domMod.DOMElement
import typings.ink.domMod.TextNode
import typings.yogaLayout.mod.YogaConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLayoutMod {
  
  @JSImport("ink/build/build-layout", "buildLayout")
  @js.native
  def buildLayout(node: DOMElement, options: BuildLayoutOptions): TextNode | DOMElement = js.native
  @JSImport("ink/build/build-layout", "buildLayout")
  @js.native
  def buildLayout(node: TextNode, options: BuildLayoutOptions): TextNode | DOMElement = js.native
  
  @js.native
  trait BuildLayoutOptions extends StObject {
    
    var config: YogaConfig = js.native
    
    var skipStaticElements: Boolean = js.native
    
    var terminalWidth: Double = js.native
  }
  object BuildLayoutOptions {
    
    @scala.inline
    def apply(config: YogaConfig, skipStaticElements: Boolean, terminalWidth: Double): BuildLayoutOptions = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], skipStaticElements = skipStaticElements.asInstanceOf[js.Any], terminalWidth = terminalWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildLayoutOptions]
    }
    
    @scala.inline
    implicit class BuildLayoutOptionsMutableBuilder[Self <: BuildLayoutOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: YogaConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipStaticElements(value: Boolean): Self = StObject.set(x, "skipStaticElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTerminalWidth(value: Double): Self = StObject.set(x, "terminalWidth", value.asInstanceOf[js.Any])
    }
  }
}
