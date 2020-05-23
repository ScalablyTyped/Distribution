package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 绘制区域样式对象
  * 用于定义矩形区域的显示样式，如空心/实心样式、圆角等信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
trait PlusNativeObjRectStyles extends js.Object {
  /**
    * 矩形边框颜色
    * 绘制矩形边框的颜色，可取值：
    *     "#RRGGBB"格式字符串，如"#FF0000"表示绘制红色区域；
    *     "rgba(R,G,B,A)"，其中R/G/B分别代表红色值/绿色值/蓝色值，正整数类型，取值范围为0-255，A为透明度，浮点数类型，取值范围为0-1（0为全透明，1为不透明），如"rgba(255,0,0,0.5)"，表示红色半透明。
    *     默认值为矩形填充区域颜色（color属性值）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var borderColor: js.UndefOr[String] = js.undefined
  /**
    * 矩形边框宽度
    * 可取值：像素值，数字加"px"格式字符串，如"2px"。
    *     默认值为"0px"（无边框）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var borderWidth: js.UndefOr[String] = js.undefined
  /**
    * 绘制颜色
    * 矩形填充区域的颜色，可取值：
    *     "#RRGGBB"格式字符串，如"#FF0000"表示绘制红色区域；
    *     "rgba(R,G,B,A)"，其中R/G/B分别代表红色值/绿色值/蓝色值，正整数类型，取值范围为0-255，A为透明度，浮点数类型，取值范围为0-1（0为全透明，1为不透明），如"rgba(255,0,0,0.5)"，表示红色半透明。
    *     默认值为"#FFFFFF"（白色）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * 矩形区域的圆角半径
    * 可取值：圆角半径像素值，数字加"px"格式字符串，如"6px"。
    *     默认值为"0px"（矩形无圆角）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var radius: js.UndefOr[String] = js.undefined
}

object PlusNativeObjRectStyles {
  @scala.inline
  def apply(
    borderColor: String = null,
    borderWidth: String = null,
    color: String = null,
    radius: String = null
  ): PlusNativeObjRectStyles = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusNativeObjRectStyles]
  }
}

