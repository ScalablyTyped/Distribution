package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Adds a new sheet. When a sheet is added at a given index, all subsequent
  * sheets&#39; indexes are incremented. To add an object sheet, use
  * AddChartRequest instead and specify EmbeddedObjectPosition.sheetId or
  * EmbeddedObjectPosition.newSheet.
  */
@js.native
trait SchemaAddSheetRequest extends js.Object {
  
  /**
    * The properties the new sheet should have. All properties are optional.
    * The sheetId field is optional; if one is not set, an id will be randomly
    * generated. (It is an error to specify the ID of a sheet that already
    * exists.)
    */
  var properties: js.UndefOr[SchemaSheetProperties] = js.native
}
object SchemaAddSheetRequest {
  
  @scala.inline
  def apply(): SchemaAddSheetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddSheetRequest]
  }
  
  @scala.inline
  implicit class SchemaAddSheetRequestOps[Self <: SchemaAddSheetRequest] (val x: Self) extends AnyVal {
    
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
    def setProperties(value: SchemaSheetProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
}
