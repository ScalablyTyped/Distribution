package typings.googleapis.workflowexecutionsV1betaMod.workflowexecutionsV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPosition extends StObject {
  
  /**
    * The source code column position (of the line) the current instruction was generated from.
    */
  var column: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of bytes of source code making up this stack trace element.
    */
  var length: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The source code line number the current instruction was generated from.
    */
  var line: js.UndefOr[String | Null] = js.undefined
}
object SchemaPosition {
  
  inline def apply(): SchemaPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPosition]
  }
  
  extension [Self <: SchemaPosition](x: Self) {
    
    inline def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnNull: Self = StObject.set(x, "column", null)
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setLength(value: String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthNull: Self = StObject.set(x, "length", null)
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineNull: Self = StObject.set(x, "line", null)
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
