package typings
package leafletDashGpxLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.GPX")
@js.native
class GPX protected ()
  extends leafletLib.leafletMod.FeatureGroup[js.Any] {
  def this(gpx: java.lang.String) = this()
  def this(gpx: java.lang.String, options: GPXOptions) = this()
  def get_author(): java.lang.String = js.native
  def get_average_cadence(): scala.Double = js.native
  def get_average_hr(): scala.Double = js.native
  def get_average_temp(): scala.Double = js.native
  def get_cadence_data(): js.Array[js.Tuple3[scala.Double, scala.Double, java.lang.String]] = js.native
  def get_cadence_data_imp(): js.Array[js.Tuple3[scala.Double, scala.Double, java.lang.String]] = js.native
  def get_copyright(): java.lang.String = js.native
  def get_desc(): java.lang.String = js.native
  def get_distance(): scala.Double = js.native
  def get_distance_imp(): scala.Double = js.native
  def get_duration_string(duration: scala.Double, hidems: scala.Boolean): java.lang.String = js.native
  def get_duration_string_iso(duration: scala.Double, hidems: scala.Boolean): java.lang.String = js.native
  def get_elevation_data(): js.Array[js.Tuple3[scala.Double, scala.Double, java.lang.String]] = js.native
  def get_elevation_data_imp(): js.Array[js.Tuple3[scala.Double, scala.Double, java.lang.String]] = js.native
  def get_elevation_gain(): scala.Double = js.native
  def get_elevation_gain_imp(): scala.Double = js.native
  def get_elevation_loss(): scala.Double = js.native
  def get_elevation_loss_imp(): scala.Double = js.native
  def get_elevation_max(): scala.Double = js.native
  def get_elevation_max_imp(): scala.Double = js.native
  def get_elevation_min(): scala.Double = js.native
  def get_elevation_min_imp(): scala.Double = js.native
  def get_end_time(): stdLib.Date = js.native
  def get_heartrate_data(): js.Array[js.Tuple3[scala.Double, scala.Double, java.lang.String]] = js.native
  def get_heartrate_data_imp(): js.Array[js.Tuple3[scala.Double, scala.Double, java.lang.String]] = js.native
  def get_moving_pace(): scala.Double = js.native
  def get_moving_pace_imp(): scala.Double = js.native
  def get_moving_speed(): scala.Double = js.native
  def get_moving_speed_imp(): scala.Double = js.native
  def get_moving_time(): scala.Double = js.native
  def get_name(): java.lang.String = js.native
  def get_start_time(): stdLib.Date = js.native
  def get_temp_data(): js.Array[js.Tuple3[scala.Double, scala.Double, java.lang.String]] = js.native
  def get_temp_data_imp(): js.Array[js.Tuple3[scala.Double, scala.Double, java.lang.String]] = js.native
  def get_total_speed(): scala.Double = js.native
  def get_total_speed_imp(): scala.Double = js.native
  def get_total_time(): scala.Double = js.native
  def m_to_km(meters: scala.Double): scala.Double = js.native
  def m_to_mi(meters: scala.Double): scala.Double = js.native
  def reload(): scala.Unit = js.native
  def to_ft(meters: scala.Double): scala.Double = js.native
  def to_miles(kilometers: scala.Double): scala.Double = js.native
}

