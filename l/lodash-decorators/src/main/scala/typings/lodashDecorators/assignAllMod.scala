package typings.lodashDecorators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/utils/assignAll", JSImport.Namespace)
@js.native
object assignAllMod extends js.Object {
  def assignAll[T, U](to: T, from: U): T = js.native
  def assignAll[T, U](to: T, from: U, excludes: js.Array[String]): T = js.native
  def assignProperty[T, U](to: T, from: U, prop: String): Unit = js.native
}

