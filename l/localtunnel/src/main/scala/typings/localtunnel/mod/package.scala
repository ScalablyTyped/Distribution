package typings.localtunnel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type TunnelCallback = js.Function2[
    /* err */ java.lang.String, 
    /* tunnel */ js.UndefOr[typings.localtunnel.mod.Tunnel], 
    scala.Unit
  ]
}
