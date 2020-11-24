package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Click-through URL
  */
@js.native
trait SchemaCreativeClickThroughUrl extends js.Object {
  
  /**
    * Read-only convenience field representing the actual URL that will be used
    * for this click-through. The URL is computed as follows:  - If
    * landingPageId is specified then that landing page&#39;s URL is assigned
    * to this field. - Otherwise, the customClickThroughUrl is assigned to this
    * field.
    */
  var computedClickThroughUrl: js.UndefOr[String] = js.native
  
  /**
    * Custom click-through URL. Applicable if the landingPageId field is left
    * unset.
    */
  var customClickThroughUrl: js.UndefOr[String] = js.native
  
  /**
    * ID of the landing page for the click-through URL.
    */
  var landingPageId: js.UndefOr[String] = js.native
}
object SchemaCreativeClickThroughUrl {
  
  @scala.inline
  def apply(): SchemaCreativeClickThroughUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeClickThroughUrl]
  }
  
  @scala.inline
  implicit class SchemaCreativeClickThroughUrlOps[Self <: SchemaCreativeClickThroughUrl] (val x: Self) extends AnyVal {
    
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
    def setComputedClickThroughUrl(value: String): Self = this.set("computedClickThroughUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputedClickThroughUrl: Self = this.set("computedClickThroughUrl", js.undefined)
    
    @scala.inline
    def setCustomClickThroughUrl(value: String): Self = this.set("customClickThroughUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomClickThroughUrl: Self = this.set("customClickThroughUrl", js.undefined)
    
    @scala.inline
    def setLandingPageId(value: String): Self = this.set("landingPageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLandingPageId: Self = this.set("landingPageId", js.undefined)
  }
}
