package typings.graphqlCompose

import typings.graphqlCompose.projectionMod.ProjectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProjection extends js.Object {
  var projection: js.UndefOr[ProjectionType] = js.undefined
}

object AnonProjection {
  @scala.inline
  def apply(projection: ProjectionType = null): AnonProjection = {
    val __obj = js.Dynamic.literal()
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProjection]
  }
}

