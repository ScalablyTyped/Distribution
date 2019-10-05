package typings.jsonUnderscoreMl

import typings.cheerio.Cheerio
import typings.jsonUnderscoreMl.jsonUnderscoreMlMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json_ml", JSImport.Namespace)
@js.native
object jsonUnderscoreMlMod extends js.Object {
  def parse(xml: String): js.Array[Node] = js.native
  def parse(xml: String, trim: Boolean): js.Array[Node] = js.native
  def stringify(`object`: js.Array[Node]): String = js.native
  def stringify(`object`: js.Array[Node], replacer: js.Function1[/* node */ Cheerio, _]): String = js.native
  def stringify(`object`: js.Array[Node], replacer: js.Function1[/* node */ Cheerio, _], indent: Double): String = js.native
  def stringify(`object`: js.Array[Node], replacer: Null, indent: Double): String = js.native
  type Node = String | (js.Array[String | js.Any])
}

