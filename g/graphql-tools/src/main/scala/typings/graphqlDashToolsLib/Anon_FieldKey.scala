package typings
package graphqlDashToolsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldKey extends js.Object {
  var field: graphqlLib.typeDefinitionMod.GraphQLField[_, _, org.scalablytyped.runtime.StringDictionary[_]]
  var objectType: (graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]) | graphqlLib.graphqlMod.GraphQLInterfaceType
}

object Anon_FieldKey {
  @scala.inline
  def apply(
    field: graphqlLib.typeDefinitionMod.GraphQLField[_, _, org.scalablytyped.runtime.StringDictionary[_]],
    objectType: (graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]) | graphqlLib.graphqlMod.GraphQLInterfaceType
  ): Anon_FieldKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("objectType")(objectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FieldKey]
  }
}

