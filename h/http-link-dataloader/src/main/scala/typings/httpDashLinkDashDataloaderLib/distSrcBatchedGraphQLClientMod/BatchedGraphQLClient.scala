package typings
package httpDashLinkDashDataloaderLib.distSrcBatchedGraphQLClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http-link-dataloader/dist/src/BatchedGraphQLClient", "BatchedGraphQLClient")
@js.native
class BatchedGraphQLClient protected () extends js.Object {
  def this(uri: java.lang.String) = this()
  def this(uri: java.lang.String, options: httpDashLinkDashDataloaderLib.distSrcTypesMod.Options with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ClientOptions */ js.Any)) = this()
  var dataloader: js.Any = js.native
  var options: httpDashLinkDashDataloaderLib.distSrcTypesMod.Options = js.native
  var uri: java.lang.String = js.native
  def load(keys: js.Array[java.lang.String]): js.Promise[_] = js.native
  def request[T /* <: js.Any */](query: java.lang.String): js.Promise[T] = js.native
  def request[T /* <: js.Any */](query: java.lang.String, variables: httpDashLinkDashDataloaderLib.distSrcTypesMod.Variables): js.Promise[T] = js.native
  def request[T /* <: js.Any */](
    query: java.lang.String,
    variables: httpDashLinkDashDataloaderLib.distSrcTypesMod.Variables,
    operationName: java.lang.String
  ): js.Promise[T] = js.native
}

