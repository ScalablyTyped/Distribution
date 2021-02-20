package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringList extends StObject {
  
  /** Elements of the list. */
  var elements: js.UndefOr[js.Array[String]] = js.native
}
object StringList {
  
  @scala.inline
  def apply(): StringList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringList]
  }
  
  @scala.inline
  implicit class StringListMutableBuilder[Self <: StringList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElements(value: js.Array[String]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    @scala.inline
    def setElementsVarargs(value: String*): Self = StObject.set(x, "elements", js.Array(value :_*))
  }
}
