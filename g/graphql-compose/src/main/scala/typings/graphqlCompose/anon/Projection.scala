package typings.graphqlCompose.anon

import typings.graphqlCompose.projectionMod.ProjectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Projection extends js.Object {
  var projection: js.UndefOr[ProjectionType] = js.undefined
}

object Projection {
  @scala.inline
  def apply(projection: ProjectionType = null): Projection = {
    val __obj = js.Dynamic.literal()
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Projection]
  }
}

