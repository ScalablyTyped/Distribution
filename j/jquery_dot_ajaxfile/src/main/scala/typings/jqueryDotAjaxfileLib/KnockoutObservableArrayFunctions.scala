package typings
package jqueryDotAjaxfileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutObservableArrayFunctions[T] extends js.Object {
  def destroy(destroyFunction: js.Function1[/* item */ T, scala.Boolean]): scala.Unit = js.native
  def destroy(item: T): scala.Unit = js.native
  def destroyAll(): scala.Unit = js.native
  def destroyAll(items: js.Array[T]): scala.Unit = js.native
  // General Array functions
  def indexOf(searchElement: T): scala.Double = js.native
  // General Array functions
  def indexOf(searchElement: T, fromIndex: scala.Double): scala.Double = js.native
  def pop(): T = js.native
  def push(items: T*): scala.Unit = js.native
  def remove(item: T): js.Array[T] = js.native
  def remove(removeFunction: js.Function1[/* item */ T, scala.Boolean]): js.Array[T] = js.native
  def removeAll(): js.Array[T] = js.native
  def removeAll(items: js.Array[T]): js.Array[T] = js.native
  // Ko specific
  def replace(oldItem: T, newItem: T): scala.Unit = js.native
  def reverse(): js.Array[T] = js.native
  def shift(): T = js.native
  def slice(start: scala.Double): js.Array[T] = js.native
  def slice(start: scala.Double, end: scala.Double): js.Array[T] = js.native
  def sort(): scala.Unit = js.native
  def sort(compareFunction: js.Function2[/* left */ T, /* right */ T, scala.Double]): scala.Unit = js.native
  def splice(start: scala.Double): js.Array[T] = js.native
  def splice(start: scala.Double, deleteCount: scala.Double, items: T*): js.Array[T] = js.native
  def unshift(items: T*): scala.Double = js.native
}

