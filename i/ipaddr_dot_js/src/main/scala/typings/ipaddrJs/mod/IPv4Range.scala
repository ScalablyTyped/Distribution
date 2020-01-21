package typings.ipaddrJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ipaddrJs.ipaddrJsStrings.unicast
  - typings.ipaddrJs.ipaddrJsStrings.unspecified
  - typings.ipaddrJs.ipaddrJsStrings.broadcast
  - typings.ipaddrJs.ipaddrJsStrings.multicast
  - typings.ipaddrJs.ipaddrJsStrings.linkLocal
  - typings.ipaddrJs.ipaddrJsStrings.loopback
  - typings.ipaddrJs.ipaddrJsStrings.carrierGradeNat
  - typings.ipaddrJs.ipaddrJsStrings.`private`
  - typings.ipaddrJs.ipaddrJsStrings.reserved
*/
trait IPv4Range extends js.Object

object IPv4Range {
  @scala.inline
  def broadcast: typings.ipaddrJs.ipaddrJsStrings.broadcast = this.cast("broadcast")
  @scala.inline
  def carrierGradeNat: typings.ipaddrJs.ipaddrJsStrings.carrierGradeNat = this.cast("carrierGradeNat")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def linkLocal: typings.ipaddrJs.ipaddrJsStrings.linkLocal = this.cast("linkLocal")
  @scala.inline
  def loopback: typings.ipaddrJs.ipaddrJsStrings.loopback = this.cast("loopback")
  @scala.inline
  def multicast: typings.ipaddrJs.ipaddrJsStrings.multicast = this.cast("multicast")
  @scala.inline
  def `private`: typings.ipaddrJs.ipaddrJsStrings.`private` = this.cast("private")
  @scala.inline
  def reserved: typings.ipaddrJs.ipaddrJsStrings.reserved = this.cast("reserved")
  @scala.inline
  def unicast: typings.ipaddrJs.ipaddrJsStrings.unicast = this.cast("unicast")
  @scala.inline
  def unspecified: typings.ipaddrJs.ipaddrJsStrings.unspecified = this.cast("unspecified")
}

