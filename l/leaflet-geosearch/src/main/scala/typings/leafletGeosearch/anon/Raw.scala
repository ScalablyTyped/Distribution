package typings.leafletGeosearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Raw extends js.Object {
  var raw: Osmid
}

object Raw {
  @scala.inline
  def apply(raw: Osmid): Raw = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Raw]
  }
}

