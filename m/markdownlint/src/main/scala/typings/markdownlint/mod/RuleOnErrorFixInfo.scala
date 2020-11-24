package typings.markdownlint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fix information for RuleOnErrorInfo.
  */
@js.native
trait RuleOnErrorFixInfo extends js.Object {
  
  /**
    * Count of characters to delete.
    */
  var deleteCount: js.UndefOr[Double] = js.native
  
  /**
    * Column of the fix (1-based).
    */
  var editColumn: js.UndefOr[Double] = js.native
  
  /**
    * Text to insert (after deleting).
    */
  var insertText: js.UndefOr[String] = js.native
  
  /**
    * Line number (1-based).
    */
  var lineNumber: js.UndefOr[Double] = js.native
}
object RuleOnErrorFixInfo {
  
  @scala.inline
  def apply(): RuleOnErrorFixInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleOnErrorFixInfo]
  }
  
  @scala.inline
  implicit class RuleOnErrorFixInfoOps[Self <: RuleOnErrorFixInfo] (val x: Self) extends AnyVal {
    
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
    def setDeleteCount(value: Double): Self = this.set("deleteCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteCount: Self = this.set("deleteCount", js.undefined)
    
    @scala.inline
    def setEditColumn(value: Double): Self = this.set("editColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditColumn: Self = this.set("editColumn", js.undefined)
    
    @scala.inline
    def setInsertText(value: String): Self = this.set("insertText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertText: Self = this.set("insertText", js.undefined)
    
    @scala.inline
    def setLineNumber(value: Double): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineNumber: Self = this.set("lineNumber", js.undefined)
  }
}
