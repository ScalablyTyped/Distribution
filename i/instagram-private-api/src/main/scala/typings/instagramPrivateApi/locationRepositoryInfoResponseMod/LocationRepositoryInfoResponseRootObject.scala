package typings.instagramPrivateApi.locationRepositoryInfoResponseMod

import typings.instagramPrivateApi.statusResponseMod.StatusResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationRepositoryInfoResponseRootObject extends StatusResponse {
  var location: LocationRepositoryInfoResponseLocation
}

object LocationRepositoryInfoResponseRootObject {
  @scala.inline
  def apply(location: LocationRepositoryInfoResponseLocation, status: String): LocationRepositoryInfoResponseRootObject = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LocationRepositoryInfoResponseRootObject]
  }
}

