package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deletes content from the document.
  */
@js.native
trait SchemaDeleteContentRangeRequest extends js.Object {
  
  /**
    * The range of content to delete.  Deleting text that crosses a paragraph
    * boundary may result in changes to paragraph styles, lists, positioned
    * objects and bookmarks as the two paragraphs are merged.  Attempting to
    * delete certain ranges can result in an invalid document structure in
    * which case a 400 bad request error is returned.  Some examples of invalid
    * delete requests include:  * Deleting one code unit of a surrogate pair. *
    * Deleting the last newline character of a Body, Header,   Footer,
    * Footnote, TableCell or TableOfContents. * Deleting the start or end of a
    * Table,   TableOfContents or Equation without deleting the entire element.
    * * Deleting the newline character before a   Table,   TableOfContents or
    * SectionBreak without deleting the   element. * Deleting individual rows
    * or cells of a table. Deleting the content within   a table cell is
    * allowed.
    */
  var range: js.UndefOr[SchemaRange] = js.native
}
object SchemaDeleteContentRangeRequest {
  
  @scala.inline
  def apply(): SchemaDeleteContentRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteContentRangeRequest]
  }
  
  @scala.inline
  implicit class SchemaDeleteContentRangeRequestOps[Self <: SchemaDeleteContentRangeRequest] (val x: Self) extends AnyVal {
    
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
    def setRange(value: SchemaRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
}
