package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fills in more data based on existing data.
  */
@js.native
trait SchemaAutoFillRequest extends js.Object {
  
  /**
    * The range to autofill. This will examine the range and detect the
    * location that has data and automatically fill that data in to the rest of
    * the range.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
  
  /**
    * The source and destination areas to autofill. This explicitly lists the
    * source of the autofill and where to extend that data.
    */
  var sourceAndDestination: js.UndefOr[SchemaSourceAndDestination] = js.native
  
  /**
    * True if we should generate data with the &quot;alternate&quot; series.
    * This differs based on the type and amount of source data.
    */
  var useAlternateSeries: js.UndefOr[Boolean] = js.native
}
object SchemaAutoFillRequest {
  
  @scala.inline
  def apply(): SchemaAutoFillRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoFillRequest]
  }
  
  @scala.inline
  implicit class SchemaAutoFillRequestOps[Self <: SchemaAutoFillRequest] (val x: Self) extends AnyVal {
    
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
    def setRange(value: SchemaGridRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setSourceAndDestination(value: SchemaSourceAndDestination): Self = this.set("sourceAndDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceAndDestination: Self = this.set("sourceAndDestination", js.undefined)
    
    @scala.inline
    def setUseAlternateSeries(value: Boolean): Self = this.set("useAlternateSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseAlternateSeries: Self = this.set("useAlternateSeries", js.undefined)
  }
}
