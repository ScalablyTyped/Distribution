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

trait RouteSettings extends CommonRouteProperties {
  var auth: js.UndefOr[AuthSettings] = js.undefined
}

object RouteSettings {
  @scala.inline
  def apply(
    auth: AuthSettings = null,
    bind: js.Object = null,
    cache: `false` | RouteOptionsCache = null,
    compression: Dictionary[RouteCompressionEncoderSettings] = null,
    cors: Boolean | RouteOptionsCors = null,
    description: String = null,
    ext: /* import warning: ImportType.apply c Unsupported type mapping: 
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
  ): RouteSettings = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (bind != null) __obj.updateDynamic("bind")(bind)
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression)
    if (cors != null) __obj.updateDynamic("cors")(cors.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (ext != null) __obj.updateDynamic("ext")(ext)
    if (files != null) __obj.updateDynamic("files")(files)
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isInternal)) __obj.updateDynamic("isInternal")(isInternal)
    if (json != null) __obj.updateDynamic("json")(json)
    if (jsonp != null) __obj.updateDynamic("jsonp")(jsonp)
    if (log != null) __obj.updateDynamic("log")(log)
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (pre != null) __obj.updateDynamic("pre")(pre)
    if (response != null) __obj.updateDynamic("response")(response)
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    if (validate != null) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[RouteSettings]
  }
}

