package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，监听设备方向感应器参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/orientation.html](http://www.html5plus.org/doc/zh_cn/orientation.html)
  */
trait PlusOrientationOrientationOption extends StObject {
  
  /**
    * 更新方向信息的时间间隔
    * 数值类型，单位为ms，默认值为500ms。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/orientation.html](http://www.html5plus.org/doc/zh_cn/orientation.html)
    */
  var frequency: js.UndefOr[Double] = js.undefined
}
object PlusOrientationOrientationOption {
  
  @scala.inline
  def apply(): PlusOrientationOrientationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusOrientationOrientationOption]
  }
  
  @scala.inline
  implicit class PlusOrientationOrientationOptionMutableBuilder[Self <: PlusOrientationOrientationOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
  }
}
