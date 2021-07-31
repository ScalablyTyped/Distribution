package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response to a GetTemplate request.
  */
trait SchemaGetTemplateResponse extends StObject {
  
  /**
    * The template metadata describing the template name, available parameters,
    * etc.
    */
  var metadata: js.UndefOr[SchemaTemplateMetadata] = js.undefined
  
  /**
    * The status of the get template request. Any problems with the request
    * will be indicated in the error_details.
    */
  var status: js.UndefOr[SchemaStatus] = js.undefined
}
object SchemaGetTemplateResponse {
  
  @scala.inline
  def apply(): SchemaGetTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetTemplateResponse]
  }
  
  @scala.inline
  implicit class SchemaGetTemplateResponseMutableBuilder[Self <: SchemaGetTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: SchemaTemplateMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setStatus(value: SchemaStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
