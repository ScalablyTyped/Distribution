package typings.kdbxweb.mod

import typings.std.ArrayBuffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "KdbxUuid")
@js.native
class KdbxUuid protected () extends StObject {
  def this(ab: String) = this()
  def this(ab: ArrayBuffer) = this()
  
  var empty: Boolean = js.native
  
  def equals(other: KdbxUuid): Boolean = js.native
  
  var id: js.UndefOr[String] = js.native
  
  def toBytes(): js.UndefOr[Uint8Array] = js.native
}
/* static members */
object KdbxUuid {
  
  @JSImport("kdbxweb", "KdbxUuid.random")
  @js.native
  def random(): KdbxUuid = js.native
}
