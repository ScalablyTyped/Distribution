package typings.jsrsasign

import typings.jsrsasign.jsrsasignStrings.gen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Gen extends js.Object {
  var `type`: js.UndefOr[gen] = js.undefined
}

object Anon_Gen {
  @scala.inline
  def apply(`type`: gen = null): Anon_Gen = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Gen]
  }
}

