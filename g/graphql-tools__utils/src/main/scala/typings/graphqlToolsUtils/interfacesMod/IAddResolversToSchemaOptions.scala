package typings.graphqlToolsUtils.interfacesMod

import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.mod.GraphQLSchema
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAddResolversToSchemaOptions extends js.Object {
  /**
    * Override the default field resolver provided by `graphql-js`
    */
  var defaultFieldResolver: js.UndefOr[IFieldResolver[_, _, Record[String, _], _]] = js.native
  /**
    * GraphQL object types that implement interfaces will inherit any missing
    * resolvers from their interface types defined in the `resolvers` object
    */
  var inheritResolversFromInterfaces: js.UndefOr[Boolean] = js.native
  /**
    * Additional options for validating the provided resolvers
    */
  var resolverValidationOptions: js.UndefOr[IResolverValidationOptions] = js.native
  /**
    * Object describing the field resolvers to add to the provided schema
    */
  var resolvers: IResolvers[_, _, Record[String, _], _] = js.native
  /**
    * The schema to which to add resolvers
    */
  var schema: GraphQLSchema = js.native
  /**
    * Set to `true` to modify the existing schema instead of creating a new one
    */
  var updateResolversInPlace: js.UndefOr[Boolean] = js.native
}

object IAddResolversToSchemaOptions {
  @scala.inline
  def apply(resolvers: IResolvers[_, _, Record[String, _], _], schema: GraphQLSchema): IAddResolversToSchemaOptions = {
    val __obj = js.Dynamic.literal(resolvers = resolvers.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAddResolversToSchemaOptions]
  }
  @scala.inline
  implicit class IAddResolversToSchemaOptionsOps[Self <: IAddResolversToSchemaOptions] (val x: Self) extends AnyVal {
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
    def setResolvers(value: IResolvers[_, _, Record[String, _], _]): Self = this.set("resolvers", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: GraphQLSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultFieldResolver(value: (_, Record[String, _], _, /* info */ GraphQLResolveInfo) => _): Self = this.set("defaultFieldResolver", js.Any.fromFunction4(value))
    @scala.inline
    def deleteDefaultFieldResolver: Self = this.set("defaultFieldResolver", js.undefined)
    @scala.inline
    def setInheritResolversFromInterfaces(value: Boolean): Self = this.set("inheritResolversFromInterfaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInheritResolversFromInterfaces: Self = this.set("inheritResolversFromInterfaces", js.undefined)
    @scala.inline
    def setResolverValidationOptions(value: IResolverValidationOptions): Self = this.set("resolverValidationOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolverValidationOptions: Self = this.set("resolverValidationOptions", js.undefined)
    @scala.inline
    def setUpdateResolversInPlace(value: Boolean): Self = this.set("updateResolversInPlace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateResolversInPlace: Self = this.set("updateResolversInPlace", js.undefined)
  }
  
}

