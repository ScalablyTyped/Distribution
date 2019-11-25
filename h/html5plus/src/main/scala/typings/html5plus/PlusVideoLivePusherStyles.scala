package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 直播推流控件配置选项
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
  */
trait PlusVideoLivePusherStyles extends js.Object {
  /**
    * 宽高比
    * 可取值：3:4, 9:16。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var aspect: js.UndefOr[String] = js.undefined
  /**
    * 自动聚集
    * 默认值为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `auto-focus`: js.UndefOr[Boolean] = js.undefined
  /**
    * 是否美颜
    * 可取值0、1，其中0表示不使用美颜，1表示不使用美颜。
    * 	默认值为0(不使用美颜)。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var beauty: js.UndefOr[Double] = js.undefined
  /**
    * 开启摄像头
    * 默认值为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `enable-camera`: js.UndefOr[Boolean] = js.undefined
  /**
    * LivePusher控件的高度
    * 可取值：
    * 		像素值，如"100px"；
    * 		百分比，如"10%"，相对于父Webview窗口的高度。
    * 	默认值为"100%"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var height: js.UndefOr[String] = js.undefined
  /**
    * LivePusher控件左上角的水平偏移量
    * 可取值：
    * 		像素值，如"100px"；
    * 		百分比，如"10%"，相对于父Webview窗口的宽度；
    * 		自动计算，如"auto"，根据width值自动计算，相对于父Webview窗口水平居中。
    * 	默认值为"0px"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var left: js.UndefOr[String] = js.undefined
  /**
    * 推流视频模式
    * 可取值：SD（标清）, HD（高清）, FHD（超清）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var mode: js.UndefOr[String] = js.undefined
  /**
    * 是否静音
    * 默认值为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var muted: js.UndefOr[Boolean] = js.undefined
  /**
    * LivePusher控件在Webview窗口的布局模式
    * 可取值：
    * 		"static" - 静态布局模式，如果页面存在滚动条则随窗口内容滚动；
    * 		"absolute" - 绝对布局模式，如果页面存在滚动条不随窗口内容滚动；
    * 	默认值为"static"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var position: js.UndefOr[String] = js.undefined
  /**
    * LivePusher控件左上角的垂直偏移量
    * 可取值：
    * 		像素值，如"100px"；
    * 		百分比，如"10%"，相对于父Webview窗口的高度；
    * 		自动计算，如"auto",根据height值自动计算，相对于父Webview窗口垂直居中。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var top: js.UndefOr[String] = js.undefined
  /**
    * 推流地址
    * 支持RTMP协议。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var url: js.UndefOr[String] = js.undefined
  /**
    * 是否美白
    * 可取值0、1、2、3、4、5，其中0表示不使用美白，其余值分别表示美白的程度，值越大美白程度越大。
    * 	默认值为0（不使用美白）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var whiteness: js.UndefOr[Double] = js.undefined
  /**
    * LivePusher控件的宽度
    * 可取值：
    * 		像素值，如"100px"；
    * 		百分比，如"10%"，相对于父Webview窗口的宽度。
    * 	默认值为"100%"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var width: js.UndefOr[String] = js.undefined
}

object PlusVideoLivePusherStyles {
  @scala.inline
  def apply(
    aspect: String = null,
    `auto-focus`: js.UndefOr[Boolean] = js.undefined,
    beauty: Int | Double = null,
    `enable-camera`: js.UndefOr[Boolean] = js.undefined,
    height: String = null,
    left: String = null,
    mode: String = null,
    muted: js.UndefOr[Boolean] = js.undefined,
    position: String = null,
    top: String = null,
    url: String = null,
    whiteness: Int | Double = null,
    width: String = null
  ): PlusVideoLivePusherStyles = {
    val __obj = js.Dynamic.literal()
    if (aspect != null) __obj.updateDynamic("aspect")(aspect.asInstanceOf[js.Any])
    if (!js.isUndefined(`auto-focus`)) __obj.updateDynamic("auto-focus")(`auto-focus`.asInstanceOf[js.Any])
    if (beauty != null) __obj.updateDynamic("beauty")(beauty.asInstanceOf[js.Any])
    if (!js.isUndefined(`enable-camera`)) __obj.updateDynamic("enable-camera")(`enable-camera`.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (whiteness != null) __obj.updateDynamic("whiteness")(whiteness.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusVideoLivePusherStyles]
  }
}

