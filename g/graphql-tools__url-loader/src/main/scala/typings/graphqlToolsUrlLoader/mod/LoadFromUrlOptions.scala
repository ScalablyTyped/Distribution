package typings.graphqlToolsUrlLoader.mod

import typings.graphqlToolsUrlLoader.anon.Typeofw3cwebsocket
import typings.graphqlToolsUrlLoader.graphqlToolsUrlLoaderStrings.GET
import typings.graphqlToolsUrlLoader.graphqlToolsUrlLoaderStrings.POST
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @graphql-tools/utils.@graphql-tools/utils.SingleFileOptions */
/* Inlined parent std.Partial<graphql.graphql.IntrospectionOptions> */
@js.native
trait LoadFromUrlOptions extends js.Object {
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
    * When building a schema from a GraphQL service's introspection result, it
    * might be safe to assume the schema is valid. Set to true to assume the
    * produced schema is valid.
    *
    * Default: false
    */
  var assumeValid: js.UndefOr[Boolean] = js.native
  /**
    * Set to true to assume the SDL is valid.
    *
    * Default: false
    */
  var assumeValidSDL: js.UndefOr[Boolean] = js.native
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
    * A custom `fetch` implementation to use when querying the original schema.
    * Defaults to `cross-fetch`
    */
  var customFetch: js.UndefOr[FetchFn | String] = js.native
  var cwd: js.UndefOr[String] = js.native
  var descriptions: js.UndefOr[Boolean] = js.native
  var directiveIsRepeatable: js.UndefOr[Boolean] = js.native
  /**
    * Whether to enable subscriptions on the loaded schema
    */
  var enableSubscriptions: js.UndefOr[Boolean] = js.native
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
  /**
    * Additional headers to include when querying the original schema
    */
  var headers: js.UndefOr[Headers] = js.native
  /**
    * HTTP method to use when querying the original schema.
    */
  var method: js.UndefOr[GET | POST] = js.native
  /**
    * By default, the parser creates AST nodes that know the location
    * in the source that they correspond to. This configuration flag
    * disables that behavior for performance or testing.
    */
  var noLocation: js.UndefOr[Boolean] = js.native
  var schemaDescription: js.UndefOr[Boolean] = js.native
  var specifiedByUrl: js.UndefOr[Boolean] = js.native
  /**
    * Whether to use the GET HTTP method for queries when querying the original schema
    */
  var useGETForQueries: js.UndefOr[Boolean] = js.native
  /**
    * Custom WebSocket implementation used by the loaded schema if subscriptions
    * are enabled
    */
  var webSocketImpl: js.UndefOr[Typeofw3cwebsocket | String] = js.native
}

object LoadFromUrlOptions {
  @scala.inline
  def apply(): LoadFromUrlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadFromUrlOptions]
  }
  @scala.inline
  implicit class LoadFromUrlOptionsOps[Self <: LoadFromUrlOptions] (val x: Self) extends AnyVal {
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
    def setAssumeValid(value: Boolean): Self = this.set("assumeValid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssumeValid: Self = this.set("assumeValid", js.undefined)
    @scala.inline
    def setAssumeValidSDL(value: Boolean): Self = this.set("assumeValidSDL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssumeValidSDL: Self = this.set("assumeValidSDL", js.undefined)
    @scala.inline
    def setCommentDescriptions(value: Boolean): Self = this.set("commentDescriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommentDescriptions: Self = this.set("commentDescriptions", js.undefined)
    @scala.inline
    def setCustomFetch(value: FetchFn | String): Self = this.set("customFetch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomFetch: Self = this.set("customFetch", js.undefined)
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setDescriptions(value: Boolean): Self = this.set("descriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescriptions: Self = this.set("descriptions", js.undefined)
    @scala.inline
    def setDirectiveIsRepeatable(value: Boolean): Self = this.set("directiveIsRepeatable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectiveIsRepeatable: Self = this.set("directiveIsRepeatable", js.undefined)
    @scala.inline
    def setEnableSubscriptions(value: Boolean): Self = this.set("enableSubscriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableSubscriptions: Self = this.set("enableSubscriptions", js.undefined)
    @scala.inline
    def setExperimentalFragmentVariables(value: Boolean): Self = this.set("experimentalFragmentVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExperimentalFragmentVariables: Self = this.set("experimentalFragmentVariables", js.undefined)
    @scala.inline
    def setHeadersVarargs(value: (Record[String, String])*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setMethod(value: GET | POST): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setNoLocation(value: Boolean): Self = this.set("noLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoLocation: Self = this.set("noLocation", js.undefined)
    @scala.inline
    def setSchemaDescription(value: Boolean): Self = this.set("schemaDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaDescription: Self = this.set("schemaDescription", js.undefined)
    @scala.inline
    def setSpecifiedByUrl(value: Boolean): Self = this.set("specifiedByUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpecifiedByUrl: Self = this.set("specifiedByUrl", js.undefined)
    @scala.inline
    def setUseGETForQueries(value: Boolean): Self = this.set("useGETForQueries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseGETForQueries: Self = this.set("useGETForQueries", js.undefined)
    @scala.inline
    def setWebSocketImpl(value: Typeofw3cwebsocket | String): Self = this.set("webSocketImpl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebSocketImpl: Self = this.set("webSocketImpl", js.undefined)
  }
  
}

