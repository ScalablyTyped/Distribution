package typings.knockoutDotEs5

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Array[T] extends js.Object {
  def destroy(item: T): Unit = js.native
  def destroyAll(): Unit = js.native
  def destroyAll(items: Array[T]): Unit = js.native
  def remove(item: T): Array[T] = js.native
  def removeAll(): Array[T] = js.native
  def removeAll(items: Array[T]): Array[T] = js.native
}

