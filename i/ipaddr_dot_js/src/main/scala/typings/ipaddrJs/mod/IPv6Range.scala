package typings.ipaddrJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ipaddrJs.ipaddrJsStrings.unicast
  - typings.ipaddrJs.ipaddrJsStrings.unspecified
  - typings.ipaddrJs.ipaddrJsStrings.linkLocal
  - typings.ipaddrJs.ipaddrJsStrings.multicast
  - typings.ipaddrJs.ipaddrJsStrings.loopback
  - typings.ipaddrJs.ipaddrJsStrings.uniqueLocal
  - typings.ipaddrJs.ipaddrJsStrings.ipv4Mapped
  - typings.ipaddrJs.ipaddrJsStrings.rfc6145
  - typings.ipaddrJs.ipaddrJsStrings.rfc6052
  - typings.ipaddrJs.ipaddrJsStrings.`6to4`
  - typings.ipaddrJs.ipaddrJsStrings.teredo
  - typings.ipaddrJs.ipaddrJsStrings.reserved
*/
trait IPv6Range extends js.Object

object IPv6Range {
  @scala.inline
  def `6to4`: typings.ipaddrJs.ipaddrJsStrings.`6to4` = this.cast("6to4")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ipv4Mapped: typings.ipaddrJs.ipaddrJsStrings.ipv4Mapped = this.cast("ipv4Mapped")
  @scala.inline
  def linkLocal: typings.ipaddrJs.ipaddrJsStrings.linkLocal = this.cast("linkLocal")
  @scala.inline
  def loopback: typings.ipaddrJs.ipaddrJsStrings.loopback = this.cast("loopback")
  @scala.inline
  def multicast: typings.ipaddrJs.ipaddrJsStrings.multicast = this.cast("multicast")
  @scala.inline
  def reserved: typings.ipaddrJs.ipaddrJsStrings.reserved = this.cast("reserved")
  @scala.inline
  def rfc6052: typings.ipaddrJs.ipaddrJsStrings.rfc6052 = this.cast("rfc6052")
  @scala.inline
  def rfc6145: typings.ipaddrJs.ipaddrJsStrings.rfc6145 = this.cast("rfc6145")
  @scala.inline
  def teredo: typings.ipaddrJs.ipaddrJsStrings.teredo = this.cast("teredo")
  @scala.inline
  def unicast: typings.ipaddrJs.ipaddrJsStrings.unicast = this.cast("unicast")
  @scala.inline
  def uniqueLocal: typings.ipaddrJs.ipaddrJsStrings.uniqueLocal = this.cast("uniqueLocal")
  @scala.inline
  def unspecified: typings.ipaddrJs.ipaddrJsStrings.unspecified = this.cast("unspecified")
}

