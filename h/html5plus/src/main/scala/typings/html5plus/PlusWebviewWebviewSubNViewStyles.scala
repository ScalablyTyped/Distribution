package typings.html5plus

import typings.html5plus.html5plusStrings.ImageSlider
import typings.html5plus.html5plusStrings.NView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 窗口原生子View控件样式
  * 可设置原生控件的标识、大小、位置以及绘制的内容等。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewWebviewSubNViewStyles extends js.Object {
  /**
    * 原生子View控件的标识
    * 可通过plus.nativeObj.View.getViewById(id)方法传入此标识来获取子View控件对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * 原生子View控件的样式
    * 可设置原生控件的位置、大小等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var styles: js.UndefOr[PlusNativeObjViewStyles] = js.undefined
  /**
    * 原生子View控件初始绘制内容
    * 可设置绘制图片、矩形区域、文本等内容。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var tags: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * 原生子View控件类型
    * 可取值：
    *         "NView" - 原生子View控件（plus.nativeObj.NView）；
    *         "ImageSlider" - 原生图片轮播控件（plus.nativeObj.ImageSlider）。
    *     默认值为"NView"。
    * - NView: 
    *     原生子View控件（plus.nativeObj.NView）
    *                                 
    * - ImageSlider: 
    *     原生图片轮播控件（plus.nativeObj.ImageSlider）                            
    *                                 
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `type`: js.UndefOr[NView | ImageSlider] = js.undefined
}

object PlusWebviewWebviewSubNViewStyles {
  @scala.inline
  def apply(
    id: String = null,
    styles: PlusNativeObjViewStyles = null,
    tags: js.Array[_] = null,
    `type`: NView | ImageSlider = null
  ): PlusWebviewWebviewSubNViewStyles = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusWebviewWebviewSubNViewStyles]
  }
}

