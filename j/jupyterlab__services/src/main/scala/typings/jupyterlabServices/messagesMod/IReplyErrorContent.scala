package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.error
import org.scalablytyped.runtime.StObject
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
  implicit class IReplyErrorContentMutableBuilder[Self <: IReplyErrorContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEname(value: String): Self = StObject.set(x, "ename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvalue(value: String): Self = StObject.set(x, "evalue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: error): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceback(value: js.Array[String]): Self = StObject.set(x, "traceback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracebackVarargs(value: String*): Self = StObject.set(x, "traceback", js.Array(value :_*))
  }
}
