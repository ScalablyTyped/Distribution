package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of inserting an embedded Google Sheets chart.
  */
@js.native
trait SchemaInsertInlineSheetsChartResponse extends js.Object {
  
  /**
    * The object ID of the inserted chart.
    */
  var objectId: js.UndefOr[String] = js.native
}
object SchemaInsertInlineSheetsChartResponse {
  
  @scala.inline
  def apply(): SchemaInsertInlineSheetsChartResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInsertInlineSheetsChartResponse]
  }
  
  @scala.inline
  implicit class SchemaInsertInlineSheetsChartResponseOps[Self <: SchemaInsertInlineSheetsChartResponse] (val x: Self) extends AnyVal {
    
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
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
  }
}
