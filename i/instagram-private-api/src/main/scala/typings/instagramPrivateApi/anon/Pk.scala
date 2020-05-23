package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pk extends js.Object {
  var pk: String | Double
}

object Pk {
  @scala.inline
  def apply(pk: String | Double): Pk = {
    val __obj = js.Dynamic.literal(pk = pk.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pk]
  }
}

