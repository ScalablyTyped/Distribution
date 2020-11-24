package typings.html5plus

import typings.html5plus.html5plusStrings.ImageSlider
import typings.html5plus.html5plusStrings.NView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 窗口原生子View控件样式
  * 可设置原生控件的标识、大小、位置以及绘制的内容等。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
@js.native
trait PlusWebviewWebviewSubNViewStyles extends js.Object {
  
  /**
    * 原生子View控件的标识
    * 可通过plus.nativeObj.View.getViewById(id)方法传入此标识来获取子View控件对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * 原生子View控件的样式
    * 可设置原生控件的位置、大小等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var styles: js.UndefOr[PlusNativeObjViewStyles] = js.native
  
  /**
    * 原生子View控件初始绘制内容
    * 可设置绘制图片、矩形区域、文本等内容。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var tags: js.UndefOr[js.Array[_]] = js.native
  
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
  var `type`: js.UndefOr[NView | ImageSlider] = js.native
}
object PlusWebviewWebviewSubNViewStyles {
  
  @scala.inline
  def apply(): PlusWebviewWebviewSubNViewStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewWebviewSubNViewStyles]
  }
  
  @scala.inline
  implicit class PlusWebviewWebviewSubNViewStylesOps[Self <: PlusWebviewWebviewSubNViewStyles] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setStyles(value: PlusNativeObjViewStyles): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: js.Any*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[_]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setType(value: NView | ImageSlider): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
