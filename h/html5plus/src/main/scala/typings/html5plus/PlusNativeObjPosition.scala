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
@js.native
trait PlusNativeObjPosition extends js.Object {
  /**
    * 区域底部相对于作用对象（或容器）向上的偏移量
    * 可取值：像素值，如"100px";百分比，如"10%"，相对于作用对象（或容器）的高度。
    *     当设置了top和height值时，忽略此属性值；
    *     当未设置top值时，可通过bottom属性值来确定区域的垂直位置；
    *     当未设置height值时，可通过top和bottom属性值来确定区域的高度。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var bottom: js.UndefOr[String] = js.native
  /**
    * 区域的高度
    * 可取值：像素值，如"100px";百分比，如"10%"，相对于作用对象（或容器）的高度。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var height: js.UndefOr[String] = js.native
  /**
    * 区域左侧相对于作用对象（或容器）向右的偏移量
    * 可取值：像素值，如"100px"；百分比，如"10%"，相对于作用对象（或容器）的宽度；
    *     自动计算，如"auto",根据width值自动计算，相对于作用对象（或容器）水平居中。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var left: js.UndefOr[String] = js.native
  /**
    * 区域右侧相对于作用对象（或容器）向左的偏移量
    * 可取值：像素值，如"100px";百分比，如"10%"，相对于作用对象（或容器）的宽度。
    *     当设置了left和width值时，忽略此属性值；
    *     当未设置left值时，可通过right属性值来确定区域的水平位置；
    *     当未设置width值时，可通过left和right属性值来确定区域的宽度。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var right: js.UndefOr[String] = js.native
  /**
    * 区域顶部相对于作用对象（或容器）向下的偏移量
    * 可取值：像素值，如"100px"；百分比，如"10%"，相对于作用对象（或容器）的高度；
    *     自动计算，如"auto",根据height值自动计算，相对于作用对象（或容器）垂直居中。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var top: js.UndefOr[String] = js.native
  /**
    * 区域的宽度
    * 可取值：像素值，如"100px";百分比，如"10%"，相对于作用对象（或容器）的宽度。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var width: js.UndefOr[String] = js.native
}

object PlusNativeObjPosition {
  @scala.inline
  def apply(): PlusNativeObjPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNativeObjPosition]
  }
  @scala.inline
  implicit class PlusNativeObjPositionOps[Self <: PlusNativeObjPosition] (val x: Self) extends AnyVal {
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
    def setBottom(value: String): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLeft(value: String): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setRight(value: String): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setTop(value: String): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

