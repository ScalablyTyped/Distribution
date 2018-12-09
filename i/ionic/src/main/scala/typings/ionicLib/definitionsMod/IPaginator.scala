package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IPaginator[T /* <: Response[js.Array[js.Object]] */, S]
  extends nodeLib.IterableIterator[js.Promise[T]] {
  val state: S
}

