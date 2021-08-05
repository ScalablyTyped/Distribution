package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Randomizes the order of the rows in a range.
  */
trait SchemaRandomizeRangeRequest extends StObject {
  
  /**
    * The range to randomize.
    */
  var range: js.UndefOr[SchemaGridRange] = js.undefined
}
object SchemaRandomizeRangeRequest {
  
  inline def apply(): SchemaRandomizeRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRandomizeRangeRequest]
  }
  
  extension [Self <: SchemaRandomizeRangeRequest](x: Self) {
    
    inline def setRange(value: SchemaGridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
