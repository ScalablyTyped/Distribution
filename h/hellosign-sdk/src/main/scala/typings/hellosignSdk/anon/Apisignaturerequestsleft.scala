package typings.hellosignSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Apisignaturerequestsleft extends StObject {
  
  var api_signature_requests_left: Double
  
  var documents_left: Double
  
  var templates_left: Double
}
object Apisignaturerequestsleft {
  
  inline def apply(api_signature_requests_left: Double, documents_left: Double, templates_left: Double): Apisignaturerequestsleft = {
    val __obj = js.Dynamic.literal(api_signature_requests_left = api_signature_requests_left.asInstanceOf[js.Any], documents_left = documents_left.asInstanceOf[js.Any], templates_left = templates_left.asInstanceOf[js.Any])
    __obj.asInstanceOf[Apisignaturerequestsleft]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Apisignaturerequestsleft] (val x: Self) extends AnyVal {
    
    inline def setApi_signature_requests_left(value: Double): Self = StObject.set(x, "api_signature_requests_left", value.asInstanceOf[js.Any])
    
    inline def setDocuments_left(value: Double): Self = StObject.set(x, "documents_left", value.asInstanceOf[js.Any])
    
    inline def setTemplates_left(value: Double): Self = StObject.set(x, "templates_left", value.asInstanceOf[js.Any])
  }
}
