package typings.luminoAlgorithm

import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesStrideMod {
  
  @JSImport("@lumino/algorithm/types/stride", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stride[T](`object`: js.Iterable[T], step: Double): IterableIterator[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("stride")(`object`.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[T]]
}
