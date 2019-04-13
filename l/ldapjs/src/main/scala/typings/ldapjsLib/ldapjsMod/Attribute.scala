package typings
package ldapjsLib.ldapjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ldapjs", "Attribute")
@js.native
class Attribute () extends js.Object {
  val buffers: js.Array[nodeLib.Buffer] = js.native
  val json: AttributeJson = js.native
  var `type`: java.lang.String = js.native
  /**
    *  Array of string values, binaries are represented in base64.
    *  get: When reading it always returns an array of strings.
    *  set: When assigning it accepts either an array or a single value.
    *       `Buffer`s are assigned directly, any other value is converted to string and loaded into a `Buffer`.
    */
  var vals: java.lang.String | js.Array[java.lang.String] = js.native
}

/* static members */
@JSImport("ldapjs", "Attribute")
@js.native
object Attribute extends js.Object {
  def compare(a: ldapjsLib.ldapjsMod.Attribute, b: ldapjsLib.ldapjsMod.Attribute): scala.Double = js.native
  def isAttribute(`object`: js.Any): /* is ldapjs.ldapjs.Attribute */ scala.Boolean = js.native
}

