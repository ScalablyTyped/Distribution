package typings.html5plus

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
  var onPoiSearchComplete: js.UndefOr[js.Function2[/* result0 */ Double, /* result1 */ PlusMapsSearchPoiResult, Unit]] = js.native
  /**
    * 线路检索完成事件
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var onRouteSearchComplete: js.UndefOr[
    js.Function2[/* result0 */ Double, /* result1 */ PlusMapsSearchRouteResult, Unit]
  ] = js.native
  /**
    * 驾车路线检索
    * 用于驾车路线检索，检索完成后触发onRouteSearchComplete()事件。
    *     调用此方法时对象处于检索操作中，则终止上次检索操作，重新开始新的检索。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def drivingSearch(): Boolean = js.native
  def drivingSearch(
    start: js.UndefOr[scala.Nothing],
    startCity: js.UndefOr[scala.Nothing],
    end: js.UndefOr[scala.Nothing],
    endCity: String
  ): Boolean = js.native
  def drivingSearch(start: js.UndefOr[scala.Nothing], startCity: js.UndefOr[scala.Nothing], end: String): Boolean = js.native
  def drivingSearch(
    start: js.UndefOr[scala.Nothing],
    startCity: js.UndefOr[scala.Nothing],
    end: String,
    endCity: String
  ): Boolean = js.native
  def drivingSearch(start: js.UndefOr[scala.Nothing], startCity: String): Boolean = js.native
  def drivingSearch(
    start: js.UndefOr[scala.Nothing],
    startCity: String,
    end: js.UndefOr[scala.Nothing],
    endCity: String
  ): Boolean = js.native
  def drivingSearch(start: js.UndefOr[scala.Nothing], startCity: String, end: String): Boolean = js.native
  def drivingSearch(start: js.UndefOr[scala.Nothing], startCity: String, end: String, endCity: String): Boolean = js.native
  def drivingSearch(start: String): Boolean = js.native
  def drivingSearch(
    start: String,
    startCity: js.UndefOr[scala.Nothing],
    end: js.UndefOr[scala.Nothing],
    endCity: String
  ): Boolean = js.native
  def drivingSearch(start: String, startCity: js.UndefOr[scala.Nothing], end: String): Boolean = js.native
  def drivingSearch(start: String, startCity: js.UndefOr[scala.Nothing], end: String, endCity: String): Boolean = js.native
  def drivingSearch(start: String, startCity: String): Boolean = js.native
  def drivingSearch(start: String, startCity: String, end: js.UndefOr[scala.Nothing], endCity: String): Boolean = js.native
  def drivingSearch(start: String, startCity: String, end: String): Boolean = js.native
  def drivingSearch(start: String, startCity: String, end: String, endCity: String): Boolean = js.native
  /**
    * 获取检索返回结果每页的信息数目
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getPageCapacity(): Double = js.native
  /**
    * 城市兴趣点检索
    * 检索结果将通过onPoiSearchComplete事件返回。
    *     如果调用此方法时已经处于POI检索操作中，则终止上次检索操作，重新开始新的检索。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def poiSearchInCity(): Boolean = js.native
  def poiSearchInCity(city: js.UndefOr[scala.Nothing], key: js.UndefOr[scala.Nothing], index: Double): Boolean = js.native
  def poiSearchInCity(city: js.UndefOr[scala.Nothing], key: String): Boolean = js.native
  def poiSearchInCity(city: js.UndefOr[scala.Nothing], key: String, index: Double): Boolean = js.native
  def poiSearchInCity(city: String): Boolean = js.native
  def poiSearchInCity(city: String, key: js.UndefOr[scala.Nothing], index: Double): Boolean = js.native
  def poiSearchInCity(city: String, key: String): Boolean = js.native
  def poiSearchInCity(city: String, key: String, index: Double): Boolean = js.native
  /**
    * 指定范围检索
    * 根据范围和检索词进行检索，检索完成后触发onPoiSearchComplete()事件。
    *     若调用此方法时对象处于POI检索操作中，则终止上次检索操作，重新开始新的检索。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def poiSearchInbounds(): Boolean = js.native
  /**
    * 周边检索
    * 周边检索根据中心点、半径与检索词进行检索，检索完成后触发onPoiSearchComplete()事件。
    *     若调用此方法时对象处于POI检索操作中，则终止上次检索操作，重新开始新的检索。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def poiSearchNearBy(): Boolean = js.native
  def poiSearchNearBy(
    key: js.UndefOr[scala.Nothing],
    pt: js.UndefOr[scala.Nothing],
    radius: js.UndefOr[scala.Nothing],
    index: Double
  ): Boolean = js.native
  def poiSearchNearBy(key: js.UndefOr[scala.Nothing], pt: js.UndefOr[scala.Nothing], radius: Double): Boolean = js.native
  def poiSearchNearBy(key: js.UndefOr[scala.Nothing], pt: js.UndefOr[scala.Nothing], radius: Double, index: Double): Boolean = js.native
  def poiSearchNearBy(key: js.UndefOr[scala.Nothing], pt: PlusMapsPoint): Boolean = js.native
  def poiSearchNearBy(
    key: js.UndefOr[scala.Nothing],
    pt: PlusMapsPoint,
    radius: js.UndefOr[scala.Nothing],
    index: Double
  ): Boolean = js.native
  def poiSearchNearBy(key: js.UndefOr[scala.Nothing], pt: PlusMapsPoint, radius: Double): Boolean = js.native
  def poiSearchNearBy(key: js.UndefOr[scala.Nothing], pt: PlusMapsPoint, radius: Double, index: Double): Boolean = js.native
  def poiSearchNearBy(key: String): Boolean = js.native
  def poiSearchNearBy(key: String, pt: js.UndefOr[scala.Nothing], radius: js.UndefOr[scala.Nothing], index: Double): Boolean = js.native
  def poiSearchNearBy(key: String, pt: js.UndefOr[scala.Nothing], radius: Double): Boolean = js.native
  def poiSearchNearBy(key: String, pt: js.UndefOr[scala.Nothing], radius: Double, index: Double): Boolean = js.native
  def poiSearchNearBy(key: String, pt: PlusMapsPoint): Boolean = js.native
  def poiSearchNearBy(key: String, pt: PlusMapsPoint, radius: js.UndefOr[scala.Nothing], index: Double): Boolean = js.native
  def poiSearchNearBy(key: String, pt: PlusMapsPoint, radius: Double): Boolean = js.native
  def poiSearchNearBy(key: String, pt: PlusMapsPoint, radius: Double, index: Double): Boolean = js.native
  /**
    * 设置驾车路线检索策略
    * 设置驾车路线检索策略，默认采用maps.SearchPolicy.DRIVING_TIME_FIRST策略。
    *     如果设置非法值则认为设置失败，采用上次设置的检索策略并返回false；需在调用drivingSearch()方法前设置的策略才生效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setDrivingPolicy(): Boolean = js.native
  def setDrivingPolicy(policy: PlusMapsSearchPolicy): Boolean = js.native
  /**
    * 设置检索返回结果每页的信息数目
    * 地图检索结果是按页返回的，默认检索每页返回10条信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setPageCapacity(): Unit = js.native
  def setPageCapacity(capacity: Double): Unit = js.native
  /**
    * 设置公交路线检索策略
    * 默认采用maps.SearchPolicy.TRANSIT_TIME_FIRST策略。
    *     需在调用transitSearch()方法前设置的策略才生效；
    *     如果设置非法值则认为设置失败，采用上次设置的检索策略并返回false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def setTransitPolicy(): Boolean = js.native
  def setTransitPolicy(policy: PlusMapsSearchPolicy): Boolean = js.native
  /**
    * 公交路线检索
    * 检索完成后触发onRouteSearchComplete()事件。
    *     若调用此方法时对象处于检索操作中，则终止上次检索操作，重新开始新的检索。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def transitSearch(): Boolean = js.native
  def transitSearch(start: js.UndefOr[scala.Nothing], end: js.UndefOr[scala.Nothing], city: String): Boolean = js.native
  def transitSearch(start: js.UndefOr[scala.Nothing], end: String): Boolean = js.native
  def transitSearch(start: js.UndefOr[scala.Nothing], end: String, city: String): Boolean = js.native
  def transitSearch(start: String): Boolean = js.native
  def transitSearch(start: String, end: js.UndefOr[scala.Nothing], city: String): Boolean = js.native
  def transitSearch(start: String, end: String): Boolean = js.native
  def transitSearch(start: String, end: String, city: String): Boolean = js.native
  /**
    * 步行路线检索
    * 用于步行路线检索，检索完成后触发onRouteSearchComplete()事件。
    *     调用此方法时对象处于检索操作中，则终止上次检索操作，重新开始新的检索。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def walkingSearch(): Boolean = js.native
  def walkingSearch(
    start: js.UndefOr[scala.Nothing],
    startCity: js.UndefOr[scala.Nothing],
    end: js.UndefOr[scala.Nothing],
    endCity: String
  ): Boolean = js.native
  def walkingSearch(start: js.UndefOr[scala.Nothing], startCity: js.UndefOr[scala.Nothing], end: String): Boolean = js.native
  def walkingSearch(
    start: js.UndefOr[scala.Nothing],
    startCity: js.UndefOr[scala.Nothing],
    end: String,
    endCity: String
  ): Boolean = js.native
  def walkingSearch(start: js.UndefOr[scala.Nothing], startCity: String): Boolean = js.native
  def walkingSearch(
    start: js.UndefOr[scala.Nothing],
    startCity: String,
    end: js.UndefOr[scala.Nothing],
    endCity: String
  ): Boolean = js.native
  def walkingSearch(start: js.UndefOr[scala.Nothing], startCity: String, end: String): Boolean = js.native
  def walkingSearch(start: js.UndefOr[scala.Nothing], startCity: String, end: String, endCity: String): Boolean = js.native
  def walkingSearch(start: String): Boolean = js.native
  def walkingSearch(
    start: String,
    startCity: js.UndefOr[scala.Nothing],
    end: js.UndefOr[scala.Nothing],
    endCity: String
  ): Boolean = js.native
  def walkingSearch(start: String, startCity: js.UndefOr[scala.Nothing], end: String): Boolean = js.native
  def walkingSearch(start: String, startCity: js.UndefOr[scala.Nothing], end: String, endCity: String): Boolean = js.native
  def walkingSearch(start: String, startCity: String): Boolean = js.native
  def walkingSearch(start: String, startCity: String, end: js.UndefOr[scala.Nothing], endCity: String): Boolean = js.native
  def walkingSearch(start: String, startCity: String, end: String): Boolean = js.native
  def walkingSearch(start: String, startCity: String, end: String, endCity: String): Boolean = js.native
}

