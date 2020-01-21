package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaProductAspect extends js.Object {
  /**
    * The name of the aspect.
    */
  var aspectName: js.UndefOr[String] = js.native
  /**
    * The name of the destination. Leave out to apply to all destinations.
    */
  var destinationName: js.UndefOr[String] = js.native
  /**
    * Whether the aspect is required, excluded or should be validated.
    */
  var intention: js.UndefOr[String] = js.native
}

object SchemaProductAspect {
  @scala.inline
  def apply(aspectName: String = null, destinationName: String = null, intention: String = null): SchemaProductAspect = {
    val __obj = js.Dynamic.literal()
    if (aspectName != null) __obj.updateDynamic("aspectName")(aspectName.asInstanceOf[js.Any])
    if (destinationName != null) __obj.updateDynamic("destinationName")(destinationName.asInstanceOf[js.Any])
    if (intention != null) __obj.updateDynamic("intention")(intention.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProductAspect]
  }
}

