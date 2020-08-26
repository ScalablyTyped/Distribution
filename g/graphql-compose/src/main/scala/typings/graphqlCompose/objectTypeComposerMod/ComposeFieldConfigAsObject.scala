package typings.graphqlCompose.objectTypeComposerMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.FieldDefinitionNode
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.definitionMod.GraphQLOutputType
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphqlCompose.definitionsMod.Extensions
import typings.graphqlCompose.definitionsMod.Thunk
import typings.graphqlCompose.enumTypeComposerMod.EnumTypeComposer
import typings.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer
import typings.graphqlCompose.resolverMod.Resolver
import typings.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer
import typings.graphqlCompose.typeMapperMod.TypeAsString
import typings.graphqlCompose.unionTypeComposerMod.UnionTypeComposer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComposeFieldConfigAsObject[TSource, TContext, TArgs]
  extends /* opt */ StringDictionary[js.Any] {
  @JSName("$call")
  var $call: js.UndefOr[Unit] = js.native
  var args: js.UndefOr[ComposeFieldConfigArgumentMap[TArgs]] = js.native
  var astNode: js.UndefOr[FieldDefinitionNode | Null] = js.native
  var deprecationReason: js.UndefOr[String | Null] = js.native
  var description: js.UndefOr[String | Null] = js.native
  var extensions: js.UndefOr[Extensions] = js.native
  var resolve: js.UndefOr[GraphQLFieldResolver[TSource, TContext, TArgs]] = js.native
  var subscribe: js.UndefOr[GraphQLFieldResolver[TSource, TContext, StringDictionary[_]]] = js.native
  var `type`: (Thunk[ComposeOutputType[_, TContext]]) | GraphQLOutputType = js.native
}

object ComposeFieldConfigAsObject {
  @scala.inline
  def apply[TSource, TContext, TArgs](`type`: (Thunk[ComposeOutputType[_, TContext]]) | GraphQLOutputType): ComposeFieldConfigAsObject[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposeFieldConfigAsObject[TSource, TContext, TArgs]]
  }
  @scala.inline
  implicit class ComposeFieldConfigAsObjectOps[Self <: ComposeFieldConfigAsObject[_, _, _], TSource, TContext, TArgs] (val x: Self with (ComposeFieldConfigAsObject[TSource, TContext, TArgs])) extends AnyVal {
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
    def setTypeVarargs(
      value: (GraphQLOutputType | (ObjectTypeComposer[js.Any, TContext]) | EnumTypeComposer[TContext] | ScalarTypeComposer[TContext] | TypeAsString | (Resolver[js.Any, TContext, js.Any, js.Any]) | (InterfaceTypeComposer[js.Any, TContext]) | (UnionTypeComposer[js.Any, TContext]))*
    ): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setTypeFunction0(value: () => ComposeOutputType[_, TContext]): Self = this.set("type", js.Any.fromFunction0(value))
    @scala.inline
    def setType(value: (Thunk[ComposeOutputType[_, TContext]]) | GraphQLOutputType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def set$call(value: Unit): Self = this.set("$call", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$call: Self = this.set("$call", js.undefined)
    @scala.inline
    def setArgs(value: ComposeFieldConfigArgumentMap[TArgs]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setAstNode(value: FieldDefinitionNode): Self = this.set("astNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAstNode: Self = this.set("astNode", js.undefined)
    @scala.inline
    def setAstNodeNull: Self = this.set("astNode", null)
    @scala.inline
    def setDeprecationReason(value: String): Self = this.set("deprecationReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecationReason: Self = this.set("deprecationReason", js.undefined)
    @scala.inline
    def setDeprecationReasonNull: Self = this.set("deprecationReason", null)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    @scala.inline
    def setExtensions(value: Extensions): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setResolve(value: (TSource, TArgs, TContext, /* info */ GraphQLResolveInfo) => js.Any): Self = this.set("resolve", js.Any.fromFunction4(value))
    @scala.inline
    def deleteResolve: Self = this.set("resolve", js.undefined)
    @scala.inline
    def setSubscribe(value: (TSource, StringDictionary[_], TContext, /* info */ GraphQLResolveInfo) => js.Any): Self = this.set("subscribe", js.Any.fromFunction4(value))
    @scala.inline
    def deleteSubscribe: Self = this.set("subscribe", js.undefined)
  }
  
}

