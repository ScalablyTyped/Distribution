package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProjectionAny extends js.Object {
  var projection: js.UndefOr[js.Any] = js.undefined
}

object Anon_ProjectionAny {
  @scala.inline
  def apply(projection: js.Any = null): Anon_ProjectionAny = {
    val __obj = js.Dynamic.literal()
    if (projection != null) __obj.updateDynamic("projection")(projection)
    __obj.asInstanceOf[Anon_ProjectionAny]
  }
}

