package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 地图中的路线对象
  * 从Overlay对象继承而来，可通过Map对象的addOverlay()方法将对象添加地图中。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
  */
trait PlusMapsRoute extends StObject {
  
  /**
    * 路线总距离
    * 路线从起始点到终点的距离，单位为米。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var distance: js.UndefOr[Double] = js.undefined
  
  /**
    * 路线终点地理坐标点
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var endPoint: js.UndefOr[PlusMapsPoint] = js.undefined
  
  /**
    * 路线坐标点段数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var pointCount: js.UndefOr[PlusMapsPoint] = js.undefined
  
  /**
    * 路线的地理坐标点数组
    * 路线的地理坐标点数组，数组中保存Point对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var pointList: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * 线路的提示信息
    * 线路提示信息，没有提示信息则返回空字符串。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var routeTip: js.UndefOr[String] = js.undefined
  
  /**
    * 路线起点地理坐标点
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var startPoint: js.UndefOr[PlusMapsPoint] = js.undefined
}
object PlusMapsRoute {
  
  inline def apply(): PlusMapsRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusMapsRoute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlusMapsRoute] (val x: Self) extends AnyVal {
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setEndPoint(value: PlusMapsPoint): Self = StObject.set(x, "endPoint", value.asInstanceOf[js.Any])
    
    inline def setEndPointUndefined: Self = StObject.set(x, "endPoint", js.undefined)
    
    inline def setPointCount(value: PlusMapsPoint): Self = StObject.set(x, "pointCount", value.asInstanceOf[js.Any])
    
    inline def setPointCountUndefined: Self = StObject.set(x, "pointCount", js.undefined)
    
    inline def setPointList(value: js.Array[Any]): Self = StObject.set(x, "pointList", value.asInstanceOf[js.Any])
    
    inline def setPointListUndefined: Self = StObject.set(x, "pointList", js.undefined)
    
    inline def setPointListVarargs(value: Any*): Self = StObject.set(x, "pointList", js.Array(value*))
    
    inline def setRouteTip(value: String): Self = StObject.set(x, "routeTip", value.asInstanceOf[js.Any])
    
    inline def setRouteTipUndefined: Self = StObject.set(x, "routeTip", js.undefined)
    
    inline def setStartPoint(value: PlusMapsPoint): Self = StObject.set(x, "startPoint", value.asInstanceOf[js.Any])
    
    inline def setStartPointUndefined: Self = StObject.set(x, "startPoint", js.undefined)
  }
}
