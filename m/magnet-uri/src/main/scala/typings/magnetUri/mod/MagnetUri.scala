package typings.magnetUri.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MagnetUri extends js.Object {
  
  def apply(uri: String): Instance = js.native
  
  def decode(uri: String): Instance = js.native
  
  def encode(parsed: Instance): String = js.native
}
