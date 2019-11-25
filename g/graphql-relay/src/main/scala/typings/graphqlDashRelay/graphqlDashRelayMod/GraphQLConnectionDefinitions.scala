package typings.graphqlDashRelay.graphqlDashRelayMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphqlMod.GraphQLObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLConnectionDefinitions extends js.Object {
  var connectionType: GraphQLObjectType[_, _, StringDictionary[_]]
  var edgeType: GraphQLObjectType[_, _, StringDictionary[_]]
}

object GraphQLConnectionDefinitions {
  @scala.inline
  def apply(
    connectionType: GraphQLObjectType[_, _, StringDictionary[_]],
    edgeType: GraphQLObjectType[_, _, StringDictionary[_]]
  ): GraphQLConnectionDefinitions = {
    val __obj = js.Dynamic.literal(connectionType = connectionType.asInstanceOf[js.Any], edgeType = edgeType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GraphQLConnectionDefinitions]
  }
}

