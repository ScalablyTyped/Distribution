package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntArray extends StObject {
  
  /** Elements in the int array. */
  var elements: js.UndefOr[js.Array[String]] = js.undefined
}
object IntArray {
  
  inline def apply(): IntArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntArray]
  }
  
  extension [Self <: IntArray](x: Self) {
    
    inline def setElements(value: js.Array[String]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    inline def setElementsVarargs(value: String*): Self = StObject.set(x, "elements", js.Array(value*))
  }
}
