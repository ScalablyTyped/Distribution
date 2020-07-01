package typings.graphqlToolsUtils.observableToAsyncIterableMod

import typings.std.AsyncIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/observableToAsyncIterable", "observableToAsyncIterable")
@js.native
object observableToAsyncIterable extends js.Object {
  def apply[T](observable: Observable[T]): (AsyncIterator[T, _, js.UndefOr[scala.Nothing]]) with typings.graphqlToolsUtils.anon.AsyncIterator[T] = js.native
}

