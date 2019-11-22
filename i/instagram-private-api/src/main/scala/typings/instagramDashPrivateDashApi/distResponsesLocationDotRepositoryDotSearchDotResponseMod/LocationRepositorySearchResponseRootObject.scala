package typings.instagramDashPrivateDashApi.distResponsesLocationDotRepositoryDotSearchDotResponseMod

import typings.instagramDashPrivateDashApi.distResponsesStatusDotResponseMod.StatusResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationRepositorySearchResponseRootObject extends StatusResponse {
  var rank_token: String
  var request_id: String
  var venues: js.Array[LocationRepositorySearchResponseVenuesItem]
}

object LocationRepositorySearchResponseRootObject {
  @scala.inline
  def apply(
    rank_token: String,
    request_id: String,
    status: String,
    venues: js.Array[LocationRepositorySearchResponseVenuesItem]
  ): LocationRepositorySearchResponseRootObject = {
    val __obj = js.Dynamic.literal(rank_token = rank_token, request_id = request_id, status = status, venues = venues)
  
    __obj.asInstanceOf[LocationRepositorySearchResponseRootObject]
  }
}

