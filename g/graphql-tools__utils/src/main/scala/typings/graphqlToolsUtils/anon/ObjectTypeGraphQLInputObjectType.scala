package typings.graphqlToolsUtils.anon

import typings.graphql.mod.GraphQLInputObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectTypeGraphQLInputObjectType extends js.Object {
  var objectType: GraphQLInputObjectType = js.native
}

object ObjectTypeGraphQLInputObjectType {
  @scala.inline
  def apply(objectType: GraphQLInputObjectType): ObjectTypeGraphQLInputObjectType = {
    val __obj = js.Dynamic.literal(objectType = objectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeGraphQLInputObjectType]
  }
  @scala.inline
  implicit class ObjectTypeGraphQLInputObjectTypeOps[Self <: ObjectTypeGraphQLInputObjectType] (val x: Self) extends AnyVal {
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
    def setObjectType(value: GraphQLInputObjectType): Self = this.set("objectType", value.asInstanceOf[js.Any])
  }
  
}

