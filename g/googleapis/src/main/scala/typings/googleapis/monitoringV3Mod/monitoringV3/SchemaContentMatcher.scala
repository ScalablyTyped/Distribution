package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to perform string matching. It allows substring and regular
  * expressions, together with their negations.
  */
@js.native
trait SchemaContentMatcher extends js.Object {
  /**
    * String or regex content to match (max 1024 bytes)
    */
  var content: js.UndefOr[String] = js.native
}

object SchemaContentMatcher {
  @scala.inline
  def apply(content: String = null): SchemaContentMatcher = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaContentMatcher]
  }
}

