package typings.graphqlCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProjection extends js.Object {
  var projection: js.UndefOr[js.Any] = js.undefined
}

object AnonProjection {
  @scala.inline
  def apply(projection: js.Any = null): AnonProjection = {
    val __obj = js.Dynamic.literal()
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProjection]
  }
}

