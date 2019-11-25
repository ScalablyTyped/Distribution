package typings.graphqlDashTools.distInterfacesMod

import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphql.typeDefinitionMod.GraphQLNamedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeTypeCandidate extends js.Object {
  var schema: js.UndefOr[GraphQLSchema] = js.undefined
  var `type`: GraphQLNamedType
}

object MergeTypeCandidate {
  @scala.inline
  def apply(`type`: GraphQLNamedType, schema: GraphQLSchema = null): MergeTypeCandidate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeTypeCandidate]
  }
}

