package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 地图覆盖物基类对象
  * Overlay是地图上显示元素的基类，用于抽象地图元素，不用于实例化。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
  */
trait PlusMapsOverlay extends StObject {
  
  /**
    * 隐藏地图上的覆盖物
    * 常用于地图覆盖物在显示后调用此方法来隐藏。
    *         只有添加到地图上的覆盖物才能看到效果；
    *         如果覆盖物对象已经在地图上隐藏再调用此方法将无效果。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def hide(): Unit
  
  /**
    * 判断地图覆盖物是否可见
    * 地图覆盖物对象默认为可见；地图覆盖物对象是否可见由其自身状态决定，不管其是否被添加到地图层中。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def isVisible(): Boolean
  
  /**
    * 显示地图上的覆盖物
    * 常用于地图覆盖物在隐藏后调用此方法来显示。
    *     只有添加到地图上的覆盖物才能看到效果；
    *     如果覆盖物对象已经在地图上显示再调用此方法将无效果。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def show(): Unit
}
object PlusMapsOverlay {
  
  @scala.inline
  def apply(hide: () => Unit, isVisible: () => Boolean, show: () => Unit): PlusMapsOverlay = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), isVisible = js.Any.fromFunction0(isVisible), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[PlusMapsOverlay]
  }
  
  @scala.inline
  implicit class PlusMapsOverlayMutableBuilder[Self <: PlusMapsOverlay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsVisible(value: () => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
