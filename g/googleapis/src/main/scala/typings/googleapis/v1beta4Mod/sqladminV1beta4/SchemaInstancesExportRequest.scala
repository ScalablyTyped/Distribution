package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Database instance export request.
  */
@js.native
trait SchemaInstancesExportRequest extends StObject {
  
  /**
    * Contains details about the export operation.
    */
  var exportContext: js.UndefOr[SchemaExportContext] = js.native
}
object SchemaInstancesExportRequest {
  
  @scala.inline
  def apply(): SchemaInstancesExportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesExportRequest]
  }
  
  @scala.inline
  implicit class SchemaInstancesExportRequestMutableBuilder[Self <: SchemaInstancesExportRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportContext(value: SchemaExportContext): Self = StObject.set(x, "exportContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportContextUndefined: Self = StObject.set(x, "exportContext", js.undefined)
  }
}
