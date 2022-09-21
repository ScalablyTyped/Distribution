package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsProcessorsSetdefaultprocessorversion
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the Processor to change default version.
    */
  var processor: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta3SetDefaultProcessorVersionRequest] = js.undefined
}
object ParamsResourceProjectsLocationsProcessorsSetdefaultprocessorversion {
  
  inline def apply(): ParamsResourceProjectsLocationsProcessorsSetdefaultprocessorversion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsProcessorsSetdefaultprocessorversion]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsProcessorsSetdefaultprocessorversion](x: Self) {
    
    inline def setProcessor(value: String): Self = StObject.set(x, "processor", value.asInstanceOf[js.Any])
    
    inline def setProcessorUndefined: Self = StObject.set(x, "processor", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDocumentaiV1beta3SetDefaultProcessorVersionRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
