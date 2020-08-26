package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Inserts an InlineObject containing an image at the given location.
  */
@js.native
trait SchemaInsertInlineImageRequest extends js.Object {
  /**
    * Inserts the text at the end of a header, footer or the document body.
    * Inline images cannot be inserted inside a footnote.
    */
  var endOfSegmentLocation: js.UndefOr[SchemaEndOfSegmentLocation] = js.native
  /**
    * Inserts the image at a specific index in the document.  The image must be
    * inserted inside the bounds of an existing Paragraph. For instance, it
    * cannot be inserted at a table&#39;s start index (i.e. between the table
    * and its preceding paragraph).  Inline images cannot be inserted inside a
    * footnote or equation.
    */
  var location: js.UndefOr[SchemaLocation] = js.native
  /**
    * The size that the image should appear as in the document. This property
    * is optional and the final size of the image in the document is determined
    * by the following rules:  * If neither width nor height is specified, then
    * a default size of the  image is calculated based on its resolution.  * If
    * one dimension is specified then the other dimension is calculated to
    * preserve the aspect ratio of the image.  * If both width and height are
    * specified, the image is scaled to fit  within the provided dimensions
    * while maintaining its aspect ratio.
    */
  var objectSize: js.UndefOr[SchemaSize] = js.native
  /**
    * The image URI.  The image is fetched once at insertion time and a copy is
    * stored for display inside the document. Images must be less than 50MB in
    * size, cannot exceed 25 megapixels, and must be in one of PNG, JPEG, or
    * GIF format.  The provided URI can be at most 2 kB in length. The URI
    * itself is saved with the image, and exposed via the
    * ImageProperties.content_uri field.
    */
  var uri: js.UndefOr[String] = js.native
}

object SchemaInsertInlineImageRequest {
  @scala.inline
  def apply(): SchemaInsertInlineImageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInsertInlineImageRequest]
  }
  @scala.inline
  implicit class SchemaInsertInlineImageRequestOps[Self <: SchemaInsertInlineImageRequest] (val x: Self) extends AnyVal {
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
    def setEndOfSegmentLocation(value: SchemaEndOfSegmentLocation): Self = this.set("endOfSegmentLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndOfSegmentLocation: Self = this.set("endOfSegmentLocation", js.undefined)
    @scala.inline
    def setLocation(value: SchemaLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setObjectSize(value: SchemaSize): Self = this.set("objectSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectSize: Self = this.set("objectSize", js.undefined)
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}

