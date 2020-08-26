package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TextAnnotation contains a structured representation of OCR extracted text.
  * The hierarchy of an OCR extracted text structure is like this:
  * TextAnnotation -&gt; Page -&gt; Block -&gt; Paragraph -&gt; Word -&gt;
  * Symbol Each structural component, starting from Page, may further have
  * their own properties. Properties describe detected languages, breaks etc..
  * Please refer to the TextAnnotation.TextProperty message definition below
  * for more detail.
  */
@js.native
trait SchemaGoogleCloudVisionV1p3beta1TextAnnotation extends js.Object {
  /**
    * List of pages detected by OCR.
    */
  var pages: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p3beta1Page]] = js.native
  /**
    * UTF-8 text detected on the pages.
    */
  var text: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVisionV1p3beta1TextAnnotation {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p3beta1TextAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p3beta1TextAnnotation]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p3beta1TextAnnotationOps[Self <: SchemaGoogleCloudVisionV1p3beta1TextAnnotation] (val x: Self) extends AnyVal {
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
    def setPagesVarargs(value: SchemaGoogleCloudVisionV1p3beta1Page*): Self = this.set("pages", js.Array(value :_*))
    @scala.inline
    def setPages(value: js.Array[SchemaGoogleCloudVisionV1p3beta1Page]): Self = this.set("pages", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePages: Self = this.set("pages", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

