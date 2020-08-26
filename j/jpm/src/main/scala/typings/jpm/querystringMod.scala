package typings.jpm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sdk/querystring", JSImport.Namespace)
@js.native
object querystringMod extends js.Object {
  def escape(query: String): String = js.native
  def parse(querystring: String): js.Object = js.native
  def parse(querystring: String, separator: js.UndefOr[scala.Nothing], assignment: String): js.Object = js.native
  def parse(querystring: String, separator: String): js.Object = js.native
  def parse(querystring: String, separator: String, assignment: String): js.Object = js.native
  def stringify(`object`: js.Object): String = js.native
  def stringify(`object`: js.Object, separator: js.UndefOr[scala.Nothing], assignment: String): String = js.native
  def stringify(`object`: js.Object, separator: String): String = js.native
  def stringify(`object`: js.Object, separator: String, assignment: String): String = js.native
  def unescape(query: String): String = js.native
}

