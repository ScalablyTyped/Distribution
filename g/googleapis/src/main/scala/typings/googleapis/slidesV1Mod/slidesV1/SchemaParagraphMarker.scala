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
  def apply(): SchemaParagraphMarker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParagraphMarker]
  }
  @scala.inline
  implicit class SchemaParagraphMarkerOps[Self <: SchemaParagraphMarker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBullet(value: SchemaBullet): Self = this.set("bullet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBullet: Self = this.set("bullet", js.undefined)
    @scala.inline
    def setStyle(value: SchemaParagraphStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

