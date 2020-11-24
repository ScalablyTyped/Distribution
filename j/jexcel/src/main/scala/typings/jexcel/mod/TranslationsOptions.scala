package typings.jexcel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TranslationsOptions extends js.Object {
  
  /** About */
  var about: js.UndefOr[js.Any] = js.native
  
  /** Add comments */
  var addComments: js.UndefOr[js.Any] = js.native
  
  /** Are you sure to delete the selected columns? */
  var areYouSureToDeleteTheSelectedColumns: js.UndefOr[js.Any] = js.native
  
  /** Are you sure to delete the selected rows? */
  var areYouSureToDeleteTheSelectedRows: js.UndefOr[js.Any] = js.native
  
  /** Cell already merged */
  var cellAlreadyMerged: js.UndefOr[js.Any] = js.native
  
  /** Clear comments */
  var clearComments: js.UndefOr[js.Any] = js.native
  
  /** Comments */
  var comments: js.UndefOr[js.Any] = js.native
  
  /** Copy... */
  var copy: js.UndefOr[js.Any] = js.native
  
  /** Delete selected columns */
  var deleteSelectedColumns: js.UndefOr[js.Any] = js.native
  
  /** Delete selected rows */
  var deleteSelectedRows: js.UndefOr[js.Any] = js.native
  
  /** Edit comments */
  var editComments: js.UndefOr[js.Any] = js.native
  
  /** entries */
  var entries: js.UndefOr[js.Any] = js.native
  
  /** Insert a new column after */
  var insertANewColumnAfter: js.UndefOr[js.Any] = js.native
  
  /** Insert a new column before */
  var insertANewColumnBefore: js.UndefOr[js.Any] = js.native
  
  /** Insert a new row after */
  var insertANewRowAfter: js.UndefOr[js.Any] = js.native
  
  /** Insert a new row before */
  var insertANewRowBefore: js.UndefOr[js.Any] = js.native
  
  /** Invalid merged properties */
  var invalidMergeProperties: js.UndefOr[js.Any] = js.native
  
  /** No cells selected */
  var noCellsSelected: js.UndefOr[js.Any] = js.native
  
  /** No records found */
  var noRecordsFound: js.UndefOr[js.Any] = js.native
  
  /** Order ascending */
  var orderAscending: js.UndefOr[js.Any] = js.native
  
  /** Order descending */
  var orderDescending: js.UndefOr[js.Any] = js.native
  
  /** Paste... */
  var paste: js.UndefOr[js.Any] = js.native
  
  /** Rename this column */
  var renameThisColumn: js.UndefOr[js.Any] = js.native
  
  /** Save as... */
  var saveAs: js.UndefOr[js.Any] = js.native
  
  /** Show */
  var show: js.UndefOr[js.Any] = js.native
  
  /** Showing page {0} of {1} entries */
  var showingPage: js.UndefOr[js.Any] = js.native
  
  /** There is a conflict with another merged cell */
  var thereIsAConflictWithAnotherMergedCell: js.UndefOr[js.Any] = js.native
  
  /** This action will clear your search results. Are you sure? */
  var thisActionWillClearYourSearchResultsAreYouSure: js.UndefOr[js.Any] = js.native
  
  /** This action will destroy any existing merged cells. Are you sure? */
  var thisActionWillDestroyAnyExistingMergedCellsAreYouSure: js.UndefOr[js.Any] = js.native
}
object TranslationsOptions {
  
