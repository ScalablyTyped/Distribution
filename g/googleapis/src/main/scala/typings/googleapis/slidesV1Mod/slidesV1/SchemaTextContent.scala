package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The general text content. The text must reside in a compatible shape (e.g.
  * text box or rectangle) or a table cell in a page.
  */
@js.native
trait SchemaTextContent extends js.Object {
  /**
    * The bulleted lists contained in this text, keyed by list ID.
    */
  var lists: js.UndefOr[StringDictionary[SchemaList]] = js.native
  /**
    * The text contents broken down into its component parts, including styling
    * information. This property is read-only.
    */
  var textElements: js.UndefOr[js.Array[SchemaTextElement]] = js.native
}

object SchemaTextContent {
  @scala.inline
  def apply(lists: StringDictionary[SchemaList] = null, textElements: js.Array[SchemaTextElement] = null): SchemaTextContent = {
    val __obj = js.Dynamic.literal()
    if (lists != null) __obj.updateDynamic("lists")(lists.asInstanceOf[js.Any])
    if (textElements != null) __obj.updateDynamic("textElements")(textElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTextContent]
  }
}

