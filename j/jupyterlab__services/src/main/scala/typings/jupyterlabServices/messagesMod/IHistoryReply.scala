package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.ok
import org.scalablytyped.runtime.StObject
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
  implicit class IHistoryReplyMutableBuilder[Self <: IHistoryReply] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHistory(value: js.Array[js.Tuple3[Double, Double, String | (js.Tuple2[String, String])]]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryVarargs(value: (js.Tuple3[Double, Double, String | (js.Tuple2[String, String])])*): Self = StObject.set(x, "history", js.Array(value :_*))
  }
}
