package typings.libp2pCrypto

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait GenSharedKey extends StObject {
    
    def genSharedKey(theirPub: Uint8Array): js.Promise[Uint8Array] = js.native
    def genSharedKey(theirPub: Uint8Array, forcePrivate: js.Any): js.Promise[Uint8Array] = js.native
    
    var key: Uint8Array = js.native
  }
}
