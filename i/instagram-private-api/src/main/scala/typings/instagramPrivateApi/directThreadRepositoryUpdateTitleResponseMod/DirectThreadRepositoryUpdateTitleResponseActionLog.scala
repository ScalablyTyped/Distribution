package typings.instagramPrivateApi.directThreadRepositoryUpdateTitleResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectThreadRepositoryUpdateTitleResponseActionLog extends js.Object {
  var bold: js.Array[DirectThreadRepositoryUpdateTitleResponseBoldItem]
  var description: String
  var text_attributes: js.Array[DirectThreadRepositoryUpdateTitleResponseTextAttributesItem]
}

object DirectThreadRepositoryUpdateTitleResponseActionLog {
  @scala.inline
  def apply(
    bold: js.Array[DirectThreadRepositoryUpdateTitleResponseBoldItem],
    description: String,
    text_attributes: js.Array[DirectThreadRepositoryUpdateTitleResponseTextAttributesItem]
  ): DirectThreadRepositoryUpdateTitleResponseActionLog = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], text_attributes = text_attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadRepositoryUpdateTitleResponseActionLog]
  }
}

