package typings.layuiSrc.layui

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* 服务端返回数据不固定
  interface TableOriginResponse {
  status: number;
  message: string;
  total: number;
  data: any;
  [propName: string]: any;
  }
  */
trait TableRequest
  extends StObject
     with /* propName */ StringDictionary[js.Any] {
  
  var limit: Double
  
  var page: Double
}
object TableRequest {
  
  @scala.inline
  def apply(limit: Double, page: Double): TableRequest = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRequest]
  }
  
  @scala.inline
  implicit class TableRequestMutableBuilder[Self <: TableRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
  }
}
