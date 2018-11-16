package typings
package makerDotJsLib.MakerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.importer")
@js.native
object importerNs extends js.Object {
  def fromSVGPathData(pathData: java.lang.String): makerDotJsLib.MakerJsNs.IModel = js.native
  /**
       * Create a numeric array from a string of numbers. The numbers may be delimited by anything non-numeric.
       *
       * Example:
       * ```
       * var n = makerjs.importer.parseNumericList('5, 10, 15.20 25-30-35 4e1 .5');
       * ```
       *
       * @param s The string of numbers.
       * @returns Array of numbers.
       */
  def parseNumericList(s: java.lang.String): js.Array[scala.Double] = js.native
}

