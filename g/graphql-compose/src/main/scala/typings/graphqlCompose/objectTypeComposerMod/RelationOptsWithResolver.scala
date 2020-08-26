package typings.graphqlCompose.objectTypeComposerMod

import typings.graphqlCompose.definitionsMod.Thunk
import typings.graphqlCompose.resolverMod.Resolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationOptsWithResolver[TRelationSource, TSource, TContext, TArgs] extends RelationOpts[TRelationSource, TSource, TContext, TArgs] {
  var catchErrors: js.UndefOr[Boolean] = js.native
  var deprecationReason: js.UndefOr[String | Null] = js.native
  var description: js.UndefOr[String | Null] = js.native
  var prepareArgs: js.UndefOr[RelationArgsMapper[TSource, TContext, TArgs]] = js.native
  var projection: js.UndefOr[js.Object] = js.native
  var resolver: Thunk[Resolver[TRelationSource, TContext, TArgs, _]] = js.native
}

object RelationOptsWithResolver {
  @scala.inline
  def apply[TRelationSource, TSource, TContext, TArgs](resolver: Thunk[Resolver[TRelationSource, TContext, TArgs, _]]): RelationOptsWithResolver[TRelationSource, TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal(resolver = resolver.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationOptsWithResolver[TRelationSource, TSource, TContext, TArgs]]
  }
  @scala.inline
  implicit class RelationOptsWithResolverOps[Self <: RelationOptsWithResolver[_, _, _, _], TRelationSource, TSource, TContext, TArgs] (val x: Self with (RelationOptsWithResolver[TRelationSource, TSource, TContext, TArgs])) extends AnyVal {
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
    def setResolverFunction0(value: () => Resolver[TRelationSource, TContext, TArgs, _]): Self = this.set("resolver", js.Any.fromFunction0(value))
    @scala.inline
    def setResolver(value: Thunk[Resolver[TRelationSource, TContext, TArgs, _]]): Self = this.set("resolver", value.asInstanceOf[js.Any])
    @scala.inline
    def setCatchErrors(value: Boolean): Self = this.set("catchErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatchErrors: Self = this.set("catchErrors", js.undefined)
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
    def setPrepareArgs(value: RelationArgsMapper[TSource, TContext, TArgs]): Self = this.set("prepareArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrepareArgs: Self = this.set("prepareArgs", js.undefined)
    @scala.inline
    def setProjection(value: js.Object): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
  }
  
}

