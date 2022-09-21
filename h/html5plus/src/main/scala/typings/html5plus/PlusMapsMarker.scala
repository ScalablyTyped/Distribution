package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 地图上显示的标点对象
  * 从Overlay对象继承而来，可通过Map对象的addOverlay()方法将对象添加地图中。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
  */
@js.native
trait PlusMapsMarker extends StObject {
  
  /**
    * 覆盖物显示到最上层
    * 常用于覆盖物相互覆盖时调整覆盖物的显示顺序。
    *     只有添加到地图上的覆盖物才能看到效果；
    *     如果覆盖物对象已经在地图上隐藏再调用此方法将无效果。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def bringToTop(): Unit = js.native
  
  /**
    * 获取标点上显示的文本标注
    * 如果没有设置关联的气泡对象则返回null。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getBubble(): PlusMapsBubble = js.native
  
  /**
    * 获取标点上显示的文本标注
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getLabel(): String = js.native
  
  /**
    * 获取标点的坐标
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getPoint(): PlusMapsPoint = js.native
  
  /**
    * 隐藏标点上显示的气泡
    * 如果没有设置关联的气泡对象或者气泡对象没有弹出显示，则不做任何操作。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def hideBubble(): Unit = js.native
  
  /**
    * 获取标点是否允许拖拽
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def isDraggable(): Boolean = js.native
  
  /**
    * 用户拖拽标点事件
    * 可调用标点对象的markObj.setDraggable(true)方法设置标点允许拖拽，当用户拖拽标点对象时触发此事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var onDrag: js.UndefOr[js.Function1[/* result */ Any, Unit]] = js.native
  
  /**
    * 用户点击地图标点事件
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var onclick: js.UndefOr[js.Function1[/* result */ PlusMapsOverlay, Unit]] = js.native
  
  /**
    * 设置标点的气泡内容
    * 设置气泡内容后，用户点击标点时弹出则弹出气泡。
    *     注意：用户点击标点时先弹出标点关联的气泡，再响应标点的onclick事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setBubble(): Unit = js.native
  def setBubble(buuble: Unit, pop: Boolean): Unit = js.native
  def setBubble(buuble: PlusMapsBubble): Unit = js.native
  def setBubble(buuble: PlusMapsBubble, pop: Boolean): Unit = js.native
  
  /**
    * 设置标点的是否允许拖拽
    * 设置标点可拖拽后，用户按住标点后拖动，标点会跟随手的拖拽而移动。
    *     拖拽后会更新标点的坐标信息。
    *     注：拖动前需要先在标点上长按。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setDraggable(): Unit = js.native
  def setDraggable(draggable: Boolean): Unit = js.native
  
  /**
    * 设置标点上显示的图标
    * 若未设置则显示默认标点图标，已添加的标点在设置新值后将在地图上立即更新标点内容。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setIcon(): Unit = js.native
  def setIcon(icon: String): Unit = js.native
  
  /**
    * 设置标点上显示的图标数组
    * 设置图标数组后则按照指定的间隔时间轮播数组中图标。
    *     设置图标数组后将忽略setIcon方法设置的图标，未设置则显示setIcon设置的图标。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setIcons(): Unit = js.native
  def setIcons(icons: js.Array[Any]): Unit = js.native
  
  /**
    * 设置标点上显示的文本标注
    * 若未设置则不显示标注（默认为空字符串），已添加的标点在设置新值后将在地图上立即更新标点内容。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setLabel(): Unit = js.native
  def setLabel(label: String): Unit = js.native
  
  /**
    * 设置标点对象的坐标
    * 标点在设置新坐标后将在地图上立即更新标点位置。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setPoint(): Unit = js.native
  def setPoint(point: PlusMapsPoint): Unit = js.native
}
