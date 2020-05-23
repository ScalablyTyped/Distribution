package typings.graphqlTools.anon

import typings.graphql.mod.GraphQLInputObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectTypeGraphQLInputObjectType extends js.Object {
  var objectType: GraphQLInputObjectType
}

object ObjectTypeGraphQLInputObjectType {
  @scala.inline
  def apply(objectType: GraphQLInputObjectType): ObjectTypeGraphQLInputObjectType = {
    val __obj = js.Dynamic.literal(objectType = objectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeGraphQLInputObjectType]
  }
}

