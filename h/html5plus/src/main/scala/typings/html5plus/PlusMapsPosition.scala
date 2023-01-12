package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 检索结果的位置点
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
  */
trait PlusMapsPosition extends StObject {
  
  /**
    * 位置点的地址信息
    * 如果没有位置点的地址信息则返回空字符串。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var address: js.UndefOr[String] = js.undefined
  
  /**
    * 位置点的所属城市信息
    * 如果没有位置点的所属城市信息则返回空字符串。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var city: js.UndefOr[String] = js.undefined
  
  /**
    * 位置点的名称
    * 如果没有位置点的名称则返回空字符串。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * 位置点的电话信息
    * 如果没有位置点的电话信息则返回空字符串。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var phone: js.UndefOr[String] = js.undefined
  
  /**
    * 位置点的经纬度坐标
    * 如果没有经纬度坐标信息（如果公交、地铁路线数据等），则其值为undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var point: js.UndefOr[PlusMapsPoint] = js.undefined
  
  /**
    * 位置点的邮编信息
    * 如果没有位置点的邮编信息则返回空字符串。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var postcode: js.UndefOr[String] = js.undefined
}
object PlusMapsPosition {
  
  inline def apply(): PlusMapsPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusMapsPosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlusMapsPosition] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    inline def setPoint(value: PlusMapsPoint): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    inline def setPostcode(value: String): Self = StObject.set(x, "postcode", value.asInstanceOf[js.Any])
    
    inline def setPostcodeUndefined: Self = StObject.set(x, "postcode", js.undefined)
  }
}
