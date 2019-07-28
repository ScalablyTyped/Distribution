package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 区域信息对象
  * 包括位置、大小等信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
trait PlusNativeObjPosition extends js.Object {
  /**
    * 区域底部相对于作用对象（或容器）向上的偏移量
    * 可取值：像素值，如"100px";百分比，如"10%"，相对于作用对象（或容器）的高度。
    * 	当设置了top和height值时，忽略此属性值；
    * 	当未设置top值时，可通过bottom属性值来确定区域的垂直位置；
    * 	当未设置height值时，可通过top和bottom属性值来确定区域的高度。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var bottom: js.UndefOr[String] = js.undefined
  /**
    * 区域的高度
    * 可取值：像素值，如"100px";百分比，如"10%"，相对于作用对象（或容器）的高度。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var height: js.UndefOr[String] = js.undefined
  /**
    * 区域左侧相对于作用对象（或容器）向右的偏移量
    * 可取值：像素值，如"100px"；百分比，如"10%"，相对于作用对象（或容器）的宽度；
    * 	自动计算，如"auto",根据width值自动计算，相对于作用对象（或容器）水平居中。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var left: js.UndefOr[String] = js.undefined
  /**
    * 区域右侧相对于作用对象（或容器）向左的偏移量
    * 可取值：像素值，如"100px";百分比，如"10%"，相对于作用对象（或容器）的宽度。
    * 	当设置了left和width值时，忽略此属性值；
    * 	当未设置left值时，可通过right属性值来确定区域的水平位置；
    * 	当未设置width值时，可通过left和right属性值来确定区域的宽度。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var right: js.UndefOr[String] = js.undefined
  /**
    * 区域顶部相对于作用对象（或容器）向下的偏移量
    * 可取值：像素值，如"100px"；百分比，如"10%"，相对于作用对象（或容器）的高度；
    * 	自动计算，如"auto",根据height值自动计算，相对于作用对象（或容器）垂直居中。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var top: js.UndefOr[String] = js.undefined
  /**
    * 区域的宽度
    * 可取值：像素值，如"100px";百分比，如"10%"，相对于作用对象（或容器）的宽度。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var width: js.UndefOr[String] = js.undefined
}

object PlusNativeObjPosition {
  @scala.inline
  def apply(
    bottom: String = null,
    height: String = null,
    left: String = null,
    right: String = null,
    top: String = null,
    width: String = null
  ): PlusNativeObjPosition = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom)
    if (height != null) __obj.updateDynamic("height")(height)
    if (left != null) __obj.updateDynamic("left")(left)
    if (right != null) __obj.updateDynamic("right")(right)
    if (top != null) __obj.updateDynamic("top")(top)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[PlusNativeObjPosition]
  }
}

