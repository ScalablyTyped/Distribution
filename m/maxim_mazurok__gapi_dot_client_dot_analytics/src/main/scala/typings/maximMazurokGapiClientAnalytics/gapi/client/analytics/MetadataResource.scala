package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataResource extends StObject {
  
  var columns: ColumnsResource = js.native
}
object MetadataResource {
  
  @scala.inline
  def apply(columns: ColumnsResource): MetadataResource = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataResource]
  }
  
  @scala.inline
  implicit class MetadataResourceMutableBuilder[Self <: MetadataResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: ColumnsResource): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
  }
}
