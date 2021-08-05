package typings.html5plus

import typings.html5plus.html5plusStrings.shrink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * View控件动画参数
  * 指定动画的类型、持续时间等信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
trait PlusNativeObjViewAnimationOptions extends StObject {
  
  /**
    * 动画持续时间
    * 单位为毫秒，默认值为200ms。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * 动画帧数
    * 必须为大于0的整数，默认值为12。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var frames: js.UndefOr[Double] = js.undefined
  
  /**
    * 动画作用区域
    * 支持以下属性：
    *     top - 区域距离控件顶部的偏移量，属性值可取像素值（如"100px"），百分比（如"10%"，相对于控件的高度）,默认值为'0px'；
    *     bottom - 区域距离控件底部的偏移量，属性值可取像素值（如"100px"），百分比（如"10%"，相对于控件的高度）,默认值为'0px'；
    *     left - 区域距离控件左侧的偏移量，属性值可取像素值（如"100px"），百分比（如"10%"，相对于控件的宽度）,默认值为'0px'；
    *     right - 区域距离控件右侧的偏移量，属性值可取像素值（如"100px"），百分比（如"10%"，相对于控件的宽度）,默认值为'0px'。
    *     如“{top:'44px',bottom:'48px'}”。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var region: js.UndefOr[PlusNativeObjRect] = js.undefined
  
  /**
    * 动画类型
    * 可取值："shrink" - 从上到下分块收缩清除窗口动画。
    * - shrink: 从上到下分块清除动画
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var `type`: js.UndefOr[shrink] = js.undefined
}
object PlusNativeObjViewAnimationOptions {
  
  inline def apply(): PlusNativeObjViewAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNativeObjViewAnimationOptions]
  }
  
  extension [Self <: PlusNativeObjViewAnimationOptions](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setFrames(value: Double): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
    
    inline def setRegion(value: PlusNativeObjRect): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setType(value: shrink): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
