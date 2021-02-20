package typings.kdbxweb.mod

import typings.std.ArrayBuffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "ProtectedValue")
@js.native
class ProtectedValue protected () extends StObject {
  def this(value: ArrayBuffer, salt: ArrayBuffer) = this()
  
  def getBinary(): Uint8Array = js.native
  
  def getHash(): js.Promise[ArrayBuffer] = js.native
  
  def getText(): String = js.native
  
  def includes(str: String): Boolean = js.native
  
  def setSalt(newSalt: ArrayBuffer): Unit = js.native
}
/* static members */
object ProtectedValue {
  
  @JSImport("kdbxweb", "ProtectedValue.fromBinary")
  @js.native
  def fromBinary(binary: ArrayBuffer): ProtectedValue = js.native
  
  @JSImport("kdbxweb", "ProtectedValue.fromString")
  @js.native
  def fromString(str: String): ProtectedValue = js.native
}
