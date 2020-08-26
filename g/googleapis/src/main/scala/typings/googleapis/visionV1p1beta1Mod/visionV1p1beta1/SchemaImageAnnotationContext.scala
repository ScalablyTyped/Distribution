package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

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
  def apply(): SchemaImageAnnotationContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageAnnotationContext]
  }
  @scala.inline
  implicit class SchemaImageAnnotationContextOps[Self <: SchemaImageAnnotationContext] (val x: Self) extends AnyVal {
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
    def setPageNumber(value: Double): Self = this.set("pageNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageNumber: Self = this.set("pageNumber", js.undefined)
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}

