package typings.graphql.buildASTSchemaMod

import typings.graphql.maybeMod.Maybe
import typings.graphql.schemaMod.GraphQLSchemaValidationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildSchemaOptions extends GraphQLSchemaValidationOptions {
  /**
    * Set to true to assume the SDL is valid.
    *
    * Default: false
    */
  var assumeValidSDL: js.UndefOr[Boolean] = js.undefined
  /**
    * Descriptions are defined as preceding string literals, however an older
    * experimental version of the SDL supported preceding comments as
    * descriptions. Set to true to enable this deprecated behavior.
    * This option is provided to ease adoption and will be removed in v16.
    *
    * Default: false
    */
  var commentDescriptions: js.UndefOr[Boolean] = js.undefined
}

object BuildSchemaOptions {
  @scala.inline
  def apply(
    allowedLegacyNames: js.UndefOr[Null | Maybe[js.Array[String]]] = js.undefined,
    assumeValid: js.UndefOr[Boolean] = js.undefined,
    assumeValidSDL: js.UndefOr[Boolean] = js.undefined,
    commentDescriptions: js.UndefOr[Boolean] = js.undefined
  ): BuildSchemaOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowedLegacyNames)) __obj.updateDynamic("allowedLegacyNames")(allowedLegacyNames.asInstanceOf[js.Any])
    if (!js.isUndefined(assumeValid)) __obj.updateDynamic("assumeValid")(assumeValid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(assumeValidSDL)) __obj.updateDynamic("assumeValidSDL")(assumeValidSDL.get.asInstanceOf[js.Any])
    if (!js.isUndefined(commentDescriptions)) __obj.updateDynamic("commentDescriptions")(commentDescriptions.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildSchemaOptions]
  }
}

