package typings.makerJs.global.MakerJs

import typings.makerJs.MakerJs.IModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object importer {
  
  @JSGlobal("MakerJs.importer")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromSVGPathData(pathData: String): IModel = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSVGPathData")(pathData.asInstanceOf[js.Any]).asInstanceOf[IModel]
  
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
  inline def parseNumericList(s: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseNumericList")(s.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
}
