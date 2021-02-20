package typings.jqueryLoadingOverlay

import typings.jqueryLoadingOverlay.jqueryLoadingOverlayStrings.remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Inlined std.Partial<{  loadingClass :string,   overlayClass :string,   spinnerClass :string,   iconClass :string,   textClass :string,   loadingText :string}> */
  @js.native
  trait Options extends StObject {
    
    var iconClass: js.UndefOr[String] = js.native
    
    var loadingClass: js.UndefOr[String] = js.native
    
    var loadingText: js.UndefOr[String] = js.native
    
    var overlayClass: js.UndefOr[String] = js.native
    
    var spinnerClass: js.UndefOr[String] = js.native
    
    var textClass: js.UndefOr[String] = js.native
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
      def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
      
      @scala.inline
      def setLoadingClass(value: String): Self = StObject.set(x, "loadingClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingClassUndefined: Self = StObject.set(x, "loadingClass", js.undefined)
      
      @scala.inline
      def setLoadingText(value: String): Self = StObject.set(x, "loadingText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingTextUndefined: Self = StObject.set(x, "loadingText", js.undefined)
      
      @scala.inline
      def setOverlayClass(value: String): Self = StObject.set(x, "overlayClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayClassUndefined: Self = StObject.set(x, "overlayClass", js.undefined)
      
      @scala.inline
      def setSpinnerClass(value: String): Self = StObject.set(x, "spinnerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinnerClassUndefined: Self = StObject.set(x, "spinnerClass", js.undefined)
      
      @scala.inline
      def setTextClass(value: String): Self = StObject.set(x, "textClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextClassUndefined: Self = StObject.set(x, "textClass", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      def loadingOverlay(): JQuery = js.native
      def loadingOverlay(options: Options): JQuery = js.native
      @JSName("loadingOverlay")
      def loadingOverlay_remove(method: remove): JQuery = js.native
      @JSName("loadingOverlay")
      def loadingOverlay_remove(method: remove, options: Options): JQuery = js.native
    }
  }
}
