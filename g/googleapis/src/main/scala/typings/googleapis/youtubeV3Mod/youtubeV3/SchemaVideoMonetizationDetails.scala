package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details about monetization of a YouTube Video.
  */
@js.native
trait SchemaVideoMonetizationDetails extends js.Object {
  
  /**
    * The value of access indicates whether the video can be monetized or not.
    */
  var access: js.UndefOr[SchemaAccessPolicy] = js.native
}
object SchemaVideoMonetizationDetails {
  
  @scala.inline
  def apply(): SchemaVideoMonetizationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoMonetizationDetails]
  }
  
  @scala.inline
  implicit class SchemaVideoMonetizationDetailsOps[Self <: SchemaVideoMonetizationDetails] (val x: Self) extends AnyVal {
    
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
    def setAccess(value: SchemaAccessPolicy): Self = this.set("access", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccess: Self = this.set("access", js.undefined)
  }
}
