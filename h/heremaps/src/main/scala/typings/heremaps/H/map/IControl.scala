package typings.heremaps.H.map

import typings.heremaps.H.map.ViewModel.ILookAtData
import typings.heremaps.H.util.kinetics.IKinetics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Control interface defines method which are used for direct view or camera manipulation
  */
@js.native
trait IControl extends js.Object {
  
  /**
    * This method triggers single control action on engine. This will trigger an animation which will start modification of the view's or camera's properties according to values begin set.
    * Modification will occur at every frame. The speed values are measure by 'levels per frame' were 1 level cooresponds to a distance to next zoom level.
    * @param moveX {number} - moves the view/cam in right/left direction
    * @param moveY {number} - moves the view/cam in bottom/top direction
    * @param moveZ {number} - moves the view/cam in depth direction (changes zoom level)
    * @param angleX {number} - rotates cam over x-axis
    * @param angleY {number} - rotates cam over y-axis
    * @param angleZ {number} - rotates cam over z-axis
    * @param zoom {number} - changes current zoom level (for view works as moveZ)
    * @param opt_timestamp {number=}
    */
  def control(
    moveX: Double,
    moveY: Double,
    moveZ: Double,
    angleX: Double,
    angleY: Double,
    angleZ: Double,
    zoom: Double
  ): Unit = js.native
  def control(
    moveX: Double,
    moveY: Double,
    moveZ: Double,
    angleX: Double,
    angleY: Double,
    angleZ: Double,
    zoom: Double,
    opt_timestamp: Double
  ): Unit = js.native
  
  /**
    * This method ends current control, which will stop ongoing animation triggered by the startControl method. This method can prevent kinetics as well as it can adjust the final view if
    * the adjust function is being passed.
    * @param opt_preventKinetics {boolean=} - if set to true will prevent kinetics animation
    * @param opt_adjustView {function(H.map.ViewModel.ILookAtData)=} - user defined function which can adjust the final view this function takes last requestedData from the view model and
    * should return a modified H.map.ViewModel.CameraData which will be set as the final view
    */
  def endControl(): Unit = js.native
  def endControl(
    opt_preventKinetics: js.UndefOr[scala.Nothing],
    opt_adjustView: js.Function1[/* data */ ILookAtData, Unit]
  ): Unit = js.native
  def endControl(opt_preventKinetics: Boolean): Unit = js.native
  def endControl(opt_preventKinetics: Boolean, opt_adjustView: js.Function1[/* data */ ILookAtData, Unit]): Unit = js.native
  
  /**
    * This method starts control action for camera. This action allows to control camera animation and movement according to provided values in the H.map.IControl#control function
    * @param opt_kinetics {H.util.kinetics.IKinetics=} - kinetics settings
    * @param opt_atX {number=} - control starts at x screen coordinate
    * @param opt_atY {number=} - control starts at y screen coordinate
    */
  def startControl(): Unit = js.native
  def startControl(opt_kinetics: js.UndefOr[scala.Nothing], opt_atX: js.UndefOr[scala.Nothing], opt_atY: Double): Unit = js.native
  def startControl(opt_kinetics: js.UndefOr[scala.Nothing], opt_atX: Double): Unit = js.native
  def startControl(opt_kinetics: js.UndefOr[scala.Nothing], opt_atX: Double, opt_atY: Double): Unit = js.native
  def startControl(opt_kinetics: IKinetics): Unit = js.native
  def startControl(opt_kinetics: IKinetics, opt_atX: js.UndefOr[scala.Nothing], opt_atY: Double): Unit = js.native
  def startControl(opt_kinetics: IKinetics, opt_atX: Double): Unit = js.native
  def startControl(opt_kinetics: IKinetics, opt_atX: Double, opt_atY: Double): Unit = js.native
}
