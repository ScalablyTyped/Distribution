package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of adding a banded range.
  */
@js.native
trait SchemaAddBandingResponse extends js.Object {
  
  /**
    * The banded range that was added.
    */
  var bandedRange: js.UndefOr[SchemaBandedRange] = js.native
}
object SchemaAddBandingResponse {
  
  @scala.inline
  def apply(): SchemaAddBandingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddBandingResponse]
  }
  
  @scala.inline
  implicit class SchemaAddBandingResponseOps[Self <: SchemaAddBandingResponse] (val x: Self) extends AnyVal {
    
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
