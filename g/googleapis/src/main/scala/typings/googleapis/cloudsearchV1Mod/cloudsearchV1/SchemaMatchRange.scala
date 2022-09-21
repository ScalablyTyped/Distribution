package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMatchRange extends StObject {
  
  /**
    * End of the match in the snippet.
    */
  var end: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Starting position of the match in the snippet.
    */
  var start: js.UndefOr[Double | Null] = js.undefined
}
object SchemaMatchRange {
  
  inline def apply(): SchemaMatchRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMatchRange]
  }
  
  extension [Self <: SchemaMatchRange](x: Self) {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndNull: Self = StObject.set(x, "end", null)
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartNull: Self = StObject.set(x, "start", null)
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
