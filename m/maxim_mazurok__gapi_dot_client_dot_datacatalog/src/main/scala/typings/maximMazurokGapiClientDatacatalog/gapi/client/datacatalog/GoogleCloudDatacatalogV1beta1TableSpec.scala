package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1beta1TableSpec extends StObject {
  
  /**
    * Output only. If the table is a dated shard, i.e., with name pattern `[prefix]YYYYMMDD`, `grouped_entry` is the Data Catalog resource name of the date sharded grouped entry, for
    * example, `projects/{project_id}/locations/{location}/entrygroups/{entry_group_id}/entries/{entry_id}`. Otherwise, `grouped_entry` is empty.
    */
  var groupedEntry: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1beta1TableSpec {
  
  inline def apply(): GoogleCloudDatacatalogV1beta1TableSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1TableSpec]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1beta1TableSpec](x: Self) {
    
    inline def setGroupedEntry(value: String): Self = StObject.set(x, "groupedEntry", value.asInstanceOf[js.Any])
    
    inline def setGroupedEntryUndefined: Self = StObject.set(x, "groupedEntry", js.undefined)
  }
}
