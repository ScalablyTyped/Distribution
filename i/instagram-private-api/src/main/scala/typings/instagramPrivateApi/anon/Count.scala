package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Count extends js.Object {
  var count: Double
  var text: String
}

object Count {
  @scala.inline
  def apply(count: Double, text: String): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
}

