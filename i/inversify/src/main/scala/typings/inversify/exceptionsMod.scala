package typings.inversify

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/utils/exceptions", JSImport.Namespace)
@js.native
object exceptionsMod extends js.Object {
  def isStackOverflowExeption(error: Error): Boolean = js.native
}

