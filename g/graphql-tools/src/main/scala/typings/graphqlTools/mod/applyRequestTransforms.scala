package typings.graphqlTools.mod

import typings.graphqlToolsUtils.interfacesMod.Request
import typings.graphqlToolsUtils.interfacesMod.Transform
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "applyRequestTransforms")
@js.native
object applyRequestTransforms extends js.Object {
  def apply(originalRequest: Request, transforms: js.Array[Transform[Record[String, _]]]): Request = js.native
}

