package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 更新应用启动界面要设置的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
  */
trait PlusNavigatorSplashscreenOptions extends js.Object {
  /**
    * 是否自动关闭启动界面
    * true表示应用启动后自动关闭启动界面，false表示应用启动后不自动关闭启动界面，需要在应用调用plus.navigator.closeSplashscreen()方法关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var autoclose: js.UndefOr[Boolean] = js.undefined
  /**
    * 是否自动关闭启动界面（WAP2APP应用）
    * 与autoclose属性值作用一致，仅在WAP2APP应用中有效。
    *     不推荐设置此值，如果未设置会自动使用autoclose属性值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var autoclose_w2a: js.UndefOr[Boolean] = js.undefined
  /**
    * 启动界面延时关闭时间
    * 仅在设置为自动关闭启动界面时有效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * 启动界面延时关闭时间（WAP2APP应用）
    * 与delay属性值作用一致，仅在WAP2APP应用中有效。
    *     不推荐设置此值，如果未设置会自动使用delay属性值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var delay_w2a: js.UndefOr[Double] = js.undefined
  /**
    * 启动界面的图片路径
    * 仅支持本地文件路径，图片必须为png格式。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var image: js.UndefOr[String] = js.undefined
}

object PlusNavigatorSplashscreenOptions {
  @scala.inline
  def apply(
    autoclose: js.UndefOr[Boolean] = js.undefined,
    autoclose_w2a: js.UndefOr[Boolean] = js.undefined,
    delay: js.UndefOr[Double] = js.undefined,
    delay_w2a: js.UndefOr[Double] = js.undefined,
    image: String = null
  ): PlusNavigatorSplashscreenOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoclose)) __obj.updateDynamic("autoclose")(autoclose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoclose_w2a)) __obj.updateDynamic("autoclose_w2a")(autoclose_w2a.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delay_w2a)) __obj.updateDynamic("delay_w2a")(delay_w2a.get.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusNavigatorSplashscreenOptions]
  }
}

