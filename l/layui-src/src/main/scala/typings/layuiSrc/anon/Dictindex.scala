package typings.layuiSrc.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictindex
  extends StObject
     with /* index */ StringDictionary[Any] {
  
  /**
    * 当前浏览器是否为安卓系统环境
    */
  var android: Boolean
  
  /**
    * 当前浏览器是否为 ie6-11 的版本，如果不是 ie 浏览器，则为 false
    */
  var ie: Boolean
  
  /**
    * 当前浏览器是否为 IOS 系统环境
    */
  var ios: Boolean
  
  /**
    * 当前浏览器是否为移动设备环境
    * @since v2.5.7
    */
  var mobile: Boolean
  
  /**
    * 当前浏览器所在的底层操作系统，如：Windows、Linux、Mac 等
    */
  var os: String
  
  /**
    * 当前浏览器是否为微信 App 环境
    */
  var weixin: Boolean
}
object Dictindex {
  
  inline def apply(android: Boolean, ie: Boolean, ios: Boolean, mobile: Boolean, os: String, weixin: Boolean): Dictindex = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], ie = ie.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], weixin = weixin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictindex]
  }
  
  extension [Self <: Dictindex](x: Self) {
    
    inline def setAndroid(value: Boolean): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setIe(value: Boolean): Self = StObject.set(x, "ie", value.asInstanceOf[js.Any])
    
    inline def setIos(value: Boolean): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    inline def setMobile(value: Boolean): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    inline def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setWeixin(value: Boolean): Self = StObject.set(x, "weixin", value.asInstanceOf[js.Any])
  }
}
