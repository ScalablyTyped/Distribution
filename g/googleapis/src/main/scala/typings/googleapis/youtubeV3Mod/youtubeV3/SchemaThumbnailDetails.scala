package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Internal representation of thumbnails for a YouTube resource.
  */
@js.native
trait SchemaThumbnailDetails extends js.Object {
  
  /**
    * The default image for this resource.
    */
  var default: js.UndefOr[SchemaThumbnail] = js.native
  
  /**
    * The high quality image for this resource.
    */
  var high: js.UndefOr[SchemaThumbnail] = js.native
  
  /**
    * The maximum resolution quality image for this resource.
    */
  var maxres: js.UndefOr[SchemaThumbnail] = js.native
  
  /**
    * The medium quality image for this resource.
    */
  var medium: js.UndefOr[SchemaThumbnail] = js.native
  
  /**
    * The standard quality image for this resource.
    */
  var standard: js.UndefOr[SchemaThumbnail] = js.native
}
object SchemaThumbnailDetails {
  
  @scala.inline
  def apply(): SchemaThumbnailDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThumbnailDetails]
  }
  
  @scala.inline
  implicit class SchemaThumbnailDetailsOps[Self <: SchemaThumbnailDetails] (val x: Self) extends AnyVal {
    
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
    def setDefault(value: SchemaThumbnail): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setHigh(value: SchemaThumbnail): Self = this.set("high", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHigh: Self = this.set("high", js.undefined)
    
    @scala.inline
    def setMaxres(value: SchemaThumbnail): Self = this.set("maxres", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxres: Self = this.set("maxres", js.undefined)
    
    @scala.inline
    def setMedium(value: SchemaThumbnail): Self = this.set("medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedium: Self = this.set("medium", js.undefined)
    
    @scala.inline
    def setStandard(value: SchemaThumbnail): Self = this.set("standard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStandard: Self = this.set("standard", js.undefined)
  }
}
