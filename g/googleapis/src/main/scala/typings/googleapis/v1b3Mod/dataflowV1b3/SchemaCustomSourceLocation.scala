package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifies the location of a custom souce.
  */
@js.native
trait SchemaCustomSourceLocation extends js.Object {
  /**
    * Whether this source is stateful.
    */
  var stateful: js.UndefOr[Boolean] = js.native
}

object SchemaCustomSourceLocation {
  @scala.inline
  def apply(stateful: js.UndefOr[Boolean] = js.undefined): SchemaCustomSourceLocation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stateful)) __obj.updateDynamic("stateful")(stateful.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCustomSourceLocation]
  }
}

