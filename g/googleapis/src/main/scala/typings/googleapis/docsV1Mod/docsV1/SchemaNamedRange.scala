package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNamedRange extends StObject {
  
  /**
    * The name of the named range.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the named range.
    */
  var namedRangeId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ranges that belong to this named range.
    */
  var ranges: js.UndefOr[js.Array[SchemaRange]] = js.undefined
}
object SchemaNamedRange {
  
  inline def apply(): SchemaNamedRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNamedRange]
  }
  
  extension [Self <: SchemaNamedRange](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamedRangeId(value: String): Self = StObject.set(x, "namedRangeId", value.asInstanceOf[js.Any])
    
    inline def setNamedRangeIdNull: Self = StObject.set(x, "namedRangeId", null)
    
    inline def setNamedRangeIdUndefined: Self = StObject.set(x, "namedRangeId", js.undefined)
    
    inline def setRanges(value: js.Array[SchemaRange]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    inline def setRangesVarargs(value: SchemaRange*): Self = StObject.set(x, "ranges", js.Array(value*))
  }
}
