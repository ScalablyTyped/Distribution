package typings.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KruskalMST extends StObject {
  
  var mst: js.Array[Edge] = js.native
}
object KruskalMST {
  
  @scala.inline
  def apply(mst: js.Array[Edge]): KruskalMST = {
    val __obj = js.Dynamic.literal(mst = mst.asInstanceOf[js.Any])
    __obj.asInstanceOf[KruskalMST]
  }
  
  @scala.inline
  implicit class KruskalMSTMutableBuilder[Self <: KruskalMST] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMst(value: js.Array[Edge]): Self = StObject.set(x, "mst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMstVarargs(value: Edge*): Self = StObject.set(x, "mst", js.Array(value :_*))
  }
}
