package typings.jsonabc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonabc", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def cleanJSON(input: String): String = js.native
  def sort(inputStr: String): String = js.native
  def sort(inputStr: String, noArray: Boolean): String = js.native
  def sortObj[T /* <: js.Object */](input: T): T = js.native
  def sortObj[T /* <: js.Object */](input: T, noArray: Boolean): T = js.native
}

