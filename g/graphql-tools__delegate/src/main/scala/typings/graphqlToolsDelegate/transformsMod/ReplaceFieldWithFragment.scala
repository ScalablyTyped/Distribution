package typings.graphqlToolsDelegate.transformsMod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsDelegate.anon.Field
import typings.graphqlToolsDelegate.replaceFieldWithFragmentMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/delegate/transforms", "ReplaceFieldWithFragment")
@js.native
class ReplaceFieldWithFragment protected () extends default {
  def this(targetSchema: GraphQLSchema, fragments: js.Array[Field]) = this()
}

