package typings.luminoAlgorithm

import typings.luminoAlgorithm.iterMod.IterableOrArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortMod {
  
  @JSImport("@lumino/algorithm/types/sort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def topologicSort[T](edges: IterableOrArrayLike[js.Tuple2[T, T]]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("topologicSort")(edges.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
