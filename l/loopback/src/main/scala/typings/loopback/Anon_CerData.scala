package typings.loopback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CerData extends js.Object {
  var cerData: String
  var feedBackOptions: Anon_BatchFeedback
  var keyData: String
  var production: Boolean
  var pushOptions: Anon_Gateway
}

object Anon_CerData {
  @scala.inline
  def apply(
    cerData: String,
    feedBackOptions: Anon_BatchFeedback,
    keyData: String,
    production: Boolean,
    pushOptions: Anon_Gateway
  ): Anon_CerData = {
    val __obj = js.Dynamic.literal(cerData = cerData.asInstanceOf[js.Any], feedBackOptions = feedBackOptions.asInstanceOf[js.Any], keyData = keyData.asInstanceOf[js.Any], production = production.asInstanceOf[js.Any], pushOptions = pushOptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CerData]
  }
}

