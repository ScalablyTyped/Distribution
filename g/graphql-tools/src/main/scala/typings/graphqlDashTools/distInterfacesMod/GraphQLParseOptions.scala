package typings.graphqlDashTools.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLParseOptions extends js.Object {
  var allowLegacySDLEmptyFields: js.UndefOr[Boolean] = js.undefined
  var allowLegacySDLImplementsInterfaces: js.UndefOr[Boolean] = js.undefined
  var experimentalFragmentVariables: js.UndefOr[Boolean] = js.undefined
  var noLocation: js.UndefOr[Boolean] = js.undefined
}

object GraphQLParseOptions {
  @scala.inline
  def apply(
    allowLegacySDLEmptyFields: js.UndefOr[Boolean] = js.undefined,
    allowLegacySDLImplementsInterfaces: js.UndefOr[Boolean] = js.undefined,
    experimentalFragmentVariables: js.UndefOr[Boolean] = js.undefined,
    noLocation: js.UndefOr[Boolean] = js.undefined
  ): GraphQLParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowLegacySDLEmptyFields)) __obj.updateDynamic("allowLegacySDLEmptyFields")(allowLegacySDLEmptyFields)
    if (!js.isUndefined(allowLegacySDLImplementsInterfaces)) __obj.updateDynamic("allowLegacySDLImplementsInterfaces")(allowLegacySDLImplementsInterfaces)
    if (!js.isUndefined(experimentalFragmentVariables)) __obj.updateDynamic("experimentalFragmentVariables")(experimentalFragmentVariables)
    if (!js.isUndefined(noLocation)) __obj.updateDynamic("noLocation")(noLocation)
    __obj.asInstanceOf[GraphQLParseOptions]
  }
}

