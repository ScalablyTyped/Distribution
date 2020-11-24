package typings.hex2dec

import typings.hex2dec.anon.Prefix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hex2dec", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def decToHex(decStr: String): String = js.native
  def decToHex(decStr: String, opts: Prefix): String = js.native
  
  def hexToDec(hexStr: String): String = js.native
}
