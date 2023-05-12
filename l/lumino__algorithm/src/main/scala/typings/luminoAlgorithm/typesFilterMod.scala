package typings.luminoAlgorithm

import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFilterMod {
  
  @JSImport("@lumino/algorithm/types/filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def filter[T](`object`: js.Iterable[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): IterableIterator[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[T]]
}
