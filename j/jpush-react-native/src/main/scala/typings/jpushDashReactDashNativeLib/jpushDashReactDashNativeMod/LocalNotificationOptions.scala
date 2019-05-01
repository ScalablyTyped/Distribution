package typings
package jpushDashReactDashNativeLib.jpushDashReactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalNotificationOptions extends js.Object {
  // extra 字段
  var badge: js.UndefOr[scala.Double] = js.undefined
  var buildId: jpushDashReactDashNativeLib.jpushDashReactDashNativeLibNumbers.`1` | jpushDashReactDashNativeLib.jpushDashReactDashNativeLibNumbers.`2`
  // 通知标题
  var content: java.lang.String
  // 通知触发时间的时间戳（毫秒）
  var extra: js.UndefOr[ExtraData] = js.undefined
  // 通知内容
  var fireTime: scala.Double
  // 设置通知样式，1 为基础样式，2 为自定义样式。自定义样式需要先调用 setStyleCustom 接口设置自定义样式。(Android Only)
  var id: scala.Double
  // 本地推送触发后应用角标的 badge 值  （iOS Only）
  var soundName: js.UndefOr[java.lang.String] = js.undefined
  // 指定推送的音频文件 （iOS Only）
  var subtitle: js.UndefOr[java.lang.String] = js.undefined
  // 通知的 id, 可用于取消通知
  var title: java.lang.String
}

object LocalNotificationOptions {
  @scala.inline
  def apply(
    buildId: jpushDashReactDashNativeLib.jpushDashReactDashNativeLibNumbers.`1` | jpushDashReactDashNativeLib.jpushDashReactDashNativeLibNumbers.`2`,
    content: java.lang.String,
    fireTime: scala.Double,
    id: scala.Double,
    title: java.lang.String,
    badge: scala.Int | scala.Double = null,
    extra: ExtraData = null,
    soundName: java.lang.String = null,
    subtitle: java.lang.String = null
  ): LocalNotificationOptions = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], content = content, fireTime = fireTime, id = id, title = title)
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (soundName != null) __obj.updateDynamic("soundName")(soundName)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    __obj.asInstanceOf[LocalNotificationOptions]
  }
}

