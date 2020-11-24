package typings.layuiSrc.layui

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
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
@js.native
trait TableRequest
  extends /* propName */ StringDictionary[js.Any] {
  
  var limit: Double = js.native
  
  var page: Double = js.native
}
object TableRequest {
  
  @scala.inline
  def apply(limit: Double, page: Double): TableRequest = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRequest]
  }
  
  @scala.inline
  implicit class TableRequestOps[Self <: TableRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
  }
}
