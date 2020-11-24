package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 直播推流控件配置选项
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
  */
@js.native
trait PlusVideoLivePusherStyles extends js.Object {
  
  /**
    * 宽高比
    * 可取值：3:4, 9:16。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var aspect: js.UndefOr[String] = js.native
  
  /**
    * 自动聚集
    * 默认值为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `auto-focus`: js.UndefOr[Boolean] = js.native
  
  /**
    * 是否美颜
    * 可取值0、1，其中0表示不使用美颜，1表示不使用美颜。
    *     默认值为0(不使用美颜)。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var beauty: js.UndefOr[Double] = js.native
  
  /**
    * 开启摄像头
    * 默认值为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `enable-camera`: js.UndefOr[Boolean] = js.native
  
  /**
    * LivePusher控件的高度
    * 可取值：
    *         像素值，如"100px"；
    *         百分比，如"10%"，相对于父Webview窗口的高度。
    *     默认值为"100%"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var height: js.UndefOr[String] = js.native
  
  /**
    * LivePusher控件左上角的水平偏移量
    * 可取值：
    *         像素值，如"100px"；
    *         百分比，如"10%"，相对于父Webview窗口的宽度；
    *         自动计算，如"auto"，根据width值自动计算，相对于父Webview窗口水平居中。
    *     默认值为"0px"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var left: js.UndefOr[String] = js.native
  
  /**
    * 推流视频模式
    * 可取值：SD（标清）, HD（高清）, FHD（超清）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var mode: js.UndefOr[String] = js.native
  
  /**
    * 是否静音
    * 默认值为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var muted: js.UndefOr[Boolean] = js.native
  
  /**
    * LivePusher控件在Webview窗口的布局模式
    * 可取值：
    *         "static" - 静态布局模式，如果页面存在滚动条则随窗口内容滚动；
    *         "absolute" - 绝对布局模式，如果页面存在滚动条不随窗口内容滚动；
    *     默认值为"static"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var position: js.UndefOr[String] = js.native
  
  /**
    * LivePusher控件左上角的垂直偏移量
    * 可取值：
    *         像素值，如"100px"；
    *         百分比，如"10%"，相对于父Webview窗口的高度；
    *         自动计算，如"auto",根据height值自动计算，相对于父Webview窗口垂直居中。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var top: js.UndefOr[String] = js.native
  
  /**
    * 推流地址
    * 支持RTMP协议。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var url: js.UndefOr[String] = js.native
  
  /**
    * 是否美白
    * 可取值0、1、2、3、4、5，其中0表示不使用美白，其余值分别表示美白的程度，值越大美白程度越大。
    *     默认值为0（不使用美白）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var whiteness: js.UndefOr[Double] = js.native
  
  /**
    * LivePusher控件的宽度
    * 可取值：
    *         像素值，如"100px"；
    *         百分比，如"10%"，相对于父Webview窗口的宽度。
    *     默认值为"100%"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var width: js.UndefOr[String] = js.native
}
object PlusVideoLivePusherStyles {
  
  @scala.inline
  def apply(): PlusVideoLivePusherStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusVideoLivePusherStyles]
  }
  
  @scala.inline
  implicit class PlusVideoLivePusherStylesOps[Self <: PlusVideoLivePusherStyles] (val x: Self) extends AnyVal {
    
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
    def setAspect(value: String): Self = this.set("aspect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAspect: Self = this.set("aspect", js.undefined)
    
    @scala.inline
    def `setAuto-focus`(value: Boolean): Self = this.set("auto-focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAuto-focus`: Self = this.set("auto-focus", js.undefined)
    
    @scala.inline
    def setBeauty(value: Double): Self = this.set("beauty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeauty: Self = this.set("beauty", js.undefined)
    
    @scala.inline
    def `setEnable-camera`(value: Boolean): Self = this.set("enable-camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteEnable-camera`: Self = this.set("enable-camera", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLeft(value: String): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setMuted(value: Boolean): Self = this.set("muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMuted: Self = this.set("muted", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setTop(value: String): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setWhiteness(value: Double): Self = this.set("whiteness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhiteness: Self = this.set("whiteness", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
