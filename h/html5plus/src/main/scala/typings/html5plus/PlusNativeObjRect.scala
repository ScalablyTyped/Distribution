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
trait PlusNativeObjRect extends js.Object {
  /**
    * 区域的高度
    * 可取值：
    * 		像素值，如"100px"；
    * 		百分比，如"10%"，相对于作用对象的高度。
    * 		内容自适应，如"wrap_content"，根据内容计算高度（如调用drawText绘制文本时支持）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var height: js.UndefOr[String] = js.undefined
  /**
    * 区域左上角的水平偏移量
    * 可取值：
    * 		像素值，如"100px"；
    * 		百分比，如"10%"，相对于作用对象的宽度；
    * 		自动计算，如"auto",根据width值自动计算，相对于作用对象水平居中。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var left: js.UndefOr[String] = js.undefined
  /**
    * 区域左上角的垂直偏移量
    * 可取值：
    * 		像素值，如"100px"；
    * 		百分比，如"10%"，相对于作用对象的高度；
    * 		自动计算，如"auto",根据height值自动计算，相对于作用对象垂直居中。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var top: js.UndefOr[String] = js.undefined
  /**
    * 区域的宽度
    * 可取值：
    * 		像素值，如"100px"；
    * 		百分比，如"10%"，相对于作用对象的宽度。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var width: js.UndefOr[String] = js.undefined
}

object PlusNativeObjRect {
  @scala.inline
  def apply(height: String = null, left: String = null, top: String = null, width: String = null): PlusNativeObjRect = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height)
    if (left != null) __obj.updateDynamic("left")(left)
    if (top != null) __obj.updateDynamic("top")(top)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[PlusNativeObjRect]
  }
}

