package typings.iitc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMapDataCalcToolsMod {
  
  object global {
    
    object TILE_PARAMS {
      
      @JSGlobal("TILE_PARAMS")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * @default  [1,1,1,40,40,80,80,320,1000,2000,2000,4000,8000,16000,16000,32000];
        */
      @JSGlobal("TILE_PARAMS.TILES_PER_EDGE")
      @js.native
      def TILES_PER_EDGE: js.Array[Double] = js.native
      inline def TILES_PER_EDGE_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TILES_PER_EDGE")(x.asInstanceOf[js.Any])
      
      /**
        * @default [8,8,8,8,7,7,7,6,6,5,4,4,3,2,2,1,1];
        */
      @JSGlobal("TILE_PARAMS.ZOOM_TO_LEVEL")
      @js.native
      def ZOOM_TO_LEVEL: js.Array[Double] = js.native
      inline def ZOOM_TO_LEVEL_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZOOM_TO_LEVEL")(x.asInstanceOf[js.Any])
      
      /**
        * @default [200000,200000,200000,200000,200000,60000,60000,10000,5000,2500,2500,800,300,0,0];
        */
      @JSGlobal("TILE_PARAMS.ZOOM_TO_LINK_LENGTH")
      @js.native
      def ZOOM_TO_LINK_LENGTH: js.Array[Double] = js.native
      inline def ZOOM_TO_LINK_LENGTH_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZOOM_TO_LINK_LENGTH")(x.asInstanceOf[js.Any])
    }
    
    /**
      * we can fetch data at a zoom level different to the map zoom.
      * To improve the cacheing performance, we try and limit the number of zoom levels we retrieve data for
      * to avoid impacting server load, we keep ourselves restricted to a zoom level with the sane number
      * of tilesPerEdge and portal levels visible
      */
    inline def getDataZoomForMapZoom(mapZoom: Double): Double = js.Dynamic.global.applyDynamic("getDataZoomForMapZoom")(mapZoom.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getMapZoomTileParameters(zoom: Double): MapZoomTileParameters = js.Dynamic.global.applyDynamic("getMapZoomTileParameters")(zoom.asInstanceOf[js.Any]).asInstanceOf[MapZoomTileParameters]
    
    inline def latToTile(lat: Double, params: MapZoomTileParameters): Double = (js.Dynamic.global.applyDynamic("latToTile")(lat.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def lngToTile(lng: Double, params: MapZoomTileParameters): Double = (js.Dynamic.global.applyDynamic("lngToTile")(lng.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def pointToTileId(params: MapZoomTileParameters, x: Double, y: Double): String = (js.Dynamic.global.applyDynamic("pointToTileId")(params.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Ingress Intel splits up requests for map data (portals, links,fields) into tiles. To get data for the current viewport
      * (i.e. what is currently visible) it first calculates which tiles intersect.
      * For all those tiles, it then calculates the lat/lng bounds of that tile and a quadkey.
      * Both the bounds and the quadkey are “somewhat” required to get complete data.
      *
      * Conversion functions courtesy of @link http://wiki.openstreetmap.org/wiki/Slippy_map_tilenames
      */
    inline def setupDataTileParams(): Unit = js.Dynamic.global.applyDynamic("setupDataTileParams")().asInstanceOf[Unit]
    
    inline def tileToLat(y: Double, params: MapZoomTileParameters): Double = (js.Dynamic.global.applyDynamic("tileToLat")(y.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def tileToLng(x: Double, params: MapZoomTileParameters): Double = (js.Dynamic.global.applyDynamic("tileToLng")(x.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    trait MapZoomTileParameters extends StObject {
      
      var hasPortals: Boolean
      
      var level: Double
      
      var minLinkLength: Double
      
      var tilesPerEdge: Double
      
      var zoom: Double
    }
    object MapZoomTileParameters {
      
      inline def apply(hasPortals: Boolean, level: Double, minLinkLength: Double, tilesPerEdge: Double, zoom: Double): MapZoomTileParameters = {
        val __obj = js.Dynamic.literal(hasPortals = hasPortals.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], minLinkLength = minLinkLength.asInstanceOf[js.Any], tilesPerEdge = tilesPerEdge.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
        __obj.asInstanceOf[MapZoomTileParameters]
      }
      
      extension [Self <: MapZoomTileParameters](x: Self) {
        
        inline def setHasPortals(value: Boolean): Self = StObject.set(x, "hasPortals", value.asInstanceOf[js.Any])
        
        inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
        
        inline def setMinLinkLength(value: Double): Self = StObject.set(x, "minLinkLength", value.asInstanceOf[js.Any])
        
        inline def setTilesPerEdge(value: Double): Self = StObject.set(x, "tilesPerEdge", value.asInstanceOf[js.Any])
        
        inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      }
    }
  }
}
