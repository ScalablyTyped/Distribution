package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about supported video formats.
  */
@js.native
trait SchemaVideoFormat extends js.Object {
  /**
    * File type of the video format.
    */
  var fileType: js.UndefOr[String] = js.native
  /**
    * ID of the video format.
    */
  var id: js.UndefOr[Double] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#videoFormat&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The resolution of this video format.
    */
  var resolution: js.UndefOr[SchemaSize] = js.native
  /**
    * The target bit rate of this video format.
    */
  var targetBitRate: js.UndefOr[Double] = js.native
}

object SchemaVideoFormat {
  @scala.inline
  def apply(
    fileType: String = null,
    id: Int | Double = null,
    kind: String = null,
    resolution: SchemaSize = null,
    targetBitRate: Int | Double = null
  ): SchemaVideoFormat = {
    val __obj = js.Dynamic.literal()
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (targetBitRate != null) __obj.updateDynamic("targetBitRate")(targetBitRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVideoFormat]
  }
}

