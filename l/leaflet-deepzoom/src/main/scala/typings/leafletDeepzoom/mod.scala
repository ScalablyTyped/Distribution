package typings.leafletDeepzoom

import typings.leafletDeepzoom.mod.TileLayer_.DeepZoom
import typings.leafletDeepzoom.mod.TileLayer_.DeepZoomOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object TileLayer_ {
    
    @JSImport("leaflet", "TileLayer.DeepZoom")
    @js.native
    class DeepZoom protected ()
      extends typings.leaflet.mod.TileLayer_ {
      def this(urlTemplate: String) = this()
      def this(urlTemplate: String, options: DeepZoomOptions) = this()
    }
    
    trait DeepZoomOptions extends StObject {
      
      var height: js.UndefOr[Double] = js.undefined
      
      var imageFormat: js.UndefOr[String] = js.undefined
      
      var maxZoom: js.UndefOr[Double] = js.undefined
      
      var tileSize: js.UndefOr[Double] = js.undefined
      
      var width: js.UndefOr[Double] = js.undefined
    }
    object DeepZoomOptions {
      
      @scala.inline
      def apply(): DeepZoomOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeepZoomOptions]
      }
      
      @scala.inline
      implicit class DeepZoomOptionsMutableBuilder[Self <: DeepZoomOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        @scala.inline
        def setImageFormat(value: String): Self = StObject.set(x, "imageFormat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImageFormatUndefined: Self = StObject.set(x, "imageFormat", js.undefined)
        
        @scala.inline
        def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
        
        @scala.inline
        def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
        
        @scala.inline
        def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
  }
  
  object tileLayer {
    
    @JSImport("leaflet", "tileLayer")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def deepzoom(urlTemplate: String): DeepZoom = ^.asInstanceOf[js.Dynamic].applyDynamic("deepzoom")(urlTemplate.asInstanceOf[js.Any]).asInstanceOf[DeepZoom]
    @scala.inline
    def deepzoom(urlTemplate: String, options: DeepZoomOptions): DeepZoom = (^.asInstanceOf[js.Dynamic].applyDynamic("deepzoom")(urlTemplate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DeepZoom]
  }
}
