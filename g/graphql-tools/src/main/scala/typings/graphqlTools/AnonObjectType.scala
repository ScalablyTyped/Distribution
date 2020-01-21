package typings.graphqlTools

import typings.graphql.mod.GraphQLInputObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonObjectType extends js.Object {
  var objectType: GraphQLInputObjectType
}

object AnonObjectType {
  @scala.inline
  def apply(objectType: GraphQLInputObjectType): AnonObjectType = {
    val __obj = js.Dynamic.literal(objectType = objectType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonObjectType]
  }
}

