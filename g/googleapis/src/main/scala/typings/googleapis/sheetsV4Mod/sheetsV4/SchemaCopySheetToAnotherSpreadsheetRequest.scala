package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request to copy a sheet across spreadsheets.
  */
@js.native
trait SchemaCopySheetToAnotherSpreadsheetRequest extends js.Object {
  
  /**
    * The ID of the spreadsheet to copy the sheet to.
    */
  var destinationSpreadsheetId: js.UndefOr[String] = js.native
}
object SchemaCopySheetToAnotherSpreadsheetRequest {
  
  @scala.inline
  def apply(): SchemaCopySheetToAnotherSpreadsheetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCopySheetToAnotherSpreadsheetRequest]
  }
  
  @scala.inline
  implicit class SchemaCopySheetToAnotherSpreadsheetRequestOps[Self <: SchemaCopySheetToAnotherSpreadsheetRequest] (val x: Self) extends AnyVal {
    
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
    def setDestinationSpreadsheetId(value: String): Self = this.set("destinationSpreadsheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationSpreadsheetId: Self = this.set("destinationSpreadsheetId", js.undefined)
  }
}
