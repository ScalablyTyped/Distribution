package typings.maximMazurokGapiClientBooks.gapi.client.books

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BooksAnnotationsRange extends js.Object {
  
  /** The offset from the ending position. */
  var endOffset: js.UndefOr[String] = js.native
  
  /** The ending position for the range. */
  var endPosition: js.UndefOr[String] = js.native
  
  /** The offset from the starting position. */
  var startOffset: js.UndefOr[String] = js.native
  
  /** The starting position for the range. */
  var startPosition: js.UndefOr[String] = js.native
}
object BooksAnnotationsRange {
  
  @scala.inline
  def apply(): BooksAnnotationsRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BooksAnnotationsRange]
  }
  
  @scala.inline
  implicit class BooksAnnotationsRangeOps[Self <: BooksAnnotationsRange] (val x: Self) extends AnyVal {
    
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
    def setEndOffset(value: String): Self = this.set("endOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndOffset: Self = this.set("endOffset", js.undefined)
    
    @scala.inline
    def setEndPosition(value: String): Self = this.set("endPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndPosition: Self = this.set("endPosition", js.undefined)
    
    @scala.inline
    def setStartOffset(value: String): Self = this.set("startOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartOffset: Self = this.set("startOffset", js.undefined)
    
    @scala.inline
    def setStartPosition(value: String): Self = this.set("startPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartPosition: Self = this.set("startPosition", js.undefined)
  }
}
