package typings
package koaDashStaticLib.koaDashStaticMod.serveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options
  extends koaDashSendLib.koaDashSendMod.sendNs.SendOptions {
  /** If true, serves after return next(), allowing any downstream middleware to respond first. */
  var defer: js.UndefOr[scala.Boolean] = js.undefined
}

