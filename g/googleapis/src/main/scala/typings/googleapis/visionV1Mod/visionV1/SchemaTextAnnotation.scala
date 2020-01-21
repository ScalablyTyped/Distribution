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
trait SchemaTextAnnotation extends js.Object {
  /**
    * List of pages detected by OCR.
    */
  var pages: js.UndefOr[js.Array[SchemaPage]] = js.native
  /**
    * UTF-8 text detected on the pages.
    */
  var text: js.UndefOr[String] = js.native
}

object SchemaTextAnnotation {
  @scala.inline
  def apply(pages: js.Array[SchemaPage] = null, text: String = null): SchemaTextAnnotation = {
    val __obj = js.Dynamic.literal()
    if (pages != null) __obj.updateDynamic("pages")(pages.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTextAnnotation]
  }
}

