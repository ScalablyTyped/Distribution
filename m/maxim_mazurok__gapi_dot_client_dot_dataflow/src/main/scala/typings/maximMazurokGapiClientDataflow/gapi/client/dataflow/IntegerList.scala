package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntegerList extends StObject {
  
  /** Elements of the list. */
  var elements: js.UndefOr[js.Array[SplitInt64]] = js.native
}
object IntegerList {
  
  @scala.inline
  def apply(): IntegerList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegerList]
  }
  
  @scala.inline
  implicit class IntegerListMutableBuilder[Self <: IntegerList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElements(value: js.Array[SplitInt64]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    @scala.inline
    def setElementsVarargs(value: SplitInt64*): Self = StObject.set(x, "elements", js.Array(value :_*))
  }
}
