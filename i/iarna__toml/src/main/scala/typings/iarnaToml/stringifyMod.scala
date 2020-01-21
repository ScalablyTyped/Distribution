package typings.iarnaToml

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@iarna/toml/stringify", JSImport.Namespace)
@js.native
object stringifyMod extends js.Object {
  def apply(obj: Record[String, _]): String = js.native
  /** Serialize a value as TOML would. This is a fragment and not a complete valid TOML document. */
  def value(v: js.Any): String = js.native
}

