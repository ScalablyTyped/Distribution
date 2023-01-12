package typings.haversine

import typings.haversine.anon.Coordinates
import typings.haversine.haversineStrings.LeftcurlybracketlatCommalngRightcurlybracket
import typings.haversine.haversineStrings.LeftcurlybracketlonCommalatRightcurlybracket
import typings.haversine.haversineStrings.`[latCommalon]`
import typings.haversine.haversineStrings.`[lonCommalat]`
import typings.haversine.haversineStrings.geojson
import typings.haversine.haversineStrings.km
import typings.haversine.haversineStrings.meter
import typings.haversine.haversineStrings.mile
import typings.haversine.haversineStrings.nmi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Determines the great-circle distance between two points on a sphere given their longitudes and latitudes
    */
  inline def apply[OptionsT /* <: js.UndefOr[Options] */](start: ParamType[OptionsT], end: ParamType[OptionsT]): Return[OptionsT] = (^.asInstanceOf[js.Dynamic].apply(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Return[OptionsT]]
  inline def apply[OptionsT /* <: js.UndefOr[Options] */](start: ParamType[OptionsT], end: ParamType[OptionsT], options: OptionsT): Return[OptionsT] = (^.asInstanceOf[js.Dynamic].apply(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Return[OptionsT]]
  
  @JSImport("haversine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.haversine.mod.CoordinateLongitudeLatitude
    - typings.haversine.mod.CoordinateLonLat
    - typings.haversine.mod.CoordinateLatLng
    - typings.haversine.mod.LatLonTuple
    - typings.haversine.mod.GeoJSON
  */
  type Coordinate = _Coordinate | LatLonTuple
  
  trait CoordinateLatLng
    extends StObject
       with _Coordinate {
    
    var lat: Double
    
    var lng: Double
  }
  object CoordinateLatLng {
    
    inline def apply(lat: Double, lng: Double): CoordinateLatLng = {
      val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoordinateLatLng]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CoordinateLatLng] (val x: Self) extends AnyVal {
      
      inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      inline def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
    }
  }
  
  trait CoordinateLonLat
    extends StObject
       with _Coordinate {
    
    var lat: Double
    
    var lon: Double
  }
  object CoordinateLonLat {
    
    inline def apply(lat: Double, lon: Double): CoordinateLonLat = {
      val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoordinateLonLat]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CoordinateLonLat] (val x: Self) extends AnyVal {
      
      inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      inline def setLon(value: Double): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
    }
  }
  
  trait CoordinateLongitudeLatitude
    extends StObject
       with _Coordinate {
    
    var latitude: Double
    
    var longitude: Double
  }
  object CoordinateLongitudeLatitude {
    
    inline def apply(latitude: Double, longitude: Double): CoordinateLongitudeLatitude = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoordinateLongitudeLatitude]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CoordinateLongitudeLatitude] (val x: Self) extends AnyVal {
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    }
  }
  
  trait GeoJSON
    extends StObject
       with _Coordinate {
    
    var geometry: Coordinates
  }
  object GeoJSON {
    
    inline def apply(geometry: Coordinates): GeoJSON = {
      val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeoJSON]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GeoJSON] (val x: Self) extends AnyVal {
      
      inline def setGeometry(value: Coordinates): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    }
  }
  
  type LatLonTuple = js.Tuple2[Double, Double]
  
  trait Options extends StObject {
    
    /** Format of coordinate arguments. */
    var format: js.UndefOr[
        `[latCommalon]` | `[lonCommalat]` | LeftcurlybracketlonCommalatRightcurlybracket | LeftcurlybracketlatCommalngRightcurlybracket | geojson
      ] = js.undefined
    
    /**
      * If passed, will result in library returning boolean value of whether or not the start and end points are within that supplied threshold.
      */
    var threshold: js.UndefOr[Double | Null] = js.undefined
    
    /** Unit of measurement applied to result. Default: "km". */
    var unit: js.UndefOr[km | mile | meter | nmi] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setFormat(
        value: `[latCommalon]` | `[lonCommalat]` | LeftcurlybracketlonCommalatRightcurlybracket | LeftcurlybracketlatCommalngRightcurlybracket | geojson
      ): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdNull: Self = StObject.set(x, "threshold", null)
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      inline def setUnit(value: km | mile | meter | nmi): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
  
  // The input & output types of haversine() both depend on the Options object.
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends undefined ? haversine.haversine.CoordinateLongitudeLatitude : T extends {  format :'[lat,lon]' | '[lon,lat]'} ? [number, number] : T extends {  format :'{lat,lon}'} ? haversine.haversine.CoordinateLonLat : T extends {  format :'{lat,lng}'} ? haversine.haversine.CoordinateLatLng : T extends {  format :'geojson'} ? haversine.haversine.GeoJSON : haversine.haversine.Coordinate
    }}}
    */
  type ParamType[T /* <: js.UndefOr[Options] */] = CoordinateLongitudeLatitude
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends {  threshold :number} ? boolean : number
    }}}
    */
  type Return[T /* <: js.UndefOr[Options] */] = Boolean
  
  trait _Coordinate extends StObject
  object _Coordinate {
    
    inline def CoordinateLatLng(lat: Double, lng: Double): typings.haversine.mod.CoordinateLatLng = {
      val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.haversine.mod.CoordinateLatLng]
    }
    
    inline def CoordinateLonLat(lat: Double, lon: Double): typings.haversine.mod.CoordinateLonLat = {
      val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.haversine.mod.CoordinateLonLat]
    }
    
    inline def CoordinateLongitudeLatitude(latitude: Double, longitude: Double): typings.haversine.mod.CoordinateLongitudeLatitude = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.haversine.mod.CoordinateLongitudeLatitude]
    }
    
    inline def GeoJSON(geometry: Coordinates): typings.haversine.mod.GeoJSON = {
      val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.haversine.mod.GeoJSON]
    }
  }
}
