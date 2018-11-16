package typings
package atIarnaTomlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@iarna/toml/stringify", JSImport.Namespace)
@js.native
object stringifyMod extends js.Object {
  def apply(obj: stdLib.Record[java.lang.String, _]): java.lang.String = js.native
  /** Serialize a value as TOML would. This is a fragment and not a complete valid TOML document. */
  def value(v: js.Any): java.lang.String = js.native
}

