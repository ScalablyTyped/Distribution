package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1Attempt extends StObject {
  
  var attemptTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Details of errors that occurred.
    */
  var partialFailures: js.UndefOr[js.Array[SchemaGoogleRpcStatus]] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1Attempt {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1Attempt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1Attempt]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1Attempt](x: Self) {
    
    inline def setAttemptTime(value: String): Self = StObject.set(x, "attemptTime", value.asInstanceOf[js.Any])
    
    inline def setAttemptTimeNull: Self = StObject.set(x, "attemptTime", null)
    
    inline def setAttemptTimeUndefined: Self = StObject.set(x, "attemptTime", js.undefined)
    
    inline def setPartialFailures(value: js.Array[SchemaGoogleRpcStatus]): Self = StObject.set(x, "partialFailures", value.asInstanceOf[js.Any])
    
    inline def setPartialFailuresUndefined: Self = StObject.set(x, "partialFailures", js.undefined)
    
    inline def setPartialFailuresVarargs(value: SchemaGoogleRpcStatus*): Self = StObject.set(x, "partialFailures", js.Array(value*))
  }
}
