package typings.graphql.schemaMod

import typings.graphql.definitionMod.GraphQLInterfaceType
import typings.graphql.definitionMod.GraphQLObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterfaceImplementations extends js.Object {
  var interfaces: js.Array[GraphQLInterfaceType] = js.native
  var objects: js.Array[GraphQLObjectType[_, _]] = js.native
}

object InterfaceImplementations {
  @scala.inline
  def apply(interfaces: js.Array[GraphQLInterfaceType], objects: js.Array[GraphQLObjectType[_, _]]): InterfaceImplementations = {
    val __obj = js.Dynamic.literal(interfaces = interfaces.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceImplementations]
  }
  @scala.inline
  implicit class InterfaceImplementationsOps[Self <: InterfaceImplementations] (val x: Self) extends AnyVal {
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
    def setInterfacesVarargs(value: GraphQLInterfaceType*): Self = this.set("interfaces", js.Array(value :_*))
    @scala.inline
    def setInterfaces(value: js.Array[GraphQLInterfaceType]): Self = this.set("interfaces", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectsVarargs(value: (GraphQLObjectType[js.Any, js.Any])*): Self = this.set("objects", js.Array(value :_*))
    @scala.inline
    def setObjects(value: js.Array[GraphQLObjectType[_, _]]): Self = this.set("objects", value.asInstanceOf[js.Any])
  }
  
}

