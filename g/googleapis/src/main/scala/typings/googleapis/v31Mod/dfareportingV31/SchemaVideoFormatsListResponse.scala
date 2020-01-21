package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video Format List Response
  */
@js.native
trait SchemaVideoFormatsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#videoFormatsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Video format collection.
    */
  var videoFormats: js.UndefOr[js.Array[SchemaVideoFormat]] = js.native
}

object SchemaVideoFormatsListResponse {
  @scala.inline
  def apply(kind: String = null, videoFormats: js.Array[SchemaVideoFormat] = null): SchemaVideoFormatsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (videoFormats != null) __obj.updateDynamic("videoFormats")(videoFormats.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVideoFormatsListResponse]
  }
}

