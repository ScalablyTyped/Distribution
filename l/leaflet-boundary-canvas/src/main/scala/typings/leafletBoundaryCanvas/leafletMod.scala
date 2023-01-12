package typings.leafletBoundaryCanvas

import typings.geojson.mod.FeatureCollection
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import typings.leaflet.mod.TileLayerOptions
import typings.leaflet.mod.TileLayer_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object leafletMod {
  
  object TileLayer {
    
    @JSImport("leaflet", "TileLayer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("leaflet", "TileLayer.BoundaryCanvas")
    @js.native
    open class BoundaryCanvas_ protected () extends TileLayer_ {
      def this(url: String) = this()
      def this(url: String, options: BoundaryCanvasOptions) = this()
    }
    object BoundaryCanvas_ {
      
      @JSImport("leaflet", "TileLayer.BoundaryCanvas")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def createFromLayer(tileLayer: TileLayer_): BoundaryCanvas_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromLayer")(tileLayer.asInstanceOf[js.Any]).asInstanceOf[BoundaryCanvas_]
      inline def createFromLayer(tileLayer: TileLayer_, options: BoundaryCanvasOptions): BoundaryCanvas_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromLayer")(tileLayer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BoundaryCanvas_]
    }
    
    inline def boundaryCanvas(url: String): BoundaryCanvas_ = ^.asInstanceOf[js.Dynamic].applyDynamic("boundaryCanvas")(url.asInstanceOf[js.Any]).asInstanceOf[BoundaryCanvas_]
    inline def boundaryCanvas(url: String, options: BoundaryCanvasOptions): BoundaryCanvas_ = (^.asInstanceOf[js.Dynamic].applyDynamic("boundaryCanvas")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BoundaryCanvas_]
    
    trait BoundaryCanvasOptions
      extends StObject
         with TileLayerOptions {
      
      var boundary: js.UndefOr[FeatureCollection[Geometry, GeoJsonProperties]] = js.undefined
      
      @JSName("crossOrigin")
      var crossOrigin_BoundaryCanvasOptions: js.UndefOr[Boolean] = js.undefined
      
      var trackAttribution: js.UndefOr[Boolean] = js.undefined
    }
    object BoundaryCanvasOptions {
      
      inline def apply(): BoundaryCanvasOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BoundaryCanvasOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: BoundaryCanvasOptions] (val x: Self) extends AnyVal {
        
        inline def setBoundary(value: FeatureCollection[Geometry, GeoJsonProperties]): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
        
        inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
        
        inline def setCrossOrigin(value: Boolean): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
        
        inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
        
        inline def setTrackAttribution(value: Boolean): Self = StObject.set(x, "trackAttribution", value.asInstanceOf[js.Any])
        
        inline def setTrackAttributionUndefined: Self = StObject.set(x, "trackAttribution", js.undefined)
      }
    }
  }
}
