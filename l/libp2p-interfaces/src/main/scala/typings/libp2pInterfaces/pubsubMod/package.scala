package typings.libp2pInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object pubsubMod {
  
  type PeerId = typings.peerId.mod.^
  
  /**
    * Topic validator function
    */
  type validator = js.Function2[
    /* arg0 */ java.lang.String, 
    /* arg1 */ typings.libp2pInterfaces.pubsubMod.InMessage, 
    js.Promise[scala.Unit]
  ]
}
