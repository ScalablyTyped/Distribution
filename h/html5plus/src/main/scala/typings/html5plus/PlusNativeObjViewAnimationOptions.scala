package typings.html5plus

import typings.html5plus.html5plusStrings.shrink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * View控件动画参数
  * 指定动画的类型、持续时间等信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
trait PlusNativeObjViewAnimationOptions extends js.Object {
  /**
    * 动画持续时间
    * 单位为毫秒，默认值为200ms。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * 动画帧数
    * 必须为大于0的整数，默认值为12。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var frames: js.UndefOr[Double] = js.undefined
  /**
    * 动画作用区域
    * 支持以下属性：
    * 	top - 区域距离控件顶部的偏移量，属性值可取像素值（如"100px"），百分比（如"10%"，相对于控件的高度）,默认值为'0px'；
    * 	bottom - 区域距离控件底部的偏移量，属性值可取像素值（如"100px"），百分比（如"10%"，相对于控件的高度）,默认值为'0px'；
    * 	left - 区域距离控件左侧的偏移量，属性值可取像素值（如"100px"），百分比（如"10%"，相对于控件的宽度）,默认值为'0px'；
    * 	right - 区域距离控件右侧的偏移量，属性值可取像素值（如"100px"），百分比（如"10%"，相对于控件的宽度）,默认值为'0px'。
    * 	如“{top:'44px',bottom:'48px'}”。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var region: js.UndefOr[PlusNativeObjRect] = js.undefined
  /**
    * 动画类型
    * 可取值："shrink" - 从上到下分块收缩清除窗口动画。
    * - shrink: 从上到下分块清除动画
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var `type`: js.UndefOr[shrink] = js.undefined
}

object PlusNativeObjViewAnimationOptions {
  @scala.inline
  def apply(
    duration: Int | Double = null,
    frames: Int | Double = null,
    region: PlusNativeObjRect = null,
    `type`: shrink = null
  ): PlusNativeObjViewAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (frames != null) __obj.updateDynamic("frames")(frames.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PlusNativeObjViewAnimationOptions]
  }
}

