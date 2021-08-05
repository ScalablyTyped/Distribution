package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataResource extends StObject {
  
  var columns: ColumnsResource
}
object MetadataResource {
  
  inline def apply(columns: ColumnsResource): MetadataResource = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataResource]
  }
  
  extension [Self <: MetadataResource](x: Self) {
    
    inline def setColumns(value: ColumnsResource): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
  }
}
