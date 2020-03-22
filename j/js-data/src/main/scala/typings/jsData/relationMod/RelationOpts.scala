package typings.jsData.relationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationOpts extends js.Object {
  var `type`: js.UndefOr[String] = js.undefined
}

object RelationOpts {
  @scala.inline
  def apply(`type`: String = null): RelationOpts = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationOpts]
  }
}

