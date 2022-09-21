package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1EntryOverview extends StObject {
  
  /**
    * Entry overview with support for rich text. The overview must only contain Unicode characters, and should be formatted using HTML. The maximum length is 10 MiB as this value holds HTML descriptions including encoded images. The maximum length of the text without images is 100 KiB.
    */
  var overview: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1EntryOverview {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1EntryOverview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1EntryOverview]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1EntryOverview](x: Self) {
    
    inline def setOverview(value: String): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
    
    inline def setOverviewNull: Self = StObject.set(x, "overview", null)
    
    inline def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
  }
}
