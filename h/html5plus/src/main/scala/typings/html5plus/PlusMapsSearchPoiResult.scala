package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 保存位置检索、周边检索和范围检索返回的结果
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
  */
trait PlusMapsSearchPoiResult extends StObject {
  
  /**
    * 当前页的POI检索结果数
    * 当前页POI检索结果数，若没有检索到则返回0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var currentNumber: js.UndefOr[Double] = js.undefined
  
  /**
    * 获取指定索引的检索结果
    * 如果index值超出范围则返回null对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getPosition(): PlusMapsPosition
  
  /**
    * 获取当前页的索引
    * 当前页的索引值，从0开始，即0表示第一页。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var pageIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * 本次POI检索的总页数
    * 本次POI检索的总页数，若没有检索到则返回0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var pageNumber: js.UndefOr[Double] = js.undefined
  
  /**
    * 本次POI检索结果数组
    * POI检索结果数组，Array数组对象，数组内容为Position对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var poiList: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * POI检索总结果数
    * POI检索总结果数，若没有检索到则返回0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var totalNumber: js.UndefOr[Double] = js.undefined
}
object PlusMapsSearchPoiResult {
  
  inline def apply(getPosition: () => PlusMapsPosition): PlusMapsSearchPoiResult = {
    val __obj = js.Dynamic.literal(getPosition = js.Any.fromFunction0(getPosition))
    __obj.asInstanceOf[PlusMapsSearchPoiResult]
  }
  
  extension [Self <: PlusMapsSearchPoiResult](x: Self) {
    
    inline def setCurrentNumber(value: Double): Self = StObject.set(x, "currentNumber", value.asInstanceOf[js.Any])
    
    inline def setCurrentNumberUndefined: Self = StObject.set(x, "currentNumber", js.undefined)
    
    inline def setGetPosition(value: () => PlusMapsPosition): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
    
    inline def setPageIndex(value: Double): Self = StObject.set(x, "pageIndex", value.asInstanceOf[js.Any])
    
    inline def setPageIndexUndefined: Self = StObject.set(x, "pageIndex", js.undefined)
    
    inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
    
    inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
    
    inline def setPoiList(value: js.Array[Any]): Self = StObject.set(x, "poiList", value.asInstanceOf[js.Any])
    
    inline def setPoiListUndefined: Self = StObject.set(x, "poiList", js.undefined)
    
    inline def setPoiListVarargs(value: Any*): Self = StObject.set(x, "poiList", js.Array(value*))
    
    inline def setTotalNumber(value: Double): Self = StObject.set(x, "totalNumber", value.asInstanceOf[js.Any])
    
    inline def setTotalNumberUndefined: Self = StObject.set(x, "totalNumber", js.undefined)
  }
}
