package typings
package graphqlDashRelayLib.graphqlDashRelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLNodeDefinitions extends js.Object {
  var nodeField: graphqlLib.typeDefinitionMod.GraphQLFieldConfig[_, _, org.scalablytyped.runtime.StringDictionary[_]]
  var nodeInterface: graphqlLib.graphqlMod.GraphQLInterfaceType
  var nodesField: graphqlLib.typeDefinitionMod.GraphQLFieldConfig[_, _, org.scalablytyped.runtime.StringDictionary[_]]
}

object GraphQLNodeDefinitions {
  @scala.inline
  def apply(
    nodeField: graphqlLib.typeDefinitionMod.GraphQLFieldConfig[_, _, org.scalablytyped.runtime.StringDictionary[_]],
    nodeInterface: graphqlLib.graphqlMod.GraphQLInterfaceType,
    nodesField: graphqlLib.typeDefinitionMod.GraphQLFieldConfig[_, _, org.scalablytyped.runtime.StringDictionary[_]]
  ): GraphQLNodeDefinitions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("nodeField")(nodeField)
    __obj.updateDynamic("nodeInterface")(nodeInterface)
    __obj.updateDynamic("nodesField")(nodesField)
    __obj.asInstanceOf[GraphQLNodeDefinitions]
  }
}

