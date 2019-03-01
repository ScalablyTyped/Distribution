package typings
package graphqlDashToolsLib.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResolverValidationOptions extends js.Object {
  var allowResolversNotInSchema: js.UndefOr[scala.Boolean] = js.undefined
  var requireResolversForAllFields: js.UndefOr[scala.Boolean] = js.undefined
  var requireResolversForArgs: js.UndefOr[scala.Boolean] = js.undefined
  var requireResolversForNonScalar: js.UndefOr[scala.Boolean] = js.undefined
  var requireResolversForResolveType: js.UndefOr[scala.Boolean] = js.undefined
}

object IResolverValidationOptions {
  @scala.inline
  def apply(
    allowResolversNotInSchema: js.UndefOr[scala.Boolean] = js.undefined,
    requireResolversForAllFields: js.UndefOr[scala.Boolean] = js.undefined,
    requireResolversForArgs: js.UndefOr[scala.Boolean] = js.undefined,
    requireResolversForNonScalar: js.UndefOr[scala.Boolean] = js.undefined,
    requireResolversForResolveType: js.UndefOr[scala.Boolean] = js.undefined
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

