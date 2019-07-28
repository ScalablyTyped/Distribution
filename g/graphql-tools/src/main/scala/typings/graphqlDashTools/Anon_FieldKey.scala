package typings.graphqlDashTools

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphqlMod.GraphQLInterfaceType
import typings.graphql.graphqlMod.GraphQLObjectType
import typings.graphql.typeDefinitionMod.GraphQLField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldKey extends js.Object {
  var field: GraphQLField[_, _, StringDictionary[_]]
  var objectType: (GraphQLObjectType[_, _, StringDictionary[_]]) | GraphQLInterfaceType
}

object Anon_FieldKey {
  @scala.inline
  def apply(
    field: GraphQLField[_, _, StringDictionary[_]],
    objectType: (GraphQLObjectType[_, _, StringDictionary[_]]) | GraphQLInterfaceType
  ): Anon_FieldKey = {
    val __obj = js.Dynamic.literal(field = field, objectType = objectType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FieldKey]
  }
}

