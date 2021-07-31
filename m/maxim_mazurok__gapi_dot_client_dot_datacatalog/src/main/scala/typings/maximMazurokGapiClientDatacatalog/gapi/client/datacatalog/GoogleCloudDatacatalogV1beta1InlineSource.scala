package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1beta1InlineSource extends StObject {
  
  /** Required. Taxonomies to be imported. */
  var taxonomies: js.UndefOr[js.Array[GoogleCloudDatacatalogV1beta1SerializedTaxonomy]] = js.undefined
}
object GoogleCloudDatacatalogV1beta1InlineSource {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1InlineSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1InlineSource]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1InlineSourceMutableBuilder[Self <: GoogleCloudDatacatalogV1beta1InlineSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaxonomies(value: js.Array[GoogleCloudDatacatalogV1beta1SerializedTaxonomy]): Self = StObject.set(x, "taxonomies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxonomiesUndefined: Self = StObject.set(x, "taxonomies", js.undefined)
    
    @scala.inline
    def setTaxonomiesVarargs(value: GoogleCloudDatacatalogV1beta1SerializedTaxonomy*): Self = StObject.set(x, "taxonomies", js.Array(value :_*))
  }
}
