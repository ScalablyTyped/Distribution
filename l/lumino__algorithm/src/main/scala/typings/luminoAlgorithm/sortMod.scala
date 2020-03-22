package typings.luminoAlgorithm

import typings.luminoAlgorithm.iterMod.IterableOrArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/algorithm/lib/sort", JSImport.Namespace)
@js.native
object sortMod extends js.Object {
  def topologicSort[T](edges: IterableOrArrayLike[js.Tuple2[T, T]]): js.Array[T] = js.native
}

