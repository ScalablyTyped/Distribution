package typings.instagramPrivateApi.igtvBrowseFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgtvBrowseFeedResponseBiographyWithEntities extends js.Object {
  var entities: js.Array[_]
  var raw_text: String
}

object IgtvBrowseFeedResponseBiographyWithEntities {
  @scala.inline
  def apply(entities: js.Array[_], raw_text: String): IgtvBrowseFeedResponseBiographyWithEntities = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], raw_text = raw_text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IgtvBrowseFeedResponseBiographyWithEntities]
  }
}

