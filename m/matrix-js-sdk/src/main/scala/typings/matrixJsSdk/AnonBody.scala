package typings.matrixJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  // the batch token to pass in the query string
  var body: js.Object
  var next_batch: String
}

object AnonBody {
  @scala.inline
  def apply(body: js.Object, next_batch: String): AnonBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], next_batch = next_batch.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBody]
  }
}

