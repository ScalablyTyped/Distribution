package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 原生动画窗口样式
  * 指定动画窗口的样式，如背景图片，绘制的文字等。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
trait PlusNativeObjAnimationViewStyles extends js.Object {
  /**
    * 动画窗口上绘制的背景图片
    * 图片可以通过Webview对象的draw方法截图，也可以通过Bitmap的API从本地文件中加载。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var bitmap: js.UndefOr[PlusNativeObjBitmap] = js.undefined
  /**
    * 动画窗口上绘制的文本内容
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * 动画窗口上绘制的文本区域
    * 默认值为{top:'0px',left:'0px',width:'100%',height:'44px'}。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var textRect: js.UndefOr[PlusNativeObjRect] = js.undefined
  /**
    * 动画窗口上绘制的文本样式
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var textStyles: js.UndefOr[PlusNativeObjTextStyles] = js.undefined
}

object PlusNativeObjAnimationViewStyles {
  @scala.inline
  def apply(
    bitmap: PlusNativeObjBitmap = null,
    text: String = null,
    textRect: PlusNativeObjRect = null,
    textStyles: PlusNativeObjTextStyles = null
  ): PlusNativeObjAnimationViewStyles = {
    val __obj = js.Dynamic.literal()
    if (bitmap != null) __obj.updateDynamic("bitmap")(bitmap.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textRect != null) __obj.updateDynamic("textRect")(textRect.asInstanceOf[js.Any])
    if (textStyles != null) __obj.updateDynamic("textStyles")(textStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusNativeObjAnimationViewStyles]
  }
}

