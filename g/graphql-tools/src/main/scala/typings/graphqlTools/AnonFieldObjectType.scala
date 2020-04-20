package typings.graphqlTools

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLField
import typings.graphql.mod.GraphQLInterfaceType
import typings.graphql.mod.GraphQLObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFieldObjectType extends js.Object {
  var field: GraphQLField[_, _, StringDictionary[_]]
  var objectType: (GraphQLObjectType[_, _, StringDictionary[_]]) | GraphQLInterfaceType
}

object AnonFieldObjectType {
  @scala.inline
  def apply(
    field: GraphQLField[_, _, StringDictionary[_]],
    objectType: (GraphQLObjectType[_, _, StringDictionary[_]]) | GraphQLInterfaceType
  ): AnonFieldObjectType = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFieldObjectType]
  }
}

