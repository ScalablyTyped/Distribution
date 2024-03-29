package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateDataSourceRequest extends StObject {
  
  /**
    * Common debug options.
    */
  var debugOptions: js.UndefOr[SchemaDebugOptions] = js.undefined
  
  var source: js.UndefOr[SchemaDataSource] = js.undefined
}
object SchemaUpdateDataSourceRequest {
  
  inline def apply(): SchemaUpdateDataSourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateDataSourceRequest]
  }
  
  extension [Self <: SchemaUpdateDataSourceRequest](x: Self) {
    
    inline def setDebugOptions(value: SchemaDebugOptions): Self = StObject.set(x, "debugOptions", value.asInstanceOf[js.Any])
    
    inline def setDebugOptionsUndefined: Self = StObject.set(x, "debugOptions", js.undefined)
    
    inline def setSource(value: SchemaDataSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
