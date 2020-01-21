package typings.instagramPrivateApi.userRepositoryInfoResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRepositoryInfoResponseBiographyWithEntities extends js.Object {
  var entities: js.Array[_]
  var raw_text: String
}

object UserRepositoryInfoResponseBiographyWithEntities {
  @scala.inline
  def apply(entities: js.Array[_], raw_text: String): UserRepositoryInfoResponseBiographyWithEntities = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], raw_text = raw_text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserRepositoryInfoResponseBiographyWithEntities]
  }
}

