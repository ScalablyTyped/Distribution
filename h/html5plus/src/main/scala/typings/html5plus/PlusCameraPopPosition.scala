package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，弹出拍照或摄像界面指示位置
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/camera.html](http://www.html5plus.org/doc/zh_cn/camera.html)
  */
trait PlusCameraPopPosition extends js.Object {
  /**
    * 指示区域的高度
    * 弹出拍照或摄像窗口指示区域的高度，支持像素值（如"100px"）和百分比（如"50%"）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/camera.html](http://www.html5plus.org/doc/zh_cn/camera.html)
    */
  var height: js.UndefOr[String] = js.undefined
  /**
    * 指示区域距离容器左侧的距离
    * 弹出拍照或摄像窗口指示区域距离容器左侧的距离，支持像素值（如"100px"）和百分比（如"50%"）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/camera.html](http://www.html5plus.org/doc/zh_cn/camera.html)
    */
  var left: js.UndefOr[String] = js.undefined
  /**
    * 指示区域距离容器顶部的距离
    * 弹出拍照或摄像窗口指示区域距离容器顶部的距离，支持像素值（如"100px"）和百分比（如"50%"）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/camera.html](http://www.html5plus.org/doc/zh_cn/camera.html)
    */
  var top: js.UndefOr[String] = js.undefined
  /**
    * 指示区域的宽度
    * 弹出拍照或摄像窗口指示区域的宽度，支持像素值（如"100px"）和百分比（如"50%"）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/camera.html](http://www.html5plus.org/doc/zh_cn/camera.html)
    */
  var width: js.UndefOr[String] = js.undefined
}

object PlusCameraPopPosition {
  @scala.inline
  def apply(height: String = null, left: String = null, top: String = null, width: String = null): PlusCameraPopPosition = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height)
    if (left != null) __obj.updateDynamic("left")(left)
    if (top != null) __obj.updateDynamic("top")(top)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[PlusCameraPopPosition]
  }
}

