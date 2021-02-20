package typings.ldapjs.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ldapjs", "Attribute")
@js.native
class Attribute () extends StObject {
  
  val buffers: js.Array[Buffer] = js.native
  
  val json: AttributeJson = js.native
  
  var `type`: String = js.native
  
  /**
    *  Array of string values, binaries are represented in base64.
    *  get: When reading it always returns an array of strings.
    *  set: When assigning it accepts either an array or a single value.
    *       `Buffer`s are assigned directly, any other value is converted to string and loaded into a `Buffer`.
    */
  var vals: String | js.Array[String] = js.native
}
/* static members */
object Attribute {
  
  @JSImport("ldapjs", "Attribute.compare")
  @js.native
  def compare(a: Attribute, b: Attribute): Double = js.native
  
  @JSImport("ldapjs", "Attribute.isAttribute")
  @js.native
  def isAttribute(`object`: js.Any): /* is ldapjs.ldapjs.Attribute */ Boolean = js.native
}
