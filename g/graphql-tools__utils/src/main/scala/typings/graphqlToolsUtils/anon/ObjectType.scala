package typings.graphqlToolsUtils.anon

import typings.graphql.mod.GraphQLInterfaceType
import typings.graphql.mod.GraphQLObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectType extends js.Object {
  var objectType: (GraphQLObjectType[_, _]) | GraphQLInterfaceType = js.native
}

object ObjectType {
  @scala.inline
  def apply(objectType: (GraphQLObjectType[_, _]) | GraphQLInterfaceType): ObjectType = {
    val __obj = js.Dynamic.literal(objectType = objectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectType]
  }
  @scala.inline
  implicit class ObjectTypeOps[Self <: ObjectType] (val x: Self) extends AnyVal {
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
    def setObjectType(value: (GraphQLObjectType[_, _]) | GraphQLInterfaceType): Self = this.set("objectType", value.asInstanceOf[js.Any])
  }
  
}

