package typings.layuiSrc.anon

import typings.layuiSrc.layuiSrcStrings.LAY_CHECKED
import typings.layuiSrc.layuiSrcStrings.LAY_TABLE_INDEX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckName extends StObject {
  
  var checkName: LAY_CHECKED
  
  // 是否选中状态的字段名
  var indexName: LAY_TABLE_INDEX
}
object CheckName {
  
  inline def apply(): CheckName = {
    val __obj = js.Dynamic.literal(checkName = "LAY_CHECKED", indexName = "LAY_TABLE_INDEX")
    __obj.asInstanceOf[CheckName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckName] (val x: Self) extends AnyVal {
    
    inline def setCheckName(value: LAY_CHECKED): Self = StObject.set(x, "checkName", value.asInstanceOf[js.Any])
    
    inline def setIndexName(value: LAY_TABLE_INDEX): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
  }
}
