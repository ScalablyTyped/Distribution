package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Position in the `Source` content including its line, column number, and an
  * index of the `File` in the `Source` message. Used for debug purposes.
  */
trait SchemaSourcePosition extends StObject {
  
  /**
    * First column on the source line associated with the source fragment.
    */
  var column: js.UndefOr[Double] = js.undefined
  
  /**
    * Name of the `File`.
    */
  var fileName: js.UndefOr[String] = js.undefined
  
  /**
    * Line number of the source fragment. 1-based.
    */
  var line: js.UndefOr[Double] = js.undefined
}
object SchemaSourcePosition {
  
  inline def apply(): SchemaSourcePosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourcePosition]
  }
  
  extension [Self <: SchemaSourcePosition](x: Self) {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
