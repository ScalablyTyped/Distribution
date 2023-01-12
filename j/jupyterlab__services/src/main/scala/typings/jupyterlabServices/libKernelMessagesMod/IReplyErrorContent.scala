package typings.jupyterlabServices.libKernelMessagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IReplyErrorContent
  extends StObject
     with _ReplyContent[Any] {
  
  /**
    * Exception name
    */
  var ename: String
  
  /**
    * Exception value
    */
  var evalue: String
  
  var status: error
  
  /**
    * Traceback
    */
  var traceback: js.Array[String]
}
object IReplyErrorContent {
  
  inline def apply(ename: String, evalue: String, traceback: js.Array[String]): IReplyErrorContent = {
    val __obj = js.Dynamic.literal(ename = ename.asInstanceOf[js.Any], evalue = evalue.asInstanceOf[js.Any], status = "error", traceback = traceback.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReplyErrorContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IReplyErrorContent] (val x: Self) extends AnyVal {
    
    inline def setEname(value: String): Self = StObject.set(x, "ename", value.asInstanceOf[js.Any])
    
    inline def setEvalue(value: String): Self = StObject.set(x, "evalue", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: error): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTraceback(value: js.Array[String]): Self = StObject.set(x, "traceback", value.asInstanceOf[js.Any])
    
    inline def setTracebackVarargs(value: String*): Self = StObject.set(x, "traceback", js.Array(value*))
  }
}
