package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1beta1ViewSpec extends StObject {
  
  /** Output only. The query that defines the table view. */
  var viewQuery: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1beta1ViewSpec {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1ViewSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1ViewSpec]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1ViewSpecMutableBuilder[Self <: GoogleCloudDatacatalogV1beta1ViewSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setViewQuery(value: String): Self = StObject.set(x, "viewQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewQueryUndefined: Self = StObject.set(x, "viewQuery", js.undefined)
  }
}
