package typings.lib0

import typings.std.PerformanceMark
import typings.std.PerformanceMarkOptions
import typings.std.PerformanceMeasure
import typings.std.PerformanceMeasureOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPerformanceMod {
  
  @JSImport("lib0/dist/performance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mark(markName: String): PerformanceMark = ^.asInstanceOf[js.Dynamic].applyDynamic("mark")(markName.asInstanceOf[js.Any]).asInstanceOf[PerformanceMark]
  inline def mark(markName: String, markOptions: PerformanceMarkOptions): PerformanceMark = (^.asInstanceOf[js.Dynamic].applyDynamic("mark")(markName.asInstanceOf[js.Any], markOptions.asInstanceOf[js.Any])).asInstanceOf[PerformanceMark]
  
  inline def measure(measureName: String): PerformanceMeasure = ^.asInstanceOf[js.Dynamic].applyDynamic("measure")(measureName.asInstanceOf[js.Any]).asInstanceOf[PerformanceMeasure]
  inline def measure(measureName: String, startOrMeasureOptions: String): PerformanceMeasure = (^.asInstanceOf[js.Dynamic].applyDynamic("measure")(measureName.asInstanceOf[js.Any], startOrMeasureOptions.asInstanceOf[js.Any])).asInstanceOf[PerformanceMeasure]
  inline def measure(measureName: String, startOrMeasureOptions: String, endMark: String): PerformanceMeasure = (^.asInstanceOf[js.Dynamic].applyDynamic("measure")(measureName.asInstanceOf[js.Any], startOrMeasureOptions.asInstanceOf[js.Any], endMark.asInstanceOf[js.Any])).asInstanceOf[PerformanceMeasure]
  inline def measure(measureName: String, startOrMeasureOptions: Unit, endMark: String): PerformanceMeasure = (^.asInstanceOf[js.Dynamic].applyDynamic("measure")(measureName.asInstanceOf[js.Any], startOrMeasureOptions.asInstanceOf[js.Any], endMark.asInstanceOf[js.Any])).asInstanceOf[PerformanceMeasure]
  inline def measure(measureName: String, startOrMeasureOptions: PerformanceMeasureOptions): PerformanceMeasure = (^.asInstanceOf[js.Dynamic].applyDynamic("measure")(measureName.asInstanceOf[js.Any], startOrMeasureOptions.asInstanceOf[js.Any])).asInstanceOf[PerformanceMeasure]
  inline def measure(measureName: String, startOrMeasureOptions: PerformanceMeasureOptions, endMark: String): PerformanceMeasure = (^.asInstanceOf[js.Dynamic].applyDynamic("measure")(measureName.asInstanceOf[js.Any], startOrMeasureOptions.asInstanceOf[js.Any], endMark.asInstanceOf[js.Any])).asInstanceOf[PerformanceMeasure]
  
  inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
}
