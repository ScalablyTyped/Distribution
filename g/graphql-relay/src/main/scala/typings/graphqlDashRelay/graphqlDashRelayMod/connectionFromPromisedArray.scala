package typings.graphqlDashRelay.graphqlDashRelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-relay", "connectionFromPromisedArray")
@js.native
object connectionFromPromisedArray extends js.Object {
  def apply[T](dataPromise: js.Promise[js.Array[T]], args: ConnectionArguments): js.Promise[Connection[T]] = js.native
}

