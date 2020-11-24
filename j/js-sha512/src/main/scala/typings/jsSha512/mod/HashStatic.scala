package typings.jsSha512.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HashStatic extends js.Object {
  
  def apply(messageToHash: String): String = js.native
  
  def array(messageToHash: String): js.Array[Double] = js.native
  
  def arrayBuffer(messageToHash: String): ArrayBuffer = js.native
  
  def create(): Hash = js.native
  
  def digest(messageToHash: String): js.Array[Double] = js.native
  
  def hex(messageToHash: String): String = js.native
  
  def hmac(key: String, messageToHash: String): String = js.native
  @JSName("hmac")
  var hmac_Original: HmacStatic = js.native
  
  def update(messageToHash: String): Hash = js.native
}
