package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 地图检索对象
  * Search对象用于管理地图上的检索功能，包括位置检索、周边检索和范围检索。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
  */
@js.native
trait PlusMapsSearch extends js.Object {
  /**
    * 兴趣点检索完成事件
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var onPoiSearchComplete: js.UndefOr[
    js.Function2[/* result0 */ scala.Double, /* result1 */ PlusMapsSearchPoiResult, scala.Unit]
  ] = js.native
  /**
    * 线路检索完成事件
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var onRouteSearchComplete: js.UndefOr[
    js.Function2[/* result0 */ scala.Double, /* result1 */ PlusMapsSearchRouteResult, scala.Unit]
  ] = js.native
  /**
    * 驾车路线检索
    * 用于驾车路线检索，检索完成后触发onRouteSearchComplete()事件。
    * 	调用此方法时对象处于检索操作中，则终止上次检索操作，重新开始新的检索。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def drivingSearch(): scala.Boolean = js.native
  def drivingSearch(start: java.lang.String): scala.Boolean = js.native
  def drivingSearch(start: java.lang.String, startCity: java.lang.String): scala.Boolean = js.native
  def drivingSearch(start: java.lang.String, startCity: java.lang.String, end: java.lang.String): scala.Boolean = js.native
  def drivingSearch(
    start: java.lang.String,
    startCity: java.lang.String,
    end: java.lang.String,
    endCity: java.lang.String
  ): scala.Boolean = js.native
  /**
    * 获取检索返回结果每页的信息数目
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getPageCapacity(): scala.Double = js.native
  /**
    * 城市兴趣点检索
    * 检索结果将通过onPoiSearchComplete事件返回。
    * 	如果调用此方法时已经处于POI检索操作中，则终止上次检索操作，重新开始新的检索。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def poiSearchInCity(): scala.Boolean = js.native
  def poiSearchInCity(city: java.lang.String): scala.Boolean = js.native
  def poiSearchInCity(city: java.lang.String, key: java.lang.String): scala.Boolean = js.native
  def poiSearchInCity(city: java.lang.String, key: java.lang.String, index: scala.Double): scala.Boolean = js.native
  /**
    * 指定范围检索
    * 根据范围和检索词进行检索，检索完成后触发onPoiSearchComplete()事件。
    * 	若调用此方法时对象处于POI检索操作中，则终止上次检索操作，重新开始新的检索。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def poiSearchInbounds(): scala.Boolean = js.native
  /**
    * 周边检索
    * 周边检索根据中心点、半径与检索词进行检索，检索完成后触发onPoiSearchComplete()事件。
    * 	若调用此方法时对象处于POI检索操作中，则终止上次检索操作，重新开始新的检索。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def poiSearchNearBy(): scala.Boolean = js.native
  def poiSearchNearBy(key: java.lang.String): scala.Boolean = js.native
  def poiSearchNearBy(key: java.lang.String, pt: PlusMapsPoint): scala.Boolean = js.native
  def poiSearchNearBy(key: java.lang.String, pt: PlusMapsPoint, radius: scala.Double): scala.Boolean = js.native
  def poiSearchNearBy(key: java.lang.String, pt: PlusMapsPoint, radius: scala.Double, index: scala.Double): scala.Boolean = js.native
  /**
    * 设置驾车路线检索策略
    * 设置驾车路线检索策略，默认采用maps.SearchPolicy.DRIVING_TIME_FIRST策略。
    * 	如果设置非法值则认为设置失败，采用上次设置的检索策略并返回false；需在调用drivingSearch()方法前设置的策略才生效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setDrivingPolicy(): scala.Boolean = js.native
  def setDrivingPolicy(policy: PlusMapsSearchPolicy): scala.Boolean = js.native
  /**
    * 设置检索返回结果每页的信息数目
    * 地图检索结果是按页返回的，默认检索每页返回10条信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setPageCapacity(): scala.Unit = js.native
  def setPageCapacity(capacity: scala.Double): scala.Unit = js.native
  /**
    * 设置公交路线检索策略
    * 默认采用maps.SearchPolicy.TRANSIT_TIME_FIRST策略。
    * 	需在调用transitSearch()方法前设置的策略才生效；
    * 	如果设置非法值则认为设置失败，采用上次设置的检索策略并返回false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setTransitPolicy(): scala.Boolean = js.native
  def setTransitPolicy(policy: PlusMapsSearchPolicy): scala.Boolean = js.native
  /**
    * 公交路线检索
    * 检索完成后触发onRouteSearchComplete()事件。
    * 	若调用此方法时对象处于检索操作中，则终止上次检索操作，重新开始新的检索。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def transitSearch(): scala.Boolean = js.native
  def transitSearch(start: java.lang.String): scala.Boolean = js.native
  def transitSearch(start: java.lang.String, end: java.lang.String): scala.Boolean = js.native
  def transitSearch(start: java.lang.String, end: java.lang.String, city: java.lang.String): scala.Boolean = js.native
  /**
    * 步行路线检索
    * 用于步行路线检索，检索完成后触发onRouteSearchComplete()事件。
    * 	调用此方法时对象处于检索操作中，则终止上次检索操作，重新开始新的检索。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def walkingSearch(): scala.Boolean = js.native
  def walkingSearch(start: java.lang.String): scala.Boolean = js.native
  def walkingSearch(start: java.lang.String, startCity: java.lang.String): scala.Boolean = js.native
  def walkingSearch(start: java.lang.String, startCity: java.lang.String, end: java.lang.String): scala.Boolean = js.native
  def walkingSearch(
    start: java.lang.String,
    startCity: java.lang.String,
    end: java.lang.String,
    endCity: java.lang.String
  ): scala.Boolean = js.native
}

