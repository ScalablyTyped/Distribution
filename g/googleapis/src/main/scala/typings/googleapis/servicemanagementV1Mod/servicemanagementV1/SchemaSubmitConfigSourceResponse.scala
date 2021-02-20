package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for SubmitConfigSource method.
  */
@js.native
trait SchemaSubmitConfigSourceResponse extends StObject {
  
  /**
    * The generated service configuration.
    */
  var serviceConfig: js.UndefOr[SchemaService] = js.native
}
object SchemaSubmitConfigSourceResponse {
  
  @scala.inline
  def apply(): SchemaSubmitConfigSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubmitConfigSourceResponse]
  }
  
  @scala.inline
  implicit class SchemaSubmitConfigSourceResponseMutableBuilder[Self <: SchemaSubmitConfigSourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceConfig(value: SchemaService): Self = StObject.set(x, "serviceConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceConfigUndefined: Self = StObject.set(x, "serviceConfig", js.undefined)
  }
}
