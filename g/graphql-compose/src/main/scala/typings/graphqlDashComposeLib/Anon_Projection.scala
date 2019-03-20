package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Projection[TSource] extends js.Object {
  var projection: js.UndefOr[graphqlDashComposeLib.libUtilsProjectionMod.ProjectionType[TSource]] = js.undefined
}

object Anon_Projection {
  @scala.inline
  def apply[TSource](projection: graphqlDashComposeLib.libUtilsProjectionMod.ProjectionType[TSource] = null): Anon_Projection[TSource] = {
    val __obj = js.Dynamic.literal()
    if (projection != null) __obj.updateDynamic("projection")(projection)
    __obj.asInstanceOf[Anon_Projection[TSource]]
  }
}

