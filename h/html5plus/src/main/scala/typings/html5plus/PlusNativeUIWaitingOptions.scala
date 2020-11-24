package typings.html5plus

import typings.html5plus.html5plusStrings.black
import typings.html5plus.html5plusStrings.close
import typings.html5plus.html5plusStrings.none
import typings.html5plus.html5plusStrings.transmit
import typings.html5plus.html5plusStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，原生等待对话框的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
  */
@js.native
trait PlusNativeUIWaitingOptions extends js.Object {
  
  /**
    * 返回键处理方式
    * 可取值"none"表示截获处理返回键，但不做任何响应；"close"表示截获处理返回键并关闭等待框；"transmit"表示不截获返回键，向后传递给Webview窗口继续处理（与未显示等待框的情况一致）。
    * - none: 截获返回键，不做任何响应
    * - close: 截获返回键并关闭等待框
    * - transmit: 不截获返回键，继续传递给Webview窗口
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var back: js.UndefOr[none | close | transmit] = js.native
  
  /**
    * 等待对话框显示区域的背景色
    * 背景色的值支持(参考CSS颜色规范)：颜色名称(参考CSS Color Names)/十六进制值/rgb值/rgba值，默认值为rgba(0,0,0,0.8)。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var background: js.UndefOr[String] = js.native
  
  /**
    * 等待框中文字的颜色
    * 颜色值支持(参考CSS颜色规范)：颜色名称(参考CSS Color Names)/十六进制值/rgb值/rgba值，默认值为白色。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * 等待框背景区域的高度
    * 值支持像素绝对值（"500px"）或百分比（"50%"），如果不设置则根据内容自动计算合适的高度。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var height: js.UndefOr[String] = js.native
  
  /**
    * 自定义等待框上loading图标样式
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var loading: js.UndefOr[PlusNativeUIWaitingLoadingOptions] = js.native
  
  /**
    * 等待框是否模态显示
    * 模态显示时用户不可操作直到等待对话框关闭，否则用户在等待对话框显示时也可操作下面的内容，未设置时默认为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var modal: js.UndefOr[Boolean] = js.native
  
  /**
    * 等待对话框的内边距
    * 值支持像素值（"10px"）和百分比（"5%"），百分比相对于屏幕的宽计算，默认值为"3%"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var padding: js.UndefOr[String] = js.native
  
  /**
    * 点击等待显示区域是否自动关闭
    * true表示点击等待对话框显示区域时自动关闭，false则不关闭，未设置时默认值为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var padlock: js.UndefOr[Boolean] = js.native
  
  /**
    * 等待框显示区域的圆角
    * 值支持像素值（"10px"），未设置时使用默认值"10px"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var round: js.UndefOr[Double] = js.native
  
  /**
    * 等待框中文字的字体大小
    * 如"14px"表示使用14像素高的文字，未设置则使用系统默认字体大小。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var size: js.UndefOr[String] = js.native
  
  /**
    * 等待对话框样式
    * 可取值"black"、"white"，black表示等待框为黑色雪花样式，通常在背景主色为浅色时使用；white表示等待框为白色雪花样式，通常在背景主色为深色时使用。
    *     仅在iOS平台有效，其它平台忽略此值，未设置时默认值为white。
    * - black: 黑色雪花样式，适合浅色界面使用
    * - white: 白色雪花样式，适合深色界面使用
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var style: js.UndefOr[black | white] = js.native
  
  /**
    * 等待对话框中标题文字的水平对齐方式
    * 对齐方式可选值包括："left"：水平居左对齐显示，"center"：水平居中对齐显示，"right"：水平居右对齐显示。默认值为水平居中对齐显示，即"center"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var textalign: js.UndefOr[String] = js.native
  
  /**
    * 等待框背景区域的宽度
    * 值支持像素值（"500px"）或百分比（"50%"），百分比相对于屏幕的宽计算，如果不设置则根据内容自动计算合适的宽度。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var width: js.UndefOr[String] = js.native
}
object PlusNativeUIWaitingOptions {
  
  @scala.inline
  def apply(): PlusNativeUIWaitingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNativeUIWaitingOptions]
  }
  
  @scala.inline
  implicit class PlusNativeUIWaitingOptionsOps[Self <: PlusNativeUIWaitingOptions] (val x: Self) extends AnyVal {
    
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
    def setBack(value: none | close | transmit): Self = this.set("back", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBack: Self = this.set("back", js.undefined)
    
    @scala.inline
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLoading(value: PlusNativeUIWaitingLoadingOptions): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = this.set("modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    
    @scala.inline
    def setPadding(value: String): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setPadlock(value: Boolean): Self = this.set("padlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadlock: Self = this.set("padlock", js.undefined)
    
    @scala.inline
    def setRound(value: Double): Self = this.set("round", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStyle(value: black | white): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTextalign(value: String): Self = this.set("textalign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextalign: Self = this.set("textalign", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
