package typings.ieee754

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ieee754", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def read(buffer: Uint8Array, offset: Double, isLE: Boolean, mLen: Double, nBytes: Double): Double = js.native
  
  def write(buffer: Uint8Array, value: Double, offset: Double, isLE: Boolean, mLen: Double, nBytes: Double): Unit = js.native
}
