package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Maps模块管理地图控件，用于在web页面中显示地图控件，提供各种接口操作地图控件，如添加标点、路线等。通过plus.maps可获取地图管理对象。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
  */
@js.native
trait PlusMaps extends StObject {
  
  /**
    * 地理区域
    * 有西南及东北坐标点数据组成的矩形区域。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var Bounds: js.UndefOr[PlusMapsBounds] = js.native
  
  /**
    * 地图上显示的气泡对象
    * 此对象不能直接添加到地图上显示，只可关联到地图标点覆盖物上，用户点击标点时弹出显示。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var Bubble: js.UndefOr[PlusMapsBubble] = js.native
  
  /**
    * 地图上显示的圆圈对象
    * 从Overlay对象继承而来，可通过Map对象的addOverlay()方法将对象添加地图中。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var Circle: js.UndefOr[PlusMapsCircle] = js.native
  
  /**
    * 地图坐标转换的参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var CoordinateConvertOptions: js.UndefOr[PlusMapsCoordinateConvertOptions] = js.native
  
  /**
    * 地理编码转换的参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var GeocodeOptions: js.UndefOr[PlusMapsGeocodeOptions] = js.native
  
  /**
    * 地图控件对象
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var Map: js.UndefOr[PlusMapsMap] = js.native
  
  /**
    * 地图控件对象的参数
    * 设置地图对象显示时使用的参数，如地图的中心位置、缩放级别等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var MapStyles: js.UndefOr[PlusMapsMapStyles] = js.native
  
  /**
    * 地图视图类型
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var MapType: js.UndefOr[PlusMapsMapType] = js.native
  
  /**
    * 地图上显示的标点对象
    * 从Overlay对象继承而来，可通过Map对象的addOverlay()方法将对象添加地图中。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var Marker: js.UndefOr[PlusMapsMarker] = js.native
  
  /**
    * 地图覆盖物基类对象
    * Overlay是地图上显示元素的基类，用于抽象地图元素，不用于实例化。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var Overlay: js.UndefOr[PlusMapsOverlay] = js.native
  
  /**
    * Point对象用于表示地图元素的坐标
    * 常用语对地图上元素进行定位时使用。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var Point: js.UndefOr[PlusMapsPoint] = js.native
  
  /**
    * 地图上显示的多边形对象
    * 从Overlay对象继承而来，可通过Map对象的addOverlay()方法将对象添加地图中。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var Polygon: js.UndefOr[PlusMapsPolygon] = js.native
  
  /**
    * 地图上显示的折线对象
    * 从Overlay对象继承而来，可通过Map对象的addOverlay()方法将对象添加地图中。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var Polyline: js.UndefOr[PlusMapsPolyline] = js.native
  
  /**
    * 检索结果的位置点
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var Position: js.UndefOr[PlusMapsPosition] = js.native
  
  /**
    * 地图中的路线对象
    * 从Overlay对象继承而来，可通过Map对象的addOverlay()方法将对象添加地图中。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var Route: js.UndefOr[PlusMapsRoute] = js.native
  
  /**
    * 地图检索对象
    * Search对象用于管理地图上的检索功能，包括位置检索、周边检索和范围检索。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var Search: js.UndefOr[PlusMapsSearch] = js.native
  
  /**
    * 保存位置检索、周边检索和范围检索返回的结果
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var SearchPoiResult: js.UndefOr[PlusMapsSearchPoiResult] = js.native
  
  /**
    * 检索策略类型
    * 在线路检索时设置检索策略时使用。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var SearchPolicy: js.UndefOr[PlusMapsSearchPolicy] = js.native
  
  /**
    * 保存位置检索、周边检索和范围检索返回的结果
    * 不可通过new操作符创建SearchRouteResult对象，在触发onRouteSearchComplete()时自动创建。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var SearchRouteResult: js.UndefOr[PlusMapsSearchRouteResult] = js.native
  
  /**
    * 创建Map对象
    * 调用此方法创建后并不会显示，需要调用Webview窗口的append方法将其添加到Webview窗口后才能显示。
    *     注意：此时需要通过styles参数的top/left/width/height属性设置控件的位置及大小。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def create(): PlusMapsMap = js.native
  def create(id: String): PlusMapsMap = js.native
  def create(id: String, styles: PlusMapsMapStyles): PlusMapsMap = js.native
  def create(id: Unit, styles: PlusMapsMapStyles): PlusMapsMap = js.native
  
  /**
    * 查找已经创建的Map对象
    * 调用此方法查找指定id的Map对象，如果不存在则返回null。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getMapById(): PlusMapsMap = js.native
  def getMapById(id: String): PlusMapsMap = js.native
  
  /**
    * 调用系统第三方程序进行导航
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def openSysMap(): Unit = js.native
  def openSysMap(dst: Unit, des: String): Unit = js.native
  def openSysMap(dst: Unit, des: String, src: PlusMapsPoint): Unit = js.native
  def openSysMap(dst: Unit, des: Unit, src: PlusMapsPoint): Unit = js.native
  def openSysMap(dst: PlusMapsPoint): Unit = js.native
  def openSysMap(dst: PlusMapsPoint, des: String): Unit = js.native
  def openSysMap(dst: PlusMapsPoint, des: String, src: PlusMapsPoint): Unit = js.native
  def openSysMap(dst: PlusMapsPoint, des: Unit, src: PlusMapsPoint): Unit = js.native
}
