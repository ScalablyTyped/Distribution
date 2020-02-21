package typings.intersperse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intersperse", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply[T, U](items: js.Array[T], separator: U): js.Array[T | U] = js.native
}

