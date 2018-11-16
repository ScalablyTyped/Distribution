package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sdk/querystring", JSImport.Namespace)
@js.native
object querystringMod extends js.Object {
  def escape(query: java.lang.String): java.lang.String = js.native
  def parse(querystring: java.lang.String): js.Object = js.native
  def parse(querystring: java.lang.String, separator: java.lang.String): js.Object = js.native
  def parse(querystring: java.lang.String, separator: java.lang.String, assignment: java.lang.String): js.Object = js.native
  def stringify(`object`: js.Object): java.lang.String = js.native
  def stringify(`object`: js.Object, separator: java.lang.String): java.lang.String = js.native
  def stringify(`object`: js.Object, separator: java.lang.String, assignment: java.lang.String): java.lang.String = js.native
  def unescape(query: java.lang.String): java.lang.String = js.native
}

