package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.abort
import typings.jupyterlabServices.jupyterlabServicesStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _ReplyContent[T] extends js.Object
object _ReplyContent {
  
  @scala.inline
  def IReplyErrorContent[T](ename: String, evalue: String, status: error, traceback: js.Array[String]): _ReplyContent[T] = {
    val __obj = js.Dynamic.literal(ename = ename.asInstanceOf[js.Any], evalue = evalue.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], traceback = traceback.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ReplyContent[T]]
  }
  
  @scala.inline
  def IReplyAbortContent[T](status: abort): _ReplyContent[T] = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ReplyContent[T]]
  }
}
