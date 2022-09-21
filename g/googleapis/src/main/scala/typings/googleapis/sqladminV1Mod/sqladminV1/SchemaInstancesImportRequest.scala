package typings.googleapis.sqladminV1Mod.sqladminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstancesImportRequest extends StObject {
  
  /**
    * Contains details about the import operation.
    */
  var importContext: js.UndefOr[SchemaImportContext] = js.undefined
}
object SchemaInstancesImportRequest {
  
  inline def apply(): SchemaInstancesImportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesImportRequest]
  }
  
  extension [Self <: SchemaInstancesImportRequest](x: Self) {
    
    inline def setImportContext(value: SchemaImportContext): Self = StObject.set(x, "importContext", value.asInstanceOf[js.Any])
    
    inline def setImportContextUndefined: Self = StObject.set(x, "importContext", js.undefined)
  }
}
