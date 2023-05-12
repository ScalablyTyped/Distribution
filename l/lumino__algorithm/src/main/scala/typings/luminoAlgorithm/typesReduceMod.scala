package typings.luminoAlgorithm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReduceMod {
  
  @JSImport("@lumino/algorithm/types/reduce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reduce[T](
    `object`: js.Iterable[T],
    fn: js.Function3[/* accumulator */ T, /* value */ T, /* index */ Double, T]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def reduce[T, U](
    `object`: js.Iterable[T],
    fn: js.Function3[/* accumulator */ U, /* value */ T, /* index */ Double, U],
    initial: U
  ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], initial.asInstanceOf[js.Any])).asInstanceOf[U]
}
