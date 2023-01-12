package typings.jweixin.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpreviewImage
  extends StObject
     with BaseParams {
  
  var current: String
  
  // 当前显示图片的http链接
  var urls: js.Array[String]
}
object IpreviewImage {
  
  inline def apply(current: String, urls: js.Array[String]): IpreviewImage = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpreviewImage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IpreviewImage] (val x: Self) extends AnyVal {
    
    inline def setCurrent(value: String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
  }
}
