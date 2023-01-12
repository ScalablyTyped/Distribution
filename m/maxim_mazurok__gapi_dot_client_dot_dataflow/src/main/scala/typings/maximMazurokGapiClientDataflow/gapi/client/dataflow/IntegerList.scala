package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntegerList extends StObject {
  
  /** Elements of the list. */
  var elements: js.UndefOr[js.Array[SplitInt64]] = js.undefined
}
object IntegerList {
  
  inline def apply(): IntegerList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegerList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntegerList] (val x: Self) extends AnyVal {
    
    inline def setElements(value: js.Array[SplitInt64]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    inline def setElementsVarargs(value: SplitInt64*): Self = StObject.set(x, "elements", js.Array(value*))
  }
}
