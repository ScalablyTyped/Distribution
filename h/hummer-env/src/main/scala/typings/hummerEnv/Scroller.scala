package typings.hummerEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scroller
  extends StObject
     with HummerComponent
     with ContainerComponent {
  
  /**
    * 滑动到边缘时是否有回弹效果 默认 true
    */
  var bounces: Boolean = js.native
  
  /**
    * 上拉加载更多时展示的视图
    */
  var loadMoreView: HummerComponent = js.native
  
  /**
    * 上拉加载时触发的回调 state取值：0: 初始状态/结束加载 1: 正在加载 2: 无更多数据
    */
  def onLoadMore(state: Double): Unit = js.native
  
  /**
    * 下拉刷新时触发的回调 state取值：0: 初始状态/结束刷新 1: 开始下拉 2: 正在刷新
    */
  def onRefresh(state: Double): Unit = js.native
  
  /**
    * 下拉刷新时展示的视图
    */
  var refreshView: HummerComponent = js.native
  
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
    * 滑动时是否显示滚动条 默认false
    */
  var showScrollBar: Boolean = js.native
  
  /**
    * stop loadmore
    * @param enable can able to trigger next loadmore or not
    */
  def stopLoadMore(enable: Boolean): Unit = js.native
  
  /**
    * 结束下拉刷新
    */
  def stopPullRefresh(): Unit = js.native
}
