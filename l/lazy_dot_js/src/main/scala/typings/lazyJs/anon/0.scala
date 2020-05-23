package typings.lazyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0`[T] extends js.Object {
  var `0`: js.Any
  var `1`: T
}

object `0` {
  @scala.inline
  def apply[T](`0`: js.Any, `1`: T): `0`[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`[T]]
  }
}

