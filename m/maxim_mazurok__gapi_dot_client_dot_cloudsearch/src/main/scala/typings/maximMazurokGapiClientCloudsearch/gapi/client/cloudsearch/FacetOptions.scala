package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FacetOptions extends js.Object {
  
  /** Maximum number of facet buckets that should be returned for this facet. Defaults to 10. Maximum value is 100. */
  var numFacetBuckets: js.UndefOr[Double] = js.native
  
  /** If object_type is set, only those objects of that type will be used to compute facets. If empty, then all objects will be used to compute facets. */
  var objectType: js.UndefOr[String] = js.native
  
  /** Name of the operator chosen for faceting. @see cloudsearch.SchemaPropertyOptions */
  var operatorName: js.UndefOr[String] = js.native
  
  /** Source name to facet on. Format: datasources/{source_id} If empty, all data sources will be used. */
  var sourceName: js.UndefOr[String] = js.native
}
object FacetOptions {
  
  @scala.inline
  def apply(): FacetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FacetOptions]
  }
  
  @scala.inline
  implicit class FacetOptionsOps[Self <: FacetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNumFacetBuckets(value: Double): Self = this.set("numFacetBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumFacetBuckets: Self = this.set("numFacetBuckets", js.undefined)
    
    @scala.inline
    def setObjectType(value: String): Self = this.set("objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectType: Self = this.set("objectType", js.undefined)
    
    @scala.inline
    def setOperatorName(value: String): Self = this.set("operatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperatorName: Self = this.set("operatorName", js.undefined)
    
    @scala.inline
    def setSourceName(value: String): Self = this.set("sourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceName: Self = this.set("sourceName", js.undefined)
  }
}
