package typings.jqueryPin

import typings.jqueryPin.anon.Bottom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait Options extends StObject {
    
    var activeClass: js.UndefOr[String] = js.native
    
    var containerSelector: js.UndefOr[String] = js.native
    
    var minWidth: js.UndefOr[Double] = js.native
    
    var padding: js.UndefOr[Bottom] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveClass(value: String): Self = StObject.set(x, "activeClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveClassUndefined: Self = StObject.set(x, "activeClass", js.undefined)
      
      @scala.inline
      def setContainerSelector(value: String): Self = StObject.set(x, "containerSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerSelectorUndefined: Self = StObject.set(x, "containerSelector", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setPadding(value: Bottom): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
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
