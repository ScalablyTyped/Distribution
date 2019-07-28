package typings.localtunnel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object localtunnelMod {
  type TunnelCallback = js.Function2[/* err */ String, /* tunnel */ js.UndefOr[Tunnel], Unit]
}
