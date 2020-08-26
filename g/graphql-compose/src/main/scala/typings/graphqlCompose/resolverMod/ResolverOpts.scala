package typings.graphqlCompose.resolverMod

import typings.graphql.definitionMod.GraphQLOutputType
import typings.graphqlCompose.definitionsMod.Extensions
import typings.graphqlCompose.enumTypeComposerMod.EnumTypeComposer
import typings.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer
import typings.graphqlCompose.objectTypeComposerMod.ComposeFieldConfigArgumentMap
import typings.graphqlCompose.objectTypeComposerMod.ComposeOutputType
import typings.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer
import typings.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer
import typings.graphqlCompose.typeMapperMod.TypeAsString
import typings.graphqlCompose.unionTypeComposerMod.UnionTypeComposer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverOpts[TSource, TContext, TArgs, TReturn] extends js.Object {
  var args: js.UndefOr[ComposeFieldConfigArgumentMap[TArgs]] = js.native
  var description: js.UndefOr[String] = js.native
  var displayName: js.UndefOr[String] = js.native
  var extensions: js.UndefOr[Extensions] = js.native
  var kind: js.UndefOr[ResolverKinds] = js.native
  var name: js.UndefOr[String] = js.native
  var parent: js.UndefOr[Resolver[_, TContext, _, _]] = js.native
  var resolve: js.UndefOr[ResolverRpCb[TSource, TContext, TArgs]] = js.native
  var `type`: js.UndefOr[ComposeOutputType[TReturn, TContext]] = js.native
}

object ResolverOpts {
  @scala.inline
  def apply[TSource, TContext, TArgs, TReturn](): ResolverOpts[TSource, TContext, TArgs, TReturn] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolverOpts[TSource, TContext, TArgs, TReturn]]
  }
  @scala.inline
  implicit class ResolverOptsOps[Self <: ResolverOpts[_, _, _, _], TSource, TContext, TArgs, TReturn] (val x: Self with (ResolverOpts[TSource, TContext, TArgs, TReturn])) extends AnyVal {
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
    def setArgs(value: ComposeFieldConfigArgumentMap[TArgs]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setExtensions(value: Extensions): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setKind(value: ResolverKinds): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setParent(value: Resolver[_, TContext, _, _]): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setResolve(value: /* resolveParams */ ResolveParams[TSource, TContext, TArgs] => js.Promise[js.Any] | js.Any): Self = this.set("resolve", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResolve: Self = this.set("resolve", js.undefined)
    @scala.inline
    def setTypeVarargs(
      value: (GraphQLOutputType | (ObjectTypeComposer[TReturn, TContext]) | EnumTypeComposer[TContext] | ScalarTypeComposer[TContext] | TypeAsString | (Resolver[js.Any, TContext, js.Any, js.Any]) | (InterfaceTypeComposer[TReturn, TContext]) | (UnionTypeComposer[TReturn, TContext]))*
    ): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setType(value: ComposeOutputType[TReturn, TContext]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

