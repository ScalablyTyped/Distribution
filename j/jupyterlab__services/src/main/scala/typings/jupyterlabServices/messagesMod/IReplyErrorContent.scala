package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IReplyErrorContent
  extends _ReplyContent[js.Any] {
  
  /**
    * Exception name
    */
  var ename: String = js.native
  
  /**
    * Exception value
    */
  var evalue: String = js.native
  
  var status: error = js.native
  
  /**
    * Traceback
    */
  var traceback: js.Array[String] = js.native
}
object IReplyErrorContent {
  
  @scala.inline
  def apply(ename: String, evalue: String, status: error, traceback: js.Array[String]): IReplyErrorContent = {
    val __obj = js.Dynamic.literal(ename = ename.asInstanceOf[js.Any], evalue = evalue.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], traceback = traceback.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReplyErrorContent]
  }
  
  @scala.inline
  implicit class IReplyErrorContentOps[Self <: IReplyErrorContent] (val x: Self) extends AnyVal {
    
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
    def setEname(value: String): Self = this.set("ename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvalue(value: String): Self = this.set("evalue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: error): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracebackVarargs(value: String*): Self = this.set("traceback", js.Array(value :_*))
    
    @scala.inline
    def setTraceback(value: js.Array[String]): Self = this.set("traceback", value.asInstanceOf[js.Any])
  }
}
