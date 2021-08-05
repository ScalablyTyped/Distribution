package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResetSearchApplicationRequest extends StObject {
  
  /**
    * Common debug options.
    */
  var debugOptions: js.UndefOr[SchemaDebugOptions] = js.undefined
}
object SchemaResetSearchApplicationRequest {
  
  inline def apply(): SchemaResetSearchApplicationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResetSearchApplicationRequest]
  }
  
  extension [Self <: SchemaResetSearchApplicationRequest](x: Self) {
    
    inline def setDebugOptions(value: SchemaDebugOptions): Self = StObject.set(x, "debugOptions", value.asInstanceOf[js.Any])
    
    inline def setDebugOptionsUndefined: Self = StObject.set(x, "debugOptions", js.undefined)
  }
}
