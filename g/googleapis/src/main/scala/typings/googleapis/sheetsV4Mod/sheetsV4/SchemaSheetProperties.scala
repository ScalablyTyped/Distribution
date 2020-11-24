package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Properties of a sheet.
  */
@js.native
trait SchemaSheetProperties extends js.Object {
  
  /**
    * Additional properties of the sheet if this sheet is a grid. (If the sheet
    * is an object sheet, containing a chart or image, then this field will be
    * absent.) When writing it is an error to set any grid properties on
    * non-grid sheets.
    */
  var gridProperties: js.UndefOr[SchemaGridProperties] = js.native
  
  /**
    * True if the sheet is hidden in the UI, false if it&#39;s visible.
    */
  var hidden: js.UndefOr[Boolean] = js.native
  
  /**
    * The index of the sheet within the spreadsheet. When adding or updating
    * sheet properties, if this field is excluded then the sheet is added or
    * moved to the end of the sheet list. When updating sheet indices or
    * inserting sheets, movement is considered in &quot;before the move&quot;
    * indexes. For example, if there were 3 sheets (S1, S2, S3) in order to
    * move S1 ahead of S2 the index would have to be set to 2. A sheet index
    * update request is ignored if the requested index is identical to the
    * sheets current index or if the requested new index is equal to the
    * current sheet index + 1.
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * True if the sheet is an RTL sheet instead of an LTR sheet.
    */
  var rightToLeft: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the sheet. Must be non-negative. This field cannot be changed
    * once set.
    */
  var sheetId: js.UndefOr[Double] = js.native
  
  /**
    * The type of sheet. Defaults to GRID. This field cannot be changed once
    * set.
    */
  var sheetType: js.UndefOr[String] = js.native
  
  /**
    * The color of the tab in the UI.
    */
  var tabColor: js.UndefOr[SchemaColor] = js.native
  
  /**
    * The name of the sheet.
    */
  var title: js.UndefOr[String] = js.native
}
object SchemaSheetProperties {
  
  @scala.inline
  def apply(): SchemaSheetProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSheetProperties]
  }
  
  @scala.inline
  implicit class SchemaSheetPropertiesOps[Self <: SchemaSheetProperties] (val x: Self) extends AnyVal {
    
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
    def setGridProperties(value: SchemaGridProperties): Self = this.set("gridProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridProperties: Self = this.set("gridProperties", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setRightToLeft(value: Boolean): Self = this.set("rightToLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightToLeft: Self = this.set("rightToLeft", js.undefined)
    
    @scala.inline
    def setSheetId(value: Double): Self = this.set("sheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetId: Self = this.set("sheetId", js.undefined)
    
    @scala.inline
    def setSheetType(value: String): Self = this.set("sheetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetType: Self = this.set("sheetType", js.undefined)
    
    @scala.inline
    def setTabColor(value: SchemaColor): Self = this.set("tabColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabColor: Self = this.set("tabColor", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
