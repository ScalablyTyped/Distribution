package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Camera模块管理设备的摄像头，可用于拍照、摄像操作，通过plus.camera获取摄像头管理对象。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/camera.html](http://www.html5plus.org/doc/zh_cn/camera.html)
  */
@js.native
trait PlusCamera extends js.Object {
  
  /**
    * 摄像头对象
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/camera.html](http://www.html5plus.org/doc/zh_cn/camera.html)
    */
  var Camera: js.UndefOr[PlusCameraCamera] = js.native
  
  /**
    * JSON对象，调用摄像头的参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/camera.html](http://www.html5plus.org/doc/zh_cn/camera.html)
    */
  var CameraOptions: js.UndefOr[PlusCameraCameraOptions] = js.native
  
  /**
    * JSON对象，弹出拍照或摄像界面指示位置
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/camera.html](http://www.html5plus.org/doc/zh_cn/camera.html)
    */
  var PopPosition: js.UndefOr[PlusCameraPopPosition] = js.native
  
  /**
    * 获取摄像头管理对象
    * 获取需要操作的摄像头对象，如果要进行拍照或摄像操作，需先通过此方法获取摄像头对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/camera.html](http://www.html5plus.org/doc/zh_cn/camera.html)
    */
  def getCamera(): PlusCameraCamera = js.native
  def getCamera(index: Double): PlusCameraCamera = js.native
}
