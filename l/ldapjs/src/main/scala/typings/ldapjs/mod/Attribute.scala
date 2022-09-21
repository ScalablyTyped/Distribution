package typings.ldapjs.mod

import typings.ldapjs.anon.Type
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ldapjs", "Attribute")
@js.native
open class Attribute () extends StObject {
  def this(options: Type) = this()
  
  val buffers: js.Array[Buffer] = js.native
  
  val json: AttributeJson = js.native
  
  val `type`: String = js.native
  
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
  
  @JSImport("ldapjs", "Attribute")
  @js.native
  val ^ : js.Any = js.native
  
  inline def compare(a: Attribute, b: Attribute): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isAttribute(`object`: Any): /* is ldapjs.ldapjs.Attribute */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAttribute")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is ldapjs.ldapjs.Attribute */ Boolean]
}
