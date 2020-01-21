package typings.leafletGpx.mod

import typings.leaflet.mod.FeatureGroup_
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "GPX")
@js.native
class GPX protected ()
  extends FeatureGroup_[js.Any] {
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
  def get_end_time(): Date = js.native
  def get_heartrate_data(): js.Array[js.Tuple3[Double, Double, String]] = js.native
  def get_heartrate_data_imp(): js.Array[js.Tuple3[Double, Double, String]] = js.native
  def get_moving_pace(): Double = js.native
  def get_moving_pace_imp(): Double = js.native
  def get_moving_speed(): Double = js.native
  def get_moving_speed_imp(): Double = js.native
  def get_moving_time(): Double = js.native
  def get_name(): String = js.native
  def get_start_time(): Date = js.native
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

