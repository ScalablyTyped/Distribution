package typings.graphqlToolsWrap.anon

import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.mod.GraphQLError
import typings.graphqlToolsUtils.interfacesMod.FieldNodeMappers
import typings.graphqlToolsUtils.interfacesMod.IFieldResolver
import typings.graphqlToolsUtils.interfacesMod.IResolvers
import typings.graphqlToolsWrap.typesMod.ErrorsTransformer
import typings.graphqlToolsWrap.typesMod.ObjectValueTransformerMap
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultFieldResolver extends js.Object {
  var defaultFieldResolver: js.UndefOr[IFieldResolver[_, _, Record[String, _], _]] = js.native
  var errorsTransformer: js.UndefOr[ErrorsTransformer] = js.native
  var fieldNodeTransformerMap: js.UndefOr[FieldNodeMappers] = js.native
  var objectValueTransformerMap: js.UndefOr[ObjectValueTransformerMap] = js.native
  var resolvers: js.UndefOr[IResolvers[_, _, Record[String, _], _]] = js.native
  var typeDefs: js.UndefOr[String] = js.native
}

object DefaultFieldResolver {
  @scala.inline
  def apply(): DefaultFieldResolver = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultFieldResolver]
  }
  @scala.inline
  implicit class DefaultFieldResolverOps[Self <: DefaultFieldResolver] (val x: Self) extends AnyVal {
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
    def setDefaultFieldResolver(value: (_, Record[String, _], _, /* info */ GraphQLResolveInfo) => _): Self = this.set("defaultFieldResolver", js.Any.fromFunction4(value))
    @scala.inline
    def deleteDefaultFieldResolver: Self = this.set("defaultFieldResolver", js.undefined)
    @scala.inline
    def setErrorsTransformer(
      value: (/* errors */ js.Array[GraphQLError], /* transformationContext */ Record[String, js.Any]) => js.Array[GraphQLError]
    ): Self = this.set("errorsTransformer", js.Any.fromFunction2(value))
    @scala.inline
    def deleteErrorsTransformer: Self = this.set("errorsTransformer", js.undefined)
    @scala.inline
    def setFieldNodeTransformerMap(value: FieldNodeMappers): Self = this.set("fieldNodeTransformerMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldNodeTransformerMap: Self = this.set("fieldNodeTransformerMap", js.undefined)
    @scala.inline
    def setObjectValueTransformerMap(value: ObjectValueTransformerMap): Self = this.set("objectValueTransformerMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectValueTransformerMap: Self = this.set("objectValueTransformerMap", js.undefined)
    @scala.inline
    def setResolvers(value: IResolvers[_, _, Record[String, _], _]): Self = this.set("resolvers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolvers: Self = this.set("resolvers", js.undefined)
    @scala.inline
    def setTypeDefs(value: String): Self = this.set("typeDefs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeDefs: Self = this.set("typeDefs", js.undefined)
  }
  
}

