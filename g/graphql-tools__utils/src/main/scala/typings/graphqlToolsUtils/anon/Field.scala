package typings.graphqlToolsUtils.anon

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLField
import typings.graphql.mod.GraphQLInterfaceType
import typings.graphql.mod.GraphQLObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Field extends js.Object {
  var field: GraphQLField[_, _, StringDictionary[_]] = js.native
  var objectType: (GraphQLObjectType[_, _]) | GraphQLInterfaceType = js.native
}

object Field {
  @scala.inline
  def apply(
    field: GraphQLField[_, _, StringDictionary[_]],
    objectType: (GraphQLObjectType[_, _]) | GraphQLInterfaceType
  ): Field = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
  @scala.inline
  implicit class FieldOps[Self <: Field] (val x: Self) extends AnyVal {
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
    def setField(value: GraphQLField[_, _, StringDictionary[_]]): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectType(value: (GraphQLObjectType[_, _]) | GraphQLInterfaceType): Self = this.set("objectType", value.asInstanceOf[js.Any])
  }
  
}

