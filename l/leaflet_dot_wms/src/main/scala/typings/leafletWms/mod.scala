package typings.leafletWms

import typings.leaflet.mod.LatLng_
import typings.leaflet.mod.Layer
import typings.leaflet.mod.LayerOptions
import typings.leaflet.mod.WMSParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("leaflet.wms", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("leaflet.wms", "Source")
  @js.native
  open class Source_ protected () extends Layer {
    def this(url: String, options: WmsParamsOptions) = this()
    
    var _overlay: Any = js.native
    
    var _url: String = js.native
    
    def addSubLayer(name: String): Unit = js.native
    
    def ajax(url: String, callback: Any): Unit = js.native
    
    def bringToBack(): Unit = js.native
    
    def bringToFront(): Unit = js.native
    
    def createOverlay(untiled: Boolean): Any = js.native
    
    @JSName("getEvents")
    def getEvents_MSource_(): Any = js.native
    
    def getFeatureInfo(point: Any, latLng: LatLng_, layers: Any, callback: Any): Unit = js.native
    
    def getFeatureInfoParams(point: Any, layers: Any): Any = js.native
    
    def getIdentifyLayers(): Any = js.native
    
    def getLayer(name: String): Any = js.native
    
    def hideWaiting(): Unit = js.native
    
    def identify(evt: Any): Unit = js.native
    
    def initialize(url: String, options: SourceOptions): Unit = js.native
    
    def onAdd(): Any = js.native
    
    @JSName("options")
    var options_Source_ : SourceOptions = js.native
    
    def parseFeatureInfo(result: String, url: String): String = js.native
    
    def refreshOverlay(): Unit = js.native
    
    def removeSubLayer(name: String): Unit = js.native
    
    def setOpacity(opacity: Boolean): Unit = js.native
    
    def showFeatureInfo(latlng: LatLng_, info: Any): Unit = js.native
    
    def showWaiting(): Unit = js.native
    
    var subLayers: Any = js.native
  }
  
  inline def getSourceForUrl(url: String, options: WmsParamsOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getSourceForUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def layer(source: String, options: WmsParamsOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("layer")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def overlay(url: String, options: WmsParamsOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("overlay")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def source(url: String, options: WmsParamsOptions): Source_ = (^.asInstanceOf[js.Dynamic].applyDynamic("source")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Source_]
  
  trait SourceOptions
    extends StObject
       with LayerOptions {
    
    var indentify: Boolean
    
    var untiled: Boolean
  }
  object SourceOptions {
    
    inline def apply(indentify: Boolean, untiled: Boolean): SourceOptions = {
      val __obj = js.Dynamic.literal(indentify = indentify.asInstanceOf[js.Any], untiled = untiled.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SourceOptions] (val x: Self) extends AnyVal {
      
      inline def setIndentify(value: Boolean): Self = StObject.set(x, "indentify", value.asInstanceOf[js.Any])
      
      inline def setUntiled(value: Boolean): Self = StObject.set(x, "untiled", value.asInstanceOf[js.Any])
    }
  }
  
  trait WmsParamsOptions
    extends StObject
       with WMSParams {
    
    var attribution: js.UndefOr[String] = js.undefined
    
    var crs: js.UndefOr[String] = js.undefined
    
    var isBack: js.UndefOr[Boolean] = js.undefined
    
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    var minZoom: js.UndefOr[Double] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var uppercase: js.UndefOr[Boolean] = js.undefined
  }
  object WmsParamsOptions {
    
    inline def apply(layers: String): WmsParamsOptions = {
      val __obj = js.Dynamic.literal(layers = layers.asInstanceOf[js.Any])
      __obj.asInstanceOf[WmsParamsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WmsParamsOptions] (val x: Self) extends AnyVal {
      
      inline def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
      
      inline def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
      
      inline def setCrs(value: String): Self = StObject.set(x, "crs", value.asInstanceOf[js.Any])
      
      inline def setCrsUndefined: Self = StObject.set(x, "crs", js.undefined)
      
      inline def setIsBack(value: Boolean): Self = StObject.set(x, "isBack", value.asInstanceOf[js.Any])
      
      inline def setIsBackUndefined: Self = StObject.set(x, "isBack", js.undefined)
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setUppercase(value: Boolean): Self = StObject.set(x, "uppercase", value.asInstanceOf[js.Any])
      
      inline def setUppercaseUndefined: Self = StObject.set(x, "uppercase", js.undefined)
    }
  }
}
