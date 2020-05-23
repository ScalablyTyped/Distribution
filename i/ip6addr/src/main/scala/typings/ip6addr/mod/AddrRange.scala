package typings.ip6addr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddrRange extends js.Object {
  def contains(input: String): Boolean
  def first(): Addr
  def last(): Addr
}

object AddrRange {
  @scala.inline
  def apply(contains: String => Boolean, first: () => Addr, last: () => Addr): AddrRange = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last))
    __obj.asInstanceOf[AddrRange]
  }
}

