package typings.jupyterlabServices.libKernelMessagesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHistoryReply
  extends StObject
     with IReplyOkContent {
  
  var history: js.Array[js.Tuple3[Double, Double, String | (js.Tuple2[String, String])]]
}
object IHistoryReply {
  
  inline def apply(history: js.Array[js.Tuple3[Double, Double, String | (js.Tuple2[String, String])]]): IHistoryReply = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], status = "ok")
    __obj.asInstanceOf[IHistoryReply]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IHistoryReply] (val x: Self) extends AnyVal {
    
    inline def setHistory(value: js.Array[js.Tuple3[Double, Double, String | (js.Tuple2[String, String])]]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryVarargs(value: (js.Tuple3[Double, Double, String | (js.Tuple2[String, String])])*): Self = StObject.set(x, "history", js.Array(value*))
  }
}
