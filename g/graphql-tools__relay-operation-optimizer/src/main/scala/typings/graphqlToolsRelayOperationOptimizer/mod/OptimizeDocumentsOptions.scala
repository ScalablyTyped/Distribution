package typings.graphqlToolsRelayOperationOptimizer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @graphql-tools/utils.@graphql-tools/utils.SchemaPrintOptions & graphql.graphql.ParseOptions & {  includeFragments :boolean | undefined} */
@js.native
trait OptimizeDocumentsOptions extends js.Object {
  /**
    * If enabled, the parser will parse empty fields sets in the Schema
    * Definition Language. Otherwise, the parser will follow the current
    * specification.
    *
    * This option is provided to ease adoption of the final SDL specification
    * and will be removed in v16.
    */
  var allowLegacySDLEmptyFields: js.UndefOr[Boolean] = js.native
  /**
    * If enabled, the parser will parse implemented interfaces with no `&`
    * character between each interface. Otherwise, the parser will follow the
    * current specification.
    *
    * This option is provided to ease adoption of the final SDL specification
    * and will be removed in v16.
    */
  var allowLegacySDLImplementsInterfaces: js.UndefOr[Boolean] = js.native
  /**
    * Descriptions are defined as preceding string literals, however an older
    * experimental version of the SDL supported preceding comments as
    * descriptions. Set to true to enable this deprecated behavior.
    * This option is provided to ease adoption and will be removed in v16.
    *
    * Default: false
    */
  var commentDescriptions: js.UndefOr[Boolean] = js.native
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
  var experimentalFragmentVariables: js.UndefOr[Boolean] = js.native
  var includeFragments: js.UndefOr[Boolean] = js.native
  /**
    * By default, the parser creates AST nodes that know the location
    * in the source that they correspond to. This configuration flag
    * disables that behavior for performance or testing.
    */
  var noLocation: js.UndefOr[Boolean] = js.native
}

object OptimizeDocumentsOptions {
  @scala.inline
  def apply(): OptimizeDocumentsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptimizeDocumentsOptions]
  }
  @scala.inline
  implicit class OptimizeDocumentsOptionsOps[Self <: OptimizeDocumentsOptions] (val x: Self) extends AnyVal {
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
    def setAllowLegacySDLEmptyFields(value: Boolean): Self = this.set("allowLegacySDLEmptyFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowLegacySDLEmptyFields: Self = this.set("allowLegacySDLEmptyFields", js.undefined)
    @scala.inline
    def setAllowLegacySDLImplementsInterfaces(value: Boolean): Self = this.set("allowLegacySDLImplementsInterfaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowLegacySDLImplementsInterfaces: Self = this.set("allowLegacySDLImplementsInterfaces", js.undefined)
    @scala.inline
    def setCommentDescriptions(value: Boolean): Self = this.set("commentDescriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommentDescriptions: Self = this.set("commentDescriptions", js.undefined)
    @scala.inline
    def setExperimentalFragmentVariables(value: Boolean): Self = this.set("experimentalFragmentVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExperimentalFragmentVariables: Self = this.set("experimentalFragmentVariables", js.undefined)
    @scala.inline
    def setIncludeFragments(value: Boolean): Self = this.set("includeFragments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeFragments: Self = this.set("includeFragments", js.undefined)
    @scala.inline
    def setNoLocation(value: Boolean): Self = this.set("noLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoLocation: Self = this.set("noLocation", js.undefined)
  }
  
}

