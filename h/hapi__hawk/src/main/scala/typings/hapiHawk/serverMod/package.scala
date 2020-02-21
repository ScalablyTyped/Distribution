package typings.hapiHawk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object serverMod {
  type AuthenticateBewitOptions = typings.std.Pick[
    typings.hapiHawk.serverMod.AuthenticateOptions, 
    typings.hapiHawk.hapiHawkStrings.hostHeaderName | typings.hapiHawk.hapiHawkStrings.localtimeOffsetMsec | typings.hapiHawk.hapiHawkStrings.host | typings.hapiHawk.hapiHawkStrings.port
  ]
  type AuthenticateMessageOptions = typings.std.Pick[
    typings.hapiHawk.serverMod.AuthenticateOptions, 
    typings.hapiHawk.hapiHawkStrings.nonceFunc | typings.hapiHawk.hapiHawkStrings.timestampSkewSec | typings.hapiHawk.hapiHawkStrings.localtimeOffsetMsec
  ]
  type CredentialsFunc = js.Function1[
    /* id */ java.lang.String, 
    js.Promise[typings.hapiHawk.serverMod.Credentials] | typings.hapiHawk.serverMod.Credentials
  ]
  type NonceFunc = js.Function3[
    /* key */ java.lang.String, 
    /* nonce */ java.lang.String, 
    /* ts */ java.lang.String, 
    js.Promise[scala.Unit] | scala.Unit
  ]
}
