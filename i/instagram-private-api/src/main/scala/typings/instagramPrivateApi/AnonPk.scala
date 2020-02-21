package typings.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPk extends js.Object {
  var pk: String | Double
}

object AnonPk {
  @scala.inline
  def apply(pk: String | Double): AnonPk = {
    val __obj = js.Dynamic.literal(pk = pk.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPk]
  }
}

