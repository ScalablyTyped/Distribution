package typings.instagramPrivateApi.directThreadRepositoryAddUserResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectThreadRepositoryAddUserResponseActionLog extends js.Object {
  var bold: js.Array[DirectThreadRepositoryAddUserResponseBoldItem]
  var description: String
  var text_attributes: js.Array[DirectThreadRepositoryAddUserResponseTextAttributesItem]
}

object DirectThreadRepositoryAddUserResponseActionLog {
  @scala.inline
  def apply(
    bold: js.Array[DirectThreadRepositoryAddUserResponseBoldItem],
    description: String,
    text_attributes: js.Array[DirectThreadRepositoryAddUserResponseTextAttributesItem]
  ): DirectThreadRepositoryAddUserResponseActionLog = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], text_attributes = text_attributes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DirectThreadRepositoryAddUserResponseActionLog]
  }
}

