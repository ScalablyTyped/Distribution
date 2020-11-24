package typings.hapiHawk.cryptoMod

import typings.hapiHawk.clientMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@hapi/hawk/lib/crypto", "timestampMessage")
@js.native
object timestampMessage extends js.Object {
  
  def apply(credentials: Credentials, localtimeOffsetMsec: Double): TimestampMessage_ = js.native
}
