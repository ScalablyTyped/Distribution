package typings
package makerDotJsLib.MakerJsNs.modelsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.models.ConnectTheDots")
@js.native
class ConnectTheDots protected ()
  extends makerDotJsLib.MakerJsNs.IModel {
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
  def this(coords: js.Array[scala.Double]) = this()
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
  def this(numericList: java.lang.String) = this()
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
  def this(isClosed: scala.Boolean, coords: js.Array[scala.Double | makerDotJsLib.MakerJsNs.IPoint]) = this()
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
  def this(isClosed: scala.Boolean, numericList: java.lang.String) = this()
  @JSName("paths")
  var paths_ConnectTheDots: makerDotJsLib.MakerJsNs.IPathMap = js.native
}

