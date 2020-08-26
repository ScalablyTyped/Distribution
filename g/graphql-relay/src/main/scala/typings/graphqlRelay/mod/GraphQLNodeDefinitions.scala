package typings.graphqlRelay.mod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLFieldConfig
import typings.graphql.mod.GraphQLInterfaceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLNodeDefinitions extends js.Object {
  var nodeField: GraphQLFieldConfig[_, _, StringDictionary[_]] = js.native
  var nodeInterface: GraphQLInterfaceType = js.native
  var nodesField: GraphQLFieldConfig[_, _, StringDictionary[_]] = js.native
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
  @scala.inline
  implicit class GraphQLNodeDefinitionsOps[Self <: GraphQLNodeDefinitions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNodeField(value: GraphQLFieldConfig[_, _, StringDictionary[_]]): Self = this.set("nodeField", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeInterface(value: GraphQLInterfaceType): Self = this.set("nodeInterface", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodesField(value: GraphQLFieldConfig[_, _, StringDictionary[_]]): Self = this.set("nodesField", value.asInstanceOf[js.Any])
  }
  
}

