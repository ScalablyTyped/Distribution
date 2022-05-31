package typings.jupyterlabServices.messagesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _ReplyContent[T] extends StObject
object _ReplyContent {
  
  inline def IReplyAbortContent(): typings.jupyterlabServices.messagesMod.IReplyAbortContent = {
    val __obj = js.Dynamic.literal(status = "abort")
    __obj.asInstanceOf[typings.jupyterlabServices.messagesMod.IReplyAbortContent]
  }
  
  inline def IReplyErrorContent(ename: String, evalue: String, traceback: js.Array[String]): typings.jupyterlabServices.messagesMod.IReplyErrorContent = {
    val __obj = js.Dynamic.literal(ename = ename.asInstanceOf[js.Any], evalue = evalue.asInstanceOf[js.Any], status = "error", traceback = traceback.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabServices.messagesMod.IReplyErrorContent]
  }
}