  @scala.inline
  def apply(): TranslationsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranslationsOptions]
  }
  
  @scala.inline
  implicit class TranslationsOptionsOps[Self <: TranslationsOptions] (val x: Self) extends AnyVal {
    
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
    def setAbout(value: js.Any): Self = this.set("about", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbout: Self = this.set("about", js.undefined)
    
    @scala.inline
    def setAddComments(value: js.Any): Self = this.set("addComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddComments: Self = this.set("addComments", js.undefined)
    
    @scala.inline
    def setAreYouSureToDeleteTheSelectedColumns(value: js.Any): Self = this.set("areYouSureToDeleteTheSelectedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAreYouSureToDeleteTheSelectedColumns: Self = this.set("areYouSureToDeleteTheSelectedColumns", js.undefined)
    
    @scala.inline
    def setAreYouSureToDeleteTheSelectedRows(value: js.Any): Self = this.set("areYouSureToDeleteTheSelectedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAreYouSureToDeleteTheSelectedRows: Self = this.set("areYouSureToDeleteTheSelectedRows", js.undefined)
    
    @scala.inline
    def setCellAlreadyMerged(value: js.Any): Self = this.set("cellAlreadyMerged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellAlreadyMerged: Self = this.set("cellAlreadyMerged", js.undefined)
    
    @scala.inline
    def setClearComments(value: js.Any): Self = this.set("clearComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearComments: Self = this.set("clearComments", js.undefined)
    
    @scala.inline
    def setComments(value: js.Any): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setCopy(value: js.Any): Self = this.set("copy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopy: Self = this.set("copy", js.undefined)
    
    @scala.inline
    def setDeleteSelectedColumns(value: js.Any): Self = this.set("deleteSelectedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteSelectedColumns: Self = this.set("deleteSelectedColumns", js.undefined)
    
    @scala.inline
    def setDeleteSelectedRows(value: js.Any): Self = this.set("deleteSelectedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteSelectedRows: Self = this.set("deleteSelectedRows", js.undefined)
    
    @scala.inline
    def setEditComments(value: js.Any): Self = this.set("editComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditComments: Self = this.set("editComments", js.undefined)
    
    @scala.inline
    def setEntries(value: js.Any): Self = this.set("entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
    
    @scala.inline
    def setInsertANewColumnAfter(value: js.Any): Self = this.set("insertANewColumnAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertANewColumnAfter: Self = this.set("insertANewColumnAfter", js.undefined)
    
    @scala.inline
    def setInsertANewColumnBefore(value: js.Any): Self = this.set("insertANewColumnBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertANewColumnBefore: Self = this.set("insertANewColumnBefore", js.undefined)
    
    @scala.inline
    def setInsertANewRowAfter(value: js.Any): Self = this.set("insertANewRowAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertANewRowAfter: Self = this.set("insertANewRowAfter", js.undefined)
    
    @scala.inline
    def setInsertANewRowBefore(value: js.Any): Self = this.set("insertANewRowBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertANewRowBefore: Self = this.set("insertANewRowBefore", js.undefined)
    
    @scala.inline
    def setInvalidMergeProperties(value: js.Any): Self = this.set("invalidMergeProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidMergeProperties: Self = this.set("invalidMergeProperties", js.undefined)
    
    @scala.inline
    def setNoCellsSelected(value: js.Any): Self = this.set("noCellsSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoCellsSelected: Self = this.set("noCellsSelected", js.undefined)
    
    @scala.inline
    def setNoRecordsFound(value: js.Any): Self = this.set("noRecordsFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoRecordsFound: Self = this.set("noRecordsFound", js.undefined)
    
    @scala.inline
    def setOrderAscending(value: js.Any): Self = this.set("orderAscending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderAscending: Self = this.set("orderAscending", js.undefined)
    
    @scala.inline
    def setOrderDescending(value: js.Any): Self = this.set("orderDescending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderDescending: Self = this.set("orderDescending", js.undefined)
    
    @scala.inline
    def setPaste(value: js.Any): Self = this.set("paste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaste: Self = this.set("paste", js.undefined)
    
    @scala.inline
    def setRenameThisColumn(value: js.Any): Self = this.set("renameThisColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenameThisColumn: Self = this.set("renameThisColumn", js.undefined)
    
    @scala.inline
    def setSaveAs(value: js.Any): Self = this.set("saveAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveAs: Self = this.set("saveAs", js.undefined)
    
    @scala.inline
    def setShow(value: js.Any): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setShowingPage(value: js.Any): Self = this.set("showingPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowingPage: Self = this.set("showingPage", js.undefined)
    
    @scala.inline
    def setThereIsAConflictWithAnotherMergedCell(value: js.Any): Self = this.set("thereIsAConflictWithAnotherMergedCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThereIsAConflictWithAnotherMergedCell: Self = this.set("thereIsAConflictWithAnotherMergedCell", js.undefined)
    
    @scala.inline
    def setThisActionWillClearYourSearchResultsAreYouSure(value: js.Any): Self = this.set("thisActionWillClearYourSearchResultsAreYouSure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThisActionWillClearYourSearchResultsAreYouSure: Self = this.set("thisActionWillClearYourSearchResultsAreYouSure", js.undefined)
    
    @scala.inline
    def setThisActionWillDestroyAnyExistingMergedCellsAreYouSure(value: js.Any): Self = this.set("thisActionWillDestroyAnyExistingMergedCellsAreYouSure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThisActionWillDestroyAnyExistingMergedCellsAreYouSure: Self = this.set("thisActionWillDestroyAnyExistingMergedCellsAreYouSure", js.undefined)
  }
}
