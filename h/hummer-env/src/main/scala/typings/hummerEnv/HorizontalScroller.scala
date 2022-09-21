package typings.hummerEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HorizontalScroller
  extends StObject
     with HummerComponent
     with ContainerComponent {
  
  /**
    * @summary 滑动到边缘时是否有回弹效果 默认 true
    */
  var bounces: Boolean = js.native
  
  /**
    * 滚动一定距离（单位：dp/pt/hm/px）
    */
  def scrollBy(dx: Double, dy: Double): Unit = js.native
  
  /**
    * 滚动到指定坐标（单位：dp/pt/hm/px）
    */
  def scrollTo(x: Double, y: Double): Unit = js.native
  
  /**
    * 滚动到底部
    */
  def scrollToBottom(): Unit = js.native
  
  /**
    * 滚动到顶部
    */
  def scrollToTop(): Unit = js.native
  
  /**
    * 滚动到底部事件监听
    */
  def setOnScrollToBottomListener(cb: js.Function0[Unit]): Unit = js.native
  
  /**
    * 滚动到顶部事件监听
    */
  def setOnScrollToTopListener(cb: js.Function0[Unit]): Unit = js.native
  
  /**
    * @summary 是否展示滚动条, 默认 false
    */
  var showScrollBar: Boolean = js.native
}
