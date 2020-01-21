package typings.graphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/jsutils/PromiseOrValue", JSImport.Namespace)
@js.native
object promiseOrValueMod extends js.Object {
  type PromiseOrValue[T] = js.Promise[T] | T
}

