package typings.googleapis.v2betaMod.cloudfunctionsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsFunctionsGeneratedownloadurl
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of function for which source code Google Cloud Storage signed URL should be generated.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGenerateDownloadUrlRequest] = js.undefined
}
object ParamsResourceProjectsLocationsFunctionsGeneratedownloadurl {
  
  inline def apply(): ParamsResourceProjectsLocationsFunctionsGeneratedownloadurl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsFunctionsGeneratedownloadurl]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsFunctionsGeneratedownloadurl](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGenerateDownloadUrlRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
