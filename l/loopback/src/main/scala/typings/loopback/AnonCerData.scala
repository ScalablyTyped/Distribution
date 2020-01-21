package typings.loopback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCerData extends js.Object {
  var cerData: String
  var feedBackOptions: AnonBatchFeedback
  var keyData: String
  var production: Boolean
  var pushOptions: AnonGateway
}

object AnonCerData {
  @scala.inline
  def apply(
    cerData: String,
    feedBackOptions: AnonBatchFeedback,
    keyData: String,
    production: Boolean,
    pushOptions: AnonGateway
  ): AnonCerData = {
    val __obj = js.Dynamic.literal(cerData = cerData.asInstanceOf[js.Any], feedBackOptions = feedBackOptions.asInstanceOf[js.Any], keyData = keyData.asInstanceOf[js.Any], production = production.asInstanceOf[js.Any], pushOptions = pushOptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCerData]
  }
}

