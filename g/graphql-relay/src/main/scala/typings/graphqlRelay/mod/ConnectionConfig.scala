package typings.graphqlRelay.mod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLFieldConfigMap
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.definitionMod.Thunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionConfig extends js.Object {
  var connectionFields: js.UndefOr[(Thunk[GraphQLFieldConfigMap[_, _]]) | Null] = js.native
  var edgeFields: js.UndefOr[(Thunk[GraphQLFieldConfigMap[_, _]]) | Null] = js.native
  var name: js.UndefOr[String | Null] = js.native
  var nodeType: ConnectionConfigNodeType = js.native
  var resolveCursor: js.UndefOr[(GraphQLFieldResolver[_, _, StringDictionary[_]]) | Null] = js.native
  var resolveNode: js.UndefOr[(GraphQLFieldResolver[_, _, StringDictionary[_]]) | Null] = js.native
}

object ConnectionConfig {
  @scala.inline
  def apply(nodeType: ConnectionConfigNodeType): ConnectionConfig = {
    val __obj = js.Dynamic.literal(nodeType = nodeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionConfig]
  }
  @scala.inline
  implicit class ConnectionConfigOps[Self <: ConnectionConfig] (val x: Self) extends AnyVal {
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
    def setNodeType(value: ConnectionConfigNodeType): Self = this.set("nodeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionFieldsFunction0(value: () => GraphQLFieldConfigMap[_, _]): Self = this.set("connectionFields", js.Any.fromFunction0(value))
    @scala.inline
    def setConnectionFields(value: Thunk[GraphQLFieldConfigMap[_, _]]): Self = this.set("connectionFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionFields: Self = this.set("connectionFields", js.undefined)
    @scala.inline
    def setConnectionFieldsNull: Self = this.set("connectionFields", null)
    @scala.inline
    def setEdgeFieldsFunction0(value: () => GraphQLFieldConfigMap[_, _]): Self = this.set("edgeFields", js.Any.fromFunction0(value))
    @scala.inline
    def setEdgeFields(value: Thunk[GraphQLFieldConfigMap[_, _]]): Self = this.set("edgeFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdgeFields: Self = this.set("edgeFields", js.undefined)
    @scala.inline
    def setEdgeFieldsNull: Self = this.set("edgeFields", null)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    @scala.inline
    def setResolveCursor(value: (_, StringDictionary[_], _, /* info */ GraphQLResolveInfo) => js.Any): Self = this.set("resolveCursor", js.Any.fromFunction4(value))
    @scala.inline
    def deleteResolveCursor: Self = this.set("resolveCursor", js.undefined)
    @scala.inline
    def setResolveCursorNull: Self = this.set("resolveCursor", null)
    @scala.inline
    def setResolveNode(value: (_, StringDictionary[_], _, /* info */ GraphQLResolveInfo) => js.Any): Self = this.set("resolveNode", js.Any.fromFunction4(value))
    @scala.inline
    def deleteResolveNode: Self = this.set("resolveNode", js.undefined)
    @scala.inline
    def setResolveNodeNull: Self = this.set("resolveNode", null)
  }
  
}

