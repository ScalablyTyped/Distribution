package typings.jqueryPin

import typings.jqueryPin.anon.Bottom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait Options extends StObject {
    
    var activeClass: js.UndefOr[String] = js.undefined
    
    var containerSelector: js.UndefOr[String] = js.undefined
    
    var minWidth: js.UndefOr[Double] = js.undefined
    
    var padding: js.UndefOr[Bottom] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setActiveClass(value: String): Self = StObject.set(x, "activeClass", value.asInstanceOf[js.Any])
      
      inline def setActiveClassUndefined: Self = StObject.set(x, "activeClass", js.undefined)
      
      inline def setContainerSelector(value: String): Self = StObject.set(x, "containerSelector", value.asInstanceOf[js.Any])
      
      inline def setContainerSelectorUndefined: Self = StObject.set(x, "containerSelector", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setPadding(value: Bottom): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      def pin(): JQuery = js.native
      def pin(options: Options): JQuery = js.native
    }
  }
}
