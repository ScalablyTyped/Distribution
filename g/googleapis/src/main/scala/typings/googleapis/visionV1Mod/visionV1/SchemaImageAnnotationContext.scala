package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * If an image was produced from a file (e.g. a PDF), this message gives
  * information about the source of that image.
  */
@js.native
trait SchemaImageAnnotationContext extends js.Object {
  /**
    * If the file was a PDF or TIFF, this field gives the page number within
    * the file used to produce the image.
    */
  var pageNumber: js.UndefOr[Double] = js.native
  /**
    * The URI of the file used to produce the image.
    */
  var uri: js.UndefOr[String] = js.native
}

object SchemaImageAnnotationContext {
  @scala.inline
  def apply(pageNumber: js.UndefOr[Double] = js.undefined, uri: String = null): SchemaImageAnnotationContext = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pageNumber)) __obj.updateDynamic("pageNumber")(pageNumber.get.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImageAnnotationContext]
  }
}

