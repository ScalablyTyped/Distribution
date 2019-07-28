package typings.hapi.hapiMod

import typings.hapi.Anon_Artifacts
import typings.node.Buffer
import typings.node.streamMod.Stream
import typings.shot.shotMod.Headers
import typings.shot.shotMod.RequestOptions
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
  var app: js.UndefOr[ApplicationState] = js.undefined
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
    app: ApplicationState = null,
    auth: Anon_Artifacts = null,
    authority: String = null,
    headers: Headers = null,
    method: String = null,
    payload: String | Buffer | Stream | js.Object = null,
    plugins: PluginsStates = null,
    remoteAddress: String = null,
    simulate: typings.shot.Anon_Close = null,
    validate: js.UndefOr[Boolean] = js.undefined
  ): ServerInjectOptions = {
    val __obj = js.Dynamic.literal(url = url)
    if (!js.isUndefined(allowInternals)) __obj.updateDynamic("allowInternals")(allowInternals)
    if (app != null) __obj.updateDynamic("app")(app)
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (authority != null) __obj.updateDynamic("authority")(authority)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (remoteAddress != null) __obj.updateDynamic("remoteAddress")(remoteAddress)
    if (simulate != null) __obj.updateDynamic("simulate")(simulate)
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[ServerInjectOptions]
  }
}

