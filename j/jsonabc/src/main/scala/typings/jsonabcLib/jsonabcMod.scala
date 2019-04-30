package typings
package jsonabcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonabc", JSImport.Namespace)
@js.native
object jsonabcMod extends js.Object {
  def cleanJSON(input: java.lang.String): java.lang.String = js.native
  def sort(inputStr: java.lang.String): java.lang.String = js.native
  def sort(inputStr: java.lang.String, noArray: scala.Boolean): java.lang.String = js.native
  def sortObj[T /* <: js.Object */](input: T): T = js.native
  def sortObj[T /* <: js.Object */](input: T, noArray: scala.Boolean): T = js.native
}

