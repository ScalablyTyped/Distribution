package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexResource extends StObject {
  
  var datasources: DatasourcesResource
}
object IndexResource {
  
  @scala.inline
  def apply(datasources: DatasourcesResource): IndexResource = {
    val __obj = js.Dynamic.literal(datasources = datasources.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexResource]
  }
  
  @scala.inline
  implicit class IndexResourceMutableBuilder[Self <: IndexResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasources(value: DatasourcesResource): Self = StObject.set(x, "datasources", value.asInstanceOf[js.Any])
  }
}
