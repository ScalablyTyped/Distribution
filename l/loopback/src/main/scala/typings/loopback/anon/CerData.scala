package typings.loopback.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CerData extends js.Object {
  var cerData: String
  var feedBackOptions: BatchFeedback
  var keyData: String
  var production: Boolean
  var pushOptions: Gateway
}

object CerData {
  @scala.inline
  def apply(
    cerData: String,
    feedBackOptions: BatchFeedback,
    keyData: String,
    production: Boolean,
    pushOptions: Gateway
  ): CerData = {
    val __obj = js.Dynamic.literal(cerData = cerData.asInstanceOf[js.Any], feedBackOptions = feedBackOptions.asInstanceOf[js.Any], keyData = keyData.asInstanceOf[js.Any], production = production.asInstanceOf[js.Any], pushOptions = pushOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CerData]
  }
}

