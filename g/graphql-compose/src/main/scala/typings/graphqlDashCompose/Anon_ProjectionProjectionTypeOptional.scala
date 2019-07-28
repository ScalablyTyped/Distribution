package typings.graphqlDashCompose

import typings.graphqlDashCompose.libUtilsProjectionMod.ProjectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProjectionProjectionTypeOptional extends js.Object {
  var projection: js.UndefOr[ProjectionType] = js.undefined
}

object Anon_ProjectionProjectionTypeOptional {
  @scala.inline
  def apply(projection: ProjectionType = null): Anon_ProjectionProjectionTypeOptional = {
    val __obj = js.Dynamic.literal()
    if (projection != null) __obj.updateDynamic("projection")(projection)
    __obj.asInstanceOf[Anon_ProjectionProjectionTypeOptional]
  }
}

