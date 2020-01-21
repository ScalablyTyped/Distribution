package typings.graphql

import typings.graphql.promiseOrValueMod.PromiseOrValue
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/subscription/mapAsyncIterator", JSImport.Namespace)
@js.native
object mapAsyncIteratorMod extends js.Object {
  def default[T, U](iterable: AsyncIterable[T], callback: js.Function1[/* arg */ T, PromiseOrValue[U]]): js.Any = js.native
  def default[T, U](
    iterable: AsyncIterable[T],
    callback: js.Function1[/* arg */ T, PromiseOrValue[U]],
    rejectCallback: js.Function1[/* arg */ js.Any, PromiseOrValue[U]]
  ): js.Any = js.native
}

