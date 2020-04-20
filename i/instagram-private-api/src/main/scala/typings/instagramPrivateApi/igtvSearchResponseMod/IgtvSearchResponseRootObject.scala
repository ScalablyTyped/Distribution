package typings.instagramPrivateApi.igtvSearchResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgtvSearchResponseRootObject extends js.Object {
  var has_more: Boolean
  var num_results: Double
  var rank_token: String
  var results: js.Array[IgtvSearchResponseResultsItem]
  var status: String
}

object IgtvSearchResponseRootObject {
  @scala.inline
  def apply(
    has_more: Boolean,
    num_results: Double,
    rank_token: String,
    results: js.Array[IgtvSearchResponseResultsItem],
    status: String
  ): IgtvSearchResponseRootObject = {
    val __obj = js.Dynamic.literal(has_more = has_more.asInstanceOf[js.Any], num_results = num_results.asInstanceOf[js.Any], rank_token = rank_token.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvSearchResponseRootObject]
  }
}

