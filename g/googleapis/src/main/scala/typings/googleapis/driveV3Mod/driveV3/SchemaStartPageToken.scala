package typings.googleapis.driveV3Mod.driveV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaStartPageToken extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#startPageToken&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The starting page token for listing changes.
    */
  var startPageToken: js.UndefOr[String] = js.native
}

object SchemaStartPageToken {
  @scala.inline
  def apply(kind: String = null, startPageToken: String = null): SchemaStartPageToken = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (startPageToken != null) __obj.updateDynamic("startPageToken")(startPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStartPageToken]
  }
}

