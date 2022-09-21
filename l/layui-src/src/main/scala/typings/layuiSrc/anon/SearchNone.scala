package typings.layuiSrc.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchNone extends StObject {
  
  /**
    * 没有数据时的文案 '无数据'
    */
  var none: js.UndefOr[String] = js.undefined
  
  /**
    * 搜索无匹配数据时的文案 '无匹配数据'
    */
  var searchNone: js.UndefOr[String] = js.undefined
}
object SearchNone {
  
  inline def apply(): SearchNone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchNone]
  }
  
  extension [Self <: SearchNone](x: Self) {
    
    inline def setNone(value: String): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setNoneUndefined: Self = StObject.set(x, "none", js.undefined)
    
    inline def setSearchNone(value: String): Self = StObject.set(x, "searchNone", value.asInstanceOf[js.Any])
    
    inline def setSearchNoneUndefined: Self = StObject.set(x, "searchNone", js.undefined)
  }
}
