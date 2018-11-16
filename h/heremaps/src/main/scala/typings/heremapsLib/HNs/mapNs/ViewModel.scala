package typings
package heremapsLib.HNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * This class represents a view of the map. It consists of a virtual camera and a look-at point both of which have a position in geo-space and orientation angles. The view model allows to
         * change the values of these objects in order to move or rotate the map or zoom in and out.
         */
@JSGlobal("H.map.ViewModel")
@js.native
class ViewModel ()
  extends heremapsLib.HNs.utilNs.EventTarget
     with IControl {
  /**
               * This method adds callback which is triggered when the object is being disposed
               * @param callback {Function} - The callback function.
               * @param opt_scope {Object=} - An optional scope to call the callback in.
               */
  def addOnDisposeCallback(callback: js.Function0[scala.Unit], opt_scope: js.Object): scala.Unit = js.native
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
  def control(
    moveX: scala.Double,
    moveY: scala.Double,
    moveZ: scala.Double,
    angleX: scala.Double,
    angleY: scala.Double,
    angleZ: scala.Double
  ): scala.Unit = js.native
  /**
               * This method returns the camera data, which is currently rendered.
               * @returns {H.map.ViewModel.CameraData} - the current rendered camera data
               */
  def getCameraData(): heremapsLib.HNs.mapNs.ViewModelNs.CameraData = js.native
  /**
               * This method returns the currently requested data.
               * @returns {H.map.ViewModel.CameraData} - last requested cam/view data
               */
  def getRequestedCameraData(): heremapsLib.HNs.mapNs.ViewModelNs.CameraData = js.native
  /**
               * This method returns the zoom level that is currently rendered.
               * @returns {number} - current zoom level (scale)
               */
  def getZoom(): scala.Double = js.native
  /**
               * This method sets new camera data to be processed by the renderer.
               * @param data {H.map.ViewModel.CameraData} - the values to be modified
               * @returns {H.map.ViewModel} - this view model object
               */
  def setCameraData(data: heremapsLib.HNs.mapNs.ViewModelNs.CameraData): ViewModel = js.native
  /**
               * This method sets a new zoom level to be processed by the renderer
               * @param zoom {number} - the new zoom level
               * @param animate {boolean}
               */
  def setZoom(zoom: scala.Double, animate: scala.Boolean): scala.Unit = js.native
}

