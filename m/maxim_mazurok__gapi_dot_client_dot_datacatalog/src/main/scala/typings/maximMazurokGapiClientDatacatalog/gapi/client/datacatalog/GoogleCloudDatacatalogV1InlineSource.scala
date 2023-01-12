package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1InlineSource extends StObject {
  
  /** Required. Taxonomies to import. */
  var taxonomies: js.UndefOr[js.Array[GoogleCloudDatacatalogV1SerializedTaxonomy]] = js.undefined
}
object GoogleCloudDatacatalogV1InlineSource {
  
  inline def apply(): GoogleCloudDatacatalogV1InlineSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1InlineSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatacatalogV1InlineSource] (val x: Self) extends AnyVal {
    
    inline def setTaxonomies(value: js.Array[GoogleCloudDatacatalogV1SerializedTaxonomy]): Self = StObject.set(x, "taxonomies", value.asInstanceOf[js.Any])
    
    inline def setTaxonomiesUndefined: Self = StObject.set(x, "taxonomies", js.undefined)
    
    inline def setTaxonomiesVarargs(value: GoogleCloudDatacatalogV1SerializedTaxonomy*): Self = StObject.set(x, "taxonomies", js.Array(value*))
  }
}
