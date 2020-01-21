package typings.graphql

import typings.graphql.astMod.Location
import typings.graphql.astMod.StringValueNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescription extends js.Object {
  val description: js.UndefOr[StringValueNode] = js.undefined
  val loc: js.UndefOr[Location] = js.undefined
}

object AnonDescription {
  @scala.inline
  def apply(description: StringValueNode = null, loc: Location = null): AnonDescription = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescription]
  }
}

