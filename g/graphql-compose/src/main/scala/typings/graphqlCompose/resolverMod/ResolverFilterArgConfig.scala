package typings.graphqlCompose.resolverMod

import typings.graphql.definitionMod.GraphQLInputType
import typings.graphqlCompose.enumTypeComposerMod.EnumTypeComposer
import typings.graphqlCompose.inputTypeComposerMod.InputTypeComposer
import typings.graphqlCompose.objectTypeComposerMod.ComposeArgumentType
import typings.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer
import typings.graphqlCompose.typeMapperMod.TypeAsString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverFilterArgConfig[TSource, TContext, TArgs] extends js.Object {
  var defaultValue: js.UndefOr[js.Any] = js.native
  var description: js.UndefOr[String] = js.native
  var filterTypeNameFallback: js.UndefOr[String] = js.native
  var name: String = js.native
  var query: js.UndefOr[ResolverFilterArgFn[TSource, TContext, TArgs]] = js.native
  var `type`: ComposeArgumentType = js.native
}

object ResolverFilterArgConfig {
  @scala.inline
  def apply[TSource, TContext, TArgs](name: String, `type`: ComposeArgumentType): ResolverFilterArgConfig[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverFilterArgConfig[TSource, TContext, TArgs]]
  }
  @scala.inline
  implicit class ResolverFilterArgConfigOps[Self <: ResolverFilterArgConfig[_, _, _], TSource, TContext, TArgs] (val x: Self with (ResolverFilterArgConfig[TSource, TContext, TArgs])) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeVarargs(
      value: (GraphQLInputType | TypeAsString | InputTypeComposer[js.Any] | EnumTypeComposer[js.Any] | ScalarTypeComposer[js.Any])*
    ): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setType(value: ComposeArgumentType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setFilterTypeNameFallback(value: String): Self = this.set("filterTypeNameFallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterTypeNameFallback: Self = this.set("filterTypeNameFallback", js.undefined)
    @scala.inline
    def setQuery(
      value: (/* query */ js.Any, /* value */ js.Any, /* resolveParams */ ResolveParams[TSource, TContext, TArgs]) => js.Any
    ): Self = this.set("query", js.Any.fromFunction3(value))
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
  }
  
}

