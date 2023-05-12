package typings.lib0

import typings.node.perfHooksMod.MarkOptions
import typings.node.perfHooksMod.MeasureOptions
import typings.node.perfHooksMod.PerformanceMark
import typings.node.perfHooksMod.PerformanceMeasure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object performanceDotnodeMod {
  
  @JSImport("lib0/performance.node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mark(): PerformanceMark = ^.asInstanceOf[js.Dynamic].applyDynamic("mark")().asInstanceOf[PerformanceMark]
  inline def mark(name: String): PerformanceMark = ^.asInstanceOf[js.Dynamic].applyDynamic("mark")(name.asInstanceOf[js.Any]).asInstanceOf[PerformanceMark]
  inline def mark(name: String, options: MarkOptions): PerformanceMark = (^.asInstanceOf[js.Dynamic].applyDynamic("mark")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PerformanceMark]
  inline def mark(name: Unit, options: MarkOptions): PerformanceMark = (^.asInstanceOf[js.Dynamic].applyDynamic("mark")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PerformanceMark]
  
  inline def measure(name: String): PerformanceMeasure = ^.asInstanceOf[js.Dynamic].applyDynamic("measure")(name.asInstanceOf[js.Any]).asInstanceOf[PerformanceMeasure]
  inline def measure(name: String, options: MeasureOptions): PerformanceMeasure = (^.asInstanceOf[js.Dynamic].applyDynamic("measure")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PerformanceMeasure]
  inline def measure(name: String, startMark: String): PerformanceMeasure = (^.asInstanceOf[js.Dynamic].applyDynamic("measure")(name.asInstanceOf[js.Any], startMark.asInstanceOf[js.Any])).asInstanceOf[PerformanceMeasure]
  inline def measure(name: String, startMark: String, endMark: String): PerformanceMeasure = (^.asInstanceOf[js.Dynamic].applyDynamic("measure")(name.asInstanceOf[js.Any], startMark.asInstanceOf[js.Any], endMark.asInstanceOf[js.Any])).asInstanceOf[PerformanceMeasure]
  inline def measure(name: String, startMark: Unit, endMark: String): PerformanceMeasure = (^.asInstanceOf[js.Dynamic].applyDynamic("measure")(name.asInstanceOf[js.Any], startMark.asInstanceOf[js.Any], endMark.asInstanceOf[js.Any])).asInstanceOf[PerformanceMeasure]
  
  @JSImport("lib0/performance.node", "now")
  @js.native
  val now: js.Function0[Double] = js.native
}
