package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Database instance export request.
  */
trait SchemaInstancesExportRequest extends StObject {
  
  /**
    * Contains details about the export operation.
    */
  var exportContext: js.UndefOr[SchemaExportContext] = js.undefined
}
object SchemaInstancesExportRequest {
  
  inline def apply(): SchemaInstancesExportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesExportRequest]
  }
  
  extension [Self <: SchemaInstancesExportRequest](x: Self) {
    
    inline def setExportContext(value: SchemaExportContext): Self = StObject.set(x, "exportContext", value.asInstanceOf[js.Any])
    
    inline def setExportContextUndefined: Self = StObject.set(x, "exportContext", js.undefined)
  }
}
