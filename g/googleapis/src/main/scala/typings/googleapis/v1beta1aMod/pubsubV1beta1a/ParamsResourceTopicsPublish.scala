package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTopicsPublish
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPublishRequest] = js.undefined
}
object ParamsResourceTopicsPublish {
  
  inline def apply(): ParamsResourceTopicsPublish = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTopicsPublish]
  }
  
  extension [Self <: ParamsResourceTopicsPublish](x: Self) {
    
    inline def setRequestBody(value: SchemaPublishRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
