package typings.atLedgerhqHwDashTransportDashU2f

import typings.atLedgerhqHwDashTransportDashU2f.atLedgerhqHwDashTransportDashU2fMod.TransportU2F
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ledgerhq/hw-transport-u2f", JSImport.Namespace)
@js.native
object atLedgerhqHwDashTransportDashU2fMod extends js.Object {
  @js.native
  class default ()
    extends typings.atLedgerhqHwDashTransport.atLedgerhqHwDashTransportMod.default[String]
  
  /* static members */
  @js.native
  object default extends js.Object {
    def open(`_`: js.Any): js.Promise[TransportU2F] = js.native
    def open(`_`: js.Any, _openTimeout: Double): js.Promise[TransportU2F] = js.native
  }
  
  type TransportU2F = typings.atLedgerhqHwDashTransport.atLedgerhqHwDashTransportMod.default[String]
}

