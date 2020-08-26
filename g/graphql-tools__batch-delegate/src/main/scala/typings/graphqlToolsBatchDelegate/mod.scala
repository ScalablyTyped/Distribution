package typings.graphqlToolsBatchDelegate

import typings.dataloader.mod.Options
import typings.graphqlToolsBatchDelegate.typesMod.BatchDelegateFn
import typings.graphqlToolsBatchDelegate.typesMod.BatchDelegateOptionsFn
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/batch-delegate", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def createBatchDelegateFn[K, V, C](
    argFn: js.Function1[/* args */ js.Array[K], Record[String, _]],
    batchDelegateOptionsFn: BatchDelegateOptionsFn[Record[String, _], _]
  ): BatchDelegateFn[K, _] = js.native
  def createBatchDelegateFn[K, V, C](
    argFn: js.Function1[/* args */ js.Array[K], Record[String, _]],
    batchDelegateOptionsFn: BatchDelegateOptionsFn[Record[String, _], _],
    dataLoaderOptions: Options[K, V, C]
  ): BatchDelegateFn[K, _] = js.native
}

