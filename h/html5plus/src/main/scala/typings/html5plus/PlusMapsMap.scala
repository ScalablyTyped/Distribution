package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 地图控件对象
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
  */
@js.native
trait PlusMapsMap extends StObject {
  
  /**
    * 向地图中添加覆盖物
    * 此方法用于向地图中添加覆盖物。
    *     支持各种从maps.Overlay对象继承的各种覆盖物对象；
    *     如果添加不支持的对象则直接返回false；
    *     同一覆盖物对象只能添加到地图中一次，已在地图中的覆盖物再次添加时则返回false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def addOverlay(): Boolean = js.native
  def addOverlay(overlay: PlusMapsOverlay): Boolean = js.native
  
  /**
    * 静态方法，计算面积
    * 计算指定地理区域的面积，单位为平方米。
    *     注：此功能仅百度地图支持，高德地图暂不支持此功能。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def calculateArea(): Unit = js.native
  def calculateArea(
    bounds: js.UndefOr[scala.Nothing],
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def calculateArea(bounds: js.UndefOr[scala.Nothing], successCallback: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def calculateArea(
    bounds: js.UndefOr[scala.Nothing],
    successCallback: js.Function1[/* result */ js.Any, Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def calculateArea(bounds: PlusMapsBounds): Unit = js.native
  def calculateArea(
    bounds: PlusMapsBounds,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def calculateArea(bounds: PlusMapsBounds, successCallback: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def calculateArea(
    bounds: PlusMapsBounds,
    successCallback: js.Function1[/* result */ js.Any, Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  
  /**
    * 静态方法，计算距离
    * 计算从pointStart坐标点到pointEnd坐标的实际直线距离，单位为米（m）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def calculateDistance(): Unit = js.native
  def calculateDistance(
    pointStart: js.UndefOr[scala.Nothing],
    pointEnd: js.UndefOr[scala.Nothing],
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def calculateDistance(
    pointStart: js.UndefOr[scala.Nothing],
    pointEnd: js.UndefOr[scala.Nothing],
    successCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def calculateDistance(
    pointStart: js.UndefOr[scala.Nothing],
    pointEnd: js.UndefOr[scala.Nothing],
    successCallback: js.Function1[/* result */ js.Any, Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def calculateDistance(pointStart: js.UndefOr[scala.Nothing], pointEnd: PlusMapsPoint): Unit = js.native
  def calculateDistance(
    pointStart: js.UndefOr[scala.Nothing],
    pointEnd: PlusMapsPoint,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def calculateDistance(
    pointStart: js.UndefOr[scala.Nothing],
    pointEnd: PlusMapsPoint,
    successCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def calculateDistance(
    pointStart: js.UndefOr[scala.Nothing],
    pointEnd: PlusMapsPoint,
    successCallback: js.Function1[/* result */ js.Any, Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def calculateDistance(pointStart: PlusMapsPoint): Unit = js.native
  def calculateDistance(
    pointStart: PlusMapsPoint,
    pointEnd: js.UndefOr[scala.Nothing],
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def calculateDistance(
    pointStart: PlusMapsPoint,
    pointEnd: js.UndefOr[scala.Nothing],
    successCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def calculateDistance(
    pointStart: PlusMapsPoint,
    pointEnd: js.UndefOr[scala.Nothing],
    successCallback: js.Function1[/* result */ js.Any, Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def calculateDistance(pointStart: PlusMapsPoint, pointEnd: PlusMapsPoint): Unit = js.native
  def calculateDistance(
    pointStart: PlusMapsPoint,
    pointEnd: PlusMapsPoint,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def calculateDistance(
    pointStart: PlusMapsPoint,
    pointEnd: PlusMapsPoint,
    successCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def calculateDistance(
    pointStart: PlusMapsPoint,
    pointEnd: PlusMapsPoint,
    successCallback: js.Function1[/* result */ js.Any, Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  
  /**
    * 设置地图初始中心点和缩放级别
    * 用于设置地图的初始中心点和缩放级别，通常在创建地图后立即调用。
    *     默认中心点为天安门，默认缩放级别为12；
    *     该方法设置的中心点和缩放级别可通过reset()方法恢复；
    *     如果在地图显示后调用将改变地图的中心点和缩放级别并立即更新，并将初始值更新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def centerAndZoom(): Unit = js.native
  def centerAndZoom(center: js.UndefOr[scala.Nothing], zoom: Double): Unit = js.native
  def centerAndZoom(center: PlusMapsPoint): Unit = js.native
  def centerAndZoom(center: PlusMapsPoint, zoom: Double): Unit = js.native
  
  /**
    * 清除地图中所有覆盖物对象
    * 此方法用于清除地图中所有覆盖物对象。
    *     清除地图中的覆盖物对象后会自动更新地图视图。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def clearOverlays(): Unit = js.native
  
  /**
    * 关闭地图控件
    * 关闭地图控件将会销毁地图使用的资源，不可再使用。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def close(): Unit = js.native
  
  /**
    * 静态方法，坐标转换
    * 将第三方坐标系坐标转换成当前地图的坐标系坐标。
    *     转换成功通过successCallback返回，转换失败则通过errorCallback返回。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def convertCoordinates(): Unit = js.native
  def convertCoordinates(
    point: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def convertCoordinates(
    point: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    successCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def convertCoordinates(
    point: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    successCallback: js.Function1[/* result */ js.Any, Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def convertCoordinates(point: js.UndefOr[scala.Nothing], options: PlusMapsCoordinateConvertOptions): Unit = js.native
  def convertCoordinates(
    point: js.UndefOr[scala.Nothing],
    options: PlusMapsCoordinateConvertOptions,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def convertCoordinates(
    point: js.UndefOr[scala.Nothing],
    options: PlusMapsCoordinateConvertOptions,
    successCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def convertCoordinates(
    point: js.UndefOr[scala.Nothing],
    options: PlusMapsCoordinateConvertOptions,
    successCallback: js.Function1[/* result */ js.Any, Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def convertCoordinates(point: PlusMapsPoint): Unit = js.native
  def convertCoordinates(
    point: PlusMapsPoint,
    options: js.UndefOr[scala.Nothing],
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def convertCoordinates(
    point: PlusMapsPoint,
    options: js.UndefOr[scala.Nothing],
    successCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def convertCoordinates(
    point: PlusMapsPoint,
    options: js.UndefOr[scala.Nothing],
    successCallback: js.Function1[/* result */ js.Any, Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def convertCoordinates(point: PlusMapsPoint, options: PlusMapsCoordinateConvertOptions): Unit = js.native
  def convertCoordinates(
    point: PlusMapsPoint,
    options: PlusMapsCoordinateConvertOptions,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def convertCoordinates(
    point: PlusMapsPoint,
    options: PlusMapsCoordinateConvertOptions,
    successCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def convertCoordinates(
    point: PlusMapsPoint,
    options: PlusMapsCoordinateConvertOptions,
    successCallback: js.Function1[/* result */ js.Any, Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  
  /**
    * 静态方法，地理编码
    * 将地理位置信息转换为坐标点。
    *     转换成功通过successCallback返回，转换失败则通过errorCallback返回。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def geocode(): Unit = js.native
  def geocode(
    address: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def geocode(
    address: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    successCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def geocode(
    address: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    successCallback: js.Function1[/* result */ js.Any, Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def geocode(address: js.UndefOr[scala.Nothing], options: PlusMapsGeocodeOptions): Unit = js.native
  def geocode(
    address: js.UndefOr[scala.Nothing],
    options: PlusMapsGeocodeOptions,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def geocode(
    address: js.UndefOr[scala.Nothing],
    options: PlusMapsGeocodeOptions,
    successCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def geocode(
    address: js.UndefOr[scala.Nothing],
    options: PlusMapsGeocodeOptions,
    successCallback: js.Function1[/* result */ js.Any, Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def geocode(address: String): Unit = js.native
  def geocode(
    address: String,
    options: js.UndefOr[scala.Nothing],
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def geocode(
    address: String,
    options: js.UndefOr[scala.Nothing],
    successCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def geocode(
    address: String,
    options: js.UndefOr[scala.Nothing],
    successCallback: js.Function1[/* result */ js.Any, Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def geocode(address: String, options: PlusMapsGeocodeOptions): Unit = js.native
  def geocode(
    address: String,
    options: PlusMapsGeocodeOptions,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def geocode(
    address: String,
    options: PlusMapsGeocodeOptions,
    successCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def geocode(
    address: String,
    options: PlusMapsGeocodeOptions,
    successCallback: js.Function1[/* result */ js.Any, Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  
  /**
    * 获取当前地图可视范围的地理区域
    * 当旋转或俯视时，是当前地图可视范围的最大外接矩形地理区域。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getBounds(): PlusMapsBounds = js.native
  
  /**
    * 获取地图中心点位置
    * 此方法用于获取设置的地图中心点位置（centerAndZoom/setCenter）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getCenter(): PlusMapsPoint = js.native
  
  /**
    * 获取当前地图显示的地图中心点位置
    * 此方法用于获取当前地图显示的地图中心点位置，获取成功后通过callback回调返回。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getCurrentCenter(): Boolean = js.native
  def getCurrentCenter(callback: js.Function2[/* result0 */ Double, /* result1 */ PlusMapsPoint, Unit]): Boolean = js.native
  
  /**
    * 获取地图的显示类型
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getMapType(): PlusMapsMapType = js.native
  
  /**
    * 获取用户的当前位置信息
    * 此方法用于获取用户的当前位置信息，获取成功后通过callback回调返回。
    *     获取用户当前位置信息将打开定位设备。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getUserLocation(): Boolean = js.native
  def getUserLocation(callback: js.Function2[/* result0 */ Double, /* result1 */ PlusMapsPoint, Unit]): Boolean = js.native
  
  /**
    * 获取地图的缩放级别
    * 此方法用于设置地图的缩放级别，用于切换当前显示地图缩放级别。
    *     该方法改变缩放级别后地图显示内容将立即更新；
    *     该方法不会改变地图显示区域，以当前地图显示的中心点位置来缩放地图。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getZoom(): Double = js.native
  
  /**
    * 隐藏地图控件
    * 此方法用于隐藏地图控件，通常在显示后调用此方法来隐藏。
    *     如果地图已经隐藏再调用此方法将无效果。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def hide(): Unit = js.native
  
  /**
    * 获取是否显示用户位置
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def isShowUserLocation(): Boolean = js.native
  
  /**
    * 获取是否显示地图内置缩放控件
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def isShowZoomControls(): Boolean = js.native
  
  /**
    * 获取是否打开地图交通信息图层
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def isTraffic(): Boolean = js.native
  
  /**
    * 用户点击地图事件
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var onclick: js.UndefOr[js.Function1[/* result */ PlusMapsPoint, Unit]] = js.native
  
  /**
    * 地图状态改变事件
    * 用户拖动、缩放地图等操作完成后触发。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var onstatuschanged: js.UndefOr[js.Function1[/* result */ js.Any, Unit]] = js.native
  
  /**
    * 从地图中删除覆盖物对象
    * 此方法用于从地图中删除覆盖物对象。
    *     支持各种从maps.Overlay对象继承的各种覆盖物对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def removeOverlay(): Unit = js.native
  def removeOverlay(overlay: PlusMapsOverlay): Unit = js.native
  
  /**
    * 重置地图
    * 此方法用于重新设置地图，恢复地图的初始化时的中心点和缩放级别。
    *     该方法将导致显示内容将立即更新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def reset(): Unit = js.native
  
  /**
    * 重设地图控件大小
    * 此方法用于重新计算地图控件大小，保持与构造时传入DOM元素的大小及位置一致。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def resize(): Unit = js.native
  
  /**
    * 静态方法，反向地理编码
    * 将坐标点转换为地理位置信息。
    *     转换成功通过successCallback返回，转换失败则通过errorCallback返回。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def reverseGeocode(): Unit = js.native
  def reverseGeocode(
    point: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def reverseGeocode(
    point: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    successCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def reverseGeocode(
    point: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    successCallback: js.Function1[/* result */ js.Any, Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def reverseGeocode(point: js.UndefOr[scala.Nothing], options: PlusMapsGeocodeOptions): Unit = js.native
  def reverseGeocode(
    point: js.UndefOr[scala.Nothing],
    options: PlusMapsGeocodeOptions,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def reverseGeocode(
    point: js.UndefOr[scala.Nothing],
    options: PlusMapsGeocodeOptions,
    successCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def reverseGeocode(
    point: js.UndefOr[scala.Nothing],
    options: PlusMapsGeocodeOptions,
    successCallback: js.Function1[/* result */ js.Any, Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def reverseGeocode(point: PlusMapsPoint): Unit = js.native
  def reverseGeocode(
    point: PlusMapsPoint,
    options: js.UndefOr[scala.Nothing],
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def reverseGeocode(
    point: PlusMapsPoint,
    options: js.UndefOr[scala.Nothing],
    successCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def reverseGeocode(
    point: PlusMapsPoint,
    options: js.UndefOr[scala.Nothing],
    successCallback: js.Function1[/* result */ js.Any, Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def reverseGeocode(point: PlusMapsPoint, options: PlusMapsGeocodeOptions): Unit = js.native
  def reverseGeocode(
    point: PlusMapsPoint,
    options: PlusMapsGeocodeOptions,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def reverseGeocode(
    point: PlusMapsPoint,
    options: PlusMapsGeocodeOptions,
    successCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def reverseGeocode(
    point: PlusMapsPoint,
    options: PlusMapsGeocodeOptions,
    successCallback: js.Function1[/* result */ js.Any, Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  
  /**
    * 设置地图的中心点
    * 此方法用于设置地图的中心点，用于切换当前显示地图位置。
    *     该方法改变中心点后地图显示内容将立即更新；
    *     该方法不会改变地图显示的缩放级别。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setCenter(): Unit = js.native
  def setCenter(center: PlusMapsPoint): Unit = js.native
  
  /**
    * 设置地图的视图类型
    * 此方法用于设置地图类型，默认为普通街道视图。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setMapType(): Unit = js.native
  def setMapType(`type`: PlusMapsMapType): Unit = js.native
  
  /**
    * 设置地图控件的配置参数
    * 用于动态更新地图控件的参数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setStyles(): Unit = js.native
  def setStyles(styles: PlusMapsMapStyles): Unit = js.native
  
  /**
    * 是否打开地图交通信息图层
    * 此方法用于设置是否打开地图交通信息图层，默认不显示。
    *     该方法改变是否显示交通图层后地图显示内容将立即更新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setTraffic(): Unit = js.native
  def setTraffic(traffic: Boolean): Unit = js.native
  
  /**
    * 设置地图的缩放级别
    * 此方法用于设置地图的缩放级别，用于切换当前显示地图缩放级别。
    *     该方法改变缩放级别后地图显示内容将立即更新；
    *     该方法不会改变地图显示区域，以当前地图显示的中心点位置来缩放地图。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setZoom(): Unit = js.native
  def setZoom(zoom: Double): Unit = js.native
  
  /**
    * 显示地图控件
    * 此方法用于显示地图控件，通常在隐藏后调用此方法来显示。
    *     如果地图已经显示再调用此方法将无效果。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def show(): Unit = js.native
  
  /**
    * 显示用户位置
    * 此方法将在地图上显示用户位置信息。
    *     显示用户位置将打开定位设备。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def showUserLocation(): Unit = js.native
  def showUserLocation(display: Boolean): Unit = js.native
  
  /**
    * 设置是否显示地图内置缩放控件
    * 此方法将在地图上显示内置缩放控件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def showZoomControls(): Unit = js.native
  def showZoomControls(display: Boolean): Unit = js.native
}
