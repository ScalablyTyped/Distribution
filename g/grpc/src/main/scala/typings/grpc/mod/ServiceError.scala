package typings.grpc.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceError
  extends StObject
     with Error {
  
  /**
    * The error code, a key of {@link grpc.status} that is not `grpc.status.OK`
    */
  var code: js.UndefOr[status] = js.undefined
  
  /**
    * Original status details string
    */
  var details: js.UndefOr[String] = js.undefined
  
  /**
    * Trailing metadata sent with the status, if applicable
    */
  var metadata: js.UndefOr[Metadata] = js.undefined
}
object ServiceError {
  
  inline def apply(message: String, name: String): ServiceError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceError]
  }
  
  extension [Self <: ServiceError](x: Self) {
    
    inline def setCode(value: status): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
