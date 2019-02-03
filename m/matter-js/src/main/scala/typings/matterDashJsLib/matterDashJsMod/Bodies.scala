package typings
package matterDashJsLib.matterDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matter-js", "Bodies")
@js.native
class Bodies ()
  extends matterDashJsLib.matterDashJsMod.MatterNs.Bodies

/* static members */
@JSImport("matter-js", "Bodies")
@js.native
object Bodies extends js.Object {
  /**
    * Creates a new rigid body model with a circle hull.
    * The options parameter is an object that specifies any properties you wish to override the defaults.
    * See the properties section of the `Matter.Body` module for detailed information on what you can pass via the `options` object.
    * @method circle
    * @param {number} x
    * @param {number} y
    * @param {number} radius
    * @param {object} [options]
    * @param {number} [maxSides]
    * @return {body} A new circle body
    */
  def circle(x: scala.Double, y: scala.Double, radius: scala.Double): matterDashJsLib.matterDashJsMod.MatterNs.Body = js.native
  def circle(
    x: scala.Double,
    y: scala.Double,
    radius: scala.Double,
    options: matterDashJsLib.matterDashJsMod.MatterNs.IBodyDefinition
  ): matterDashJsLib.matterDashJsMod.MatterNs.Body = js.native
  def circle(
    x: scala.Double,
    y: scala.Double,
    radius: scala.Double,
    options: matterDashJsLib.matterDashJsMod.MatterNs.IBodyDefinition,
    maxSides: scala.Double
  ): matterDashJsLib.matterDashJsMod.MatterNs.Body = js.native
  /**
    * Creates a body using the supplied vertices (or an array containing multiple sets of vertices).
    * If the vertices are convex, they will pass through as supplied.
    * Otherwise if the vertices are concave, they will be decomposed if [poly-decomp.js](https://github.com/schteppe/poly-decomp.js) is available.
    * Note that this process is not guaranteed to support complex sets of vertices (e.g. those with holes may fail).
    * By default the decomposition will discard collinear edges (to improve performance).
    * It can also optionally discard any parts that have an area less than `minimumArea`.
    * If the vertices can not be decomposed, the result will fall back to using the convex hull.
    * The options parameter is an object that specifies any `Matter.Body` properties you wish to override the defaults.
    * See the properties section of the `Matter.Body` module for detailed information on what you can pass via the `options` object.
    * @method fromVertices
    * @param {number} x
    * @param {number} y
    * @param [[vector]] vertexSets
    * @param {object} [options]
    * @param {bool} [flagInternal=false]
    * @param {number} [removeCollinear=0.01]
    * @param {number} [minimumArea=10]
    * @return {body}
    */
  def fromVertices(
    x: scala.Double,
    y: scala.Double,
    vertexSets: js.Array[js.Array[matterDashJsLib.matterDashJsMod.MatterNs.Vector]]
  ): matterDashJsLib.matterDashJsMod.MatterNs.Body = js.native
  def fromVertices(
    x: scala.Double,
    y: scala.Double,
    vertexSets: js.Array[js.Array[matterDashJsLib.matterDashJsMod.MatterNs.Vector]],
    options: matterDashJsLib.matterDashJsMod.MatterNs.IBodyDefinition
  ): matterDashJsLib.matterDashJsMod.MatterNs.Body = js.native
  def fromVertices(
    x: scala.Double,
    y: scala.Double,
    vertexSets: js.Array[js.Array[matterDashJsLib.matterDashJsMod.MatterNs.Vector]],
    options: matterDashJsLib.matterDashJsMod.MatterNs.IBodyDefinition,
    flagInternal: scala.Boolean
  ): matterDashJsLib.matterDashJsMod.MatterNs.Body = js.native
  def fromVertices(
    x: scala.Double,
    y: scala.Double,
    vertexSets: js.Array[js.Array[matterDashJsLib.matterDashJsMod.MatterNs.Vector]],
    options: matterDashJsLib.matterDashJsMod.MatterNs.IBodyDefinition,
    flagInternal: scala.Boolean,
    removeCollinear: scala.Double
  ): matterDashJsLib.matterDashJsMod.MatterNs.Body = js.native
  def fromVertices(
    x: scala.Double,
    y: scala.Double,
    vertexSets: js.Array[js.Array[matterDashJsLib.matterDashJsMod.MatterNs.Vector]],
    options: matterDashJsLib.matterDashJsMod.MatterNs.IBodyDefinition,
    flagInternal: scala.Boolean,
    removeCollinear: scala.Double,
    minimumArea: scala.Double
  ): matterDashJsLib.matterDashJsMod.MatterNs.Body = js.native
  /**
    * Creates a new rigid body model with a regular polygon hull with the given number of sides.
    * The options parameter is an object that specifies any properties you wish to override the defaults.
    * See the properties section of the `Matter.Body` module for detailed information on what you can pass via the `options` object.
    * @method polygon
    * @param {number} x
    * @param {number} y
    * @param {number} sides
    * @param {number} radius
    * @param {object} [options]
    * @return {body} A new regular polygon body
    */
  def polygon(x: scala.Double, y: scala.Double, sides: scala.Double, radius: scala.Double): matterDashJsLib.matterDashJsMod.MatterNs.Body = js.native
  def polygon(
    x: scala.Double,
    y: scala.Double,
    sides: scala.Double,
    radius: scala.Double,
    options: matterDashJsLib.matterDashJsMod.MatterNs.IChamferableBodyDefinition
  ): matterDashJsLib.matterDashJsMod.MatterNs.Body = js.native
  /**
    * Creates a new rigid body model with a rectangle hull.
    * The options parameter is an object that specifies any properties you wish to override the defaults.
    * See the properties section of the `Matter.Body` module for detailed information on what you can pass via the `options` object.
    * @method rectangle
    * @param {number} x
    * @param {number} y
    * @param {number} width
    * @param {number} height
    * @param {object} [options]
    * @return {body} A new rectangle body
    */
  def rectangle(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): matterDashJsLib.matterDashJsMod.MatterNs.Body = js.native
  def rectangle(
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    options: matterDashJsLib.matterDashJsMod.MatterNs.IChamferableBodyDefinition
  ): matterDashJsLib.matterDashJsMod.MatterNs.Body = js.native
  /**
    * Creates a new rigid body model with a trapezoid hull.
    * The options parameter is an object that specifies any properties you wish to override the defaults.
    * See the properties section of the `Matter.Body` module for detailed information on what you can pass via the `options` object.
    * @method trapezoid
    * @param {number} x
    * @param {number} y
    * @param {number} width
    * @param {number} height
    * @param {number} slope
    * @param {object} [options]
    * @return {body} A new trapezoid body
    */
  def trapezoid(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double, slope: scala.Double): matterDashJsLib.matterDashJsMod.MatterNs.Body = js.native
  def trapezoid(
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    slope: scala.Double,
    options: matterDashJsLib.matterDashJsMod.MatterNs.IChamferableBodyDefinition
  ): matterDashJsLib.matterDashJsMod.MatterNs.Body = js.native
}

