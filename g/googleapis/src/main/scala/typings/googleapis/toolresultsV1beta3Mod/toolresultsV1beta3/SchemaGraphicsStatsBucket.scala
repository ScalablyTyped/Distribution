package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGraphicsStatsBucket extends js.Object {
  /**
    * Number of frames in the bucket.
    */
  var frameCount: js.UndefOr[String] = js.native
  /**
    * Lower bound of render time in milliseconds.
    */
  var renderMillis: js.UndefOr[String] = js.native
}

object SchemaGraphicsStatsBucket {
  @scala.inline
  def apply(frameCount: String = null, renderMillis: String = null): SchemaGraphicsStatsBucket = {
    val __obj = js.Dynamic.literal()
    if (frameCount != null) __obj.updateDynamic("frameCount")(frameCount.asInstanceOf[js.Any])
    if (renderMillis != null) __obj.updateDynamic("renderMillis")(renderMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGraphicsStatsBucket]
  }
}

