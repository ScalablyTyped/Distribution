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
  def apply(): SchemaTextContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextContent]
  }
  @scala.inline
  implicit class SchemaTextContentOps[Self <: SchemaTextContent] (val x: Self) extends AnyVal {
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
    def setLists(value: StringDictionary[SchemaList]): Self = this.set("lists", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLists: Self = this.set("lists", js.undefined)
    @scala.inline
    def setTextElementsVarargs(value: SchemaTextElement*): Self = this.set("textElements", js.Array(value :_*))
    @scala.inline
    def setTextElements(value: js.Array[SchemaTextElement]): Self = this.set("textElements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextElements: Self = this.set("textElements", js.undefined)
  }
  
}

