package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerInjectOptions
  extends shotLib.shotMod.RequestOptions {
  /**
    * allows access to routes with config.isInternal set to true. Defaults to false.
    */
  var allowInternals: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * sets the initial value of request.app, defaults to {}.
    */
  var app: js.UndefOr[ApplicationState] = js.undefined
  /**
    * (an artifacts object containing authentication artifact information. The artifacts are used to bypass the default authentication strategies, and are validated directly as if they were received
    * via an authentication scheme. Ignored if set without credentials. Defaults to no artifacts.
    */
  var artifacts: js.UndefOr[js.Object] = js.undefined
  /**
    * an credentials object containing authentication information. The credentials are used to bypass the default authentication strategies, and are validated directly as if they were received via
    * an authentication scheme. Defaults to no credentials.
    */
  var credentials: js.UndefOr[AuthCredentials] = js.undefined
  /**
    * sets the initial value of request.plugins, defaults to {}.
    */
  var plugins: js.UndefOr[PluginsStates] = js.undefined
}

