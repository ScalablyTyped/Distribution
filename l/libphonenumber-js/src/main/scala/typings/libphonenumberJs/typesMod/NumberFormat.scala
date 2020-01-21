package typings.libphonenumberJs.typesMod

import typings.libphonenumberJs.libphonenumberJsStrings.International_
import typings.libphonenumberJs.libphonenumberJsStrings.National_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.libphonenumberJs.libphonenumberJsStrings.NATIONAL
  - typings.libphonenumberJs.libphonenumberJsStrings.National_
  - typings.libphonenumberJs.libphonenumberJsStrings.INTERNATIONAL
  - typings.libphonenumberJs.libphonenumberJsStrings.International_
  - typings.libphonenumberJs.libphonenumberJsStrings.EDot164
  - typings.libphonenumberJs.libphonenumberJsStrings.RFC3966
  - typings.libphonenumberJs.libphonenumberJsStrings.IDD
*/
trait NumberFormat extends js.Object

object NumberFormat {
  @scala.inline
  def EDot164: typings.libphonenumberJs.libphonenumberJsStrings.EDot164 = this.cast("E.164")
  @scala.inline
  def IDD: typings.libphonenumberJs.libphonenumberJsStrings.IDD = this.cast("IDD")
  @scala.inline
  def INTERNATIONAL: typings.libphonenumberJs.libphonenumberJsStrings.INTERNATIONAL = this.cast("INTERNATIONAL")
  @scala.inline
  def International: International_ = this.cast("International")
  @scala.inline
  def NATIONAL: typings.libphonenumberJs.libphonenumberJsStrings.NATIONAL = this.cast("NATIONAL")
  @scala.inline
  def National: National_ = this.cast("National")
  @scala.inline
  def RFC3966: typings.libphonenumberJs.libphonenumberJsStrings.RFC3966 = this.cast("RFC3966")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

