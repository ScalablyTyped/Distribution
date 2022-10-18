package typings.leafletOffline

import typings.leaflet.mod.Control_
import typings.leaflet.mod.DoneCallback
import typings.leaflet.mod.TileLayerOptions
import typings.leaflet.mod.TileLayer_
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object leafletMod {
  
  @JSImport("leaflet", "ControlOffline")
  @js.native
  open class ControlOffline protected () extends StObject {
    def this(baseLayer: js.Object, tilesDb: js.Object, options: js.Object) = this()
    
    def initialize(baseLayer: js.Object, tilesDb: js.Object, options: js.Object): Unit = js.native
    
    def onAdd(map: js.Object): HTMLElement = js.native
  }
  
  @JSImport("leaflet", "TileLayerOffline")
  @js.native
  open class TileLayerOffline protected () extends StObject {
    def this(urlTemplate: String, tilesDb: js.Object) = this()
    def this(urlTemplate: String, tilesDb: js.Object, options: TileLayerOptions) = this()
    
    def createTile(coords: js.Object, done: DoneCallback): HTMLElement = js.native
    
    def getTileUrl(coords: js.Object): String = js.native
    
    def getTileUrls(bounds: js.Object, zoom: Double): js.Array[Any] = js.native
    
    def initialize(url: String, tilesDb: js.Object, options: js.Object): Unit = js.native
  }
  
  object control {
    
    inline def apply(): Control_ = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Control_]
    
    @JSImport("leaflet", "control")
    @js.native
    val ^ : js.Any = js.native
    
    inline def offline(baseLayer: js.Object, tilesDb: js.Object, options: js.Object): ControlOffline = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(baseLayer.asInstanceOf[js.Any], tilesDb.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ControlOffline]
  }
  
  object tileLayer {
    
    inline def apply(urlTemplate: String): TileLayer_ = ^.asInstanceOf[js.Dynamic].apply(urlTemplate.asInstanceOf[js.Any]).asInstanceOf[TileLayer_]
    inline def apply(urlTemplate: String, options: TileLayerOptions): TileLayer_ = (^.asInstanceOf[js.Dynamic].apply(urlTemplate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TileLayer_]
    
    @JSImport("leaflet", "tileLayer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def offline(url: String, tilesDb: js.Object, options: js.Object): TileLayerOffline = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(url.asInstanceOf[js.Any], tilesDb.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TileLayerOffline]
  }
}
