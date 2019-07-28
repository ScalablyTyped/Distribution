package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，保存分享消息扩展信息
  * ShareMessageExtra对象用于保存各分享平台扩展的参数，用于自定义分享功能。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
  */
trait PlusShareShareMessageExtra extends js.Object {
  /**
    * 微信分享场景，仅微信分享平台有效
    * 可取值：
    * 	"WXSceneSession"分享到微信的“我的好友”；
    * 	"WXSceneTimeline"分享到微信的“朋友圈”中；
    * 	"WXSceneFavorite"分享到微信的“我的收藏”中。
    * 	默认值为"WXSceneSession"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var scene: js.UndefOr[String] = js.undefined
}

object PlusShareShareMessageExtra {
  @scala.inline
  def apply(scene: String = null): PlusShareShareMessageExtra = {
    val __obj = js.Dynamic.literal()
    if (scene != null) __obj.updateDynamic("scene")(scene)
    __obj.asInstanceOf[PlusShareShareMessageExtra]
  }
}

