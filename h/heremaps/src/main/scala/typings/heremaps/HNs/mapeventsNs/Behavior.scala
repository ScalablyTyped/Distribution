package typings.heremaps.HNs.mapeventsNs

import typings.heremaps.HNs.mapeventsNs.BehaviorNs.Options
import typings.heremaps.HNs.mathNs.BitMask
import typings.heremaps.HNs.utilNs.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Behavior class uses map events and adds behavior functionality to the map. This allows map panning and zooming via using mouse wheel
  * @property DRAGGING {number} - Map responds to user dragging via mouse or touch
  * @property WHEELZOOM {number} - Map zooms in or out in respond to mouse wheel events
  * @property DBLTAPZOOM {number} - Map zooms in or out in response to double click or double tap. For double tap if more that one touches are on the screen map will zoom out.
  */
@JSGlobal("H.mapevents.Behavior")
@js.native
class Behavior protected () extends Disposable {
  /**
    * Constructor
    * @param mapEvents {H.mapevents.MapEvents} - previously initialized map events instance
    * @param options {H.mapevents.Behavior.Options} - additional options (i.e kinetics)
    */
  def this(mapEvents: MapEvents) = this()
  def this(mapEvents: MapEvents, options: Options) = this()
  /**
    * This method disables the behavior functionality for the map
    * @param opt_behavior {number=} - The bitmask of behaviors to disable. If no arguments are passed, all behaviors will be disabled.
    */
  def disable(): Unit = js.native
  def disable(opt_behavior: BitMask): Unit = js.native
  /**
    * This method destroys all map interaction handling. Should be used when the behavior functionality is disposed. Behavior object will also be disposed (this function will be called)
    * when attached H.mapevents.MapEvents object is dispose.
    */
  def dispose(): Unit = js.native
  /**
    * This method re-enables the behavior functionality for the map.
    * @param opt_behavior {number=} - The bitmask of behaviors to enable. If no arguments are passed, all behaviors will be enabled.
    */
  def enable(): Unit = js.native
  def enable(opt_behavior: BitMask): Unit = js.native
  /**
    * This method checks if certain functionality is enabled
    * @param behavior {number} - value like H.mapevents.Behavior.DRAGGING which the check is being performed
    * @returns {boolean}
    */
  def isEnabled(behavior: Double): Boolean = js.native
}

/* static members */
@JSGlobal("H.mapevents.Behavior")
@js.native
object Behavior extends js.Object {
  var DBLTAPZOOM: Double = js.native
  var DRAGGING: Double = js.native
  var WHEELZOOM: Double = js.native
}

