package typings.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapbox-gl", "FreeCameraOptions")
@js.native
open class FreeCameraOptions () extends StObject {
  def this(position: MercatorCoordinate) = this()
  def this(position: Unit, orientation: quat) = this()
  def this(position: MercatorCoordinate, orientation: quat) = this()
  
  /**
    * Helper function for setting orientation of the camera by defining a focus point
    * on the map.
    *
    * @param {LngLatLike} location Location of the focus point on the map
    * @param {vec3} up Up vector of the camera is required in certain scenarios where bearing can't be deduced
    *      from the viewing direction.
    */
  def lookAtPoint(location: LngLatLike): Unit = js.native
  def lookAtPoint(location: LngLatLike, up: vec3): Unit = js.native
  
  var position: js.UndefOr[MercatorCoordinate] = js.native
  
  /**
    * Helper function for setting the orientation of the camera as a pitch and a bearing.
    *
    * @param {number} pitch Pitch angle in degrees
    * @param {number} bearing Bearing angle in degrees
    */
  def setPitchBearing(pitch: Double, bearing: Double): Unit = js.native
}
