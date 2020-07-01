package typings.graphqlToolsUtils

import typings.std.AsyncIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/mapAsyncIterator", JSImport.Namespace)
@js.native
object mapAsyncIteratorMod extends js.Object {
  def mapAsyncIterator[T, U](
    iterator: AsyncIterator[T, _, js.UndefOr[scala.Nothing]],
    callback: js.Function1[/* value */ T, js.Promise[U] | U]
  ): AsyncIterator[U, _, js.UndefOr[scala.Nothing]] = js.native
  def mapAsyncIterator[T, U](
    iterator: AsyncIterator[T, _, js.UndefOr[scala.Nothing]],
    callback: js.Function1[/* value */ T, js.Promise[U] | U],
    rejectCallback: js.Any
  ): AsyncIterator[U, _, js.UndefOr[scala.Nothing]] = js.native
}

