package typings
package graphqlDashToolsLib.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeTypeCandidate extends js.Object {
  var schema: js.UndefOr[graphqlLib.graphqlMod.GraphQLSchema] = js.undefined
  var `type`: graphqlLib.typeDefinitionMod.GraphQLNamedType
}

object MergeTypeCandidate {
  @scala.inline
  def apply(
    `type`: graphqlLib.typeDefinitionMod.GraphQLNamedType,
    schema: graphqlLib.graphqlMod.GraphQLSchema = null
  ): MergeTypeCandidate = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema)
    __obj.asInstanceOf[MergeTypeCandidate]
  }
}

