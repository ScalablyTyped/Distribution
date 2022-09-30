package typings.happoCypress

import typings.std.Document
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait HappoHideDynamicElementsOptions extends StObject {
    
    var defaultMatchers: js.UndefOr[js.Array[js.RegExp]] = js.undefined
    
    var defaultSelectors: js.UndefOr[js.Array[String]] = js.undefined
    
    var matchers: js.UndefOr[js.Array[js.RegExp]] = js.undefined
    
    var replace: js.UndefOr[Boolean] = js.undefined
    
    var selectors: js.UndefOr[js.Array[String]] = js.undefined
  }
  object HappoHideDynamicElementsOptions {
    
    inline def apply(): HappoHideDynamicElementsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HappoHideDynamicElementsOptions]
    }
    
    extension [Self <: HappoHideDynamicElementsOptions](x: Self) {
      
      inline def setDefaultMatchers(value: js.Array[js.RegExp]): Self = StObject.set(x, "defaultMatchers", value.asInstanceOf[js.Any])
      
      inline def setDefaultMatchersUndefined: Self = StObject.set(x, "defaultMatchers", js.undefined)
      
      inline def setDefaultMatchersVarargs(value: js.RegExp*): Self = StObject.set(x, "defaultMatchers", js.Array(value*))
      
      inline def setDefaultSelectors(value: js.Array[String]): Self = StObject.set(x, "defaultSelectors", value.asInstanceOf[js.Any])
      
      inline def setDefaultSelectorsUndefined: Self = StObject.set(x, "defaultSelectors", js.undefined)
      
      inline def setDefaultSelectorsVarargs(value: String*): Self = StObject.set(x, "defaultSelectors", js.Array(value*))
      
      inline def setMatchers(value: js.Array[js.RegExp]): Self = StObject.set(x, "matchers", value.asInstanceOf[js.Any])
      
      inline def setMatchersUndefined: Self = StObject.set(x, "matchers", js.undefined)
      
      inline def setMatchersVarargs(value: js.RegExp*): Self = StObject.set(x, "matchers", js.Array(value*))
      
      inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setSelectors(value: js.Array[String]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
      
      inline def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
      
      inline def setSelectorsVarargs(value: String*): Self = StObject.set(x, "selectors", js.Array(value*))
    }
  }
  
  trait HappoScreenshotOptions extends StObject {
    
    var component: js.UndefOr[String] = js.undefined
    
    var responsiveInlinedCanvases: js.UndefOr[Boolean] = js.undefined
    
    var targets: js.UndefOr[js.Array[String]] = js.undefined
    
    var transformDOM: js.UndefOr[HappoTransformDOMOptions] = js.undefined
    
    var variant: js.UndefOr[String] = js.undefined
  }
  object HappoScreenshotOptions {
    
    inline def apply(): HappoScreenshotOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HappoScreenshotOptions]
    }
    
    extension [Self <: HappoScreenshotOptions](x: Self) {
      
      inline def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setResponsiveInlinedCanvases(value: Boolean): Self = StObject.set(x, "responsiveInlinedCanvases", value.asInstanceOf[js.Any])
      
      inline def setResponsiveInlinedCanvasesUndefined: Self = StObject.set(x, "responsiveInlinedCanvases", js.undefined)
      
      inline def setTargets(value: js.Array[String]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
      
      inline def setTargetsVarargs(value: String*): Self = StObject.set(x, "targets", js.Array(value*))
      
      inline def setTransformDOM(value: HappoTransformDOMOptions): Self = StObject.set(x, "transformDOM", value.asInstanceOf[js.Any])
      
      inline def setTransformDOMUndefined: Self = StObject.set(x, "transformDOM", js.undefined)
      
      inline def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  trait HappoTransformDOMOptions extends StObject {
    
    var selector: String
    
    def transform(element: Element, document: Document): Element
  }
  object HappoTransformDOMOptions {
    
    inline def apply(selector: String, transform: (Element, Document) => Element): HappoTransformDOMOptions = {
      val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any], transform = js.Any.fromFunction2(transform))
      __obj.asInstanceOf[HappoTransformDOMOptions]
    }
    
    extension [Self <: HappoTransformDOMOptions](x: Self) {
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setTransform(value: (Element, Document) => Element): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
    }
  }
  
  object global {
    
    object Cypress {
      
      @js.native
      trait Chainable extends StObject {
        
        def happoHideDynamicElements(): Unit = js.native
        def happoHideDynamicElements(options: HappoHideDynamicElementsOptions): Unit = js.native
        
        def happoScreenshot(): Unit = js.native
        def happoScreenshot(options: HappoScreenshotOptions): Unit = js.native
      }
    }
  }
}
