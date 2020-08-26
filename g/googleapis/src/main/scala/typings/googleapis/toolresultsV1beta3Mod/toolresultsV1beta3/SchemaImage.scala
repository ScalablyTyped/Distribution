package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An image, with a link to the main image and a thumbnail.
  */
@js.native
trait SchemaImage extends js.Object {
  /**
    * An error explaining why the thumbnail could not be rendered.
    */
  var error: js.UndefOr[SchemaStatus] = js.native
  /**
    * A reference to the full-size, original image.  This is the same as the
    * tool_outputs entry for the image under its Step.  Always set.
    */
  var sourceImage: js.UndefOr[SchemaToolOutputReference] = js.native
  /**
    * The step to which the image is attached.  Always set.
    */
  var stepId: js.UndefOr[String] = js.native
  /**
    * The thumbnail.
    */
  var thumbnail: js.UndefOr[SchemaThumbnail] = js.native
}

object SchemaImage {
  @scala.inline
  def apply(): SchemaImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImage]
  }
  @scala.inline
  implicit class SchemaImageOps[Self <: SchemaImage] (val x: Self) extends AnyVal {
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
    def setError(value: SchemaStatus): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setSourceImage(value: SchemaToolOutputReference): Self = this.set("sourceImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceImage: Self = this.set("sourceImage", js.undefined)
    @scala.inline
    def setStepId(value: String): Self = this.set("stepId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepId: Self = this.set("stepId", js.undefined)
    @scala.inline
    def setThumbnail(value: SchemaThumbnail): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnail: Self = this.set("thumbnail", js.undefined)
  }
  
}

