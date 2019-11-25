package typings.jweixin.jweixinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*=============================智能接口================================*/
/*=============================设备信息================================*/
/* Rewritten from type alias, can be one of: 
  - typings.jweixin.jweixinStrings.`2g`
  - typings.jweixin.jweixinStrings.`3g`
  - typings.jweixin.jweixinStrings.`4g`
  - typings.jweixin.jweixinStrings.wifi
*/
trait networkType extends js.Object

object networkType {
  @scala.inline
  def `2g`: typings.jweixin.jweixinStrings.`2g` = this.cast("2g")
  @scala.inline
  def `3g`: typings.jweixin.jweixinStrings.`3g` = this.cast("3g")
  @scala.inline
  def `4g`: typings.jweixin.jweixinStrings.`4g` = this.cast("4g")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def wifi: typings.jweixin.jweixinStrings.wifi = this.cast("wifi")
}

