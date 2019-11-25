package typings.atHapiHapi.atHapiHapiMod

import typings.atHapiHapi.Anon_Artifacts
import typings.atHapiShot.atHapiShotMod.Headers
import typings.atHapiShot.atHapiShotMod.RequestOptions
import typings.node.Buffer
import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerInjectOptions extends RequestOptions {
  /**
    * allows access to routes with config.isInternal set to true. Defaults to false.
    */
  var allowInternals: js.UndefOr[Boolean] = js.undefined
  /**
    * sets the initial value of request.app, defaults to {}.
    */
  var app: js.UndefOr[RequestApplicationState] = js.undefined
  /**
    * Authentication bypass options.
    */
  var auth: js.UndefOr[Anon_Artifacts] = js.undefined
  /**
    * sets the initial value of request.plugins, defaults to {}.
    */
  var plugins: js.UndefOr[PluginsStates] = js.undefined
}

object ServerInjectOptions {
  @scala.inline
  def apply(
    url: String,
    allowInternals: js.UndefOr[Boolean] = js.undefined,
    app: RequestApplicationState = null,
    auth: Anon_Artifacts = null,
    authority: String = null,
    headers: Headers = null,
    method: String = null,
    payload: String | Buffer | Stream | js.Object = null,
    plugins: PluginsStates = null,
    remoteAddress: String = null,
    simulate: typings.atHapiShot.Anon_Close = null,
    validate: js.UndefOr[Boolean] = js.undefined
  ): ServerInjectOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(allowInternals)) __obj.updateDynamic("allowInternals")(allowInternals.asInstanceOf[js.Any])
    if (app != null) __obj.updateDynamic("app")(app.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (authority != null) __obj.updateDynamic("authority")(authority.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (remoteAddress != null) __obj.updateDynamic("remoteAddress")(remoteAddress.asInstanceOf[js.Any])
    if (simulate != null) __obj.updateDynamic("simulate")(simulate.asInstanceOf[js.Any])
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerInjectOptions]
  }
}

