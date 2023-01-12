package typings.leafletGpx

import org.scalablytyped.runtime.StringDictionary
import typings.leaflet.mod.FeatureGroup_
import typings.leaflet.mod.PolylineOptions
import typings.leafletGpx.anon.ParseElements
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object leafletMod {
  
  @JSImport("leaflet", "GPX")
  @js.native
  open class GPX protected () extends FeatureGroup_[Any] {
    def this(gpx: String) = this()
    def this(gpx: String, options: GPXOptions) = this()
    
    def get_author(): String = js.native
    
    def get_average_cadence(): Double = js.native
    
    def get_average_hr(): Double = js.native
    
    def get_average_temp(): Double = js.native
    
    def get_cadence_data(): js.Array[js.Tuple3[Double, Double, String]] = js.native
    
    def get_cadence_data_imp(): js.Array[js.Tuple3[Double, Double, String]] = js.native
    
    def get_copyright(): String = js.native
    
    def get_desc(): String = js.native
    
    def get_distance(): Double = js.native
    
    def get_distance_imp(): Double = js.native
    
    def get_duration_string(duration: Double, hidems: Boolean): String = js.native
    
    def get_duration_string_iso(duration: Double, hidems: Boolean): String = js.native
    
    def get_elevation_data(): js.Array[js.Tuple3[Double, Double, String]] = js.native
    
    def get_elevation_data_imp(): js.Array[js.Tuple3[Double, Double, String]] = js.native
    
    def get_elevation_gain(): Double = js.native
    
    def get_elevation_gain_imp(): Double = js.native
    
    def get_elevation_loss(): Double = js.native
    
    def get_elevation_loss_imp(): Double = js.native
    
    def get_elevation_max(): Double = js.native
    
    def get_elevation_max_imp(): Double = js.native
    
    def get_elevation_min(): Double = js.native
    
    def get_elevation_min_imp(): Double = js.native
    
    def get_end_time(): js.Date = js.native
    
    def get_heartrate_data(): js.Array[js.Tuple3[Double, Double, String]] = js.native
    
    def get_heartrate_data_imp(): js.Array[js.Tuple3[Double, Double, String]] = js.native
    
    def get_moving_pace(): Double = js.native
    
    def get_moving_pace_imp(): Double = js.native
    
    def get_moving_speed(): Double = js.native
    
    def get_moving_speed_imp(): Double = js.native
    
    def get_moving_time(): Double = js.native
    
    def get_name(): String = js.native
    
    def get_start_time(): js.Date = js.native
    
    def get_temp_data(): js.Array[js.Tuple3[Double, Double, String]] = js.native
    
    def get_temp_data_imp(): js.Array[js.Tuple3[Double, Double, String]] = js.native
    
    def get_total_speed(): Double = js.native
    
    def get_total_speed_imp(): Double = js.native
    
    def get_total_time(): Double = js.native
    
    def m_to_km(meters: Double): Double = js.native
    
    def m_to_mi(meters: Double): Double = js.native
    
    def reload(): Unit = js.native
    
    def to_ft(meters: Double): Double = js.native
    
    def to_miles(kilometers: Double): Double = js.native
  }
  
  trait GPXMarkerOptions extends StObject {
    
    var endIconUrl: js.UndefOr[String] = js.undefined
    
    var shadowUrl: js.UndefOr[String] = js.undefined
    
    var startIconUrl: js.UndefOr[String] = js.undefined
    
    var wptIconUrls: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GPXMarkerOptions {
    
    inline def apply(): GPXMarkerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GPXMarkerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GPXMarkerOptions] (val x: Self) extends AnyVal {
      
      inline def setEndIconUrl(value: String): Self = StObject.set(x, "endIconUrl", value.asInstanceOf[js.Any])
      
      inline def setEndIconUrlUndefined: Self = StObject.set(x, "endIconUrl", js.undefined)
      
      inline def setShadowUrl(value: String): Self = StObject.set(x, "shadowUrl", value.asInstanceOf[js.Any])
      
      inline def setShadowUrlUndefined: Self = StObject.set(x, "shadowUrl", js.undefined)
      
      inline def setStartIconUrl(value: String): Self = StObject.set(x, "startIconUrl", value.asInstanceOf[js.Any])
      
      inline def setStartIconUrlUndefined: Self = StObject.set(x, "startIconUrl", js.undefined)
      
      inline def setWptIconUrls(value: StringDictionary[String]): Self = StObject.set(x, "wptIconUrls", value.asInstanceOf[js.Any])
      
      inline def setWptIconUrlsUndefined: Self = StObject.set(x, "wptIconUrls", js.undefined)
    }
  }
  
  trait GPXOptions extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var gpx_options: js.UndefOr[ParseElements] = js.undefined
    
    var marker_options: js.UndefOr[GPXMarkerOptions] = js.undefined
    
    var max_point_interval: js.UndefOr[Double] = js.undefined
    
    var polyline_options: js.UndefOr[PolylineOptions] = js.undefined
  }
  object GPXOptions {
    
    inline def apply(): GPXOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GPXOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GPXOptions] (val x: Self) extends AnyVal {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setGpx_options(value: ParseElements): Self = StObject.set(x, "gpx_options", value.asInstanceOf[js.Any])
      
      inline def setGpx_optionsUndefined: Self = StObject.set(x, "gpx_options", js.undefined)
      
      inline def setMarker_options(value: GPXMarkerOptions): Self = StObject.set(x, "marker_options", value.asInstanceOf[js.Any])
      
      inline def setMarker_optionsUndefined: Self = StObject.set(x, "marker_options", js.undefined)
      
      inline def setMax_point_interval(value: Double): Self = StObject.set(x, "max_point_interval", value.asInstanceOf[js.Any])
      
      inline def setMax_point_intervalUndefined: Self = StObject.set(x, "max_point_interval", js.undefined)
      
      inline def setPolyline_options(value: PolylineOptions): Self = StObject.set(x, "polyline_options", value.asInstanceOf[js.Any])
      
      inline def setPolyline_optionsUndefined: Self = StObject.set(x, "polyline_options", js.undefined)
    }
  }
}
