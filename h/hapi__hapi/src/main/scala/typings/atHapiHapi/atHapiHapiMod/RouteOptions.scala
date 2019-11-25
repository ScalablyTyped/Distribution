package typings.atHapiHapi.atHapiHapiMod

import typings.atHapiHapi.Anon_Collect
import typings.atHapiHapi.Anon_FailAction
import typings.atHapiHapi.Anon_RelativeTo
import typings.atHapiHapi.Anon_Server
import typings.atHapiHapi.atHapiHapiMod.Json.StringifyArguments
import typings.atHapiHapi.atHapiHapiMod.Lifecycle.Method
import typings.atHapiHapi.atHapiHapiMod.Util.Dictionary
import typings.atHapiHapi.atHapiHapiNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteOptions extends CommonRouteProperties {
  /**
    * Application-specific route configuration state. Should not be used by plugins which should use options.plugins[name] instead.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsapp)
    */
  var app: js.UndefOr[RouteOptionsApp] = js.undefined
  /**
    * Route authentication configuration. Value can be:
    * false to disable authentication if a default strategy is set.
    * a string with the name of an authentication strategy registered with server.auth.strategy(). The strategy will be set to 'required' mode.
    * an authentication configuration object.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsapp)
    */
  var auth: js.UndefOr[`false` | String | RouteOptionsAccess] = js.undefined
}

object RouteOptions {
  @scala.inline
  def apply(
    app: RouteOptionsApp = null,
    auth: `false` | String | RouteOptionsAccess = null,
    bind: js.Object = null,
    cache: `false` | RouteOptionsCache = null,
    compression: Dictionary[RouteCompressionEncoderSettings] = null,
    cors: Boolean | RouteOptionsCors = null,
    description: String = null,
    ext: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in @hapi/hapi.@hapi/hapi.RouteRequestExtType ]:? @hapi/hapi.@hapi/hapi.RouteExtObject | std.Array<@hapi/hapi.@hapi/hapi.RouteExtObject>}
    */ typings.atHapiHapi.atHapiHapiStrings.CommonRouteProperties with js.Any = null,
    files: Anon_RelativeTo = null,
    handler: Method | js.Object = null,
    id: String = null,
    isInternal: js.UndefOr[Boolean] = js.undefined,
    json: StringifyArguments = null,
    jsonp: String = null,
    log: Anon_Collect = null,
    notes: String | js.Array[String] = null,
    payload: RouteOptionsPayload = null,
    plugins: PluginSpecificConfiguration = null,
    pre: RouteOptionsPreArray = null,
    response: RouteOptionsResponse = null,
    security: RouteOptionsSecure = null,
    state: Anon_FailAction = null,
    tags: js.Array[String] = null,
    timeout: Anon_Server = null,
    validate: RouteOptionsValidate = null
  ): RouteOptions = {
    val __obj = js.Dynamic.literal()
    if (app != null) __obj.updateDynamic("app")(app.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (bind != null) __obj.updateDynamic("bind")(bind.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (cors != null) __obj.updateDynamic("cors")(cors.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isInternal)) __obj.updateDynamic("isInternal")(isInternal.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (jsonp != null) __obj.updateDynamic("jsonp")(jsonp.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (pre != null) __obj.updateDynamic("pre")(pre.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteOptions]
  }
}

