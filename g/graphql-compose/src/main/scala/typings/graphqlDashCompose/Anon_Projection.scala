package typings.graphqlDashCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Projection extends js.Object {
  var projection: js.UndefOr[js.Any] = js.undefined
}

object Anon_Projection {
  @scala.inline
  def apply(projection: js.Any = null): Anon_Projection = {
    val __obj = js.Dynamic.literal()
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Projection]
  }
}

