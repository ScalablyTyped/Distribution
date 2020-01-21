package typings.graphqlCompose.mod

import typings.graphqlCompose.definitionsMod.Thunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "resolveMaybeThunk")
@js.native
object resolveMaybeThunk extends js.Object {
  def apply[T](thingOrThunk: Thunk[T]): T = js.native
}

