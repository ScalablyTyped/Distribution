package typings.jsMd5.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait md5 extends js.Object {
  
  def apply(message: message): String = js.native
  
  def array(message: message): js.Array[Double] = js.native
  
  def arrayBuffer(message: message): ArrayBuffer = js.native
  
  def base64(message: message): String = js.native
  
  def buffer(message: message): ArrayBuffer = js.native
  
  def create(): Md5_ = js.native
  
  def digest(message: message): js.Array[Double] = js.native
  
  def hex(message: message): String = js.native
  
  def update(message: message): Md5_ = js.native
}
