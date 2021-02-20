package typings.handsontable.mod.Handsontable

import typings.handsontable.mod.Handsontable.comments.CommentObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Additional cell-specific meta data.
  */
@js.native
trait CellMeta extends ColumnSettings {
  
  var comment: js.UndefOr[CommentObject] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var isSearchResult: js.UndefOr[Boolean] = js.native
  
  var skipRowOnPaste: js.UndefOr[Boolean] = js.native
  
  var valid: js.UndefOr[Boolean] = js.native
}
object CellMeta {
  
  @scala.inline
  def apply(): CellMeta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellMeta]
  }
  
  @scala.inline
  implicit class CellMetaMutableBuilder[Self <: CellMeta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: CommentObject): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setIsSearchResult(value: Boolean): Self = StObject.set(x, "isSearchResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSearchResultUndefined: Self = StObject.set(x, "isSearchResult", js.undefined)
    
    @scala.inline
    def setSkipRowOnPaste(value: Boolean): Self = StObject.set(x, "skipRowOnPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipRowOnPasteUndefined: Self = StObject.set(x, "skipRowOnPaste", js.undefined)
    
    @scala.inline
    def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
  }
}
