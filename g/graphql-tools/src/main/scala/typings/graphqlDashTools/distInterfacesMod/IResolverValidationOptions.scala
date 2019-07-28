package typings.graphqlDashTools.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResolverValidationOptions extends js.Object {
  var allowResolversNotInSchema: js.UndefOr[Boolean] = js.undefined
  var requireResolversForAllFields: js.UndefOr[Boolean] = js.undefined
  var requireResolversForArgs: js.UndefOr[Boolean] = js.undefined
  var requireResolversForNonScalar: js.UndefOr[Boolean] = js.undefined
  var requireResolversForResolveType: js.UndefOr[Boolean] = js.undefined
}

object IResolverValidationOptions {
  @scala.inline
  def apply(
    allowResolversNotInSchema: js.UndefOr[Boolean] = js.undefined,
    requireResolversForAllFields: js.UndefOr[Boolean] = js.undefined,
    requireResolversForArgs: js.UndefOr[Boolean] = js.undefined,
    requireResolversForNonScalar: js.UndefOr[Boolean] = js.undefined,
    requireResolversForResolveType: js.UndefOr[Boolean] = js.undefined
  ): IResolverValidationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowResolversNotInSchema)) __obj.updateDynamic("allowResolversNotInSchema")(allowResolversNotInSchema)
    if (!js.isUndefined(requireResolversForAllFields)) __obj.updateDynamic("requireResolversForAllFields")(requireResolversForAllFields)
    if (!js.isUndefined(requireResolversForArgs)) __obj.updateDynamic("requireResolversForArgs")(requireResolversForArgs)
    if (!js.isUndefined(requireResolversForNonScalar)) __obj.updateDynamic("requireResolversForNonScalar")(requireResolversForNonScalar)
    if (!js.isUndefined(requireResolversForResolveType)) __obj.updateDynamic("requireResolversForResolveType")(requireResolversForResolveType)
    __obj.asInstanceOf[IResolverValidationOptions]
  }
}

