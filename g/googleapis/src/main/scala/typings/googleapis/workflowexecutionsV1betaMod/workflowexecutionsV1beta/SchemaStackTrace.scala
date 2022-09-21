package typings.googleapis.workflowexecutionsV1betaMod.workflowexecutionsV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStackTrace extends StObject {
  
  /**
    * An array of stack elements.
    */
  var elements: js.UndefOr[js.Array[SchemaStackTraceElement]] = js.undefined
}
object SchemaStackTrace {
  
  inline def apply(): SchemaStackTrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStackTrace]
  }
  
  extension [Self <: SchemaStackTrace](x: Self) {
    
    inline def setElements(value: js.Array[SchemaStackTraceElement]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    inline def setElementsVarargs(value: SchemaStackTraceElement*): Self = StObject.set(x, "elements", js.Array(value*))
  }
}
