package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorProto extends StObject {
  
  /** Debugging information. This property is internal to Google and should not be used. */
  var debugInfo: js.UndefOr[String] = js.undefined
  
  /** Specifies where the error occurred, if present. */
  var location: js.UndefOr[String] = js.undefined
  
  /** A human-readable description of the error. */
  var message: js.UndefOr[String] = js.undefined
  
  /** A short error code that summarizes the error. */
  var reason: js.UndefOr[String] = js.undefined
}
object ErrorProto {
  
  inline def apply(): ErrorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorProto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorProto] (val x: Self) extends AnyVal {
    
    inline def setDebugInfo(value: String): Self = StObject.set(x, "debugInfo", value.asInstanceOf[js.Any])
    
    inline def setDebugInfoUndefined: Self = StObject.set(x, "debugInfo", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
