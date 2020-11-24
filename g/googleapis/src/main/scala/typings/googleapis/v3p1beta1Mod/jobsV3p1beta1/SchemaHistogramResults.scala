package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output only.  Histogram results that match HistogramFacets specified in
  * SearchJobsRequest.
  */
@js.native
trait SchemaHistogramResults extends js.Object {
  
  /**
    * Specifies compensation field-based histogram results that match
    * HistogramFacets.compensation_histogram_requests.
    */
  var compensationHistogramResults: js.UndefOr[js.Array[SchemaCompensationHistogramResult]] = js.native
  
  /**
    * Specifies histogram results for custom attributes that match
    * HistogramFacets.custom_attribute_histogram_facets.
    */
  var customAttributeHistogramResults: js.UndefOr[js.Array[SchemaCustomAttributeHistogramResult]] = js.native
  
  /**
    * Specifies histogram results that matches
    * HistogramFacets.simple_histogram_facets.
    */
  var simpleHistogramResults: js.UndefOr[js.Array[SchemaHistogramResult]] = js.native
}
object SchemaHistogramResults {
  
  @scala.inline
  def apply(): SchemaHistogramResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistogramResults]
  }
  
  @scala.inline
  implicit class SchemaHistogramResultsOps[Self <: SchemaHistogramResults] (val x: Self) extends AnyVal {
    
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
    def setCompensationHistogramResultsVarargs(value: SchemaCompensationHistogramResult*): Self = this.set("compensationHistogramResults", js.Array(value :_*))
    
    @scala.inline
    def setCompensationHistogramResults(value: js.Array[SchemaCompensationHistogramResult]): Self = this.set("compensationHistogramResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompensationHistogramResults: Self = this.set("compensationHistogramResults", js.undefined)
    
    @scala.inline
    def setCustomAttributeHistogramResultsVarargs(value: SchemaCustomAttributeHistogramResult*): Self = this.set("customAttributeHistogramResults", js.Array(value :_*))
    
    @scala.inline
    def setCustomAttributeHistogramResults(value: js.Array[SchemaCustomAttributeHistogramResult]): Self = this.set("customAttributeHistogramResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomAttributeHistogramResults: Self = this.set("customAttributeHistogramResults", js.undefined)
    
    @scala.inline
    def setSimpleHistogramResultsVarargs(value: SchemaHistogramResult*): Self = this.set("simpleHistogramResults", js.Array(value :_*))
    
    @scala.inline
    def setSimpleHistogramResults(value: js.Array[SchemaHistogramResult]): Self = this.set("simpleHistogramResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimpleHistogramResults: Self = this.set("simpleHistogramResults", js.undefined)
  }
}
