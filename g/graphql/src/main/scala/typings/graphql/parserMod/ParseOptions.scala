package typings.graphql.parserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  /**
    * If enabled, the parser will parse empty fields sets in the Schema
    * Definition Language. Otherwise, the parser will follow the current
    * specification.
    *
    * This option is provided to ease adoption of the final SDL specification
    * and will be removed in v16.
    */
  var allowLegacySDLEmptyFields: js.UndefOr[Boolean] = js.undefined
  /**
    * If enabled, the parser will parse implemented interfaces with no `&`
    * character between each interface. Otherwise, the parser will follow the
    * current specification.
    *
    * This option is provided to ease adoption of the final SDL specification
    * and will be removed in v16.
    */
  var allowLegacySDLImplementsInterfaces: js.UndefOr[Boolean] = js.undefined
  /**
    * EXPERIMENTAL:
    *
    * If enabled, the parser will understand and parse variable definitions
    * contained in a fragment definition. They'll be represented in the
    * `variableDefinitions` field of the FragmentDefinitionNode.
    *
    * The syntax is identical to normal, query-defined variables. For example:
    *
    *   fragment A($var: Boolean = false) on T  {
    *     ...
    *   }
    *
    * Note: this feature is experimental and may change or be removed in the
    * future.
    */
  var experimentalFragmentVariables: js.UndefOr[Boolean] = js.undefined
  /**
    * By default, the parser creates AST nodes that know the location
    * in the source that they correspond to. This configuration flag
    * disables that behavior for performance or testing.
    */
  var noLocation: js.UndefOr[Boolean] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(
    allowLegacySDLEmptyFields: js.UndefOr[Boolean] = js.undefined,
    allowLegacySDLImplementsInterfaces: js.UndefOr[Boolean] = js.undefined,
    experimentalFragmentVariables: js.UndefOr[Boolean] = js.undefined,
    noLocation: js.UndefOr[Boolean] = js.undefined
  ): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowLegacySDLEmptyFields)) __obj.updateDynamic("allowLegacySDLEmptyFields")(allowLegacySDLEmptyFields.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowLegacySDLImplementsInterfaces)) __obj.updateDynamic("allowLegacySDLImplementsInterfaces")(allowLegacySDLImplementsInterfaces.get.asInstanceOf[js.Any])
    if (!js.isUndefined(experimentalFragmentVariables)) __obj.updateDynamic("experimentalFragmentVariables")(experimentalFragmentVariables.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noLocation)) __obj.updateDynamic("noLocation")(noLocation.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions]
  }
}

