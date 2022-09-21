package typings.layuiSrc.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultNodeName extends StObject {
  
  /**
    * 节点默认名称  '未命名'
    */
  var defaultNodeName: js.UndefOr[String] = js.undefined
  
  /**
    * 数据为空时的提示文本 '无数据'
    */
  var none: js.UndefOr[String] = js.undefined
}
object DefaultNodeName {
  
  inline def apply(): DefaultNodeName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultNodeName]
  }
  
  extension [Self <: DefaultNodeName](x: Self) {
    
    inline def setDefaultNodeName(value: String): Self = StObject.set(x, "defaultNodeName", value.asInstanceOf[js.Any])
    
    inline def setDefaultNodeNameUndefined: Self = StObject.set(x, "defaultNodeName", js.undefined)
    
    inline def setNone(value: String): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setNoneUndefined: Self = StObject.set(x, "none", js.undefined)
  }
}
