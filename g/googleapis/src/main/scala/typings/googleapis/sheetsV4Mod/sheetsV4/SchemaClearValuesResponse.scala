package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response when clearing a range of values in a spreadsheet.
  */
@js.native
trait SchemaClearValuesResponse extends js.Object {
  
  /**
    * The range (in A1 notation) that was cleared. (If the request was for an
    * unbounded range or a ranger larger  than the bounds of the sheet, this
    * will be the actual range  that was cleared, bounded to the sheet&#39;s
    * limits.)
    */
  var clearedRange: js.UndefOr[String] = js.native
  
  /**
    * The spreadsheet the updates were applied to.
    */
  var spreadsheetId: js.UndefOr[String] = js.native
}
object SchemaClearValuesResponse {
  
  @scala.inline
  def apply(): SchemaClearValuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClearValuesResponse]
  }
  
  @scala.inline
  implicit class SchemaClearValuesResponseOps[Self <: SchemaClearValuesResponse] (val x: Self) extends AnyVal {
    
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
    def setClearedRange(value: String): Self = this.set("clearedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearedRange: Self = this.set("clearedRange", js.undefined)
    
    @scala.inline
    def setSpreadsheetId(value: String): Self = this.set("spreadsheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpreadsheetId: Self = this.set("spreadsheetId", js.undefined)
  }
}
