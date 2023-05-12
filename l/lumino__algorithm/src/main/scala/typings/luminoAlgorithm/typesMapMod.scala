package typings.luminoAlgorithm

import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMapMod {
  
  @JSImport("@lumino/algorithm/types/map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def map[T, U](`object`: js.Iterable[T], fn: js.Function2[/* value */ T, /* index */ Double, U]): IterableIterator[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[U]]
}
