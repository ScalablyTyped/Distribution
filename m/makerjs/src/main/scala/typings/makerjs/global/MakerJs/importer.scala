package typings.makerjs.global.MakerJs

import typings.makerjs.MakerJs.IModel
import typings.makerjs.MakerJs.importer.ISVGImportOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object importer {
  
  @JSGlobal("MakerJs.importer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a model from SVG path data.
    *
    * @param pathData SVG path data.
    * @param options ISVGImportOptions object.
    * @param options.bezierAccuracy Optional accuracy of Bezier curves.
    * @returns An IModel object.
    */
  inline def fromSVGPathData(pathData: String): IModel = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSVGPathData")(pathData.asInstanceOf[js.Any]).asInstanceOf[IModel]
  inline def fromSVGPathData(pathData: String, options: ISVGImportOptions): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSVGPathData")(pathData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
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
