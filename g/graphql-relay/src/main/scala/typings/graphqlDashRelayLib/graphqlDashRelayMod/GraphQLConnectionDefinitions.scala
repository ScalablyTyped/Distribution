package typings
package graphqlDashRelayLib.graphqlDashRelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLConnectionDefinitions extends js.Object {
  var connectionType: graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]
  var edgeType: graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]
}

object GraphQLConnectionDefinitions {
  @scala.inline
  def apply(
    connectionType: graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]],
    edgeType: graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]
  ): GraphQLConnectionDefinitions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("connectionType")(connectionType)
    __obj.updateDynamic("edgeType")(edgeType)
    __obj.asInstanceOf[GraphQLConnectionDefinitions]
  }
}

