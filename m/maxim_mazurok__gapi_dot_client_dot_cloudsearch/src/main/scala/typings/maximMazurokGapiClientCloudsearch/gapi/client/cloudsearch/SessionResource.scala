package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionResource extends StObject {
  
  var searchapplications: SearchapplicationsResource
}
object SessionResource {
  
  inline def apply(searchapplications: SearchapplicationsResource): SessionResource = {
    val __obj = js.Dynamic.literal(searchapplications = searchapplications.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionResource]
  }
  
  extension [Self <: SessionResource](x: Self) {
    
    inline def setSearchapplications(value: SearchapplicationsResource): Self = StObject.set(x, "searchapplications", value.asInstanceOf[js.Any])
  }
}
