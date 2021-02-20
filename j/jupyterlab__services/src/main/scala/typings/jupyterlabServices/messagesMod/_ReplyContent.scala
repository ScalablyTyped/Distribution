package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.abort
import typings.jupyterlabServices.jupyterlabServicesStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _ReplyContent[T] extends StObject
object _ReplyContent {
  
  @scala.inline
  def IReplyAbortContent(status: abort): typings.jupyterlabServices.messagesMod.IReplyAbortContent = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabServices.messagesMod.IReplyAbortContent]
  }
  
  @scala.inline
  def IReplyErrorContent(ename: String, evalue: String, status: error, traceback: js.Array[String]): typings.jupyterlabServices.messagesMod.IReplyErrorContent = {
    val __obj = js.Dynamic.literal(ename = ename.asInstanceOf[js.Any], evalue = evalue.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], traceback = traceback.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabServices.messagesMod.IReplyErrorContent]
  }
}
