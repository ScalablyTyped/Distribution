package typings.latlonGeohash

import typings.latlonGeohash.mod.Geohash.Bounds
import typings.latlonGeohash.mod.Geohash.Direction
import typings.latlonGeohash.mod.Geohash.Neighbours
import typings.latlonGeohash.mod.Geohash.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("latlon-geohash", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("latlon-geohash", "default.Direction")
    @js.native
    object Direction extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.latlonGeohash.mod.Geohash.Direction & String] = js.native
      
      /* "E" */ val East: typings.latlonGeohash.mod.Geohash.Direction.East & String = js.native
      
      /* "N" */ val North: typings.latlonGeohash.mod.Geohash.Direction.North & String = js.native
      
      /* "S" */ val South: typings.latlonGeohash.mod.Geohash.Direction.South & String = js.native
      
      /* "W" */ val West: typings.latlonGeohash.mod.Geohash.Direction.West & String = js.native
    }
    
    @scala.inline
    def adjacent(geohash: String, direction: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("adjacent")(geohash.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * Determines adjacent cell in given direction.
      *
      * @param   geohash - Cell to which adjacent cell is required.
      * @param   direction - Direction from geohash (N/S/E/W).
      * @returns Geocode of adjacent cell.
      * @throws  Invalid geohash.
      */
    @scala.inline
    def adjacent(geohash: String, direction: Direction): String = (^.asInstanceOf[js.Dynamic].applyDynamic("adjacent")(geohash.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Returns SW/NE latitude/longitude bounds of specified geohash.
      *
      * @param   geohash - Cell that bounds are required of.
      * @returns The Bounds
      * @throws  Invalid geohash.
      */
    @scala.inline
    def bounds(geohash: String): Bounds = ^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(geohash.asInstanceOf[js.Any]).asInstanceOf[Bounds]
    
    /**
      * Decode geohash to latitude/longitude (location is approximate centre of geohash cell,
      *     to reasonable precision).
      *
      * @param   geohash - Geohash string to be converted to latitude/longitude.
      * @returns (Center of) geohashed location.
      * @throws  Invalid geohash.
      *
      * @example
      *     var latlon = Geohash.decode('u120fxw'); // latlon: { lat: 52.205, lon: 0.1188 }
      */
    @scala.inline
    def decode(geohash: String): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(geohash.asInstanceOf[js.Any]).asInstanceOf[Point]
    
    /**
      * Encodes latitude/longitude to geohash, either to specified precision or to automatically
      * evaluated precision.
      *
      * @param   lat - Latitude in degrees.
      * @param   lon - Longitude in degrees.
      * @param   [precision] - Number of characters in resulting geohash.
      * @returns Geohash of supplied latitude/longitude.
      * @throws  Invalid geohash.
      *
      * @example
      *     var geohash = Geohash.encode(52.205, 0.119, 7); // geohash: 'u120fxw'
      */
    @scala.inline
    def encode(latitude: Double, longitude: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def encode(latitude: Double, longitude: Double, precision: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Returns all 8 adjacent cells to specified geohash.
      *
      * @param   geohash - Geohash neighbours are required of.
      * @returns The neighbours
      * @throws  Invalid geohash.
      */
    @scala.inline
    def neighbours(geohash: String): Neighbours = ^.asInstanceOf[js.Dynamic].applyDynamic("neighbours")(geohash.asInstanceOf[js.Any]).asInstanceOf[Neighbours]
  }
  
  object Geohash {
    
    @js.native
    sealed trait Direction extends StObject
    @JSImport("latlon-geohash", "Geohash.Direction")
    @js.native
    object Direction extends StObject {
      
      @js.native
      sealed trait East
        extends StObject
           with Direction
      
      @js.native
      sealed trait North
        extends StObject
           with Direction
      
      @js.native
      sealed trait South
        extends StObject
           with Direction
      
      @js.native
      sealed trait West
        extends StObject
           with Direction
    }
    
    trait Bounds extends StObject {
      
      @JSName("ne")
      var ne_FBounds: Point
      
      var sw: Point
    }
    object Bounds {
      
      @scala.inline
      def apply(ne_ : Point, sw: Point): Bounds = {
        val __obj = js.Dynamic.literal(sw = sw.asInstanceOf[js.Any])
        __obj.updateDynamic("ne")(ne_.asInstanceOf[js.Any])
        __obj.asInstanceOf[Bounds]
      }
      
      @scala.inline
      implicit class BoundsMutableBuilder[Self <: Bounds] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNe_(value: Point): Self = StObject.set(x, "ne", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSw(value: Point): Self = StObject.set(x, "sw", value.asInstanceOf[js.Any])
      }
    }
    
    trait Neighbours extends StObject {
      
      var e: String
      
      var n: String
      
      @JSName("ne")
      var ne_FNeighbours: String
      
      var nw: String
      
      var s: String
      
      var se: String
      
      var sw: String
      
      var w: String
    }
    object Neighbours {
      
      @scala.inline
      def apply(e: String, n: String, ne_ : String, nw: String, s: String, se: String, sw: String, w: String): Neighbours = {
        val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], nw = nw.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], se = se.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
        __obj.updateDynamic("ne")(ne_.asInstanceOf[js.Any])
        __obj.asInstanceOf[Neighbours]
      }
      
      @scala.inline
      implicit class NeighboursMutableBuilder[Self <: Neighbours] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNe_(value: String): Self = StObject.set(x, "ne", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNw(value: String): Self = StObject.set(x, "nw", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSe(value: String): Self = StObject.set(x, "se", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSw(value: String): Self = StObject.set(x, "sw", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setW(value: String): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      }
    }
    
    trait Point extends StObject {
      
      var lat: Double
      
      var lon: Double
    }
    object Point {
      
      @scala.inline
      def apply(lat: Double, lon: Double): Point = {
        val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
        __obj.asInstanceOf[Point]
      }
      
      @scala.inline
      implicit class PointMutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLon(value: Double): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
      }
    }
  }
}
