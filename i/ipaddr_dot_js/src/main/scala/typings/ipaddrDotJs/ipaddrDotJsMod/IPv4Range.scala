package typings.ipaddrDotJs.ipaddrDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ipaddrDotJs.ipaddrDotJsStrings.unicast
  - typings.ipaddrDotJs.ipaddrDotJsStrings.unspecified
  - typings.ipaddrDotJs.ipaddrDotJsStrings.broadcast
  - typings.ipaddrDotJs.ipaddrDotJsStrings.multicast
  - typings.ipaddrDotJs.ipaddrDotJsStrings.linkLocal
  - typings.ipaddrDotJs.ipaddrDotJsStrings.loopback
  - typings.ipaddrDotJs.ipaddrDotJsStrings.carrierGradeNat
  - typings.ipaddrDotJs.ipaddrDotJsStrings.`private`
  - typings.ipaddrDotJs.ipaddrDotJsStrings.reserved
*/
trait IPv4Range extends js.Object

object IPv4Range {
  @scala.inline
  def broadcast: typings.ipaddrDotJs.ipaddrDotJsStrings.broadcast = this.cast("broadcast")
  @scala.inline
  def carrierGradeNat: typings.ipaddrDotJs.ipaddrDotJsStrings.carrierGradeNat = this.cast("carrierGradeNat")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def linkLocal: typings.ipaddrDotJs.ipaddrDotJsStrings.linkLocal = this.cast("linkLocal")
  @scala.inline
  def loopback: typings.ipaddrDotJs.ipaddrDotJsStrings.loopback = this.cast("loopback")
  @scala.inline
  def multicast: typings.ipaddrDotJs.ipaddrDotJsStrings.multicast = this.cast("multicast")
  @scala.inline
  def `private`: typings.ipaddrDotJs.ipaddrDotJsStrings.`private` = this.cast("private")
  @scala.inline
  def reserved: typings.ipaddrDotJs.ipaddrDotJsStrings.reserved = this.cast("reserved")
  @scala.inline
  def unicast: typings.ipaddrDotJs.ipaddrDotJsStrings.unicast = this.cast("unicast")
  @scala.inline
  def unspecified: typings.ipaddrDotJs.ipaddrDotJsStrings.unspecified = this.cast("unspecified")
}

