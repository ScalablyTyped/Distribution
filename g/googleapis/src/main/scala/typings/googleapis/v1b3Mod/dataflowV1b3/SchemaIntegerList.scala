package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A metric value representing a list of integers.
  */
trait SchemaIntegerList extends StObject {
  
  /**
    * Elements of the list.
    */
  var elements: js.UndefOr[js.Array[SchemaSplitInt64]] = js.undefined
}
object SchemaIntegerList {
  
  inline def apply(): SchemaIntegerList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIntegerList]
  }
  
  extension [Self <: SchemaIntegerList](x: Self) {
    
    inline def setElements(value: js.Array[SchemaSplitInt64]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    inline def setElementsVarargs(value: SchemaSplitInt64*): Self = StObject.set(x, "elements", js.Array(value :_*))
  }
}
