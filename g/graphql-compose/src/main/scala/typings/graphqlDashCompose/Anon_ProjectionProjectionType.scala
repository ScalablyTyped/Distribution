package typings.graphqlDashCompose

import typings.graphqlDashCompose.esmUtilsProjectionMod.ProjectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProjectionProjectionType extends js.Object {
  var projection: js.UndefOr[ProjectionType] = js.undefined
}

object Anon_ProjectionProjectionType {
  @scala.inline
  def apply(projection: ProjectionType = null): Anon_ProjectionProjectionType = {
    val __obj = js.Dynamic.literal()
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ProjectionProjectionType]
  }
}

