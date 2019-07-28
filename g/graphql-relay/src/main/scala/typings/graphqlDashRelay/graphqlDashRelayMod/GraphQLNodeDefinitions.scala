package typings.graphqlDashRelay.graphqlDashRelayMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphqlMod.GraphQLInterfaceType
import typings.graphql.typeDefinitionMod.GraphQLFieldConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLNodeDefinitions extends js.Object {
  var nodeField: GraphQLFieldConfig[_, _, StringDictionary[_]]
  var nodeInterface: GraphQLInterfaceType
  var nodesField: GraphQLFieldConfig[_, _, StringDictionary[_]]
}

object GraphQLNodeDefinitions {
  @scala.inline
  def apply(
    nodeField: GraphQLFieldConfig[_, _, StringDictionary[_]],
    nodeInterface: GraphQLInterfaceType,
    nodesField: GraphQLFieldConfig[_, _, StringDictionary[_]]
  ): GraphQLNodeDefinitions = {
    val __obj = js.Dynamic.literal(nodeField = nodeField, nodeInterface = nodeInterface, nodesField = nodesField)
  
    __obj.asInstanceOf[GraphQLNodeDefinitions]
  }
}

