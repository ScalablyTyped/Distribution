package typings.html5plus

import typings.html5plus.html5plusStrings.`pop-in`
import typings.html5plus.html5plusStrings.`pop-out`
import typings.html5plus.html5plusStrings.`slide-in-right`
import typings.html5plus.html5plusStrings.`slide-out-right`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 原生动画参数
  * 指定动画的类型、持续时间等信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
trait PlusNativeObjAnimationOptions extends StObject {
  
  /**
    * 动画持续时间
    * 单位为毫秒，默认值为200ms。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * 动画类型
    * 可取值：
    *     "pop-in" - 从右侧平移入栈动画效果（副窗口从右侧向左平移滑出显示，主窗口从当前屏幕区域向左侧平移滑出被遮盖），如果仅传入一个View控件对象则自动降级为slide-in-right动画；
    *     "pop-out" - 从右侧平移出栈动画效果（副窗口从当前屏幕区域向右侧平移出可视区域，主窗口从左侧向右平移滑出显示），如果仅出入一个View控件对象则自动降级为slide-out-right动画；
    *     "slide-in-right" - 从右侧横向滑动效果（主窗口从当前屏幕右侧外向内横向滑动显示）；
    *     "slide-out-right - 横向向右侧滑出屏幕动画（主窗口从屏幕中横向向右侧滑动到屏幕外）。
    * - pop-in: 
    *     从右侧平移入栈动画效果（副窗口从右侧向左平移滑出显示，主窗口从当前屏幕区域向左侧平移滑出被遮盖）。
    *                                 
    * - pop-out: 
    *     从右侧平移出栈动画效果（副窗口从当前屏幕区域向右侧平移出可视区域，主窗口从左侧向右平移滑出显示）。
    *                                 
    * - slide-in-right: 
    *     从右侧横向滑动效果（主窗口从当前屏幕右侧外向内横向滑动显示）。
    *                                 
    * - slide-out-right: 
    *     横向向右侧滑出屏幕动画（主窗口从屏幕中横向向右侧滑动到屏幕外）。
    *                                 
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var `type`: js.UndefOr[`pop-in` | `pop-out` | `slide-in-right` | `slide-out-right`] = js.undefined
}
object PlusNativeObjAnimationOptions {
  
  inline def apply(): PlusNativeObjAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNativeObjAnimationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlusNativeObjAnimationOptions] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setType(value: `pop-in` | `pop-out` | `slide-in-right` | `slide-out-right`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
