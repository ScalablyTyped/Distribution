package typings.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of a property in a projection.
  */
@js.native
trait SchemaProjection extends js.Object {
  /**
    * The property to project.
    */
  var property: js.UndefOr[SchemaPropertyReference] = js.native
}

object SchemaProjection {
  @scala.inline
  def apply(property: SchemaPropertyReference = null): SchemaProjection = {
    val __obj = js.Dynamic.literal()
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProjection]
  }
}

