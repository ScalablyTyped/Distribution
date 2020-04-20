package typings.instagramPrivateApi.igtvSearchResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgtvSearchResponseBiographyWithEntities extends js.Object {
  var entities: js.Array[IgtvSearchResponseEntitiesItem]
  var raw_text: String
}

object IgtvSearchResponseBiographyWithEntities {
  @scala.inline
  def apply(entities: js.Array[IgtvSearchResponseEntitiesItem], raw_text: String): IgtvSearchResponseBiographyWithEntities = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], raw_text = raw_text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvSearchResponseBiographyWithEntities]
  }
}

