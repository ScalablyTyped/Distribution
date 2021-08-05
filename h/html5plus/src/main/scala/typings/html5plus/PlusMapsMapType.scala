package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 地图视图类型
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
  */
trait PlusMapsMapType extends StObject {
  
  /**
    * 普通街道视图类型
    * 地图视图类型常量，普通街道视图。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var MAPTYPE_NORMAL: js.UndefOr[Double] = js.undefined
  
  /**
    * 卫星视图
    * 地图视图类型常量，卫星视图。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var MAPTYPE_SATELLITE: js.UndefOr[Double] = js.undefined
}
object PlusMapsMapType {
  
  inline def apply(): PlusMapsMapType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusMapsMapType]
  }
  
  extension [Self <: PlusMapsMapType](x: Self) {
    
    inline def setMAPTYPE_NORMAL(value: Double): Self = StObject.set(x, "MAPTYPE_NORMAL", value.asInstanceOf[js.Any])
    
    inline def setMAPTYPE_NORMALUndefined: Self = StObject.set(x, "MAPTYPE_NORMAL", js.undefined)
    
    inline def setMAPTYPE_SATELLITE(value: Double): Self = StObject.set(x, "MAPTYPE_SATELLITE", value.asInstanceOf[js.Any])
    
    inline def setMAPTYPE_SATELLITEUndefined: Self = StObject.set(x, "MAPTYPE_SATELLITE", js.undefined)
  }
}
