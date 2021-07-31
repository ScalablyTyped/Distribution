package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 监听设备加速度感应器参数
  * JSON对象，用于设置获取设备加速度信息的参数。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/accelerometer.html](http://www.html5plus.org/doc/zh_cn/accelerometer.html)
  */
trait PlusAccelerometerAccelerometerOption extends StObject {
  
  /**
    * 更新加速度信息间隔时间
    * 监听器获取加速度信息的时间间隔，单位为ms，默认值为500ms
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/accelerometer.html](http://www.html5plus.org/doc/zh_cn/accelerometer.html)
    */
  var frequency: js.UndefOr[Double] = js.undefined
}
object PlusAccelerometerAccelerometerOption {
  
  @scala.inline
  def apply(): PlusAccelerometerAccelerometerOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusAccelerometerAccelerometerOption]
  }
  
  @scala.inline
  implicit class PlusAccelerometerAccelerometerOptionMutableBuilder[Self <: PlusAccelerometerAccelerometerOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
  }
}
