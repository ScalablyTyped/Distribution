package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProjectionProjectionType extends js.Object {
  var projection: js.UndefOr[graphqlDashComposeLib.libUtilsProjectionMod.ProjectionType] = js.undefined
}

object Anon_ProjectionProjectionType {
  @scala.inline
  def apply(projection: graphqlDashComposeLib.libUtilsProjectionMod.ProjectionType = null): Anon_ProjectionProjectionType = {
    val __obj = js.Dynamic.literal()
    if (projection != null) __obj.updateDynamic("projection")(projection)
    __obj.asInstanceOf[Anon_ProjectionProjectionType]
  }
}

