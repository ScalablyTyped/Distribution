package typings.luminoAlgorithm

import typings.luminoAlgorithm.iterMod.IterableOrArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reduceMod {
  
  @JSImport("@lumino/algorithm/types/reduce", "reduce")
  @js.native
  def reduce[T](
    `object`: IterableOrArrayLike[T],
    fn: js.Function3[/* accumulator */ T, /* value */ T, /* index */ Double, T]
  ): T = js.native
  @JSImport("@lumino/algorithm/types/reduce", "reduce")
  @js.native
  def reduce[T, U](
    `object`: IterableOrArrayLike[T],
    fn: js.Function3[/* accumulator */ U, /* value */ T, /* index */ Double, U],
    initial: U
  ): U = js.native
}
