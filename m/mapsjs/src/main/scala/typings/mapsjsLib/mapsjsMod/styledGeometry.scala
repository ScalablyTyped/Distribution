package typings
package mapsjsLib.mapsjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapsjs", "styledGeometry")
@js.native
class styledGeometry protected () extends js.Object {
  def this(geom: geometry) = this()
  def this(geom: geometry, gStyle: geometryStyle) = this()
  /**
  	 * Renders this geometry as an SVG path. Note: We attach original
  	 * geometry bounds to svg doc as an expando.
  	 * @param {string} key Identifer to keep track of the SVG DOM element.
  	 * @param {number} mupp Map units per pixel with which to create the SVG element.
  	 * @returns {HTMLElement} A new SVG document root.
  	 */
  def createSvgPathElement(key: java.lang.String, mapUnitsPerPix: scala.Double): stdLib.HTMLElement = js.native
  /**
  	 * Gets optional animation function called when SVG node is created.
  	 * @returns {function} Function with the signature animation(pathElement, loopback).
  	 */
  def getAnimation(): js.Function2[
    /* pathElement */ stdLib.HTMLElement, 
    /* loopback */ js.Function0[scala.Unit], 
    scala.Unit
  ] = js.native
  /**
  	 * Gets the dash array as a string.
  	 * @returns {string} Dash array as astring.
  	 */
  def getDashArray(): java.lang.String = js.native
  /**
  	 * Gets fill color as a CSS style string.
  	 * @returns {string} Fill color as a CSS style string.
  	 */
  def getFillColor(): java.lang.String = js.native
  /**
  	 * Gets fill opacity in decimal format.
  	 * @returns {number} Fill opacity.
  	 */
  def getFillOpacity(): scala.Double = js.native
  /**
  	 * Gets the styledGeometry's underlying geometry object.
  	 * @returns {geometry} The underlying geometry.
  	 */
  def getGeometry(): geometry = js.native
  /**
    * Gets the styledGeometry's underlying geometryStyle object.
    * @returns {geometryStyle} The underlying geometry style.
    */
  def getGeometryStyle(): geometryStyle = js.native
  /**
  	 * Gets path outline color as a CSS style string.
  	 * @returns {string} Outline color as a CSS style string.
  	 */
  def getOutlineColor(): java.lang.String = js.native
  /**
  	 * Gets path outline opacity in decimal format.
  	 * @returns {number} Outline opacity.
  	 */
  def getOutlineOpacity(): scala.Double = js.native
  /**
  	 * Gets path outline thickness in pixels.
  	 * @returns {number} Thickness in pixels.
  	 */
  def getOutlineThicknessPix(): scala.Double = js.native
  /** 
  	 * Renders this to a canvas context.
  	 * @param {CanvasRenderingContext2D} ctx Canvas context to which to render.
  	 */
  def renderPathToCanvasContext(ctx: stdLib.CanvasRenderingContext2D): scala.Unit = js.native
  /**
  	 * You can use the loopback parameter on complete to call itself and 
  	 * create repeating animation.
  	 * @param {function} Function with the signature animation(pathElement, loopback).
  	 */
  def setAnimation(
    action: js.Function2[
      /* pathElement */ stdLib.HTMLElement, 
      /* loopback */ js.Function0[scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
  	 * Sets dash array string from a CSS style string. Defaults to solid
  	 * stroke if no dash array string is provided.
  	 * @param {string} [da] Dash array as a CSS style string.
  	 */
  def setDashArray(da: java.lang.String): scala.Unit = js.native
  /**
  	 * Sets fill color as a CSS style string.
  	 * @param {string} c Fill color as a CSS style string.
  	 */
  def setFillColor(c: java.lang.String): scala.Unit = js.native
  /**
  	 * Sets fill opacity to a decimal between 0 and 1.
  	 * @param {number} o Fill opacity.
  	 */
  def setFillOpacity(o: scala.Double): scala.Unit = js.native
  /**
    * Set this styledGeometry's geometry.
    * @param {geometry} g A new Geometry.
    */
  def setGeometry(g: geometry): scala.Unit = js.native
  /**
  	 * Set this styledGeometry's geometryStyle.
  	 * @param {geometryStyle} gs A new styledGeometry.
  	 */
  def setGeometryStyle(gs: geometryStyle): scala.Unit = js.native
  /**
  	 * Gets path outline opacity in decimal format.
  	 * @param {number} Outline opacity.
  	 */
  def setOutlineColor(c: java.lang.String): scala.Unit = js.native
  /**
  	 * Set path outline opacity to a decimal between 0 and 1.
  	 * @param {number} o Outline opacity.
  	 */
  def setOutlineOpacity(o: scala.Double): scala.Unit = js.native
  /**
  	 * Sets path outline thickness in pixels.
  	 * @param {number} t Thickness in pixels.
  	 */
  def setOutlineThicknessPix(t: scala.Double): scala.Unit = js.native
}

