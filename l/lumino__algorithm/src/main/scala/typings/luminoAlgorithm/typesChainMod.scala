package typings.luminoAlgorithm

import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesChainMod {
  
  @JSImport("@lumino/algorithm/types/chain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def chain[T](objects: js.Iterable[T]*): IterableIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(objects.asInstanceOf[Seq[js.Any]]*).asInstanceOf[IterableIterator[T]]
}
