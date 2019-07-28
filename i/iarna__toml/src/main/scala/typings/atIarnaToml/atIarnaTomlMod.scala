package typings.atIarnaToml

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@iarna/toml", JSImport.Namespace)
@js.native
object atIarnaTomlMod extends js.Object {
  def parse(str: String): Record[String, _] = js.native
  def stringify(obj: Record[String, _]): String = js.native
  @JSName("stringify")
  @js.native
  object stringifyNs extends js.Object {
    /** Serialize a value as TOML would. This is a fragment and not a complete valid TOML document. */
    def value(v: js.Any): String = js.native
  }
  
}

