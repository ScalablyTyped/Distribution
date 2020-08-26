package typings.graphql.definitionMod

import typings.graphql.astMod.FieldDefinitionNode
import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLFieldConfig[TSource, TContext, TArgs] extends js.Object {
  var args: js.UndefOr[GraphQLFieldConfigArgumentMap] = js.native
  var astNode: js.UndefOr[Maybe[FieldDefinitionNode]] = js.native
  var deprecationReason: js.UndefOr[Maybe[String]] = js.native
  var description: js.UndefOr[Maybe[String]] = js.native
  var extensions: js.UndefOr[Maybe[GraphQLFieldExtensions[TSource, TContext, TArgs]]] = js.native
  var resolve: js.UndefOr[GraphQLFieldResolver[TSource, TContext, TArgs]] = js.native
  var subscribe: js.UndefOr[GraphQLFieldResolver[TSource, TContext, TArgs]] = js.native
  var `type`: GraphQLOutputType = js.native
}

object GraphQLFieldConfig {
  @scala.inline
  def apply[TSource, TContext, TArgs](`type`: GraphQLOutputType): GraphQLFieldConfig[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLFieldConfig[TSource, TContext, TArgs]]
  }
  @scala.inline
  implicit class GraphQLFieldConfigOps[Self <: GraphQLFieldConfig[_, _, _], TSource, TContext, TArgs] (val x: Self with (GraphQLFieldConfig[TSource, TContext, TArgs])) extends AnyVal {
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
    def setType(value: GraphQLOutputType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setArgs(value: GraphQLFieldConfigArgumentMap): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setAstNode(value: Maybe[FieldDefinitionNode]): Self = this.set("astNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAstNode: Self = this.set("astNode", js.undefined)
    @scala.inline
    def setAstNodeNull: Self = this.set("astNode", null)
    @scala.inline
    def setDeprecationReason(value: Maybe[String]): Self = this.set("deprecationReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecationReason: Self = this.set("deprecationReason", js.undefined)
    @scala.inline
    def setDeprecationReasonNull: Self = this.set("deprecationReason", null)
    @scala.inline
    def setDescription(value: Maybe[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    @scala.inline
    def setExtensions(value: Maybe[GraphQLFieldExtensions[TSource, TContext, TArgs]]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setExtensionsNull: Self = this.set("extensions", null)
    @scala.inline
    def setResolve(value: (TSource, TArgs, TContext, /* info */ GraphQLResolveInfo) => js.Any): Self = this.set("resolve", js.Any.fromFunction4(value))
    @scala.inline
    def deleteResolve: Self = this.set("resolve", js.undefined)
    @scala.inline
    def setSubscribe(value: (TSource, TArgs, TContext, /* info */ GraphQLResolveInfo) => js.Any): Self = this.set("subscribe", js.Any.fromFunction4(value))
    @scala.inline
    def deleteSubscribe: Self = this.set("subscribe", js.undefined)
  }
  
}

