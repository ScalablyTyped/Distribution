package typings
package atIarnaTomlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@iarna/toml", JSImport.Namespace)
@js.native
object tomlMod extends js.Object {
  def parse(str: java.lang.String): stdLib.Record[java.lang.String, _] = js.native
  def stringify(obj: stdLib.Record[java.lang.String, _]): java.lang.String = js.native
  @JSName("stringify")
  @js.native
  object stringifyNs extends js.Object {
    /** Serialize a value as TOML would. This is a fragment and not a complete valid TOML document. */
    def value(v: js.Any): java.lang.String = js.native
  }
  
}

