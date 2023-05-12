package typings.luminoAlgorithm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSortMod {
  
  @JSImport("@lumino/algorithm/types/sort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def topologicSort[T](edges: js.Iterable[js.Tuple2[T, T]]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("topologicSort")(edges.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
