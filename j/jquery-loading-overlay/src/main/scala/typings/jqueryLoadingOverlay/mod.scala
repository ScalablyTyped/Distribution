package typings.jqueryLoadingOverlay

import typings.jqueryLoadingOverlay.jqueryLoadingOverlayStrings.remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Inlined std.Partial<{  loadingClass :string,   overlayClass :string,   spinnerClass :string,   iconClass :string,   textClass :string,   loadingText :string}> */
  trait Options extends StObject {
    
    var iconClass: js.UndefOr[String] = js.undefined
    
    var loadingClass: js.UndefOr[String] = js.undefined
    
    var loadingText: js.UndefOr[String] = js.undefined
    
    var overlayClass: js.UndefOr[String] = js.undefined
    
    var spinnerClass: js.UndefOr[String] = js.undefined
    
    var textClass: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
      
      inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
      
      inline def setLoadingClass(value: String): Self = StObject.set(x, "loadingClass", value.asInstanceOf[js.Any])
      
      inline def setLoadingClassUndefined: Self = StObject.set(x, "loadingClass", js.undefined)
      
      inline def setLoadingText(value: String): Self = StObject.set(x, "loadingText", value.asInstanceOf[js.Any])
      
      inline def setLoadingTextUndefined: Self = StObject.set(x, "loadingText", js.undefined)
      
      inline def setOverlayClass(value: String): Self = StObject.set(x, "overlayClass", value.asInstanceOf[js.Any])
      
      inline def setOverlayClassUndefined: Self = StObject.set(x, "overlayClass", js.undefined)
      
      inline def setSpinnerClass(value: String): Self = StObject.set(x, "spinnerClass", value.asInstanceOf[js.Any])
      
      inline def setSpinnerClassUndefined: Self = StObject.set(x, "spinnerClass", js.undefined)
      
      inline def setTextClass(value: String): Self = StObject.set(x, "textClass", value.asInstanceOf[js.Any])
      
      inline def setTextClassUndefined: Self = StObject.set(x, "textClass", js.undefined)
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
