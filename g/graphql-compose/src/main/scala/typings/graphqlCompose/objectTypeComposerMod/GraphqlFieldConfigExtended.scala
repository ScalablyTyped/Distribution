package typings.graphqlCompose.objectTypeComposerMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.FieldDefinitionNode
import typings.graphql.definitionMod.GraphQLFieldConfigArgumentMap
import typings.graphql.definitionMod.GraphQLFieldExtensions
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.definitionMod.GraphQLOutputType
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql.GraphQLFieldConfig<TSource, TContext, {[argName: string] : any}> & {  projection :any | undefined} */
@js.native
trait GraphqlFieldConfigExtended[TSource, TContext] extends js.Object {
  var args: js.UndefOr[GraphQLFieldConfigArgumentMap] = js.native
  var astNode: js.UndefOr[Maybe[FieldDefinitionNode]] = js.native
  var deprecationReason: js.UndefOr[Maybe[String]] = js.native
  var description: js.UndefOr[Maybe[String]] = js.native
  var extensions: js.UndefOr[Maybe[GraphQLFieldExtensions[TSource, TContext, StringDictionary[_]]]] = js.native
  var projection: js.UndefOr[js.Any] = js.native
  var resolve: js.UndefOr[GraphQLFieldResolver[TSource, TContext, StringDictionary[_]]] = js.native
  var subscribe: js.UndefOr[GraphQLFieldResolver[TSource, TContext, StringDictionary[_]]] = js.native
  var `type`: GraphQLOutputType = js.native
}

object GraphqlFieldConfigExtended {
  @scala.inline
  def apply[TSource, TContext](`type`: GraphQLOutputType): GraphqlFieldConfigExtended[TSource, TContext] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphqlFieldConfigExtended[TSource, TContext]]
  }
  @scala.inline
  implicit class GraphqlFieldConfigExtendedOps[Self <: GraphqlFieldConfigExtended[_, _], TSource, TContext] (val x: Self with (GraphqlFieldConfigExtended[TSource, TContext])) extends AnyVal {
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
    def setExtensions(value: Maybe[GraphQLFieldExtensions[TSource, TContext, StringDictionary[_]]]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setExtensionsNull: Self = this.set("extensions", null)
    @scala.inline
    def setProjection(value: js.Any): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def setResolve(value: (TSource, StringDictionary[_], TContext, /* info */ GraphQLResolveInfo) => js.Any): Self = this.set("resolve", js.Any.fromFunction4(value))
    @scala.inline
    def deleteResolve: Self = this.set("resolve", js.undefined)
    @scala.inline
    def setSubscribe(value: (TSource, StringDictionary[_], TContext, /* info */ GraphQLResolveInfo) => js.Any): Self = this.set("subscribe", js.Any.fromFunction4(value))
    @scala.inline
    def deleteSubscribe: Self = this.set("subscribe", js.undefined)
  }
  
}

