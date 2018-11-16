package typings
package jssLib.jssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jss", "SheetsRegistry")
@js.native
class SheetsRegistry () extends js.Object {
  val index: scala.Double = js.native
  var registry: js.Array[StyleSheet[_]] = js.native
  def add(sheet: StyleSheet[_]): scala.Unit = js.native
  def remove(sheet: StyleSheet[_]): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def toString(options: ToCssOptions): java.lang.String = js.native
}

