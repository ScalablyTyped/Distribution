package typings.graphqlCompose

import typings.graphqlCompose.projectionMod.ProjectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProjectionProjectionType extends js.Object {
  var projection: js.UndefOr[ProjectionType] = js.undefined
}

object AnonProjectionProjectionType {
  @scala.inline
  def apply(projection: ProjectionType = null): AnonProjectionProjectionType = {
    val __obj = js.Dynamic.literal()
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProjectionProjectionType]
  }
}

