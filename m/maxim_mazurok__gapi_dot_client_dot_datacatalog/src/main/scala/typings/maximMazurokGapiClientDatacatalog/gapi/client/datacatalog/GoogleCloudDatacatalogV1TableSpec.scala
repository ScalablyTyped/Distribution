package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1TableSpec extends StObject {
  
  /**
    * Output only. If the table is date-sharded, that is, it matches the `[prefix]YYYYMMDD` name pattern, this field is the Data Catalog resource name of the date-sharded grouped entry.
    * For example: `projects/{PROJECT_ID}/locations/{LOCATION}/entrygroups/{ENTRY_GROUP_ID}/entries/{ENTRY_ID}`. Otherwise, `grouped_entry` is empty.
    */
  var groupedEntry: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1TableSpec {
  
  inline def apply(): GoogleCloudDatacatalogV1TableSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1TableSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatacatalogV1TableSpec] (val x: Self) extends AnyVal {
    
    inline def setGroupedEntry(value: String): Self = StObject.set(x, "groupedEntry", value.asInstanceOf[js.Any])
    
    inline def setGroupedEntryUndefined: Self = StObject.set(x, "groupedEntry", js.undefined)
  }
}
