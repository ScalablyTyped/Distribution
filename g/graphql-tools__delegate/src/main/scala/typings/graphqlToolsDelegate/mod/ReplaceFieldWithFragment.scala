package typings.graphqlToolsDelegate.mod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsDelegate.anon.Field
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/delegate", "ReplaceFieldWithFragment")
@js.native
class ReplaceFieldWithFragment protected ()
  extends typings.graphqlToolsDelegate.transformsMod.ReplaceFieldWithFragment {
  def this(targetSchema: GraphQLSchema, fragments: js.Array[Field]) = this()
}

