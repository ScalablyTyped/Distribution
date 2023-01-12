package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1EntryOverview extends StObject {
  
  /**
    * Entry overview with support for rich text. The overview must only contain Unicode characters, and should be formatted using HTML. The maximum length is 10 MiB as this value holds
    * HTML descriptions including encoded images. The maximum length of the text without images is 100 KiB.
    */
  var overview: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1EntryOverview {
  
  inline def apply(): GoogleCloudDatacatalogV1EntryOverview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1EntryOverview]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatacatalogV1EntryOverview] (val x: Self) extends AnyVal {
    
    inline def setOverview(value: String): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
    
    inline def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
  }
}
