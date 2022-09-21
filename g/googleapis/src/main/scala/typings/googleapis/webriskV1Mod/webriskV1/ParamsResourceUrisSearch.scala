package typings.googleapis.webriskV1Mod.webriskV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUrisSearch
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ThreatLists to search in. Multiple ThreatLists may be specified.
    */
  var threatTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Required. The URI to be checked for matches.
    */
  var uri: js.UndefOr[String] = js.undefined
}
object ParamsResourceUrisSearch {
  
  inline def apply(): ParamsResourceUrisSearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUrisSearch]
  }
  
  extension [Self <: ParamsResourceUrisSearch](x: Self) {
    
    inline def setThreatTypes(value: js.Array[String]): Self = StObject.set(x, "threatTypes", value.asInstanceOf[js.Any])
    
    inline def setThreatTypesUndefined: Self = StObject.set(x, "threatTypes", js.undefined)
    
    inline def setThreatTypesVarargs(value: String*): Self = StObject.set(x, "threatTypes", js.Array(value*))
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
