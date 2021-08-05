package typings.jasmineEnzyme

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jasmine-enzyme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Unit]
  
  object global {
    
    object jasmine {
      
      @js.native
      trait Matchers[T] extends StObject {
        
        def toBeChecked(): Unit = js.native
        
        def toBeDisabled(): Unit = js.native
        
        def toBeEmptyRender(): Unit = js.native
        
        def toContainExactlyOneMatchingElement(selector: String): Unit = js.native
        
        def toContainMatchingElement(selector: String): Unit = js.native
        
        def toContainMatchingElements(num: Double, selector: String): Unit = js.native
        
        def toContainReact(reactInstance: Element): Unit = js.native
        
        def toExist(): Unit = js.native
        
        def toHaveClassName(className: String): Unit = js.native
        
        def toHaveDisplayName(tagName: String): Unit = js.native
        
        def toHaveHTML(html: String): Unit = js.native
        
        def toHaveProp(propKey: String): Unit = js.native
        def toHaveProp(propKey: String, propValue: js.Any): Unit = js.native
        
        def toHaveRef(refName: String): String = js.native
        
        def toHaveState(stateKey: String): Unit = js.native
        def toHaveState(stateKey: String, stateValue: js.Any): Unit = js.native
        
        def toHaveStyle(styleKey: String): Unit = js.native
        def toHaveStyle(styleKey: String, styleValue: js.Any): Unit = js.native
        
        def toHaveTagName(tagName: String): Unit = js.native
        
        def toHaveText(): Unit = js.native
        def toHaveText(text: String): Unit = js.native
        
        def toHaveValue(value: js.Any): Unit = js.native
        
        def toIncludeText(text: String): Unit = js.native
        
        def toMatchElement(reactInstance: Element): Unit = js.native
        
        def toMatchSelector(selector: String): Unit = js.native
      }
    }
  }
}
