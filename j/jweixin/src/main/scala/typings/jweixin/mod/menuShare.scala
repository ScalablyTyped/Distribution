package typings.jweixin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 传播类
/* Rewritten from type alias, can be one of: 
  - typings.jweixin.jweixinStrings.menuItemColonshareColonappMessage
  - typings.jweixin.jweixinStrings.menuItemColonshareColontimeline
  - typings.jweixin.jweixinStrings.menuItemColonshareColonqq
  - typings.jweixin.jweixinStrings.menuItemColonshareColonweiboApp
  - typings.jweixin.jweixinStrings.menuItemColonfavorite
  - typings.jweixin.jweixinStrings.menuItemColonshareColonfacebook
  - typings.jweixin.jweixinStrings.menuItemColonshareColonQZone
*/
trait menuShare extends js.Object

object menuShare {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def menuItemColonfavorite: typings.jweixin.jweixinStrings.menuItemColonfavorite = this.cast("menuItem:favorite")
  @scala.inline
  def menuItemColonshareColonQZone: typings.jweixin.jweixinStrings.menuItemColonshareColonQZone = this.cast("menuItem:share:QZone")
  @scala.inline
  def menuItemColonshareColonappMessage: typings.jweixin.jweixinStrings.menuItemColonshareColonappMessage = this.cast("menuItem:share:appMessage")
  @scala.inline
  def menuItemColonshareColonfacebook: typings.jweixin.jweixinStrings.menuItemColonshareColonfacebook = this.cast("menuItem:share:facebook")
  @scala.inline
  def menuItemColonshareColonqq: typings.jweixin.jweixinStrings.menuItemColonshareColonqq = this.cast("menuItem:share:qq")
  @scala.inline
  def menuItemColonshareColontimeline: typings.jweixin.jweixinStrings.menuItemColonshareColontimeline = this.cast("menuItem:share:timeline")
  @scala.inline
  def menuItemColonshareColonweiboApp: typings.jweixin.jweixinStrings.menuItemColonshareColonweiboApp = this.cast("menuItem:share:weiboApp")
}

