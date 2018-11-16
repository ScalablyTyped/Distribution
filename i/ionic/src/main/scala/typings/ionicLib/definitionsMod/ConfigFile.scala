package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConfigFile extends js.Object {
  var `features.ssl-commands`: js.UndefOr[scala.Boolean] = js.undefined
  var `git.host`: js.UndefOr[java.lang.String] = js.undefined
  var `git.port`: js.UndefOr[scala.Double] = js.undefined
  var `git.setup`: js.UndefOr[scala.Boolean] = js.undefined
  var interactive: js.UndefOr[scala.Boolean] = js.undefined
  var npmClient: NpmClient
  var proxy: js.UndefOr[java.lang.String] = js.undefined
  var `ssl.cafile`: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var `ssl.certfile`: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var `ssl.keyfile`: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var telemetry: scala.Boolean
  var `tokens.telemetry`: js.UndefOr[java.lang.String] = js.undefined
  var `tokens.user`: js.UndefOr[java.lang.String] = js.undefined
  var `urls.api`: js.UndefOr[java.lang.String] = js.undefined
  var `urls.dash`: js.UndefOr[java.lang.String] = js.undefined
  var `user.email`: js.UndefOr[java.lang.String] = js.undefined
  var `user.id`: js.UndefOr[scala.Double] = js.undefined
  var version: java.lang.String
}

