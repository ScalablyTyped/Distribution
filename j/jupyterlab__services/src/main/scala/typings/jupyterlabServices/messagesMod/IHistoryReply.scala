package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHistoryReply extends IReplyOkContent {
  
  var history: js.Array[js.Tuple3[Double, Double, String | (js.Tuple2[String, String])]] = js.native
}
object IHistoryReply {
  
  @scala.inline
  def apply(history: js.Array[js.Tuple3[Double, Double, String | (js.Tuple2[String, String])]], status: ok): IHistoryReply = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHistoryReply]
  }
  
  @scala.inline
  implicit class IHistoryReplyOps[Self <: IHistoryReply] (val x: Self) extends AnyVal {
    
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
    def setHistoryVarargs(value: (js.Tuple3[Double, Double, String | (js.Tuple2[String, String])])*): Self = this.set("history", js.Array(value :_*))
    
    @scala.inline
    def setHistory(value: js.Array[js.Tuple3[Double, Double, String | (js.Tuple2[String, String])]]): Self = this.set("history", value.asInstanceOf[js.Any])
  }
}
