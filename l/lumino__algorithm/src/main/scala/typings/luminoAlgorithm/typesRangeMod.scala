package typings.luminoAlgorithm

import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRangeMod {
  
  @JSImport("@lumino/algorithm/types/range", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def range(start: Double): IterableIterator[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[Double]]
  inline def range(start: Double, stop: Double): IterableIterator[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Double]]
  inline def range(start: Double, stop: Double, step: Double): IterableIterator[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Double]]
  inline def range(start: Double, stop: Unit, step: Double): IterableIterator[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Double]]
}
