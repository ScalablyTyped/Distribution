package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing filter sets.
  */
@js.native
trait SchemaListFilterSetsResponse extends js.Object {
  /**
    * The filter sets belonging to the buyer.
    */
  var filterSets: js.UndefOr[js.Array[SchemaFilterSet]] = js.native
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListFilterSetsRequest.pageToken field in the subsequent call to the
    * accounts.filterSets.list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListFilterSetsResponse {
  @scala.inline
  def apply(): SchemaListFilterSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFilterSetsResponse]
  }
  @scala.inline
  implicit class SchemaListFilterSetsResponseOps[Self <: SchemaListFilterSetsResponse] (val x: Self) extends AnyVal {
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
    def setFilterSetsVarargs(value: SchemaFilterSet*): Self = this.set("filterSets", js.Array(value :_*))
    @scala.inline
    def setFilterSets(value: js.Array[SchemaFilterSet]): Self = this.set("filterSets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterSets: Self = this.set("filterSets", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

