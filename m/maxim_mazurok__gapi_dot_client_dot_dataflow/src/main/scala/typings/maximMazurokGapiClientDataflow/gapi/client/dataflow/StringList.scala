package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringList extends StObject {
  
  /** Elements of the list. */
  var elements: js.UndefOr[js.Array[String]] = js.undefined
}
object StringList {
  
  inline def apply(): StringList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringList]
  }
  
  extension [Self <: StringList](x: Self) {
    
    inline def setElements(value: js.Array[String]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    inline def setElementsVarargs(value: String*): Self = StObject.set(x, "elements", js.Array(value :_*))
  }
}
