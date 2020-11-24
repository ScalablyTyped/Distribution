package typings.heremaps.H.map

import typings.heremaps.H.map.ViewModel.ILookAtData
import typings.heremaps.H.util.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents a view of the map. It consists of a virtual camera and a look-at point both of which have a position in geo-space and orientation angles. The view model allows to
  * change the values of these objects in order to move or rotate the map or zoom in and out.
  */
@js.native
trait ViewModel_
  extends EventTarget
     with IControl {
  
  def addOnDisposeCallback(callback: js.Function0[Unit], opt_scope: js.Object): Unit = js.native
  
  /**
    * A method to set the values for a continuously modification of the ViewModel on different axes. If the current render engine doesn't support certain modifications then they are ignored.
    * @param moveX {number} - The movement on x-axis as levels per millisecond where a level correlates to the distance between camera and look-at point.
    * @param moveY {number} - The movement on y-axis as levels per millisecond where a level correlates to the distance between camera and look-at point
    * @param moveZ {number} - The movement on z-axis as levels per millisecond.
    * @param angleX {number} - The rotation of on screen's x axis as degrees per millisecond.
    * @param angleY {number} - The rotation of on screen's y axis as degrees per millisecond.
    * @param angleZ {number} - The rotation of on screen's z axis as degrees per millisecond.
    * @param opt_zoom {number=} - The modification of the zoom level as levels per millisecond
    */
  def control(moveX: Double, moveY: Double, moveZ: Double, angleX: Double, angleY: Double, angleZ: Double): Unit = js.native
  
  /**
    * {@link https://developer.here.com/documentation/maps/api_reference/H.map.ViewModel.html#getLookAtData}
    */
  def getLookAtData(): ILookAtData = js.native
  
  /**
    * This method returns the zoom level that is currently rendered.
    * @returns {number} - current zoom level (scale)
    */
  def getZoom(): Double = js.native
  
  /**
    * {@link https://developer.here.com/documentation/maps/api_reference/H.map.ViewModel.html#setLookAtData}
    * @param data - The values to be modified. Here are some of the main possibilities to reposition the camera at give look-at point
    * @param opt_animate - A value indicating if an animated transition should be applied, default is false.
    */
  def setLookAtData(data: ILookAtData): ViewModel = js.native
  def setLookAtData(data: ILookAtData, opt_animate: Boolean): ViewModel = js.native
  
  /**
    * This method sets a new zoom level to be processed by the renderer
    * @param zoom {number} - the new zoom level
    * @param animate {boolean}
    */
  def setZoom(zoom: Double, animate: Boolean): Unit = js.native
}
