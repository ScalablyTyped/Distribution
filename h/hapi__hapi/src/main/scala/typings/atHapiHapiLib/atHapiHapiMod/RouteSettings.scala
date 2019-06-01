package typings
package atHapiHapiLib.atHapiHapiMod

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
    cache: atHapiHapiLib.atHapiHapiLibNumbers.`false` | RouteOptionsCache = null,
    compression: atHapiHapiLib.atHapiHapiMod.UtilNs.Dictionary[RouteCompressionEncoderSettings] = null,
    cors: scala.Boolean | RouteOptionsCors = null,
    description: java.lang.String = null,
    ext: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in @hapi/hapi.@hapi/hapi.RouteRequestExtType ]:? @hapi/hapi.@hapi/hapi.RouteExtObject | std.Array<@hapi/hapi.@hapi/hapi.RouteExtObject>}
    */ atHapiHapiLib.atHapiHapiLibStrings.CommonRouteProperties with js.Any = null,
    files: atHapiHapiLib.Anon_RelativeTo = null,
    handler: atHapiHapiLib.atHapiHapiMod.LifecycleNs.Method | js.Object = null,
    id: java.lang.String = null,
    isInternal: js.UndefOr[scala.Boolean] = js.undefined,
    json: atHapiHapiLib.atHapiHapiMod.JsonNs.StringifyArguments = null,
    jsonp: java.lang.String = null,
    log: atHapiHapiLib.Anon_Collect = null,
    notes: java.lang.String | js.Array[java.lang.String] = null,
    payload: RouteOptionsPayload = null,
    plugins: PluginSpecificConfiguration = null,
    pre: RouteOptionsPreArray = null,
    response: RouteOptionsResponse = null,
    security: RouteOptionsSecure = null,
    state: atHapiHapiLib.Anon_FailAction = null,
    tags: js.Array[java.lang.String] = null,
    timeout: atHapiHapiLib.Anon_Server = null,
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

