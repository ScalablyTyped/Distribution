package typings.libp2pInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object peerStreamsMod {
  
  type PeerId = typings.peerId.mod.^
  
  type Sink = js.Function1[/* source */ typings.std.Uint8Array, js.Promise[typings.std.Uint8Array]]
}
