package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 摄像头对象
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/camera.html](http://www.html5plus.org/doc/zh_cn/camera.html)
  */
@js.native
trait PlusCameraCamera extends js.Object {
  /**
    * 字符串数组，摄像头支持的拍照文件格式
    * 属性类型为String[]，若不支持此属性则返回空数组对象。
    *     摄像头支持的图片文件格式字符串形式为文件格式后缀名，如“jpg”、“png”、“bmp”。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/camera.html](http://www.html5plus.org/doc/zh_cn/camera.html)
    */
  var supportedImageFormats: js.UndefOr[js.Array[_]] = js.native
  /**
    * 字符串数组，摄像头支持的拍照分辨率
    * 属性类型为String[]，若不支持此属性则返回空数组对象。
    *     摄像头支持的拍照图片分辨率字符串形式“WIDTH*Height”，如“400*800”；如果支持任意自定义分辨率则“*”。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/camera.html](http://www.html5plus.org/doc/zh_cn/camera.html)
    */
  var supportedImageResolutions: js.UndefOr[js.Array[_]] = js.native
  /**
    * 字符串数组，摄像头支持的摄像文件格式
    * 属性类型为String[]，若不支持此属性则返回空数组对象。
    *     摄像头支持的视频文件格式字符串形式为文件格式后缀名，如“3gp”、“mp4”、“avi”。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/camera.html](http://www.html5plus.org/doc/zh_cn/camera.html)
    */
  var supportedVideoFormats: js.UndefOr[js.Array[_]] = js.native
  /**
    * 字符串数组，摄像头支持的摄像分辨率
    * 属性类型为String[]，若不支持此属性则返回空数组对象。
    *     摄像头支持的视频分辨率字符串形式为“WIDTH*Height”，如“400*800”；如果支持任意自定义分辨率则“*”。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/camera.html](http://www.html5plus.org/doc/zh_cn/camera.html)
    */
  var supportedVideoResolutions: js.UndefOr[js.Array[_]] = js.native
  /**
    * 进行拍照操作
    * 摄像头资源为独占资源，如果其它程序或页面已经占用摄像头，再次操作则失败。
    *     拍照操作成功将通过successCB返回拍照获取的图片路径。
    *     可通过option设置摄像头的各种属性参数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/camera.html](http://www.html5plus.org/doc/zh_cn/camera.html)
    */
  def captureImage(): Unit = js.native
  def captureImage(
    successCB: js.UndefOr[scala.Nothing],
    errorCB: js.UndefOr[scala.Nothing],
    options: PlusCameraCameraOptions
  ): Unit = js.native
  def captureImage(successCB: js.UndefOr[scala.Nothing], errorCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def captureImage(
    successCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit],
    options: PlusCameraCameraOptions
  ): Unit = js.native
  def captureImage(successCB: js.Function1[/* result */ String, Unit]): Unit = js.native
  def captureImage(
    successCB: js.Function1[/* result */ String, Unit],
    errorCB: js.UndefOr[scala.Nothing],
    options: PlusCameraCameraOptions
  ): Unit = js.native
  def captureImage(
    successCB: js.Function1[/* result */ String, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def captureImage(
    successCB: js.Function1[/* result */ String, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit],
    options: PlusCameraCameraOptions
  ): Unit = js.native
  /**
    * 调用摄像头进行摄像操作
    * 摄像头资源为独占资源，如果其它程序或页面已经占用摄像头，再次操作则失败。
    *     拍照操作成功将通过successCB返回摄像获取的视频文件路径。
    *     可通过option设置摄像头的各种属性参数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/camera.html](http://www.html5plus.org/doc/zh_cn/camera.html)
    */
  def startVideoCapture(): Unit = js.native
  def startVideoCapture(
    successCB: js.UndefOr[scala.Nothing],
    errorCB: js.UndefOr[scala.Nothing],
    option: PlusCameraCameraOptions
  ): Unit = js.native
  def startVideoCapture(successCB: js.UndefOr[scala.Nothing], errorCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def startVideoCapture(
    successCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit],
    option: PlusCameraCameraOptions
  ): Unit = js.native
  def startVideoCapture(successCB: js.Function1[/* result */ String, Unit]): Unit = js.native
  def startVideoCapture(
    successCB: js.Function1[/* result */ String, Unit],
    errorCB: js.UndefOr[scala.Nothing],
    option: PlusCameraCameraOptions
  ): Unit = js.native
  def startVideoCapture(
    successCB: js.Function1[/* result */ String, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def startVideoCapture(
    successCB: js.Function1[/* result */ String, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit],
    option: PlusCameraCameraOptions
  ): Unit = js.native
  /**
    * 结束摄像操作
    * 开始调用摄像头进行摄像操作后，可在后台结束摄像操作，与用户在界面结束操作效果一致。
    *     摄像操作成功将通过startVideoCapture函数中的successCB返回拍照获取的图片路径。
    *     用户如果没有进行摄像操作关闭摄像头页面则调用失败回调函数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/camera.html](http://www.html5plus.org/doc/zh_cn/camera.html)
    */
  def stopVideoCapture(): Unit = js.native
}

