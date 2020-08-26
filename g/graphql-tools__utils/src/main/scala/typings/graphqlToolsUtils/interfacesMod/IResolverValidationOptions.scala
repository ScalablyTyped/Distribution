package typings.graphqlToolsUtils.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResolverValidationOptions extends js.Object {
  /**
    * Set to `false` to require all defined resolvers to match fields that
    * actually exist in the schema. Defaults to `true`.
    */
  var allowResolversNotInSchema: js.UndefOr[Boolean] = js.native
  /**
    * Set to `true` to require a resolver for be defined for all fields defined
    * in the schema. Defaults to `false`.
    */
  var requireResolversForAllFields: js.UndefOr[Boolean] = js.native
  /**
    * Set to `true` to require a resolver to be defined for any field that has
    * arguments. Defaults to `false`.
    */
  var requireResolversForArgs: js.UndefOr[Boolean] = js.native
  /**
    * Set to `true` to require a resolver to be defined for any field which has
    * a return type that isn't a scalar. Defaults to `false`.
    */
  var requireResolversForNonScalar: js.UndefOr[Boolean] = js.native
  /**
    * Set to `true` to require a `resolveType()` for Interface and Union types.
    * Defaults to `false`.
    */
  var requireResolversForResolveType: js.UndefOr[Boolean] = js.native
}

object IResolverValidationOptions {
  @scala.inline
  def apply(): IResolverValidationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResolverValidationOptions]
  }
  @scala.inline
  implicit class IResolverValidationOptionsOps[Self <: IResolverValidationOptions] (val x: Self) extends AnyVal {
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
    def setAllowResolversNotInSchema(value: Boolean): Self = this.set("allowResolversNotInSchema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowResolversNotInSchema: Self = this.set("allowResolversNotInSchema", js.undefined)
    @scala.inline
    def setRequireResolversForAllFields(value: Boolean): Self = this.set("requireResolversForAllFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireResolversForAllFields: Self = this.set("requireResolversForAllFields", js.undefined)
    @scala.inline
    def setRequireResolversForArgs(value: Boolean): Self = this.set("requireResolversForArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireResolversForArgs: Self = this.set("requireResolversForArgs", js.undefined)
    @scala.inline
    def setRequireResolversForNonScalar(value: Boolean): Self = this.set("requireResolversForNonScalar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireResolversForNonScalar: Self = this.set("requireResolversForNonScalar", js.undefined)
    @scala.inline
    def setRequireResolversForResolveType(value: Boolean): Self = this.set("requireResolversForResolveType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireResolversForResolveType: Self = this.set("requireResolversForResolveType", js.undefined)
  }
  
}

