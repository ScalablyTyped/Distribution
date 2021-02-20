package typings.makerJs.global.MakerJs

import typings.makerJs.MakerJs.IModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object importer {
  
  @JSGlobal("MakerJs.importer.fromSVGPathData")
  @js.native
  def fromSVGPathData(pathData: String): IModel = js.native
  
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
  @JSGlobal("MakerJs.importer.parseNumericList")
  @js.native
  def parseNumericList(s: String): js.Array[Double] = js.native
}
