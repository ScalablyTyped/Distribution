package typings.matrixJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  // the batch token to pass in the query string
  var body: js.Object
  var next_batch: String
}

object Body {
  @scala.inline
  def apply(body: js.Object, next_batch: String): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], next_batch = next_batch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}

