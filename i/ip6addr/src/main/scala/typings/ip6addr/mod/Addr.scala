package typings.ip6addr.mod

import typings.ip6addr.ip6addrStrings.ipv4
import typings.ip6addr.ip6addrStrings.ipv6
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Addr extends js.Object {
  def compare(other: Addr): Double = js.native
  def kind(): ipv4 | ipv6 = js.native
  def offset(num: Double): Addr | Null = js.native
  def toBuffer(): Uint8Array = js.native
  def toBuffer(buff: Uint8Array): Uint8Array = js.native
  def toLong(): Double = js.native
  def toString(opts: ToStringOpts): String = js.native
}

