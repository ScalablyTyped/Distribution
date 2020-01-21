package typings.instagramPrivateApi.igtvChannelFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgtvChannelFeedResponseBiographyWithEntities extends js.Object {
  var entities: js.Array[_]
  var raw_text: String
}

object IgtvChannelFeedResponseBiographyWithEntities {
  @scala.inline
  def apply(entities: js.Array[_], raw_text: String): IgtvChannelFeedResponseBiographyWithEntities = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], raw_text = raw_text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IgtvChannelFeedResponseBiographyWithEntities]
  }
}

