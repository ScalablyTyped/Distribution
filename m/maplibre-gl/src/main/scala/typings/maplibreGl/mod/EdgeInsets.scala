package typings.maplibreGl.mod

import typings.mapboxPointGeometry.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "EdgeInsets")
@js.native
open class EdgeInsets () extends StObject {
  def this(top: Double) = this()
  def this(top: Double, bottom: Double) = this()
  def this(top: scala.Unit, bottom: Double) = this()
  def this(top: Double, bottom: Double, left: Double) = this()
  def this(top: Double, bottom: scala.Unit, left: Double) = this()
  def this(top: scala.Unit, bottom: Double, left: Double) = this()
  def this(top: scala.Unit, bottom: scala.Unit, left: Double) = this()
  def this(top: Double, bottom: Double, left: Double, right: Double) = this()
  def this(top: Double, bottom: Double, left: scala.Unit, right: Double) = this()
  def this(top: Double, bottom: scala.Unit, left: Double, right: Double) = this()
  def this(top: Double, bottom: scala.Unit, left: scala.Unit, right: Double) = this()
  def this(top: scala.Unit, bottom: Double, left: Double, right: Double) = this()
  def this(top: scala.Unit, bottom: Double, left: scala.Unit, right: Double) = this()
  def this(top: scala.Unit, bottom: scala.Unit, left: Double, right: Double) = this()
  def this(top: scala.Unit, bottom: scala.Unit, left: scala.Unit, right: Double) = this()
  
  var bottom: Double = js.native
  
  def equals(other: PaddingOptions): Boolean = js.native
  
  /**
  	 * Utility method that computes the new apprent center or vanishing point after applying insets.
  	 * This is in pixels and with the top left being (0.0) and +y being downwards.
  	 *
  	 * @param {number} width the width
  	 * @param {number} height the height
  	 * @returns {Point} the point
  	 * @memberof EdgeInsets
  	 */
  def getCenter(width: Double, height: Double): ^ = js.native
  
  def interpolate(start: EdgeInsets, target: PaddingOptions, t: Double): EdgeInsets = js.native
  /**
  	 * Interpolates the inset in-place.
  	 * This maintains the current inset value for any inset not present in `target`.
  	 * @param {PaddingOptions | EdgeInsets} start interpolation start
  	 * @param {PaddingOptions} target interpolation target
  	 * @param {number} t interpolation step/weight
  	 * @returns {EdgeInsets} the insets
  	 * @memberof EdgeInsets
  	 */
  def interpolate(start: PaddingOptions, target: PaddingOptions, t: Double): EdgeInsets = js.native
  
  var left: Double = js.native
  
  var right: Double = js.native
  
  /**
  	 * Returns the current state as json, useful when you want to have a
  	 * read-only representation of the inset.
  	 *
  	 * @returns {PaddingOptions} state as json
  	 * @memberof EdgeInsets
  	 */
  def toJSON(): PaddingOptions = js.native
  
  var top: Double = js.native
}
