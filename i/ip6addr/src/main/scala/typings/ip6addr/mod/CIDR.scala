package typings.ip6addr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CIDR extends js.Object {
  def address(): Addr = js.native
  def broadcast(): Addr = js.native
  def compare(other: CIDR): Double = js.native
  def contains(input: String): Boolean = js.native
  def first(): Addr = js.native
  def last(): Addr = js.native
  def prefixLength(): Double = js.native
  def toString(opts: ToStringOpts): String = js.native
}

