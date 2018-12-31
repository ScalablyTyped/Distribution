package typings
package lodashDashDecoratorsLib.sharedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoizeMap[T, U] extends js.Object {
  var clear: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  def delete(key: T): scala.Unit
  def get(key: T): U
  def has(key: T): scala.Boolean
  def set(key: T, value: U): scala.Unit
}

