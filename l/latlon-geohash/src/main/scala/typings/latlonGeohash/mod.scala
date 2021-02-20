package typings.latlonGeohash

import typings.latlonGeohash.mod.Geohash.Bounds
import typings.latlonGeohash.mod.Geohash.Direction
import typings.latlonGeohash.mod.Geohash.Neighbours
import typings.latlonGeohash.mod.Geohash.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("latlon-geohash", "default.Direction")
    @js.native
    object Direction extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.latlonGeohash.mod.Geohash.Direction with String] = js.native
      
      /* "E" */ val East: typings.latlonGeohash.mod.Geohash.Direction.East with String = js.native
      
      /* "N" */ val North: typings.latlonGeohash.mod.Geohash.Direction.North with String = js.native
      
      /* "S" */ val South: typings.latlonGeohash.mod.Geohash.Direction.South with String = js.native
      
      /* "W" */ val West: typings.latlonGeohash.mod.Geohash.Direction.West with String = js.native
    }
    
    @JSImport("latlon-geohash", "default.adjacent")
    @js.native
    def adjacent(geohash: String, direction: String): String = js.native
    /**
      * Determines adjacent cell in given direction.
      *
      * @param   geohash - Cell to which adjacent cell is required.
      * @param   direction - Direction from geohash (N/S/E/W).
      * @returns Geocode of adjacent cell.
      * @throws  Invalid geohash.
      */
    @JSImport("latlon-geohash", "default.adjacent")
    @js.native
    def adjacent(geohash: String, direction: Direction): String = js.native
    
    /**
      * Returns SW/NE latitude/longitude bounds of specified geohash.
      *
      * @param   geohash - Cell that bounds are required of.
      * @returns The Bounds
      * @throws  Invalid geohash.
      */
    @JSImport("latlon-geohash", "default.bounds")
    @js.native
    def bounds(geohash: String): Bounds = js.native
    
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
    @JSImport("latlon-geohash", "default.decode")
    @js.native
    def decode(geohash: String): Point = js.native
    
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
    @JSImport("latlon-geohash", "default.encode")
    @js.native
    def encode(latitude: Double, longitude: Double): String = js.native
    @JSImport("latlon-geohash", "default.encode")
    @js.native
    def encode(latitude: Double, longitude: Double, precision: Double): String = js.native
    
    /**
      * Returns all 8 adjacent cells to specified geohash.
      *
      * @param   geohash - Geohash neighbours are required of.
      * @returns The neighbours
      * @throws  Invalid geohash.
      */
    @JSImport("latlon-geohash", "default.neighbours")
    @js.native
    def neighbours(geohash: String): Neighbours = js.native
  }
  
  object Geohash {
    
    @js.native
    sealed trait Direction extends StObject
    @JSImport("latlon-geohash", "Geohash.Direction")
    @js.native
    object Direction extends StObject {
      
      @js.native
      sealed trait East extends Direction
      
      @js.native
      sealed trait North extends Direction
      
      @js.native
      sealed trait South extends Direction
      
      @js.native
      sealed trait West extends Direction
    }
    
    @js.native
    trait Bounds extends StObject {
      
      @JSName("ne")
      var ne_FBounds: Point = js.native
      
      var sw: Point = js.native
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
    
    @js.native
    trait Neighbours extends StObject {
      
      var e: String = js.native
      
      var n: String = js.native
      
      @JSName("ne")
      var ne_FNeighbours: String = js.native
      
      var nw: String = js.native
      
      var s: String = js.native
      
      var se: String = js.native
      
      var sw: String = js.native
      
      var w: String = js.native
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
    
    @js.native
    trait Point extends StObject {
      
      var lat: Double = js.native
      
      var lon: Double = js.native
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
