package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryInfo extends js.Object {
  
  /** Includes an entry for each satisfied QueryProperty. */
  var queryProperty: js.UndefOr[js.Array[String]] = js.native
}
object QueryInfo {
  
  @scala.inline
  def apply(): QueryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryInfo]
  }
  
  @scala.inline
  implicit class QueryInfoOps[Self <: QueryInfo] (val x: Self) extends AnyVal {
    
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
    def setQueryPropertyVarargs(value: String*): Self = this.set("queryProperty", js.Array(value :_*))
    
    @scala.inline
    def setQueryProperty(value: js.Array[String]): Self = this.set("queryProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryProperty: Self = this.set("queryProperty", js.undefined)
  }
}
