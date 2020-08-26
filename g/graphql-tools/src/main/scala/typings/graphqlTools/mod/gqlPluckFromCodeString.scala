package typings.graphqlTools.mod

import typings.graphqlToolsGraphqlTagPluck.mod.GraphQLTagPluckOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "gqlPluckFromCodeString")
@js.native
object gqlPluckFromCodeString extends js.Object {
  def apply(filePath: String, code: String): js.Promise[String] = js.native
  def apply(filePath: String, code: String, options: GraphQLTagPluckOptions): js.Promise[String] = js.native
}

