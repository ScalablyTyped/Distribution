package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListWatchesResponse extends StObject {
  
  /**
    * The returned watches.
    */
  var watches: js.UndefOr[js.Array[SchemaWatch]] = js.undefined
}
object SchemaListWatchesResponse {
  
  inline def apply(): SchemaListWatchesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListWatchesResponse]
  }
  
  extension [Self <: SchemaListWatchesResponse](x: Self) {
    
    inline def setWatches(value: js.Array[SchemaWatch]): Self = StObject.set(x, "watches", value.asInstanceOf[js.Any])
    
    inline def setWatchesUndefined: Self = StObject.set(x, "watches", js.undefined)
    
    inline def setWatchesVarargs(value: SchemaWatch*): Self = StObject.set(x, "watches", js.Array(value*))
  }
}
