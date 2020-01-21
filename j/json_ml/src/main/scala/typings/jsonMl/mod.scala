package typings.jsonMl

import typings.cheerio.Cheerio_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json_ml", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def parse(xml: String): js.Array[Node] = js.native
  def parse(xml: String, trim: Boolean): js.Array[Node] = js.native
  def stringify(`object`: js.Array[Node]): String = js.native
  def stringify(`object`: js.Array[Node], replacer: js.Function1[/* node */ Cheerio_, _]): String = js.native
  def stringify(`object`: js.Array[Node], replacer: js.Function1[/* node */ Cheerio_, _], indent: Double): String = js.native
  def stringify(`object`: js.Array[Node], replacer: Null, indent: Double): String = js.native
  type Node = String | (js.Array[String | js.Any])
}

