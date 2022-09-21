package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSourcePosition extends StObject {
  
  /**
    * First column on the source line associated with the source fragment.
    */
  var column: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Start position relative to the beginning of the file.
    */
  var currentOffset: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * End position relative to the beginning of the file.
    */
  var endOffset: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Name of the `File`.
    */
  var fileName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Line number of the source fragment. 1-based.
    */
  var line: js.UndefOr[Double | Null] = js.undefined
}
object SchemaSourcePosition {
  
  inline def apply(): SchemaSourcePosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourcePosition]
  }
  
  extension [Self <: SchemaSourcePosition](x: Self) {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnNull: Self = StObject.set(x, "column", null)
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setCurrentOffset(value: Double): Self = StObject.set(x, "currentOffset", value.asInstanceOf[js.Any])
    
    inline def setCurrentOffsetNull: Self = StObject.set(x, "currentOffset", null)
    
    inline def setCurrentOffsetUndefined: Self = StObject.set(x, "currentOffset", js.undefined)
    
    inline def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    inline def setEndOffsetNull: Self = StObject.set(x, "endOffset", null)
    
    inline def setEndOffsetUndefined: Self = StObject.set(x, "endOffset", js.undefined)
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameNull: Self = StObject.set(x, "fileName", null)
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineNull: Self = StObject.set(x, "line", null)
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
