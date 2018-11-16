package typings
package knockoutDotEs5Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Array[T] extends js.Object {
  def destroy(item: T): scala.Unit = js.native
  def destroyAll(): scala.Unit = js.native
  def destroyAll(items: Array[T]): scala.Unit = js.native
  def remove(item: T): Array[T] = js.native
  def removeAll(): Array[T] = js.native
  def removeAll(items: Array[T]): Array[T] = js.native
}

