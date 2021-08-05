package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，应用信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
  */
trait PlusRuntimeWidgetInfo extends StObject {
  
  /**
    * 应用的APPID
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var appid: js.UndefOr[String] = js.undefined
  
  /**
    * 应用描述信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var author: js.UndefOr[String] = js.undefined
  
  /**
    * 应用描述信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * 开发者邮箱地址
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * 应用许可特性列表
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var features: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * 应用授权描述信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var license: js.UndefOr[String] = js.undefined
  
  /**
    * 应用授权说明链接地址
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var licensehref: js.UndefOr[String] = js.undefined
  
  /**
    * 应用的名称
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * 应用的版本号
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var version: js.UndefOr[String] = js.undefined
}
object PlusRuntimeWidgetInfo {
  
  inline def apply(): PlusRuntimeWidgetInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusRuntimeWidgetInfo]
  }
  
  extension [Self <: PlusRuntimeWidgetInfo](x: Self) {
    
    inline def setAppid(value: String): Self = StObject.set(x, "appid", value.asInstanceOf[js.Any])
    
    inline def setAppidUndefined: Self = StObject.set(x, "appid", js.undefined)
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setFeatures(value: js.Array[String]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
    
    inline def setLicensehref(value: String): Self = StObject.set(x, "licensehref", value.asInstanceOf[js.Any])
    
    inline def setLicensehrefUndefined: Self = StObject.set(x, "licensehref", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
