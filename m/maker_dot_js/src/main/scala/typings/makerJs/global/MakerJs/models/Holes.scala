package typings.makerJs.global.MakerJs.models

import typings.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MakerJs.models.Holes")
@js.native
class Holes protected ()
  extends typings.makerJs.MakerJs.models.Holes {
  /**
    * Create an array of circles of the same radius from an array of center points.
    *
    * Example:
    * ```
    * //Create some holes from an array of points
    * var makerjs = require('makerjs');
    * var model = new makerjs.models.Holes(10, [[0, 0],[50, 0],[25, 40]]);
    * var svg = makerjs.exporter.toSVG(model);
    * document.write(svg);
    * ```
    *
    * @param holeRadius Hole radius.
    * @param points Array of points for origin of each hole.
    * @param ids Optional array of corresponding path ids for the holes.
    */
  def this(holeRadius: Double, points: js.Array[IPoint]) = this()
  def this(holeRadius: Double, points: js.Array[IPoint], ids: js.Array[String]) = this()
}
