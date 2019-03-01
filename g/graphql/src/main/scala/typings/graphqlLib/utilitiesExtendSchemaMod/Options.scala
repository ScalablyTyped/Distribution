package typings
package graphqlLib.utilitiesExtendSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends graphqlLib.typeSchemaMod.GraphQLSchemaValidationOptions {
  /**
    * Set to true to assume the SDL is valid.
    *
    * Default: false
    */
  var assumeValidSDL: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Descriptions are defined as preceding string literals, however an older
    * experimental version of the SDL supported preceding comments as
    * descriptions. Set to true to enable this deprecated behavior.
    * This option is provided to ease adoption and will be removed in v16.
    *
    * Default: false
    */
  var commentDescriptions: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowedLegacyNames: graphqlLib.tsutilsMaybeMod.Maybe[js.Array[java.lang.String]] = null,
    assumeValid: js.UndefOr[scala.Boolean] = js.undefined,
    assumeValidSDL: js.UndefOr[scala.Boolean] = js.undefined,
    commentDescriptions: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (allowedLegacyNames != null) __obj.updateDynamic("allowedLegacyNames")(allowedLegacyNames.asInstanceOf[js.Any])
    if (!js.isUndefined(assumeValid)) __obj.updateDynamic("assumeValid")(assumeValid)
    if (!js.isUndefined(assumeValidSDL)) __obj.updateDynamic("assumeValidSDL")(assumeValidSDL)
    if (!js.isUndefined(commentDescriptions)) __obj.updateDynamic("commentDescriptions")(commentDescriptions)
    __obj.asInstanceOf[Options]
  }
}

