package typings.layuiSrc.layui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableRequestRename extends StObject {
  
  var limitName: String = js.native
  
  var pageName: String = js.native
}
object TableRequestRename {
  
  @scala.inline
  def apply(limitName: String, pageName: String): TableRequestRename = {
    val __obj = js.Dynamic.literal(limitName = limitName.asInstanceOf[js.Any], pageName = pageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRequestRename]
  }
  
  @scala.inline
  implicit class TableRequestRenameMutableBuilder[Self <: TableRequestRename] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimitName(value: String): Self = StObject.set(x, "limitName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageName(value: String): Self = StObject.set(x, "pageName", value.asInstanceOf[js.Any])
  }
}
