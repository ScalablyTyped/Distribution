package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Adds a new banded range to the spreadsheet.
  */
@js.native
trait SchemaAddBandingRequest extends js.Object {
  
  /**
    * The banded range to add. The bandedRangeId field is optional; if one is
    * not set, an id will be randomly generated. (It is an error to specify the
    * ID of a range that already exists.)
    */
  var bandedRange: js.UndefOr[SchemaBandedRange] = js.native
}
object SchemaAddBandingRequest {
  
  @scala.inline
  def apply(): SchemaAddBandingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddBandingRequest]
  }
  
  @scala.inline
  implicit class SchemaAddBandingRequestOps[Self <: SchemaAddBandingRequest] (val x: Self) extends AnyVal {
    
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
    def setBandedRange(value: SchemaBandedRange): Self = this.set("bandedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBandedRange: Self = this.set("bandedRange", js.undefined)
  }
}
