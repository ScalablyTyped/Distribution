package typings.graphqlToolsUtils.loadersMod

import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql.ParseOptions & graphql.graphql/type/schema.GraphQLSchemaValidationOptions & graphql.graphql.BuildSchemaOptions & {  cwd ? :string} */
trait SingleFileOptions extends js.Object {
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
    * If provided, the schema will consider fields or types with names included
    * in this list valid, even if they do not adhere to the specification's
    * schema validation rules.
    *
    * This option is provided to ease adoption and will be removed in v15.
    */
  var allowedLegacyNames: js.UndefOr[Maybe[js.Array[String]]] = js.undefined
  /**
    * When building a schema from a GraphQL service's introspection result, it
    * might be safe to assume the schema is valid. Set to true to assume the
    * produced schema is valid.
    *
    * Default: false
    */
  var assumeValid: js.UndefOr[Boolean] = js.undefined
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
  var cwd: js.UndefOr[String] = js.undefined
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

object SingleFileOptions {
  @scala.inline
  def apply(
    allowLegacySDLEmptyFields: js.UndefOr[Boolean] = js.undefined,
    allowLegacySDLImplementsInterfaces: js.UndefOr[Boolean] = js.undefined,
    allowedLegacyNames: js.UndefOr[Null | Maybe[js.Array[String]]] = js.undefined,
    assumeValid: js.UndefOr[Boolean] = js.undefined,
    assumeValidSDL: js.UndefOr[Boolean] = js.undefined,
    commentDescriptions: js.UndefOr[Boolean] = js.undefined,
    cwd: String = null,
    experimentalFragmentVariables: js.UndefOr[Boolean] = js.undefined,
    noLocation: js.UndefOr[Boolean] = js.undefined
  ): SingleFileOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowLegacySDLEmptyFields)) __obj.updateDynamic("allowLegacySDLEmptyFields")(allowLegacySDLEmptyFields.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowLegacySDLImplementsInterfaces)) __obj.updateDynamic("allowLegacySDLImplementsInterfaces")(allowLegacySDLImplementsInterfaces.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowedLegacyNames)) __obj.updateDynamic("allowedLegacyNames")(allowedLegacyNames.asInstanceOf[js.Any])
    if (!js.isUndefined(assumeValid)) __obj.updateDynamic("assumeValid")(assumeValid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(assumeValidSDL)) __obj.updateDynamic("assumeValidSDL")(assumeValidSDL.get.asInstanceOf[js.Any])
    if (!js.isUndefined(commentDescriptions)) __obj.updateDynamic("commentDescriptions")(commentDescriptions.get.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (!js.isUndefined(experimentalFragmentVariables)) __obj.updateDynamic("experimentalFragmentVariables")(experimentalFragmentVariables.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noLocation)) __obj.updateDynamic("noLocation")(noLocation.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleFileOptions]
  }
}

