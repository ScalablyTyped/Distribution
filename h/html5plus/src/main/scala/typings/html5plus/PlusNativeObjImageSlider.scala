package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 原生图片轮播控件对象
  * 原生图片轮播控件对象从原生View控件（plus.nativeObj.View）继承而来，用于绘制图片轮播内容。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
@js.native
trait PlusNativeObjImageSlider extends js.Object {
  
  /**
    * 添加图片轮播控件的图片
    * 动态添加图片轮播控件显示的图片。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def addImages(): Unit = js.native
  def addImages(images: js.Array[PlusNativeObj]): Unit = js.native
  
  /**
    * 获取当前图片轮播控件显示的图片索引值
    * 索引值从0开始，即0表示图片轮播控件当前显示第一张图片。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def currentImageIndex(): Double = js.native
  
  /**
    * 设置图片轮播控件的图片
    * 动态更新图片轮播控件显示的图片。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def setImages(): Unit = js.native
  def setImages(images: js.Array[PlusNativeObj]): Unit = js.native
}
