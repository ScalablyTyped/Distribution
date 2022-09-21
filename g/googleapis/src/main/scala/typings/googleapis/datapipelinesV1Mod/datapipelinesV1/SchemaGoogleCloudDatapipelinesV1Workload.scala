package typings.googleapis.datapipelinesV1Mod.datapipelinesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatapipelinesV1Workload extends StObject {
  
  /**
    * Template information and additional parameters needed to launch a Dataflow job using the flex launch API.
    */
  var dataflowFlexTemplateRequest: js.UndefOr[SchemaGoogleCloudDatapipelinesV1LaunchFlexTemplateRequest] = js.undefined
  
  /**
    * Template information and additional parameters needed to launch a Dataflow job using the standard launch API.
    */
  var dataflowLaunchTemplateRequest: js.UndefOr[SchemaGoogleCloudDatapipelinesV1LaunchTemplateRequest] = js.undefined
}
object SchemaGoogleCloudDatapipelinesV1Workload {
  
  inline def apply(): SchemaGoogleCloudDatapipelinesV1Workload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatapipelinesV1Workload]
  }
  
  extension [Self <: SchemaGoogleCloudDatapipelinesV1Workload](x: Self) {
    
    inline def setDataflowFlexTemplateRequest(value: SchemaGoogleCloudDatapipelinesV1LaunchFlexTemplateRequest): Self = StObject.set(x, "dataflowFlexTemplateRequest", value.asInstanceOf[js.Any])
    
    inline def setDataflowFlexTemplateRequestUndefined: Self = StObject.set(x, "dataflowFlexTemplateRequest", js.undefined)
    
    inline def setDataflowLaunchTemplateRequest(value: SchemaGoogleCloudDatapipelinesV1LaunchTemplateRequest): Self = StObject.set(x, "dataflowLaunchTemplateRequest", value.asInstanceOf[js.Any])
    
    inline def setDataflowLaunchTemplateRequestUndefined: Self = StObject.set(x, "dataflowLaunchTemplateRequest", js.undefined)
  }
}
