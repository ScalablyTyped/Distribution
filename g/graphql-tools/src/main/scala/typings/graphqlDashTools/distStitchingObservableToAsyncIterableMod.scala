package typings.graphqlDashTools

import typings.std.AsyncIterator
import typings.zenDashObservableDashTs.libZenObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/stitching/observableToAsyncIterable", JSImport.Namespace)
@js.native
object distStitchingObservableToAsyncIterableMod extends js.Object {
  def observableToAsyncIterable[T](observable: Observable[T]): AsyncIterator[T, _, js.UndefOr[scala.Nothing]] = js.native
}

