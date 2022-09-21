package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FloatingPointList extends StObject {
  
  /** Elements of the list. */
  var elements: js.UndefOr[js.Array[Double]] = js.undefined
}
object FloatingPointList {
  
  inline def apply(): FloatingPointList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloatingPointList]
  }
  
  extension [Self <: FloatingPointList](x: Self) {
    
    inline def setElements(value: js.Array[Double]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    inline def setElementsVarargs(value: Double*): Self = StObject.set(x, "elements", js.Array(value*))
  }
}
