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
    * Authentication bypass options.
    */
  var auth: js.UndefOr[hapiLib.Anon_Artifacts] = js.undefined
  /**
    * sets the initial value of request.plugins, defaults to {}.
    */
  var plugins: js.UndefOr[PluginsStates] = js.undefined
}

