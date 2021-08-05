package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugResource extends StObject {
  
  var datasources: DatasourcesResource
  
  var identitysources: IdentitysourcesResource
}
object DebugResource {
  
  inline def apply(datasources: DatasourcesResource, identitysources: IdentitysourcesResource): DebugResource = {
    val __obj = js.Dynamic.literal(datasources = datasources.asInstanceOf[js.Any], identitysources = identitysources.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugResource]
  }
  
  extension [Self <: DebugResource](x: Self) {
    
    inline def setDatasources(value: DatasourcesResource): Self = StObject.set(x, "datasources", value.asInstanceOf[js.Any])
    
    inline def setIdentitysources(value: IdentitysourcesResource): Self = StObject.set(x, "identitysources", value.asInstanceOf[js.Any])
  }
}
