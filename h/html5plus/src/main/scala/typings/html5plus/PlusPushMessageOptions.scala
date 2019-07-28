package typings.html5plus

import typings.html5plus.html5plusStrings.none
import typings.html5plus.html5plusStrings.system
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，获客户端创建本地消息的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
  */
trait PlusPushMessageOptions extends js.Object {
  /**
    * 要启动流应用的appid
    * 默认值为当前流应用的appid。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var appid: js.UndefOr[String] = js.undefined
  /**
    * 是否覆盖上一次提示的消息
    * 可取值true或false，true为覆盖，false不覆盖，默认为permission中设置的cover值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var cover: js.UndefOr[Boolean] = js.undefined
  /**
    * 提示消息延迟显示的时间
    * 当设备接收到推送消息后，可不立即显示，而是延迟一段时间显示，延迟时间单位为s，默认为0s，立即显示。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * 推送消息的图标
    * 本地图片地址，相对路径 - 相对于当前页面的host位置，如"a.jpg"，注意当前页面为网络地址则不支持； 绝对路径 - 系统绝对路径，如Android平台"/sdcard/logo.png"，此类路径通常通过其它5+ API获取的； 扩展相对路径URL(RelativeURL) - 以"_"开头的相对路径，如"_www/a.jpg"； 本地路径URL - 以“file://”开头，后面跟随系统绝对路径。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var icon: js.UndefOr[String] = js.undefined
  /**
    * 推送消息的提示音
    * 显示消息时的播放的提示音，可取值：
    * 	“system”-表示使用系统通知提示音；
    * 	“none”-表示不使用提示音；
    * 	默认值为“system”。
    * - system: 使用系统通知提示音
    * - none: 不使用提示音
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var sound: js.UndefOr[system | none] = js.undefined
  /**
    * 推送消息的标题
    * 在系统消息中心显示的通知消息标题，默认值为程序的名称。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * 消息上显示的提示时间
    * 默认为当前时间，如果延迟显示则使用延时后显示消息的时间。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var when: js.UndefOr[Date] = js.undefined
}

object PlusPushMessageOptions {
  @scala.inline
  def apply(
    appid: String = null,
    cover: js.UndefOr[Boolean] = js.undefined,
    delay: Int | Double = null,
    icon: String = null,
    sound: system | none = null,
    title: String = null,
    when: Date = null
  ): PlusPushMessageOptions = {
    val __obj = js.Dynamic.literal()
    if (appid != null) __obj.updateDynamic("appid")(appid)
    if (!js.isUndefined(cover)) __obj.updateDynamic("cover")(cover)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (sound != null) __obj.updateDynamic("sound")(sound.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (when != null) __obj.updateDynamic("when")(when)
    __obj.asInstanceOf[PlusPushMessageOptions]
  }
}

