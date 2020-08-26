package typings.graphqlToolsDelegate

import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/delegate/defaultMergedResolver", JSImport.Namespace)
@js.native
object defaultMergedResolverMod extends js.Object {
  def defaultMergedResolver(
    parent: Record[String, _],
    args: Record[String, _],
    context: Record[String, _],
    info: GraphQLResolveInfo
  ): js.Any = js.native
}

