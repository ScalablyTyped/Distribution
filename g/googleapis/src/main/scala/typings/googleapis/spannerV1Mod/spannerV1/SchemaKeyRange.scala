package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaKeyRange extends StObject {
  
  /**
    * If the end is closed, then the range includes all rows whose first `len(end_closed)` key columns exactly match `end_closed`.
    */
  var endClosed: js.UndefOr[js.Array[Any] | Null] = js.undefined
  
  /**
    * If the end is open, then the range excludes rows whose first `len(end_open)` key columns exactly match `end_open`.
    */
  var endOpen: js.UndefOr[js.Array[Any] | Null] = js.undefined
  
  /**
    * If the start is closed, then the range includes all rows whose first `len(start_closed)` key columns exactly match `start_closed`.
    */
  var startClosed: js.UndefOr[js.Array[Any] | Null] = js.undefined
  
  /**
    * If the start is open, then the range excludes rows whose first `len(start_open)` key columns exactly match `start_open`.
    */
  var startOpen: js.UndefOr[js.Array[Any] | Null] = js.undefined
}
object SchemaKeyRange {
  
  inline def apply(): SchemaKeyRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKeyRange]
  }
  
  extension [Self <: SchemaKeyRange](x: Self) {
    
    inline def setEndClosed(value: js.Array[Any]): Self = StObject.set(x, "endClosed", value.asInstanceOf[js.Any])
    
    inline def setEndClosedNull: Self = StObject.set(x, "endClosed", null)
    
    inline def setEndClosedUndefined: Self = StObject.set(x, "endClosed", js.undefined)
    
    inline def setEndClosedVarargs(value: Any*): Self = StObject.set(x, "endClosed", js.Array(value*))
    
    inline def setEndOpen(value: js.Array[Any]): Self = StObject.set(x, "endOpen", value.asInstanceOf[js.Any])
    
    inline def setEndOpenNull: Self = StObject.set(x, "endOpen", null)
    
    inline def setEndOpenUndefined: Self = StObject.set(x, "endOpen", js.undefined)
    
    inline def setEndOpenVarargs(value: Any*): Self = StObject.set(x, "endOpen", js.Array(value*))
    
    inline def setStartClosed(value: js.Array[Any]): Self = StObject.set(x, "startClosed", value.asInstanceOf[js.Any])
    
    inline def setStartClosedNull: Self = StObject.set(x, "startClosed", null)
    
    inline def setStartClosedUndefined: Self = StObject.set(x, "startClosed", js.undefined)
    
    inline def setStartClosedVarargs(value: Any*): Self = StObject.set(x, "startClosed", js.Array(value*))
    
    inline def setStartOpen(value: js.Array[Any]): Self = StObject.set(x, "startOpen", value.asInstanceOf[js.Any])
    
    inline def setStartOpenNull: Self = StObject.set(x, "startOpen", null)
    
    inline def setStartOpenUndefined: Self = StObject.set(x, "startOpen", js.undefined)
    
    inline def setStartOpenVarargs(value: Any*): Self = StObject.set(x, "startOpen", js.Array(value*))
  }
}
