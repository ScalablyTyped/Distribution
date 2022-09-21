package typings.googleapis.eventarcV1beta1Mod.eventarcV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsTriggersDelete
  extends StObject
     with StandardParameters {
  
  /**
    * If set to true, and the trigger is not found, the request will succeed but no action will be taken on the server.
    */
  var allowMissing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If provided, the trigger will only be deleted if the etag matches the current etag on the resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the trigger to be deleted.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Required. If set, validate the request and preview the review, but do not actually post it.
    */
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceProjectsLocationsTriggersDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsTriggersDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsTriggersDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsTriggersDelete](x: Self) {
    
    inline def setAllowMissing(value: Boolean): Self = StObject.set(x, "allowMissing", value.asInstanceOf[js.Any])
    
    inline def setAllowMissingUndefined: Self = StObject.set(x, "allowMissing", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
