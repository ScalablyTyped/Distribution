package typings.makerJs.global.MakerJs.models

import typings.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MakerJs.models.ConnectTheDots")
@js.native
class ConnectTheDots protected ()
  extends typings.makerJs.MakerJs.models.ConnectTheDots {
  /**
    * Create a model by connecting points designated in a numeric array. The model will be 'closed' - i.e. the last point will connect to the first point.
    *
    * Example:
    * ```
    * var c = new makerjs.models.ConnectTheDots([-10, 0, 10, 0, 0, 20]); // 3 coordinates to form a triangle
    * ```
    *
    * @param coords Array of coordinates.
    */
  def this(coords: js.Array[Double]) = this()
  /**
    * Create a model by connecting points designated in a string. The model will be 'closed' - i.e. the last point will connect to the first point.
    *
    * Example:
    * ```
    * var c = new makerjs.models.ConnectTheDots('-10 0 10 0 0 20'); // 3 coordinates to form a triangle
    * ```
    *
    * @param numericList String containing a list of numbers which can be delimited by spaces, commas, or anything non-numeric (Note: [exponential notation](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/toExponential) is allowed).
    */
  def this(numericList: String) = this()
  /**
    * Create a model by connecting points designated in a numeric array. The model will be 'closed' - i.e. the last point will connect to the first point.
    *
    * Example:
    * ```
    * var c = new makerjs.models.ConnectTheDots(false, [-10, 0, 10, 0, 0, 20]); // 3 coordinates to form a polyline
    * ```
    *
    * @param isClosed Flag to specify if last point should connect to the first point.
    * @param coords Array of coordinates.
    */
  /**
    * Create a model by connecting points designated in an array of points. The model may be closed, or left open.
    *
    * Example:
    * ```
    * var c = new makerjs.models.ConnectTheDots(false, [[-10, 0], [10, 0], [0, 20]]); // 3 coordinates left open
    * ```
    *
    * @param isClosed Flag to specify if last point should connect to the first point.
    * @param points Array of IPoints.
    */
  def this(isClosed: Boolean, coords: js.Array[Double | IPoint]) = this()
  /**
    * Create a model by connecting points designated in a string. The model will be 'closed' - i.e. the last point will connect to the first point.
    *
    * Example:
    * ```
    * var c = new makerjs.models.ConnectTheDots(false, '-10 0 10 0 0 20'); // 3 coordinates to form a polyline
    * ```
    *
    * @param isClosed Flag to specify if last point should connect to the first point.
    * @param numericList String containing a list of numbers which can be delimited by spaces, commas, or anything non-numeric (Note: [exponential notation](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/toExponential) is allowed).
    */
  def this(isClosed: Boolean, numericList: String) = this()
}
