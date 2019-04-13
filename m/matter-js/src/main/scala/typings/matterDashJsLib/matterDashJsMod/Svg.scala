package typings
package matterDashJsLib.matterDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matter-js", "Svg")
@js.native
class Svg () extends js.Object

/* static members */
@JSImport("matter-js", "Svg")
@js.native
object Svg extends js.Object {
  /**
    * Converts an SVG path into an array of vector points.
    * If the input path forms a concave shape, you must decompose the result into convex parts before use.
    * See `Bodies.fromVertices` which provides support for this.
    * Note that this function is not guaranteed to support complex paths (such as those with holes).
    * @method pathToVertices
    * @param {SVGPathElement} path
    * @param {Number} [sampleLength=15]
    * @return {Vector[]} points
    */
  def pathToVertices(path: stdLib.SVGPathElement, sampleLength: scala.Double): js.Array[matterDashJsLib.matterDashJsMod.Vector] = js.native
}

