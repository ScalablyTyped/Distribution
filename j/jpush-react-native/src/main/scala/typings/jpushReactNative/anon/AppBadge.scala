package typings.jpushReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppBadge extends js.Object {
  
  /**
    * iOS 用来标记应用程序状态的一个数字,出现在程序图标右上角。设置的值小于0时，sdk不作处理。
    */
  var appBadge: Double = js.native
  
  /**
    * Push封装badge功能,允许应用上传 badge 值至 JPush 服务器,由 JPush 后台帮助管理每个用户所对应的推送 badge 值,简化了设置推送 badge 的操作。设置的值小于0时，sdk时不作处理。
    */
  var badge: Double = js.native
}
object AppBadge {
  
  @scala.inline
  def apply(appBadge: Double, badge: Double): AppBadge = {
    val __obj = js.Dynamic.literal(appBadge = appBadge.asInstanceOf[js.Any], badge = badge.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppBadge]
  }
  
  @scala.inline
  implicit class AppBadgeOps[Self <: AppBadge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppBadge(value: Double): Self = this.set("appBadge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadge(value: Double): Self = this.set("badge", value.asInstanceOf[js.Any])
  }
}
