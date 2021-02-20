package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FloatingPointList extends StObject {
  
  /** Elements of the list. */
  var elements: js.UndefOr[js.Array[Double]] = js.native
}
object FloatingPointList {
  
  @scala.inline
  def apply(): FloatingPointList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloatingPointList]
  }
  
  @scala.inline
  implicit class FloatingPointListMutableBuilder[Self <: FloatingPointList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElements(value: js.Array[Double]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    @scala.inline
    def setElementsVarargs(value: Double*): Self = StObject.set(x, "elements", js.Array(value :_*))
  }
}
