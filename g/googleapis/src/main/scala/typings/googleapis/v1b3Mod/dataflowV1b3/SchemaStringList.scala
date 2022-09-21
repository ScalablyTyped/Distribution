package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStringList extends StObject {
  
  /**
    * Elements of the list.
    */
  var elements: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaStringList {
  
  inline def apply(): SchemaStringList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStringList]
  }
  
  extension [Self <: SchemaStringList](x: Self) {
    
    inline def setElements(value: js.Array[String]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsNull: Self = StObject.set(x, "elements", null)
    
    inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    inline def setElementsVarargs(value: String*): Self = StObject.set(x, "elements", js.Array(value*))
  }
}
