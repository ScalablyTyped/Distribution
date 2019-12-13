package typings.instagramDashPrivateDashApi.distResponsesIgtvDotSearchDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgtvSearchResponseBiography_with_entities extends js.Object {
  var entities: js.Array[IgtvSearchResponseEntitiesItem]
  var raw_text: String
}

object IgtvSearchResponseBiography_with_entities {
  @scala.inline
  def apply(entities: js.Array[IgtvSearchResponseEntitiesItem], raw_text: String): IgtvSearchResponseBiography_with_entities = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], raw_text = raw_text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IgtvSearchResponseBiography_with_entities]
  }
}

