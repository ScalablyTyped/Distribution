package typings.libphonenumberDashJs.typesMod

import typings.libphonenumberDashJs.libphonenumberDashJsStrings.International_
import typings.libphonenumberDashJs.libphonenumberDashJsStrings.National_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.libphonenumberDashJs.libphonenumberDashJsStrings.NATIONAL
  - typings.libphonenumberDashJs.libphonenumberDashJsStrings.National_
  - typings.libphonenumberDashJs.libphonenumberDashJsStrings.INTERNATIONAL
  - typings.libphonenumberDashJs.libphonenumberDashJsStrings.International_
  - typings.libphonenumberDashJs.libphonenumberDashJsStrings.EDot164
  - typings.libphonenumberDashJs.libphonenumberDashJsStrings.RFC3966
  - typings.libphonenumberDashJs.libphonenumberDashJsStrings.IDD
*/
trait NumberFormat extends js.Object

object NumberFormat {
  @scala.inline
  def EDot164: typings.libphonenumberDashJs.libphonenumberDashJsStrings.EDot164 = this.cast("E.164")
  @scala.inline
  def IDD: typings.libphonenumberDashJs.libphonenumberDashJsStrings.IDD = this.cast("IDD")
  @scala.inline
  def INTERNATIONAL: typings.libphonenumberDashJs.libphonenumberDashJsStrings.INTERNATIONAL = this.cast("INTERNATIONAL")
  @scala.inline
  def International: International_ = this.cast("International")
  @scala.inline
  def NATIONAL: typings.libphonenumberDashJs.libphonenumberDashJsStrings.NATIONAL = this.cast("NATIONAL")
  @scala.inline
  def National: National_ = this.cast("National")
  @scala.inline
  def RFC3966: typings.libphonenumberDashJs.libphonenumberDashJsStrings.RFC3966 = this.cast("RFC3966")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

