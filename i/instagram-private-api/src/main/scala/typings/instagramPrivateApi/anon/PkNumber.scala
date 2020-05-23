package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PkNumber extends js.Object {
  var pk: Double
}

object PkNumber {
  @scala.inline
  def apply(pk: Double): PkNumber = {
    val __obj = js.Dynamic.literal(pk = pk.asInstanceOf[js.Any])
    __obj.asInstanceOf[PkNumber]
  }
}

