package typings.layuiSrc.layui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableRequestRename extends StObject {
  
  var limitName: String
  
  var pageName: String
}
object TableRequestRename {
  
  inline def apply(limitName: String, pageName: String): TableRequestRename = {
    val __obj = js.Dynamic.literal(limitName = limitName.asInstanceOf[js.Any], pageName = pageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRequestRename]
  }
  
  extension [Self <: TableRequestRename](x: Self) {
    
    inline def setLimitName(value: String): Self = StObject.set(x, "limitName", value.asInstanceOf[js.Any])
    
    inline def setPageName(value: String): Self = StObject.set(x, "pageName", value.asInstanceOf[js.Any])
  }
}
