package typings.graphqlDashTools

import typings.std.AsyncIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/stitching/mapAsyncIterator", JSImport.Namespace)
@js.native
object distStitchingMapAsyncIteratorMod extends js.Object {
  def default[T, U](
    iterator: AsyncIterator[T, _, js.UndefOr[scala.Nothing]],
    callback: js.Function1[/* value */ T, js.Promise[U] | U]
  ): AsyncIterator[U, _, js.UndefOr[scala.Nothing]] = js.native
  def default[T, U](
    iterator: AsyncIterator[T, _, js.UndefOr[scala.Nothing]],
    callback: js.Function1[/* value */ T, js.Promise[U] | U],
    rejectCallback: js.Any
  ): AsyncIterator[U, _, js.UndefOr[scala.Nothing]] = js.native
}

