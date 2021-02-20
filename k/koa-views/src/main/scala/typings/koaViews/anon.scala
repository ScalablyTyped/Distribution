package typings.koaViews

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AutoRender extends StObject {
    
    /*
      * autoRender the result into ctx.body, defaults to true
      */
    var autoRender: js.UndefOr[Boolean] = js.native
    
    /*
      * replace consolidate as default engine source
      */
    var engineSource: js.UndefOr[js.Any] = js.native
    
    /*
      * default extension for your views
      */
    var extension: js.UndefOr[String] = js.native
    
    /*
      * map a file extension to an engine
      */
    var map: js.UndefOr[js.Any] = js.native
    
    /*
      * these options will get passed to the view engine
      */
    var options: js.UndefOr[js.Any] = js.native
  }
  object AutoRender {
    
    @scala.inline
    def apply(): AutoRender = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoRender]
    }
    
    @scala.inline
    implicit class AutoRenderMutableBuilder[Self <: AutoRender] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoRender(value: Boolean): Self = StObject.set(x, "autoRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoRenderUndefined: Self = StObject.set(x, "autoRender", js.undefined)
      
      @scala.inline
      def setEngineSource(value: js.Any): Self = StObject.set(x, "engineSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineSourceUndefined: Self = StObject.set(x, "engineSource", js.undefined)
      
      @scala.inline
      def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      @scala.inline
      def setMap(value: js.Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
