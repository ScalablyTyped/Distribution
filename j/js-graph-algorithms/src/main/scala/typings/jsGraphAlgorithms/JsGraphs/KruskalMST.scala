package typings.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KruskalMST extends StObject {
  
  var mst: js.Array[Edge]
}
object KruskalMST {
  
  inline def apply(mst: js.Array[Edge]): KruskalMST = {
    val __obj = js.Dynamic.literal(mst = mst.asInstanceOf[js.Any])
    __obj.asInstanceOf[KruskalMST]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KruskalMST] (val x: Self) extends AnyVal {
    
    inline def setMst(value: js.Array[Edge]): Self = StObject.set(x, "mst", value.asInstanceOf[js.Any])
    
    inline def setMstVarargs(value: Edge*): Self = StObject.set(x, "mst", js.Array(value*))
  }
}
