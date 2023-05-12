package typings.luminoAlgorithm

import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTakeMod {
  
  @JSImport("@lumino/algorithm/types/take", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def take[T](`object`: js.Iterable[T], count: Double): IterableIterator[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("take")(`object`.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[T]]
}
