package typings.googleapis.webriskV1Mod.webriskV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudWebriskV1Submission extends StObject {
  
  /**
    * ThreatTypes found to be associated with the submitted URI after reviewing it. This may be empty if the URI was not added to any list.
    */
  var threatTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. The URI that is being reported for malicious content to be analyzed.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudWebriskV1Submission {
  
  inline def apply(): SchemaGoogleCloudWebriskV1Submission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudWebriskV1Submission]
  }
  
  extension [Self <: SchemaGoogleCloudWebriskV1Submission](x: Self) {
    
    inline def setThreatTypes(value: js.Array[String]): Self = StObject.set(x, "threatTypes", value.asInstanceOf[js.Any])
    
    inline def setThreatTypesNull: Self = StObject.set(x, "threatTypes", null)
    
    inline def setThreatTypesUndefined: Self = StObject.set(x, "threatTypes", js.undefined)
    
    inline def setThreatTypesVarargs(value: String*): Self = StObject.set(x, "threatTypes", js.Array(value*))
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
