package typings.hashJs

import typings.hashJs.hashJsStrings.hex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageDigest[T] extends StObject {
  
  var blockSize: Double = js.native
  
  def digest(): js.Array[Double] = js.native
  @JSName("digest")
  def digest_hex(enc: hex): String = js.native
  
  var outSize: Double = js.native
  
  def update(msg: Any): T = js.native
  @JSName("update")
  def update_hex(msg: Any, enc: hex): T = js.native
}
