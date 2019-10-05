package typings.heremaps.H.map

import typings.heremaps.H.math.BitMask
import typings.heremaps.H.util.kinetics.IKinetics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface describes interaction with the view port. Interaction will reflect view change depending on the interaction coordinates passed and the modifiers which specify the type of
  * interaction.
  */
@js.native
trait IInteraction extends js.Object {
  /**
    * This method ends interaction and applies kinetic movement if defined by using startInteraction method
    * @param opt_preventKinetics {boolean=} - if set to true will prevent kinetics behaviour at the end of interaction
    */
  def endInteraction(): Unit = js.native
  def endInteraction(opt_preventKinetics: Boolean): Unit = js.native
  /**
    * This method resolves direct screen (view port) interaction. This function will modify the current view according to values passed in.
    * @param x {number} - viewport x coordinate
    * @param y {number} - viewport y coordinate
    * @param opt_bx {number=} - x coordinate for second pointer/touch if present
    * @param opt_by {number=} - y coordinate for secong pointer/touch if present
    * @param opt_timestamp {number=} - known timestamp which should be passed
    */
  def interaction(x: Double, y: Double): Unit = js.native
  def interaction(x: Double, y: Double, opt_bx: Double): Unit = js.native
  def interaction(x: Double, y: Double, opt_bx: Double, opt_by: Double): Unit = js.native
  def interaction(x: Double, y: Double, opt_bx: Double, opt_by: Double, opt_timestamp: Double): Unit = js.native
  /**
    * This method starts the interaction with the view port. Should be called every time when new interaction is started i.e mouse grab, or touch start.
    * @param modifiers {number} - a bitmask which specifies what operations should performed during every interaction
    * @param opt_kinetics {H.util.kinetics.IKinetics=} - specifies kinetic move at the end of interaction
    */
  def startInteraction(modifiers: BitMask): Unit = js.native
  def startInteraction(modifiers: BitMask, opt_kinetics: IKinetics): Unit = js.native
}

