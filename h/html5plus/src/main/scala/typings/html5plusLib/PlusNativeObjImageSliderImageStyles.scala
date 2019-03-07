package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 图片轮播控件中图片项配置参数
  * 用于指定图片地址等信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
trait PlusNativeObjImageSliderImageStyles extends js.Object {
  /**
    * 图片水平对齐方式
    * 仅在图片显示的宽度与图片轮播控件宽度不一致时有效，可取值：
    * 		"left" - 图片在轮播控件中水平居左对齐；
    * 		"center" - 图片在轮播控件中水平居中对齐；
    * 		"right" - 图片在轮播控件中水平居右对齐。
    * 	默认值为"center"。
    * - left: 图片在轮播控件中水平居左对齐
    * - center: 图片在轮播控件中水平居中对齐
    * - right: 图片在轮播控件中水平居右对齐
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var align: js.UndefOr[
    html5plusLib.html5plusLibStrings.left | html5plusLib.html5plusLibStrings.center | html5plusLib.html5plusLibStrings.right
  ] = js.undefined
  /**
    * 图片显示的高度
    * 可取值：
    * 		像素值，如"100px"；
    * 		百分比，如"10%"，现对于图片轮播控件的高度；
    * 		自动计算"auto"，如果指定图片宽度（width），则按图片实际大小等比缩放图片高度值，如果没有指定宽度（width值为"auto"）则自动缩放图片至可完整显示。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 图片地址
    * 支持本地地址（相对地址、绝对路径、RelativeURL、本地路径URL）；
    * 	也支持网络地址（http://或https://）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var src: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 图片垂直对齐方式
    * 仅在图片显示的高度与图片轮播控件宽度不一致时有效，可取值：
    * 		"top" - 图片在轮播控件中垂直居顶对齐；
    * 		"middle" - 图片在轮播控件中垂直居中对齐；
    * 		"bottom" - 图片在轮播控件中垂直居底对齐。
    * 	默认值为"middle"。
    * - top: 图片在轮播控件中垂直居顶对齐
    * - middle: 图片在轮播控件中垂直居中对齐
    * - bottom: 图片在轮播控件中垂直居底对齐
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var verticalAlign: js.UndefOr[
    html5plusLib.html5plusLibStrings.top | html5plusLib.html5plusLibStrings.middle | html5plusLib.html5plusLibStrings.bottom
  ] = js.undefined
  /**
    * 图片显示的宽度
    * 可取值：
    * 		像素值，如"100px"；
    * 		百分比，如"10%"，相对于图片轮播控件的宽度；
    * 		自动计算"auto"，如果指定图片高度（height），则按图片实际大小等比缩放图片宽度值，如果没有指定高度（height值为"auto"）则自动缩放图片至可完整显示。
    * 	默认值为"auto"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object PlusNativeObjImageSliderImageStyles {
  @scala.inline
  def apply(
    align: html5plusLib.html5plusLibStrings.left | html5plusLib.html5plusLibStrings.center | html5plusLib.html5plusLibStrings.right = null,
    height: java.lang.String = null,
    src: java.lang.String = null,
    verticalAlign: html5plusLib.html5plusLibStrings.top | html5plusLib.html5plusLibStrings.middle | html5plusLib.html5plusLibStrings.bottom = null,
    width: java.lang.String = null
  ): PlusNativeObjImageSliderImageStyles = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height)
    if (src != null) __obj.updateDynamic("src")(src)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[PlusNativeObjImageSliderImageStyles]
  }
}

