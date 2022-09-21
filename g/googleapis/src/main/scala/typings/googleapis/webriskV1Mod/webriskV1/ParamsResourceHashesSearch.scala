package typings.googleapis.webriskV1Mod.webriskV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceHashesSearch
  extends StObject
     with StandardParameters {
  
  /**
    * A hash prefix, consisting of the most significant 4-32 bytes of a SHA256 hash. For JSON requests, this field is base64-encoded. Note that if this parameter is provided by a URI, it must be encoded using the web safe base64 variant (RFC 4648).
    */
  var hashPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ThreatLists to search in. Multiple ThreatLists may be specified.
    */
  var threatTypes: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceHashesSearch {
  
  inline def apply(): ParamsResourceHashesSearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceHashesSearch]
  }
  
  extension [Self <: ParamsResourceHashesSearch](x: Self) {
    
    inline def setHashPrefix(value: String): Self = StObject.set(x, "hashPrefix", value.asInstanceOf[js.Any])
    
    inline def setHashPrefixUndefined: Self = StObject.set(x, "hashPrefix", js.undefined)
    
    inline def setThreatTypes(value: js.Array[String]): Self = StObject.set(x, "threatTypes", value.asInstanceOf[js.Any])
    
    inline def setThreatTypesUndefined: Self = StObject.set(x, "threatTypes", js.undefined)
    
    inline def setThreatTypesVarargs(value: String*): Self = StObject.set(x, "threatTypes", js.Array(value*))
  }
}
