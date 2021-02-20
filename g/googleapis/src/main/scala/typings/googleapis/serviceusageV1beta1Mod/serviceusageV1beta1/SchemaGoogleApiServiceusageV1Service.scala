package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A service that is available for use by the consumer.
  */
@js.native
trait SchemaGoogleApiServiceusageV1Service extends StObject {
  
  /**
    * The service configuration of the available service. Some fields may be
    * filtered out of the configuration in responses to the `ListServices`
    * method. These fields are present only in responses to the `GetService`
    * method.
    */
  var config: js.UndefOr[SchemaGoogleApiServiceusageV1ServiceConfig] = js.native
  
  /**
    * The resource name of the consumer and service.  A valid name would be: -
    * projects/123/services/serviceusage.googleapis.com
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The resource name of the consumer.  A valid name would be: - projects/123
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * Whether or not the service has been enabled for use by the consumer.
    */
  var state: js.UndefOr[String] = js.native
}
object SchemaGoogleApiServiceusageV1Service {
  
  @scala.inline
  def apply(): SchemaGoogleApiServiceusageV1Service = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleApiServiceusageV1Service]
  }
  
  @scala.inline
  implicit class SchemaGoogleApiServiceusageV1ServiceMutableBuilder[Self <: SchemaGoogleApiServiceusageV1Service] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: SchemaGoogleApiServiceusageV1ServiceConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
