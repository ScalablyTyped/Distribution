package typings.libp2pCrypto.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Keystretcher extends js.Object {
  
  def apply(res: Uint8Array): Keystretcher = js.native
  
  var cipherKey: Uint8Array = js.native
  
  var iv: Uint8Array = js.native
  
  var macKey: Uint8Array = js.native
}
