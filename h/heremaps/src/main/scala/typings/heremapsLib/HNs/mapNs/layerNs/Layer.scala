package typings
package heremapsLib.HNs.mapNs.layerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Layer class represents an object that is evaluated by the renderer in the order in which it is added to the layers collection. It provides the basic infrastructure for dispatching
  * update events to the renderer in case new data is available.
  */
@JSGlobal("H.map.layer.Layer")
@js.native
/**
  * Constructor
  * @param opt_options {H.map.layer.Layer.Options=} - optional configuration object
  */
class Layer ()
  extends heremapsLib.HNs.utilNs.EventTarget {
  def this(opt_options: heremapsLib.HNs.mapNs.layerNs.LayerNs.Options) = this()
  def addOnDisposeCallback(callback: js.Function0[scala.Unit], opt_scope: js.Object): scala.Unit = js.native
  /**
    * This method returns the copyright of the current data provider.
    * @param bounds {H.geo.Rect} - the bounding area for which to retrieve the copyright information
    * @param level {number} - the zoom level for which to retrieve the copyright information
    * @returns {Array<H.map.ICopyright>} - a list of copyright information objects for the provided area and zoom level
    */
  def getCopyrights(bounds: heremapsLib.HNs.geoNs.Rect, level: scala.Double): js.Array[heremapsLib.HNs.mapNs.ICopyright] = js.native
  /**
    * This method checks if a zoom level can be served by this layer.
    * @param zoomLevel {number} - the zoom level to check
    * @returns {boolean} - true if this layer can provide data for the zoom level, otherwise false
    */
  def isValid(zoomLevel: scala.Double): scala.Boolean = js.native
  /**
    * This method sets the maximum zoom level for which this layer will provide tiles.
    * @param max {number} - The new maximum zoom level of this layer
    * @returns {H.map.layer.Layer} - Returns this instance of the layer
    */
  def setMax(max: scala.Double): Layer = js.native
  /**
    * This method sets the minimum zoom level for which this layer will provide tiles.
    * @param min {number} - The new minimum zoom level of this layer
    * @returns {H.map.layer.Layer} - Returns this instance of the layer
    */
  def setMin(min: scala.Double): Layer = js.native
}

