package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 图片轮播控件样式
  * 从ViewStyles继承而来，扩展支持轮播图片等配置。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
trait PlusNativeObjImageSliderStyles extends js.Object {
  /**
    * 是否自动播放
    * 可取值：
    * 		"true" - 自动播放；
    * 		"false" - 不自动播放。
    * 	默认值为"false"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var autoplay: js.UndefOr[Boolean] = js.undefined
  /**
    * 是否可全屏显示
    * 可取值：
    * 		"true" - 表示可全屏显示，用户点击轮播图片时全屏显示；
    * 		"false" - 表示不可全屏显示，用户点击轮播图片时无响应。
    * 	默认值为"true"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  /**
    * 轮播的图片
    * 至少必须设置一张图片的地址信息，否则可能导致图片轮播控件显示不正常。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var images: js.UndefOr[js.Array[PlusNativeObj]] = js.undefined
  /**
    * 自动播放切换时间
    * 当autoplay属性值为true时生效，单位为毫秒。默认值为3000（3秒）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var interval: js.UndefOr[Double] = js.undefined
  /**
    * 是否可循环轮播
    * 可取值：
    * 		"true" - 支持循环轮播；
    * 		"false" - 不支持循环轮播。
    * 	默认值为"false"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var loop: js.UndefOr[Boolean] = js.undefined
}

object PlusNativeObjImageSliderStyles {
  @scala.inline
  def apply(
    autoplay: js.UndefOr[Boolean] = js.undefined,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    images: js.Array[PlusNativeObj] = null,
    interval: Int | Double = null,
    loop: js.UndefOr[Boolean] = js.undefined
  ): PlusNativeObjImageSliderStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen)
    if (images != null) __obj.updateDynamic("images")(images)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    __obj.asInstanceOf[PlusNativeObjImageSliderStyles]
  }
}

