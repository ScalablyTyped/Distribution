package typings.ipAddress.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ipAddress.ipAddressStrings.Reserved
  - typings.ipAddress.ipAddressStrings.`Interface local`
  - typings.ipAddress.ipAddressStrings.`Link local`
  - typings.ipAddress.ipAddressStrings.`Admin local`
  - typings.ipAddress.ipAddressStrings.`Site local`
  - typings.ipAddress.ipAddressStrings.`Organization local`
  - typings.ipAddress.ipAddressStrings.Global
*/
trait IPv6Scope extends js.Object

object IPv6Scope {
  @scala.inline
  def `Admin local`: typings.ipAddress.ipAddressStrings.`Admin local` = this.cast("Admin local")
  @scala.inline
  def Global: typings.ipAddress.ipAddressStrings.Global = this.cast("Global")
  @scala.inline
  def `Interface local`: typings.ipAddress.ipAddressStrings.`Interface local` = this.cast("Interface local")
  @scala.inline
  def `Link local`: typings.ipAddress.ipAddressStrings.`Link local` = this.cast("Link local")
  @scala.inline
  def `Organization local`: typings.ipAddress.ipAddressStrings.`Organization local` = this.cast("Organization local")
  @scala.inline
  def Reserved: typings.ipAddress.ipAddressStrings.Reserved = this.cast("Reserved")
  @scala.inline
  def `Site local`: typings.ipAddress.ipAddressStrings.`Site local` = this.cast("Site local")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

