package typings.luminoAlgorithm

import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEnumerateMod {
  
  @JSImport("@lumino/algorithm/types/enumerate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enumerate[T](`object`: js.Iterable[T]): IterableIterator[js.Tuple2[Double, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerate")(`object`.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[js.Tuple2[Double, T]]]
  inline def enumerate[T](`object`: js.Iterable[T], start: Double): IterableIterator[js.Tuple2[Double, T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumerate")(`object`.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[js.Tuple2[Double, T]]]
}
