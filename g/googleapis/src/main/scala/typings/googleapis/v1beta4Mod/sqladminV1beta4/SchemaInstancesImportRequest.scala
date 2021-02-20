package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Database instance import request.
  */
@js.native
trait SchemaInstancesImportRequest extends StObject {
  
  /**
    * Contains details about the import operation.
    */
  var importContext: js.UndefOr[SchemaImportContext] = js.native
}
object SchemaInstancesImportRequest {
  
  @scala.inline
  def apply(): SchemaInstancesImportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesImportRequest]
  }
  
  @scala.inline
  implicit class SchemaInstancesImportRequestMutableBuilder[Self <: SchemaInstancesImportRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImportContext(value: SchemaImportContext): Self = StObject.set(x, "importContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportContextUndefined: Self = StObject.set(x, "importContext", js.undefined)
  }
}
