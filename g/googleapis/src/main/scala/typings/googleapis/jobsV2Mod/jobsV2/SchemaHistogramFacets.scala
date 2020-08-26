package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Histogram facets to be specified in SearchJobsRequest.
  */
@js.native
trait SchemaHistogramFacets extends js.Object {
  /**
    * Optional.  Specifies compensation field-based histogram requests.
    * Duplicate values of CompensationHistogramRequest.type are not allowed.
    */
  var compensationHistogramFacets: js.UndefOr[js.Array[SchemaCompensationHistogramRequest]] = js.native
  /**
    * Optional.  Specifies the custom attributes histogram requests. Duplicate
    * values of CustomAttributeHistogramRequest.key are not allowed.
    */
  var customAttributeHistogramFacets: js.UndefOr[js.Array[SchemaCustomAttributeHistogramRequest]] = js.native
  /**
    * Optional. Specifies the simple type of histogram facets, for example,
    * `COMPANY_SIZE`, `EMPLOYMENT_TYPE` etc. This field is equivalent to
    * GetHistogramRequest.
    */
  var simpleHistogramFacets: js.UndefOr[js.Array[String]] = js.native
}

object SchemaHistogramFacets {
  @scala.inline
  def apply(): SchemaHistogramFacets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistogramFacets]
  }
  @scala.inline
  implicit class SchemaHistogramFacetsOps[Self <: SchemaHistogramFacets] (val x: Self) extends AnyVal {
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
    def setCompensationHistogramFacetsVarargs(value: SchemaCompensationHistogramRequest*): Self = this.set("compensationHistogramFacets", js.Array(value :_*))
    @scala.inline
    def setCompensationHistogramFacets(value: js.Array[SchemaCompensationHistogramRequest]): Self = this.set("compensationHistogramFacets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompensationHistogramFacets: Self = this.set("compensationHistogramFacets", js.undefined)
    @scala.inline
    def setCustomAttributeHistogramFacetsVarargs(value: SchemaCustomAttributeHistogramRequest*): Self = this.set("customAttributeHistogramFacets", js.Array(value :_*))
    @scala.inline
    def setCustomAttributeHistogramFacets(value: js.Array[SchemaCustomAttributeHistogramRequest]): Self = this.set("customAttributeHistogramFacets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomAttributeHistogramFacets: Self = this.set("customAttributeHistogramFacets", js.undefined)
    @scala.inline
    def setSimpleHistogramFacetsVarargs(value: String*): Self = this.set("simpleHistogramFacets", js.Array(value :_*))
    @scala.inline
    def setSimpleHistogramFacets(value: js.Array[String]): Self = this.set("simpleHistogramFacets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimpleHistogramFacets: Self = this.set("simpleHistogramFacets", js.undefined)
  }
  
}

