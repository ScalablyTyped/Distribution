package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Nonprofit information.
  */
@js.native
trait SchemaNonprofit extends js.Object {
  
  /**
    * Id of the nonprofit.
    */
  var nonprofitId: js.UndefOr[SchemaNonprofitId] = js.native
  
  /**
    * Legal name of the nonprofit.
    */
  var nonprofitLegalName: js.UndefOr[String] = js.native
}
object SchemaNonprofit {
  
  @scala.inline
  def apply(): SchemaNonprofit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNonprofit]
  }
  
  @scala.inline
  implicit class SchemaNonprofitOps[Self <: SchemaNonprofit] (val x: Self) extends AnyVal {
    
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
    def setNonprofitId(value: SchemaNonprofitId): Self = this.set("nonprofitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonprofitId: Self = this.set("nonprofitId", js.undefined)
    
    @scala.inline
    def setNonprofitLegalName(value: String): Self = this.set("nonprofitLegalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonprofitLegalName: Self = this.set("nonprofitLegalName", js.undefined)
  }
}
