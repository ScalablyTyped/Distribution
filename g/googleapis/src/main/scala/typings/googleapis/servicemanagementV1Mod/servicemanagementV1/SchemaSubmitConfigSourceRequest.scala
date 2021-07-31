package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for SubmitConfigSource method.
  */
trait SchemaSubmitConfigSourceRequest extends StObject {
  
  /**
    * The source configuration for the service.
    */
  var configSource: js.UndefOr[SchemaConfigSource] = js.undefined
  
  /**
    * Optional. If set, this will result in the generation of a
    * `google.api.Service` configuration based on the `ConfigSource` provided,
    * but the generated config and the sources will NOT be persisted.
    */
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}
object SchemaSubmitConfigSourceRequest {
  
  @scala.inline
  def apply(): SchemaSubmitConfigSourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubmitConfigSourceRequest]
  }
  
  @scala.inline
  implicit class SchemaSubmitConfigSourceRequestMutableBuilder[Self <: SchemaSubmitConfigSourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigSource(value: SchemaConfigSource): Self = StObject.set(x, "configSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigSourceUndefined: Self = StObject.set(x, "configSource", js.undefined)
    
    @scala.inline
    def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
