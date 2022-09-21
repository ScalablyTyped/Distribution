package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1TableSpec extends StObject {
  
  /**
    * Output only. If the table is date-sharded, that is, it matches the `[prefix]YYYYMMDD` name pattern, this field is the Data Catalog resource name of the date-sharded grouped entry. For example: `projects/{PROJECT_ID\}/locations/{LOCATION\}/entrygroups/{ENTRY_GROUP_ID\}/entries/{ENTRY_ID\}`. Otherwise, `grouped_entry` is empty.
    */
  var groupedEntry: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1TableSpec {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1TableSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1TableSpec]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1TableSpec](x: Self) {
    
    inline def setGroupedEntry(value: String): Self = StObject.set(x, "groupedEntry", value.asInstanceOf[js.Any])
    
    inline def setGroupedEntryNull: Self = StObject.set(x, "groupedEntry", null)
    
    inline def setGroupedEntryUndefined: Self = StObject.set(x, "groupedEntry", js.undefined)
  }
}
