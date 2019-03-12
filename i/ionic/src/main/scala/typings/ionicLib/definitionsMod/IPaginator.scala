package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPaginator[T /* <: Response[js.Array[js.Object]] */, S]
  extends stdLib.IterableIterator[js.Promise[T]] {
  val state: S = js.native
}

