package typings.layuiSrc.layui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableResponseRename extends StObject {
  
  var countName: String
  
  var dataName: String
  
  var msgName: String
  
  var statusCode: Double
  
  var statusName: String
}
object TableResponseRename {
  
  @scala.inline
  def apply(countName: String, dataName: String, msgName: String, statusCode: Double, statusName: String): TableResponseRename = {
    val __obj = js.Dynamic.literal(countName = countName.asInstanceOf[js.Any], dataName = dataName.asInstanceOf[js.Any], msgName = msgName.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusName = statusName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableResponseRename]
  }
  
  @scala.inline
  implicit class TableResponseRenameMutableBuilder[Self <: TableResponseRename] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountName(value: String): Self = StObject.set(x, "countName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataName(value: String): Self = StObject.set(x, "dataName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsgName(value: String): Self = StObject.set(x, "msgName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusName(value: String): Self = StObject.set(x, "statusName", value.asInstanceOf[js.Any])
  }
}
