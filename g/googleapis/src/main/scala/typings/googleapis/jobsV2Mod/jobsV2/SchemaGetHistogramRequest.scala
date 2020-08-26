package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deprecated. Use SearchJobsRequest.histogram_facets instead to make a single
  * call with both search and histogram.  Input only.  A request for the
  * `GetHistogram` method.
  */
@js.native
trait SchemaGetHistogramRequest extends js.Object {
  /**
    * Optional.  Controls whether to broaden the search to avoid too few
    * results for a given query in instances where a search has sparse results.
    * Results from a broadened query is a superset of the results from the
    * original query.  Defaults to false.
    */
  var allowBroadening: js.UndefOr[Boolean] = js.native
  /**
    * Deprecated. Use query instead.  Optional.  Restrictions on the scope of
    * the histogram.
    */
  var filters: js.UndefOr[SchemaJobFilters] = js.native
  /**
    * Optional.  Query used to search against jobs, such as keyword, location
    * filters, etc.
    */
  var query: js.UndefOr[SchemaJobQuery] = js.native
  /**
    * Meta information, such as `user_id`, collected from the job searcher or
    * other entity conducting a job search, is used to improve the
    * service&#39;s search quality. Users determine identifier values, which
    * must be unique and consist.
    */
  var requestMetadata: js.UndefOr[SchemaRequestMetadata] = js.native
  /**
    * Required.  A list of facets that specify the histogram data to be
    * calculated against and returned.  Histogram response times can be slow,
    * and counts can be approximations. This call may be temporarily or
    * permanently removed prior to the production release of Cloud Talent
    * Solution.
    */
  var searchTypes: js.UndefOr[js.Array[String]] = js.native
}

object SchemaGetHistogramRequest {
  @scala.inline
  def apply(): SchemaGetHistogramRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetHistogramRequest]
  }
  @scala.inline
  implicit class SchemaGetHistogramRequestOps[Self <: SchemaGetHistogramRequest] (val x: Self) extends AnyVal {
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
    def setAllowBroadening(value: Boolean): Self = this.set("allowBroadening", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowBroadening: Self = this.set("allowBroadening", js.undefined)
    @scala.inline
    def setFilters(value: SchemaJobFilters): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setQuery(value: SchemaJobQuery): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setRequestMetadata(value: SchemaRequestMetadata): Self = this.set("requestMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestMetadata: Self = this.set("requestMetadata", js.undefined)
    @scala.inline
    def setSearchTypesVarargs(value: String*): Self = this.set("searchTypes", js.Array(value :_*))
    @scala.inline
    def setSearchTypes(value: js.Array[String]): Self = this.set("searchTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchTypes: Self = this.set("searchTypes", js.undefined)
  }
  
}

