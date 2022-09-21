package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSourceSplitRequest extends StObject {
  
  /**
    * Hints for tuning the splitting process.
    */
  var options: js.UndefOr[SchemaSourceSplitOptions] = js.undefined
  
  /**
    * Specification of the source to be split.
    */
  var source: js.UndefOr[SchemaSource] = js.undefined
}
object SchemaSourceSplitRequest {
  
  inline def apply(): SchemaSourceSplitRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceSplitRequest]
  }
  
  extension [Self <: SchemaSourceSplitRequest](x: Self) {
    
    inline def setOptions(value: SchemaSourceSplitOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setSource(value: SchemaSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
