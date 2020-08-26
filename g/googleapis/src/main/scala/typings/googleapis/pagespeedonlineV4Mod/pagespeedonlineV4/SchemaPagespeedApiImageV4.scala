package typings.googleapis.pagespeedonlineV4Mod.pagespeedonlineV4

import typings.googleapis.anon.Left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPagespeedApiImageV4 extends js.Object {
  /**
    * Image data base64 encoded.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * Height of screenshot in pixels.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Unique string key, if any, identifying this image.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Mime type of image data (e.g. &quot;image/jpeg&quot;).
    */
  var mime_type: js.UndefOr[String] = js.native
  var page_rect: js.UndefOr[Left] = js.native
  /**
    * Width of screenshot in pixels.
    */
  var width: js.UndefOr[Double] = js.native
}

object SchemaPagespeedApiImageV4 {
  @scala.inline
  def apply(): SchemaPagespeedApiImageV4 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPagespeedApiImageV4]
  }
  @scala.inline
  implicit class SchemaPagespeedApiImageV4Ops[Self <: SchemaPagespeedApiImageV4] (val x: Self) extends AnyVal {
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setMime_type(value: String): Self = this.set("mime_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMime_type: Self = this.set("mime_type", js.undefined)
    @scala.inline
    def setPage_rect(value: Left): Self = this.set("page_rect", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage_rect: Self = this.set("page_rect", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

