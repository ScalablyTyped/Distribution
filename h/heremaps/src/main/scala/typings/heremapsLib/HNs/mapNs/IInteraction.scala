package typings
package heremapsLib.HNs.mapNs

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
  def endInteraction(): scala.Unit = js.native
  def endInteraction(opt_preventKinetics: scala.Boolean): scala.Unit = js.native
  /**
    * This method resolves direct screen (view port) interaction. This function will modify the current view according to values passed in.
    * @param x {number} - viewport x coordinate
    * @param y {number} - viewport y coordinate
    * @param opt_bx {number=} - x coordinate for second pointer/touch if present
    * @param opt_by {number=} - y coordinate for secong pointer/touch if present
    * @param opt_timestamp {number=} - known timestamp which should be passed
    */
  def interaction(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def interaction(x: scala.Double, y: scala.Double, opt_bx: scala.Double): scala.Unit = js.native
  def interaction(x: scala.Double, y: scala.Double, opt_bx: scala.Double, opt_by: scala.Double): scala.Unit = js.native
  def interaction(
    x: scala.Double,
    y: scala.Double,
    opt_bx: scala.Double,
    opt_by: scala.Double,
    opt_timestamp: scala.Double
  ): scala.Unit = js.native
  /**
    * This method starts the interaction with the view port. Should be called every time when new interaction is started i.e mouse grab, or touch start.
    * @param modifiers {number} - a bitmask which specifies what operations should performed during every interaction
    * @param opt_kinetics {H.util.kinetics.IKinetics=} - specifies kinetic move at the end of interaction
    */
  def startInteraction(modifiers: heremapsLib.HNs.mathNs.BitMask): scala.Unit = js.native
  def startInteraction(
    modifiers: heremapsLib.HNs.mathNs.BitMask,
    opt_kinetics: heremapsLib.HNs.utilNs.kineticsNs.IKinetics
  ): scala.Unit = js.native
}

