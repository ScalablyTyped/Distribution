package typings.jpushReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppBadge extends js.Object {
  /**
    * iOS 用来标记应用程序状态的一个数字,出现在程序图标右上角。设置的值小于0时，sdk不作处理。
    */
  var appBadge: Double
  /**
    * Push封装badge功能,允许应用上传 badge 值至 JPush 服务器,由 JPush 后台帮助管理每个用户所对应的推送 badge 值,简化了设置推送 badge 的操作。设置的值小于0时，sdk时不作处理。
    */
  var badge: Double
}

object AppBadge {
  @scala.inline
  def apply(appBadge: Double, badge: Double): AppBadge = {
    val __obj = js.Dynamic.literal(appBadge = appBadge.asInstanceOf[js.Any], badge = badge.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppBadge]
  }
}

