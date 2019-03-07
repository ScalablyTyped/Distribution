package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，调用摄像头的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/camera.html](http://www.html5plus.org/doc/zh_cn/camera.html)
  */
trait PlusCameraCameraOptions extends js.Object {
  /**
    * 拍照或摄像文件保存的路径
    * 可设置具体文件名（如"_doc/camera/a.jpg"）；也可只设置路径，以"/"结尾则表明是路径（如"_doc/camera/"）。
    * 	如未设置文件名称或设置的文件名冲突则文件名由程序程序自动生成。
    * - _doc/: 应用私有文档目录
    * - _documents/: 共享文档目录
    * - _downloads/: 共享下载目录
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/camera.html](http://www.html5plus.org/doc/zh_cn/camera.html)
    */
  var filename: js.UndefOr[
    html5plusLib.html5plusLibStrings.`_doc/` | html5plusLib.html5plusLibStrings.`_documents/` | html5plusLib.html5plusLibStrings.`_downloads/`
  ] = js.undefined
  /**
    * 拍照或摄像的文件格式
    * 可通过Camera对象的supportedImageFormats或supportedVideoFormats获取，如果设置的参数无效则使用系统默认值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/camera.html](http://www.html5plus.org/doc/zh_cn/camera.html)
    */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 拍照或摄像默认使用的摄像头
    * 拍照或摄像界面默认使用的摄像头编号，1表示主摄像头，2表示辅摄像头。
    * - 1: 使用设备主摄像头
    * - 2: 使用设备辅摄像头
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/camera.html](http://www.html5plus.org/doc/zh_cn/camera.html)
    */
  var index: js.UndefOr[html5plusLib.html5plusLibStrings.`1` | html5plusLib.html5plusLibStrings.`2`] = js.undefined
  /**
    * 是否优化图片
    * 自动调整图片的方向，在部分设备上可能出现图片方向不正确的问题，此参数将配置是否自动调整图片方向。
    * 	可取值：
    * 		true - 自动调整图片方向；
    * 		false - 不调整。
    * 	默认值为true。
    * 	注意：自动调整图片方向将消耗部分系统资源，可能会导致拍照后回调触发时机延迟，将此值设置为false则可避免延迟问题。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/camera.html](http://www.html5plus.org/doc/zh_cn/camera.html)
    */
  var optimize: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 拍照或摄像界面弹出指示区域
    * 对于大屏幕设备如iPad，拍照或摄像界面为弹出窗口，此时可通过此参数设置弹出窗口位置，其为JSON对象，格式如{top:"10px",left:"10px",width:"200px",height:"200px"}，默认弹出位置为屏幕居中。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/camera.html](http://www.html5plus.org/doc/zh_cn/camera.html)
    */
  var popover: js.UndefOr[PlusCameraPopPosition] = js.undefined
  /**
    * 拍照或摄像使用的分辨率
    * 可通过Camera对象的supportedImageResolutions或supportedVideoResolutions获取，如果设置的参数无效则使用系统默认值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/camera.html](http://www.html5plus.org/doc/zh_cn/camera.html)
    */
  var resolution: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 视频长度
    * 单位为秒（s），小于等于0表示不限定视频长度。
    * 	默认值为0（不限定视频长度）。
    * 	注意：仅在调用拍摄视频（startVideoCapture）时有效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/camera.html](http://www.html5plus.org/doc/zh_cn/camera.html)
    */
  var videoMaximumDuration: js.UndefOr[scala.Double] = js.undefined
}

object PlusCameraCameraOptions {
  @scala.inline
  def apply(
    filename: html5plusLib.html5plusLibStrings.`_doc/` | html5plusLib.html5plusLibStrings.`_documents/` | html5plusLib.html5plusLibStrings.`_downloads/` = null,
    format: java.lang.String = null,
    index: html5plusLib.html5plusLibStrings.`1` | html5plusLib.html5plusLibStrings.`2` = null,
    optimize: js.UndefOr[scala.Boolean] = js.undefined,
    popover: PlusCameraPopPosition = null,
    resolution: java.lang.String = null,
    videoMaximumDuration: scala.Int | scala.Double = null
  ): PlusCameraCameraOptions = {
    val __obj = js.Dynamic.literal()
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(optimize)) __obj.updateDynamic("optimize")(optimize)
    if (popover != null) __obj.updateDynamic("popover")(popover)
    if (resolution != null) __obj.updateDynamic("resolution")(resolution)
    if (videoMaximumDuration != null) __obj.updateDynamic("videoMaximumDuration")(videoMaximumDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusCameraCameraOptions]
  }
}

