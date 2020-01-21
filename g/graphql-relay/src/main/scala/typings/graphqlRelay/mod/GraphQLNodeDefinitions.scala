package typings.graphqlRelay.mod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLFieldConfig
import typings.graphql.mod.GraphQLInterfaceType
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
    val __obj = js.Dynamic.literal(nodeField = nodeField.asInstanceOf[js.Any], nodeInterface = nodeInterface.asInstanceOf[js.Any], nodesField = nodesField.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GraphQLNodeDefinitions]
  }
}

