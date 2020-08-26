package typings.graphqlRelay.mod

import typings.graphql.mod.GraphQLObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLConnectionDefinitions extends js.Object {
  var connectionType: GraphQLObjectType[_, _] = js.native
  var edgeType: GraphQLObjectType[_, _] = js.native
}

object GraphQLConnectionDefinitions {
  @scala.inline
  def apply(connectionType: GraphQLObjectType[_, _], edgeType: GraphQLObjectType[_, _]): GraphQLConnectionDefinitions = {
    val __obj = js.Dynamic.literal(connectionType = connectionType.asInstanceOf[js.Any], edgeType = edgeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLConnectionDefinitions]
  }
  @scala.inline
  implicit class GraphQLConnectionDefinitionsOps[Self <: GraphQLConnectionDefinitions] (val x: Self) extends AnyVal {
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
    def setConnectionType(value: GraphQLObjectType[_, _]): Self = this.set("connectionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setEdgeType(value: GraphQLObjectType[_, _]): Self = this.set("edgeType", value.asInstanceOf[js.Any])
  }
  
}

