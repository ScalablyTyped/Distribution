package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 保存位置检索、周边检索和范围检索返回的结果
  * 不可通过new操作符创建SearchRouteResult对象，在触发onRouteSearchComplete()时自动创建。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
  */
@js.native
trait PlusMapsSearchRouteResult extends StObject {
  
  /**
    * 线路的终点位置
    * 线路检索结果的终点位置点对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var endPosition: js.UndefOr[PlusMapsPosition] = js.native
  
  /**
    * 获取指定索引的线路方案
    * 如果index值超出范围则返回null对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getRoute(): PlusMapsRoute = js.native
  def getRoute(index: Double): PlusMapsRoute = js.native
  
  /**
    * 线路检索结果数组
    * 线路检索结果数组，Array数组对象，数组内容为Route对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var routeList: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * 本次线路检索的总方案数
    * 线路检索结果的方案数目，若未检索到有效结果则返回0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var routeNumber: js.UndefOr[Double] = js.native
  
  /**
    * 线路的起点位置
    * 线路检索结果的起始位置点对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var startPosition: js.UndefOr[PlusMapsPosition] = js.native
}
