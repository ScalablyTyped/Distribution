package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1Schema extends StObject {
  
  /** Required. Schema of columns. A maximum of 10,000 columns and sub-columns can be specified. */
  var columns: js.UndefOr[js.Array[GoogleCloudDatacatalogV1beta1ColumnSchema]] = js.native
}
object GoogleCloudDatacatalogV1beta1Schema {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1Schema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1Schema]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1SchemaMutableBuilder[Self <: GoogleCloudDatacatalogV1beta1Schema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Array[GoogleCloudDatacatalogV1beta1ColumnSchema]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: GoogleCloudDatacatalogV1beta1ColumnSchema*): Self = StObject.set(x, "columns", js.Array(value :_*))
  }
}
