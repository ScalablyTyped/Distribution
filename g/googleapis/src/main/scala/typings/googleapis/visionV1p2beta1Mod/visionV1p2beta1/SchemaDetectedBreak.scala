package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Detected start or end of a structural component.
  */
@js.native
trait SchemaDetectedBreak extends js.Object {
  /**
    * True if break prepends the element.
    */
  var isPrefix: js.UndefOr[Boolean] = js.native
  /**
    * Detected break type.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaDetectedBreak {
  @scala.inline
  def apply(isPrefix: js.UndefOr[Boolean] = js.undefined, `type`: String = null): SchemaDetectedBreak = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isPrefix)) __obj.updateDynamic("isPrefix")(isPrefix.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDetectedBreak]
  }
}

