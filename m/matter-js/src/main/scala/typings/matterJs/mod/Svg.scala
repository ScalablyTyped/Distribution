package typings.matterJs.mod

import typings.std.SVGPathElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter-js", "Svg")
@js.native
open class Svg () extends StObject
/* static members */
object Svg {
  
  @JSImport("matter-js", "Svg")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts an SVG path into an array of vector points.
    * If the input path forms a concave shape, you must decompose the result into convex parts before use.
    * See `Bodies.fromVertices` which provides support for this.
    * Note that this function is not guaranteed to support complex paths (such as those with holes).
    * @method pathToVertices
    * @param {SVGPathElement} path
    * @param {Number} [sampleLength=15]
    * @returns {Vector[]} points
    */
  inline def pathToVertices(path: SVGPathElement, sampleLength: Double): js.Array[Vector] = (^.asInstanceOf[js.Dynamic].applyDynamic("pathToVertices")(path.asInstanceOf[js.Any], sampleLength.asInstanceOf[js.Any])).asInstanceOf[js.Array[Vector]]
}
