package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A TextElement kind that represents the beginning of a new paragraph.
  */
@js.native
trait SchemaParagraphMarker extends js.Object {
  /**
    * The bullet for this paragraph. If not present, the paragraph does not
    * belong to a list.
    */
  var bullet: js.UndefOr[SchemaBullet] = js.native
  /**
    * The paragraph&#39;s style
    */
  var style: js.UndefOr[SchemaParagraphStyle] = js.native
}

object SchemaParagraphMarker {
  @scala.inline
  def apply(bullet: SchemaBullet = null, style: SchemaParagraphStyle = null): SchemaParagraphMarker = {
    val __obj = js.Dynamic.literal()
    if (bullet != null) __obj.updateDynamic("bullet")(bullet.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaParagraphMarker]
  }
}

